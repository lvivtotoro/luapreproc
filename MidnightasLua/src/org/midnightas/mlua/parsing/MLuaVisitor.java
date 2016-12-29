// Generated from MLua.g4 by ANTLR 4.5.3
package org.midnightas.mlua.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MLuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MLuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MLuaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MLuaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclThing(MLuaParser.FuncDeclThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThing(MLuaParser.StatementThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassThing(MLuaParser.ClassThingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeThing(MLuaParser.IncludeThingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(MLuaParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#varHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarHeader(MLuaParser.VarHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(MLuaParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MLuaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MLuaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MLuaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForKVStatement(MLuaParser.ForKVStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(MLuaParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOolForEachStatement(MLuaParser.OolForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MLuaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarExpr(MLuaParser.SetVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpr(MLuaParser.InstanceofExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(MLuaParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(MLuaParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(MLuaParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MLuaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexSugar(MLuaParser.TableIndexSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallSugar(MLuaParser.FuncCallSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(MLuaParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAtom(MLuaParser.TableAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(MLuaParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MLuaParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAtom(MLuaParser.FuncAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(MLuaParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(MLuaParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTable(MLuaParser.ArrayTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyTable(MLuaParser.KeyTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#dotNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotation(MLuaParser.DotNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#dotNotationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotationSection(MLuaParser.DotNotationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotationSeperator(MLuaParser.DotNotationSeperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#classCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreate(MLuaParser.ClassCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMember(MLuaParser.VarMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncMember(MLuaParser.FuncMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorMember(MLuaParser.ConstructorMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(MLuaParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArgs(MLuaParser.FuncCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclArgs(MLuaParser.FuncDeclArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MLuaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MLuaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MLuaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(MLuaParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#staticKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticKeyword(MLuaParser.StaticKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLuaParser#lenOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenOperator(MLuaParser.LenOperatorContext ctx);
}