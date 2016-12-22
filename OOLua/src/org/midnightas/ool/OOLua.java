package org.midnightas.ool;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.io.FileUtils;
import org.midnightas.ool.parsing.OOLBaseVisitor;
import org.midnightas.ool.parsing.OOLLexer;
import org.midnightas.ool.parsing.OOLParser;
import org.midnightas.ool.parsing.OOLParser.ArrayTableContext;
import org.midnightas.ool.parsing.OOLParser.BreakStatementContext;
import org.midnightas.ool.parsing.OOLParser.ClassCreateContext;
import org.midnightas.ool.parsing.OOLParser.ClassMemberContext;
import org.midnightas.ool.parsing.OOLParser.ClassThingContext;
import org.midnightas.ool.parsing.OOLParser.ConstructorMemberContext;
import org.midnightas.ool.parsing.OOLParser.DotNotationContext;
import org.midnightas.ool.parsing.OOLParser.DotNotationSectionContext;
import org.midnightas.ool.parsing.OOLParser.DotNotationSeperatorContext;
import org.midnightas.ool.parsing.OOLParser.ExprAtomSugarContext;
import org.midnightas.ool.parsing.OOLParser.ExprStatementContext;
import org.midnightas.ool.parsing.OOLParser.ForEachStatementContext;
import org.midnightas.ool.parsing.OOLParser.ForKVStatementContext;
import org.midnightas.ool.parsing.OOLParser.FuncAtomContext;
import org.midnightas.ool.parsing.OOLParser.FuncCallArgsContext;
import org.midnightas.ool.parsing.OOLParser.FuncCallSugarContext;
import org.midnightas.ool.parsing.OOLParser.FuncDeclArgsContext;
import org.midnightas.ool.parsing.OOLParser.FuncDeclContext;
import org.midnightas.ool.parsing.OOLParser.FuncDeclThingContext;
import org.midnightas.ool.parsing.OOLParser.FuncMemberContext;
import org.midnightas.ool.parsing.OOLParser.IdentifierAtomContext;
import org.midnightas.ool.parsing.OOLParser.IdentifierContext;
import org.midnightas.ool.parsing.OOLParser.IfStatementContext;
import org.midnightas.ool.parsing.OOLParser.IncludeThingContext;
import org.midnightas.ool.parsing.OOLParser.InstanceofExprContext;
import org.midnightas.ool.parsing.OOLParser.KeyTableContext;
import org.midnightas.ool.parsing.OOLParser.LambdaAtomContext;
import org.midnightas.ool.parsing.OOLParser.NilAtomContext;
import org.midnightas.ool.parsing.OOLParser.NumberAtomContext;
import org.midnightas.ool.parsing.OOLParser.NumberContext;
import org.midnightas.ool.parsing.OOLParser.OolForEachStatementContext;
import org.midnightas.ool.parsing.OOLParser.OpExprContext;
import org.midnightas.ool.parsing.OOLParser.ParenExprContext;
import org.midnightas.ool.parsing.OOLParser.ProgramContext;
import org.midnightas.ool.parsing.OOLParser.ReturnStatementContext;
import org.midnightas.ool.parsing.OOLParser.SetVarExprContext;
import org.midnightas.ool.parsing.OOLParser.SimpleExprContext;
import org.midnightas.ool.parsing.OOLParser.StatementThingContext;
import org.midnightas.ool.parsing.OOLParser.StringAtomContext;
import org.midnightas.ool.parsing.OOLParser.StringContext;
import org.midnightas.ool.parsing.OOLParser.TableAtomContext;
import org.midnightas.ool.parsing.OOLParser.TableIndexSugarContext;
import org.midnightas.ool.parsing.OOLParser.TernaryExprContext;
import org.midnightas.ool.parsing.OOLParser.VarHeaderContext;
import org.midnightas.ool.parsing.OOLParser.VarMemberContext;
import org.midnightas.ool.parsing.OOLParser.WhileStatementContext;

/*
 * Changelog:
 *   Beta 1.1:
 *   - Added instanceof keyword.
 *   - Disallow variable names that start with _ool_.
 *   - Added foreach keyword
 *   - Fixed include issue
 */
public class OOLua {

	public static HashMap<String, String> builtinIncludes = new HashMap<String, String>();

