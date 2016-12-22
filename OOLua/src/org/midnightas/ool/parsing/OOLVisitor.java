// Generated from OOL.g4 by ANTLR 4.5.3
package org.midnightas.ool.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclThing(OOLParser.FuncDeclThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThing(OOLParser.StatementThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassThing(OOLParser.ClassThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeThing(OOLParser.IncludeThingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(OOLParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#varHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarHeader(OOLParser.VarHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(OOLParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OOLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(OOLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(OOLParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForKVStatement(OOLParser.ForKVStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(OOLParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOolForEachStatement(OOLParser.OolForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(OOLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarExpr(OOLParser.SetVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpr(OOLParser.InstanceofExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(OOLParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(OOLParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(OOLParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(OOLParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexSugar(OOLParser.TableIndexSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallSugar(OOLParser.FuncCallSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(OOLParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAtom(OOLParser.TableAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(OOLParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(OOLParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAtom(OOLParser.FuncAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(OOLParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(OOLParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTable(OOLParser.ArrayTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyTable(OOLParser.KeyTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#dotNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotation(OOLParser.DotNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#dotNotationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotationSection(OOLParser.DotNotationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotationSeperator(OOLParser.DotNotationSeperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#classCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreate(OOLParser.ClassCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMember(OOLParser.VarMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncMember(OOLParser.FuncMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorMember(OOLParser.ConstructorMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(OOLParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(OOLParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#funcCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArgs(OOLParser.FuncCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclArgs(OOLParser.FuncDeclArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OOLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(OOLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(OOLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(OOLParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#staticKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticKeyword(OOLParser.StaticKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OOLParser#lenOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenOperator(OOLParser.LenOperatorContext ctx);
}