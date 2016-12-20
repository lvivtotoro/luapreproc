// Generated from OOL.g4 by ANTLR 4.5.3
package org.midnightas.ool.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OOLParser}.
 */
public interface OOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclThing(OOLParser.FuncDeclThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclThing(OOLParser.FuncDeclThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterStatementThing(OOLParser.StatementThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitStatementThing(OOLParser.StatementThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterClassThing(OOLParser.ClassThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitClassThing(OOLParser.ClassThingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void enterIncludeThing(OOLParser.IncludeThingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeThing}
	 * labeled alternative in {@link OOLParser#programThing}.
	 * @param ctx the parse tree
	 */
	void exitIncludeThing(OOLParser.IncludeThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(OOLParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(OOLParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#varHeader}.
	 * @param ctx the parse tree
	 */
	void enterVarHeader(OOLParser.VarHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#varHeader}.
	 * @param ctx the parse tree
	 */
	void exitVarHeader(OOLParser.VarHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(OOLParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(OOLParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OOLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OOLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(OOLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(OOLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(OOLParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(OOLParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForKVStatement(OOLParser.ForKVStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forKVStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForKVStatement(OOLParser.ForKVStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(OOLParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(OOLParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOolForEachStatement(OOLParser.OolForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oolForEachStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOolForEachStatement(OOLParser.OolForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OOLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OOLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetVarExpr(OOLParser.SetVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetVarExpr(OOLParser.SetVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpr(OOLParser.InstanceofExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpr(OOLParser.InstanceofExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(OOLParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(OOLParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(OOLParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(OOLParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(OOLParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(OOLParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(OOLParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(OOLParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexSugar(OOLParser.TableIndexSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableIndexSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexSugar(OOLParser.TableIndexSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallSugar(OOLParser.FuncCallSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OOLParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallSugar(OOLParser.FuncCallSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(OOLParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(OOLParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterTableAtom(OOLParser.TableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitTableAtom(OOLParser.TableAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(OOLParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(OOLParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(OOLParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(OOLParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterFuncAtom(OOLParser.FuncAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitFuncAtom(OOLParser.FuncAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAtom(OOLParser.LambdaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAtom(OOLParser.LambdaAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(OOLParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link OOLParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(OOLParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterArrayTable(OOLParser.ArrayTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitArrayTable(OOLParser.ArrayTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterKeyTable(OOLParser.KeyTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyTable}
	 * labeled alternative in {@link OOLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitKeyTable(OOLParser.KeyTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void enterDotNotation(OOLParser.DotNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void exitDotNotation(OOLParser.DotNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#dotNotationSection}.
	 * @param ctx the parse tree
	 */
	void enterDotNotationSection(OOLParser.DotNotationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#dotNotationSection}.
	 * @param ctx the parse tree
	 */
	void exitDotNotationSection(OOLParser.DotNotationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 */
	void enterDotNotationSeperator(OOLParser.DotNotationSeperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#dotNotationSeperator}.
	 * @param ctx the parse tree
	 */
	void exitDotNotationSeperator(OOLParser.DotNotationSeperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#classCreate}.
	 * @param ctx the parse tree
	 */
	void enterClassCreate(OOLParser.ClassCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#classCreate}.
	 * @param ctx the parse tree
	 */
	void exitClassCreate(OOLParser.ClassCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVarMember(OOLParser.VarMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVarMember(OOLParser.VarMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterFuncMember(OOLParser.FuncMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitFuncMember(OOLParser.FuncMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterConstructorMember(OOLParser.ConstructorMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorMember}
	 * labeled alternative in {@link OOLParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitConstructorMember(OOLParser.ConstructorMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(OOLParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(OOLParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArgs(OOLParser.FuncCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArgs(OOLParser.FuncCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclArgs(OOLParser.FuncDeclArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclArgs(OOLParser.FuncDeclArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OOLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OOLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(OOLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(OOLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OOLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OOLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(OOLParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(OOLParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStaticKeyword(OOLParser.StaticKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStaticKeyword(OOLParser.StaticKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OOLParser#lenOperator}.
	 * @param ctx the parse tree
	 */
	void enterLenOperator(OOLParser.LenOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OOLParser#lenOperator}.
	 * @param ctx the parse tree
	 */
	void exitLenOperator(OOLParser.LenOperatorContext ctx);
}