	static {
		for (String include : new String[] { "string" })
			builtinIncludes.put(include,
					new BufferedReader(new InputStreamReader(OOLua.class.getResourceAsStream("/" + include + ".ool")))
							.lines().collect(Collectors.joining("\n")) + " ");
	}

	public static String compile(String path, String code) {
		OOLParser parser = new OOLParser(new CommonTokenStream(new OOLLexer(new ANTLRInputStream(code))));
		parser.setBuildParseTree(true);
		return ((String) new Visitor(path).visit(parser.program()));
	}

	static class Visitor extends OOLBaseVisitor<Object> {

		public String filePath;

		public Visitor(String path) {
			this.filePath = path;
		}

		public Object visitProgram(ProgramContext ctx) {
			return ctx.programThing().stream().map(this::visit).map(e -> e.toString()).collect(Collectors.joining());
		}

		public Object visitFuncDeclThing(FuncDeclThingContext ctx) {
			return visit(ctx.funcDecl());
		}

		public Object visitFuncDecl(FuncDeclContext ctx) {
			StringBuilder builder = new StringBuilder("function");
			if (ctx.dotNotation() != null)
				builder.append(" " + ctx.dotNotation().getText());
			builder.append("(" + visit(ctx.funcDeclArgs()) + ")");
			builder.append(visit(ctx.program()) + "end ");
			return builder.toString();
		}

