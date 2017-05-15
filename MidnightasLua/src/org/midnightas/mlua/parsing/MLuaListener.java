// Generated from MLua.g4 by ANTLR 4.5.3
package org.midnightas.mlua.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MLuaParser}.
 */
public interface MLuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MLuaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MLuaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MLuaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclThing(MLuaParser.FuncDeclThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclThing(MLuaParser.FuncDeclThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterStatementThing(MLuaParser.StatementThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitStatementThing(MLuaParser.StatementThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterClassThing(MLuaParser.ClassThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitClassThing(MLuaParser.ClassThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterIncludeThing(MLuaParser.IncludeThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitIncludeThing(MLuaParser.IncludeThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code luaIncludeThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterLuaIncludeThing(MLuaParser.LuaIncludeThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code luaIncludeThing}
	 * labeled alternative in {@link MLuaParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitLuaIncludeThing(MLuaParser.LuaIncludeThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(MLuaParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(MLuaParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#varHeader}.
	 * @param ctx the parse tree
	 */
	void enterVarHeader(MLuaParser.VarHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#varHeader}.
	 * @param ctx the parse tree
	 */
	void exitVarHeader(MLuaParser.VarHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(MLuaParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(MLuaParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MLuaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MLuaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MLuaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MLuaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MLuaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MLuaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForKVStatement(MLuaParser.ForKVStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForKVStatement(MLuaParser.ForKVStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(MLuaParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(MLuaParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOolForEachStatement(MLuaParser.OolForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOolForEachStatement(MLuaParser.OolForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(MLuaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(MLuaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MLuaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MLuaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MLuaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetVarExpr(MLuaParser.SetVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetVarExpr(MLuaParser.SetVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpr(MLuaParser.InstanceofExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpr(MLuaParser.InstanceofExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(MLuaParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(MLuaParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(MLuaParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(MLuaParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(MLuaParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(MLuaParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MLuaParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MLuaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MLuaParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexSugar(MLuaParser.TableIndexSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexSugar(MLuaParser.TableIndexSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallSugar(MLuaParser.FuncCallSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link MLuaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallSugar(MLuaParser.FuncCallSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(MLuaParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(MLuaParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTableAtom(MLuaParser.TableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTableAtom(MLuaParser.TableAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(MLuaParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(MLuaParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MLuaParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MLuaParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterFuncAtom(MLuaParser.FuncAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitFuncAtom(MLuaParser.FuncAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAtom(MLuaParser.LambdaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAtom(MLuaParser.LambdaAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(MLuaParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MLuaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(MLuaParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 */
	void enterArrayTable(MLuaParser.ArrayTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 */
	void exitArrayTable(MLuaParser.ArrayTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 */
	void enterKeyTable(MLuaParser.KeyTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link MLuaParser#table}.
	 * @param ctx the parse tree
	 */
	void exitKeyTable(MLuaParser.KeyTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void enterDotNotation(MLuaParser.DotNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void exitDotNotation(MLuaParser.DotNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#dotNotationSection}.
	 * @param ctx the parse tree
	 */
	void enterDotNotationSection(MLuaParser.DotNotationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#dotNotationSection}.
	 * @param ctx the parse tree
	 */
	void exitDotNotationSection(MLuaParser.DotNotationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 */
	void enterDotNotationSeperator(MLuaParser.DotNotationSeperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 */
	void exitDotNotationSeperator(MLuaParser.DotNotationSeperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#classCreate}.
	 * @param ctx the parse tree
	 */
	void enterClassCreate(MLuaParser.ClassCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#classCreate}.
	 * @param ctx the parse tree
	 */
	void exitClassCreate(MLuaParser.ClassCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVarMember(MLuaParser.VarMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVarMember(MLuaParser.VarMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterFuncMember(MLuaParser.FuncMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitFuncMember(MLuaParser.FuncMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterConstructorMember(MLuaParser.ConstructorMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link MLuaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitConstructorMember(MLuaParser.ConstructorMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(MLuaParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(MLuaParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArgs(MLuaParser.FuncCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArgs(MLuaParser.FuncCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclArgs(MLuaParser.FuncDeclArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclArgs(MLuaParser.FuncDeclArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MLuaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MLuaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MLuaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MLuaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MLuaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MLuaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(MLuaParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(MLuaParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStaticKeyword(MLuaParser.StaticKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStaticKeyword(MLuaParser.StaticKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLuaParser#lenOperator}.
	 * @param ctx the parse tree
	 */
	void enterLenOperator(MLuaParser.LenOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLuaParser#lenOperator}.
	 * @param ctx the parse tree
	 */
	void exitLenOperator(MLuaParser.LenOperatorContext ctx);
}