		public Object visitIncludeThing(IncludeThingContext ctx) {
			String path = ctx.string().value;
			path = path.substring(1, path.length() - 1);
			if (builtinIncludes.containsKey(path))
				return compile(this.filePath, builtinIncludes.get(path));
			try {
				File file = new File(path);
				if (!file.isAbsolute())
					file = new File(this.filePath, path);
				return compile(file.getParentFile().getAbsolutePath(), FileUtils.readFileToString(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		}

		public Object visitStatementThing(StatementThingContext ctx) {
			return visit(ctx.statement());
		}

		public Object visitClassThing(ClassThingContext ctx) {
			return visit(ctx.classCreate());
		}

		public Object visitVarHeader(VarHeaderContext ctx) {
			return visit(ctx.dotNotation()) + "=" + visit(ctx.expr());
		}

		public Object visitExprStatement(ExprStatementContext ctx) {
			return visit(ctx.expr()) + ";";
		}

		public Object visitIfStatement(IfStatementContext ctx) {
			StringBuilder builder = new StringBuilder(
					"if " + visit(ctx.expr()) + " then " + visit(ctx.yes).toString().trim());
			if (ctx.no != null)
				builder.append("else " + visit(ctx.no).toString().trim());
			return builder.append(" end;").toString();
		}

		public Object visitWhileStatement(WhileStatementContext ctx) {
			return "while " + visit(ctx.expr()) + " do " + visit(ctx.yes).toString().trim() + "end;";
		}

		public Object visitBreakStatement(BreakStatementContext ctx) {
			return "break;";
		}

		public Object visitForEachStatement(ForEachStatementContext ctx) {
			return "for " + visit(ctx.identifier(0)) + "," + visit(ctx.identifier(1)) + " in " + visit(ctx.expr())
					+ " do " + visit(ctx.program()) + "end;";
		}

		public Object visitOolForEachStatement(OolForEachStatementContext ctx) {
			String name = (String) visit(ctx.identifier());
			return "for " + name + "_ool_i," + name + " in pairs(" + visit(ctx.expr()) + ")do " + visit(ctx.program())
					+ "end;";
		}

		public Object visitForKVStatement(ForKVStatementContext ctx) {
			StringBuilder builder = new StringBuilder(
					"for " + visit(ctx.identifier()) + "=" + visit(ctx.start) + "," + visit(ctx.check));
			if (ctx.steps != null)
				builder.append("," + visit(ctx.steps));
			builder.append(" do " + visit(ctx.program()).toString().trim() + " end;");
			return builder.toString();
		}

		public Object visitReturnStatement(ReturnStatementContext ctx) {
			return "return " + visit(ctx.expr()) + ";";
		}

		public Object visitSetVarExpr(SetVarExprContext ctx) {
			return (ctx.local() == null ? "" : "local") + " " + visit(ctx.varHeader());
		}

		public Object visitOpExpr(OpExprContext ctx) {
			Object left = visit(ctx.left), right = visit(ctx.right);
			Object result = null;
			if (left instanceof Double && right instanceof Double)
				switch (ctx.op.getText()) {
				case "+":
					result = ((Double) left) + (Double) right;
					break;
				case "-":
					result = ((Double) left) - (Double) right;
					break;
				case "*":
					result = ((Double) left) * (Double) right;
					break;
				case "/":
					result = ((Double) left) / (Double) right;
					break;
				case "%":
					result = ((Double) left) % (Double) right;
					break;
				case "==":
					result = left.equals(right);
					break;
				case ">":
					result = ((Double) left) > (Double) right;
					break;
				case "<":
					result = ((Double) left) < (Double) right;
					break;
				case ">=":
					result = ((Double) left) >= (Double) right;
					break;
				case "<=":
					result = ((Double) left) >= (Double) right;
					break;
				case "~=":
					result = ((Double) left) != (Double) right;
				}
			else
				result = left + ctx.op.getText() + right;
			return result;
		}

		public Object visitSimpleExpr(SimpleExprContext ctx) {
			return visit(ctx.exprAtom());
		}

		public Object visitParenExpr(ParenExprContext ctx) {
			Object expr = visit(ctx.expr());
			if (expr instanceof Double)
				return expr;
			else
				return "(" + expr + ")";
		}

		public Object visitTernaryExpr(TernaryExprContext ctx) {
			return visit(ctx.check) + " and " + visit(ctx.yes) + " or " + visit(ctx.no);
		}

		public Object visitInstanceofExpr(InstanceofExprContext ctx) {
			return visit(ctx.expr()) + "._ool_class==" + visit(ctx.dotNotation());
		}

		public Object visitTableIndexSugar(TableIndexSugarContext ctx) {
			return "[" + visit(ctx.expr()) + "]";
		}

		public Object visitFuncCallSugar(FuncCallSugarContext ctx) {
			return "(" + visit(ctx.funcCallArgs()) + ")";
		}

		public Object visitNumberAtom(NumberAtomContext ctx) {
			return visit(ctx.number());
		}

		public Object visitStringAtom(StringAtomContext ctx) {
			return visit(ctx.string());
		}

		public Object visitTableAtom(TableAtomContext ctx) {
			return visit(ctx.table());
		}

		public Object visitIdentifierAtom(IdentifierAtomContext ctx) {
			return (ctx.lenOperator() == null ? "" : "#") + visit(ctx.dotNotation());
		}

		public Object visitLambdaAtom(LambdaAtomContext ctx) {
			return "function(" + visit(ctx.funcDeclArgs()) + ")return " + visit(ctx.expr()) + ";end";
		}

		public Object visitFuncAtom(FuncAtomContext ctx) {
			return visit(ctx.funcDecl());
		}

		public Object visitNilAtom(NilAtomContext ctx) {
			return "nil";
		}

		public Object visitArrayTable(ArrayTableContext ctx) {
			return "{" + ctx.expr().stream().map(this::visit).map(e -> e.toString()).collect(Collectors.joining(","))
					+ "}";
		}

		public Object visitKeyTable(KeyTableContext ctx) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < ctx.identifier().size(); i++) {
				builder.append("," + ctx.identifier(i).getText() + "=" + visit(ctx.expr(i)));
			}
			return "{" + builder.substring(1) + "}";
		}

		public Object visitDotNotation(DotNotationContext ctx) {
			StringBuilder builder = new StringBuilder();
			if (ctx.expr() != null)
				builder.append("(" + visit(ctx.expr()) + ")");
			else
				builder.append(visit(ctx.identifier()));
			for (ExprAtomSugarContext sugar : ctx.exprAtomSugar())
				builder.append(visit(sugar));
			for (DotNotationSectionContext section : ctx.dotNotationSection())
				builder.append(visit(section));
			return builder.toString();
		}

		public Object visitDotNotationSection(DotNotationSectionContext ctx) {
			StringBuilder builder = new StringBuilder();
			builder.append(visit(ctx.dotNotationSeperator()));
			if (ctx.identifier().getText().startsWith("_ool_") || ctx.identifier().getText().endsWith("_ool_")) {
				Token t = ctx.identifier().start;
				System.err.println("line " + t.getLine() + ":" + t.getCharPositionInLine()
						+ " Variable names starting or ending with _ool_ are illegal.");
				return builder.toString();
			}
			builder.append(visit(ctx.identifier()));
			for (ExprAtomSugarContext sugar : ctx.exprAtomSugar())
				builder.append(visit(sugar));
			return builder.toString();
		}

		public Object visitDotNotationSeperator(DotNotationSeperatorContext ctx) {
			return ctx.getText();
		}

		/*
		 * I bet you cant read this code, too.
		 */
		public Object visitClassCreate(ClassCreateContext ctx) {
			StringBuilder builder = new StringBuilder(ctx.name.getText() + "={};");
			builder.append(ctx.name.getText() + ".__index=" + ctx.name.getText() + ";");
			builder.append("setmetatable(" + ctx.name.getText() + ", {");
			if (ctx.extending != null)
				builder.append("__index=" + ctx.extending.getText() + ",");
			builder.append("__call=function(cls, ...) local self = setmetatable({}, cls);self._ool_class="
					+ ctx.name.getText() + ";self:__init__(...);return self;end});\n");
			boolean customConstructor = false;
			for (ClassMemberContext member : ctx.classBlock().classMember()) {
				if (member instanceof ConstructorMemberContext) {
					customConstructor = true;
					builder.append("function " + ctx.name.getText() + ":__init__(");
					String funcDeclArgs = visit(((ConstructorMemberContext) member).funcDeclArgs()).toString();
					builder.append(funcDeclArgs + ")");
					if (ctx.extending != null)
						builder.append(ctx.extending.getText() + ".__init__("
								+ (funcDeclArgs.trim().isEmpty() ? "self" : "self, ") + funcDeclArgs + ")");
					for (ClassMemberContext member0 : ctx.classBlock().classMember()) {
						if (member0 instanceof VarMemberContext) {
							VarMemberContext var = (VarMemberContext) member0;
							if (var.staticKeyword() == null)
								builder.append("self." + var.identifier().getText() + "=" + visit(var.expr()) + ";");
						} else
							continue;
					}
					builder.append(visit(((ConstructorMemberContext) member).program()) + "end\n");
					break;
				}
			}
			if (!customConstructor) {
				builder.append("function " + ctx.name.getText() + ":__init__()");
				for (ClassMemberContext member0 : ctx.classBlock().classMember()) {
					if (member0 instanceof VarMemberContext) {
						VarMemberContext var = (VarMemberContext) member0;
						if (var.staticKeyword() == null)
							builder.append("self." + var.identifier().getText() + "=" + visit(var.expr()) + ";");
					} else
						continue;
				}
				builder.append("end\n");
			}
			for (ClassMemberContext member : ctx.classBlock().classMember()) {
				if (member instanceof ConstructorMemberContext)
					continue;
				if (member instanceof FuncMemberContext) {
					FuncDeclContext funcDecl = ((FuncMemberContext) member).funcDecl();
					builder.append("function " + ctx.name.getText()
							+ (((FuncMemberContext) member).staticKeyword() == null ? ":" : ".")
							+ visit(funcDecl.dotNotation()));
					builder.append("(" + visit(funcDecl.funcDeclArgs()) + ")");
					builder.append(visit(funcDecl.program()));
					builder.append("end\n");
				} else if (member instanceof VarMemberContext) {
					VarMemberContext var = (VarMemberContext) member;
					if (var.staticKeyword() == null)
						continue;
					builder.append(ctx.name.getText() + "." + visit(var.identifier()) + "=" + visit(var.expr()) + ";");
				}
			}
			return builder.toString();
		}

		public Object visitFuncCallArgs(FuncCallArgsContext ctx) {
			return ctx.expr().stream().map(this::visit).map(e -> e.toString()).collect(Collectors.joining(","));
		}

		public Object visitFuncDeclArgs(FuncDeclArgsContext ctx) {
			return ctx.getText();
		}

		public Object visitIdentifier(IdentifierContext ctx) {
			return ctx.getText();
		}

		public Object visitString(StringContext ctx) {
			return ctx.value;
		}

		public Object visitNumber(NumberContext ctx) {
			return ctx.value;
		}
	}

	public static final void main(String[] args) throws Exception {
		Options options = new Options();
		options.addOption("f", true, "The file path.");
		CommandLine commandLine = new DefaultParser().parse(options, args);
		File file = new File(commandLine.getOptionValue("f"));
		if(!file.isAbsolute())
			file = new File(System.getProperty("user.dir"), file.getPath()); // fix to issue #1
		System.out.println(compile(file.getParentFile().getAbsolutePath(), FileUtils.readFileToString(file)).trim());
	}

}
