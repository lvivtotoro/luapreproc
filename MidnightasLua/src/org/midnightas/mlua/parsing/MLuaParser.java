// Generated from MLua.g4 by ANTLR 4.5.3
package org.midnightas.mlua.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, END_OF_STMT=48, UNARY_MINUS=49, LEN_OPERATOR=50, LOCAL=51, 
		STATIC=52, IDENTIFIER=53, NUMBER=54, STRING=55, BLOCK_COMMENT=56, LINE_COMMENT=57, 
		WHITESPACE=58;
	public static final int
		RULE_program = 0, RULE_programThing = 1, RULE_funcDecl = 2, RULE_varHeader = 3, 
		RULE_statement = 4, RULE_expr = 5, RULE_exprAtomSugar = 6, RULE_exprAtom = 7, 
		RULE_table = 8, RULE_dotNotation = 9, RULE_dotNotationSection = 10, RULE_dotNotationSeperator = 11, 
		RULE_classCreate = 12, RULE_classMember = 13, RULE_classBlock = 14, RULE_funcCallArgs = 15, 
		RULE_funcDeclArgs = 16, RULE_identifier = 17, RULE_string = 18, RULE_number = 19, 
		RULE_local = 20, RULE_staticKeyword = 21, RULE_lenOperator = 22;
	public static final String[] ruleNames = {
		"program", "programThing", "funcDecl", "varHeader", "statement", "expr", 
		"exprAtomSugar", "exprAtom", "table", "dotNotation", "dotNotationSection", 
		"dotNotationSeperator", "classCreate", "classMember", "classBlock", "funcCallArgs", 
		"funcDeclArgs", "identifier", "string", "number", "local", "staticKeyword", 
		"lenOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'('", "')'", "'function'", "'end'", "'='", "'if'", 
		"'then'", "'else'", "'while'", "'do'", "'break'", "'for'", "','", "'in'", 
		"'foreach'", "'switch'", "'case'", "'default'", "'return'", "'and'", "'or'", 
		"'%'", "'=='", "'~='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'+'", 
		"'..'", "'?'", "':'", "'instanceof'", "'['", "']'", "'lambda'", "'nil'", 
		"'{'", "'}'", "'.'", "'class'", "'extending'", "'contains'", "'constructor'", 
		"';'", "'-'", "'#'", "'local'", "'static'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"END_OF_STMT", "UNARY_MINUS", "LEN_OPERATOR", "LOCAL", "STATIC", "IDENTIFIER", 
		"NUMBER", "STRING", "BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MLua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MLuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ProgramThingContext> programThing() {
			return getRuleContexts(ProgramThingContext.class);
		}
		public ProgramThingContext programThing(int i) {
			return getRuleContext(ProgramThingContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << UNARY_MINUS) | (1L << LEN_OPERATOR) | (1L << LOCAL) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(46);
				programThing();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramThingContext extends ParserRuleContext {
		public ProgramThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programThing; }
	 
		public ProgramThingContext() { }
		public void copyFrom(ProgramThingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassThingContext extends ProgramThingContext {
		public ClassCreateContext classCreate() {
			return getRuleContext(ClassCreateContext.class,0);
		}
		public ClassThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterClassThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitClassThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitClassThing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LuaIncludeThingContext extends ProgramThingContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public LuaIncludeThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterLuaIncludeThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitLuaIncludeThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitLuaIncludeThing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclThingContext extends ProgramThingContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public FuncDeclThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncDeclThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncDeclThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncDeclThing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementThingContext extends ProgramThingContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterStatementThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitStatementThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitStatementThing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncludeThingContext extends ProgramThingContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public IncludeThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterIncludeThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitIncludeThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitIncludeThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramThingContext programThing() throws RecognitionException {
		ProgramThingContext _localctx = new ProgramThingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programThing);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FuncDeclThingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				funcDecl();
				}
				break;
			case 2:
				_localctx = new StatementThingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				statement();
				}
				break;
			case 3:
				_localctx = new ClassThingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				classCreate();
				}
				break;
			case 4:
				_localctx = new IncludeThingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(T__0);
				setState(56);
				string();
				setState(57);
				match(END_OF_STMT);
				}
				break;
			case 5:
				_localctx = new LuaIncludeThingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(T__0);
				setState(60);
				match(T__1);
				setState(61);
				string();
				setState(62);
				match(T__2);
				setState(63);
				match(END_OF_STMT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__3);
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(68);
				dotNotation();
				}
				break;
			}
			setState(71);
			match(T__1);
			setState(72);
			funcDeclArgs();
			setState(73);
			match(T__2);
			setState(74);
			program();
			setState(75);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarHeaderContext extends ParserRuleContext {
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterVarHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitVarHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitVarHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHeaderContext varHeader() throws RecognitionException {
		VarHeaderContext _localctx = new VarHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			dotNotation();
			setState(78);
			match(T__5);
			setState(79);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public ProgramContext yes;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEachStatementContext extends StatementContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ForEachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForKVStatementContext extends StatementContext {
		public ExprContext start;
		public ExprContext check;
		public ExprContext steps;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForKVStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterForKVStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitForKVStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitForKVStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OolForEachStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public OolForEachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterOolForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitOolForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitOolForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public ProgramContext yes;
		public ProgramContext no;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public ProgramContext defaultCase;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				expr(0);
				setState(82);
				match(END_OF_STMT);
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__6);
				setState(85);
				expr(0);
				setState(86);
				match(T__7);
				setState(87);
				((IfStatementContext)_localctx).yes = program();
				setState(90);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(88);
					match(T__8);
					setState(89);
					((IfStatementContext)_localctx).no = program();
					}
				}

				setState(92);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__9);
				setState(95);
				expr(0);
				setState(96);
				match(T__10);
				setState(97);
				((WhileStatementContext)_localctx).yes = program();
				setState(98);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(T__11);
				setState(101);
				match(END_OF_STMT);
				}
				break;
			case 5:
				_localctx = new ForKVStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(T__12);
				setState(103);
				identifier();
				setState(104);
				match(T__5);
				setState(105);
				((ForKVStatementContext)_localctx).start = expr(0);
				setState(106);
				match(T__13);
				setState(107);
				((ForKVStatementContext)_localctx).check = expr(0);
				setState(110);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(108);
					match(T__13);
					setState(109);
					((ForKVStatementContext)_localctx).steps = expr(0);
					}
				}

				setState(112);
				match(T__10);
				setState(113);
				program();
				setState(114);
				match(T__4);
				}
				break;
			case 6:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(T__12);
				setState(117);
				identifier();
				setState(118);
				match(T__13);
				setState(119);
				identifier();
				setState(120);
				match(T__14);
				setState(121);
				expr(0);
				setState(122);
				match(T__10);
				setState(123);
				program();
				setState(124);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new OolForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				match(T__15);
				setState(127);
				identifier();
				setState(128);
				match(T__14);
				setState(129);
				expr(0);
				setState(130);
				match(T__10);
				setState(131);
				program();
				setState(132);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(T__16);
				setState(135);
				expr(0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(136);
					match(T__17);
					setState(137);
					expr(0);
					setState(138);
					match(T__7);
					setState(139);
					program();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(146);
					match(T__18);
					setState(147);
					match(T__7);
					setState(148);
					((SwitchStatementContext)_localctx).defaultCase = program();
					}
				}

				setState(151);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				match(T__19);
				setState(154);
				expr(0);
				setState(155);
				match(END_OF_STMT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetVarExprContext extends ExprContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public FuncCallArgsContext funcCallArgs() {
			return getRuleContext(FuncCallArgsContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public SetVarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterSetVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitSetVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitSetVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceofExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public InstanceofExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterInstanceofExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitInstanceofExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitInstanceofExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleExprContext extends ExprContext {
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExprContext extends ExprContext {
		public ExprContext check;
		public ExprContext yes;
		public ExprContext no;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				exprAtom();
				}
				break;
			case 2:
				{
				_localctx = new SetVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(161);
					local();
					}
				}

				setState(164);
				funcDeclArgs();
				setState(165);
				match(T__5);
				setState(166);
				funcCallArgs();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(T__1);
				setState(169);
				expr(0);
				setState(170);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(176);
						((OpExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(179);
						((OpExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(182);
						((OpExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << UNARY_MINUS))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(185);
						((OpExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new TernaryExprContext(new ExprContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						match(T__33);
						setState(188);
						((TernaryExprContext)_localctx).yes = expr(0);
						setState(189);
						match(T__34);
						setState(190);
						((TernaryExprContext)_localctx).no = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new InstanceofExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(193);
						match(T__35);
						setState(194);
						dotNotation();
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprAtomSugarContext extends ParserRuleContext {
		public ExprAtomSugarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtomSugar; }
	 
		public ExprAtomSugarContext() { }
		public void copyFrom(ExprAtomSugarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallSugarContext extends ExprAtomSugarContext {
		public FuncCallArgsContext funcCallArgs() {
			return getRuleContext(FuncCallArgsContext.class,0);
		}
		public FuncCallSugarContext(ExprAtomSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncCallSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncCallSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncCallSugar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableIndexSugarContext extends ExprAtomSugarContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TableIndexSugarContext(ExprAtomSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterTableIndexSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitTableIndexSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitTableIndexSugar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomSugarContext exprAtomSugar() throws RecognitionException {
		ExprAtomSugarContext _localctx = new ExprAtomSugarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprAtomSugar);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case T__36:
				_localctx = new TableIndexSugarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__36);
				setState(201);
				expr(0);
				setState(202);
				match(T__37);
				}
				break;
			case T__1:
				_localctx = new FuncCallSugarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__1);
				setState(205);
				funcCallArgs();
				setState(206);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAtomContext extends ParserRuleContext {
		public ExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtom; }
	 
		public ExprAtomContext() { }
		public void copyFrom(ExprAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierAtomContext extends ExprAtomContext {
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public LenOperatorContext lenOperator() {
			return getRuleContext(LenOperatorContext.class,0);
		}
		public IdentifierAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitIdentifierAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitIdentifierAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends ExprAtomContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends ExprAtomContext {
		public NilAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends ExprAtomContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncAtomContext extends ExprAtomContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public FuncAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableAtomContext extends ExprAtomContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TableAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterTableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitTableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAtomContext extends ExprAtomContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LambdaAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterLambdaAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitLambdaAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitLambdaAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprAtom);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case UNARY_MINUS:
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				number();
				}
				break;
			case T__40:
				_localctx = new TableAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				table();
				}
				break;
			case T__1:
			case LEN_OPERATOR:
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				_la = _input.LA(1);
				if (_la==LEN_OPERATOR) {
					{
					setState(212);
					lenOperator();
					}
				}

				setState(215);
				dotNotation();
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				string();
				}
				break;
			case T__3:
				_localctx = new FuncAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				funcDecl();
				}
				break;
			case T__38:
				_localctx = new LambdaAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(T__38);
				setState(219);
				funcDeclArgs();
				setState(220);
				match(T__34);
				setState(221);
				expr(0);
				}
				break;
			case T__39:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(T__39);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTableContext extends TableContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterArrayTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitArrayTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitArrayTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyTableContext extends TableContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public KeyTableContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterKeyTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitKeyTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitKeyTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__40);
				setState(235);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << UNARY_MINUS) | (1L << LEN_OPERATOR) | (1L << LOCAL) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(227);
					expr(0);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(228);
						match(T__13);
						setState(229);
						expr(0);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(237);
				match(T__41);
				}
				break;
			case 2:
				_localctx = new KeyTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__40);
				setState(252);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(239);
					identifier();
					setState(240);
					match(T__5);
					setState(241);
					expr(0);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(242);
						match(T__13);
						setState(243);
						identifier();
						setState(244);
						match(T__5);
						setState(245);
						expr(0);
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(254);
				match(T__41);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotNotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprAtomSugarContext> exprAtomSugar() {
			return getRuleContexts(ExprAtomSugarContext.class);
		}
		public ExprAtomSugarContext exprAtomSugar(int i) {
			return getRuleContext(ExprAtomSugarContext.class,i);
		}
		public List<DotNotationSectionContext> dotNotationSection() {
			return getRuleContexts(DotNotationSectionContext.class);
		}
		public DotNotationSectionContext dotNotationSection(int i) {
			return getRuleContext(DotNotationSectionContext.class,i);
		}
		public DotNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterDotNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitDotNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitDotNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationContext dotNotation() throws RecognitionException {
		DotNotationContext _localctx = new DotNotationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dotNotation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(257);
				identifier();
				}
				break;
			case T__1:
				{
				setState(258);
				match(T__1);
				setState(259);
				expr(0);
				setState(260);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					exprAtomSugar();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					dotNotationSection();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotNotationSectionContext extends ParserRuleContext {
		public DotNotationSeperatorContext dotNotationSeperator() {
			return getRuleContext(DotNotationSeperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExprAtomSugarContext> exprAtomSugar() {
			return getRuleContexts(ExprAtomSugarContext.class);
		}
		public ExprAtomSugarContext exprAtomSugar(int i) {
			return getRuleContext(ExprAtomSugarContext.class,i);
		}
		public DotNotationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterDotNotationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitDotNotationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitDotNotationSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationSectionContext dotNotationSection() throws RecognitionException {
		DotNotationSectionContext _localctx = new DotNotationSectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dotNotationSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			dotNotationSeperator();
			setState(277);
			identifier();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					exprAtomSugar();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotNotationSeperatorContext extends ParserRuleContext {
		public DotNotationSeperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotationSeperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterDotNotationSeperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitDotNotationSeperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitDotNotationSeperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationSeperatorContext dotNotationSeperator() throws RecognitionException {
		DotNotationSeperatorContext _localctx = new DotNotationSeperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dotNotationSeperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreateContext extends ParserRuleContext {
		public DotNotationContext name;
		public DotNotationContext extending;
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public List<DotNotationContext> dotNotation() {
			return getRuleContexts(DotNotationContext.class);
		}
		public DotNotationContext dotNotation(int i) {
			return getRuleContext(DotNotationContext.class,i);
		}
		public ClassCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterClassCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitClassCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitClassCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreateContext classCreate() throws RecognitionException {
		ClassCreateContext _localctx = new ClassCreateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classCreate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__43);
			setState(287);
			((ClassCreateContext)_localctx).name = dotNotation();
			setState(290);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(288);
				match(T__44);
				setState(289);
				((ClassCreateContext)_localctx).extending = dotNotation();
				}
			}

			setState(292);
			match(T__45);
			setState(293);
			classBlock();
			setState(294);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncMemberContext extends ClassMemberContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public StaticKeywordContext staticKeyword() {
			return getRuleContext(StaticKeywordContext.class,0);
		}
		public FuncMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorMemberContext extends ClassMemberContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ConstructorMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterConstructorMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitConstructorMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitConstructorMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarMemberContext extends ClassMemberContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(MLuaParser.END_OF_STMT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StaticKeywordContext staticKeyword() {
			return getRuleContext(StaticKeywordContext.class,0);
		}
		public VarMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterVarMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitVarMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitVarMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classMember);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new VarMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(296);
					staticKeyword();
					}
				}

				setState(299);
				identifier();
				{
				setState(300);
				match(T__5);
				setState(301);
				expr(0);
				}
				setState(303);
				match(END_OF_STMT);
				}
				break;
			case 2:
				_localctx = new FuncMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(305);
					staticKeyword();
					}
				}

				setState(308);
				funcDecl();
				}
				break;
			case 3:
				_localctx = new ConstructorMemberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(T__46);
				setState(310);
				match(T__1);
				setState(311);
				funcDeclArgs();
				setState(312);
				match(T__2);
				setState(313);
				program();
				setState(314);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBlockContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__46) | (1L << STATIC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(318);
				classMember();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncCallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
		FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcCallArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(324);
				expr(0);
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(T__13);
						setState(326);
						expr(0);
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclArgsContext extends ParserRuleContext {
		public List<DotNotationContext> dotNotation() {
			return getRuleContexts(DotNotationContext.class);
		}
		public DotNotationContext dotNotation(int i) {
			return getRuleContext(DotNotationContext.class,i);
		}
		public FuncDeclArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterFuncDeclArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitFuncDeclArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitFuncDeclArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclArgsContext funcDeclArgs() throws RecognitionException {
		FuncDeclArgsContext _localctx = new FuncDeclArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcDeclArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(334);
				dotNotation();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(335);
					match(T__13);
					setState(336);
					dotNotation();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MLuaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public String value;
		public Token STRING;
		public TerminalNode STRING() { return getToken(MLuaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((StringContext)_localctx).STRING = match(STRING);
			 ((StringContext)_localctx).value =  ((StringContext)_localctx).STRING.getText(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Double value;
		public Token UNARY_MINUS;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(MLuaParser.NUMBER, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(MLuaParser.UNARY_MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if (_la==UNARY_MINUS) {
				{
				setState(349);
				((NumberContext)_localctx).UNARY_MINUS = match(UNARY_MINUS);
				}
			}

			setState(352);
			((NumberContext)_localctx).NUMBER = match(NUMBER);
			 ((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).UNARY_MINUS == null ? "" : "-") + ((NumberContext)_localctx).NUMBER.getText()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(MLuaParser.LOCAL, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LOCAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticKeywordContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(MLuaParser.STATIC, 0); }
		public StaticKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterStaticKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitStaticKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitStaticKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticKeywordContext staticKeyword() throws RecognitionException {
		StaticKeywordContext _localctx = new StaticKeywordContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LenOperatorContext extends ParserRuleContext {
		public TerminalNode LEN_OPERATOR() { return getToken(MLuaParser.LEN_OPERATOR, 0); }
		public LenOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).enterLenOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLuaListener ) ((MLuaListener)listener).exitLenOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MLuaVisitor ) return ((MLuaVisitor<? extends T>)visitor).visitLenOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenOperatorContext lenOperator() throws RecognitionException {
		LenOperatorContext _localctx = new LenOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lenOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LEN_OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3"+
		"\6\3\6\3\6\5\6\u0098\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\7\3\7"+
		"\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00c6\n\7\f\7\16\7\u00c9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00d3\n\b\3\t\3\t\3\t\5\t\u00d8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00e3\n\t\3\n\3\n\3\n\3\n\7\n\u00e9\n\n\f\n\16\n\u00ec"+
		"\13\n\5\n\u00ee\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fa"+
		"\n\n\f\n\16\n\u00fd\13\n\5\n\u00ff\n\n\3\n\5\n\u0102\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0109\n\13\3\13\7\13\u010c\n\13\f\13\16\13\u010f\13\13"+
		"\3\13\7\13\u0112\n\13\f\13\16\13\u0115\13\13\3\f\3\f\3\f\7\f\u011a\n\f"+
		"\f\f\16\f\u011d\13\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0125\n\16\3\16"+
		"\3\16\3\16\3\16\3\17\5\17\u012c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0135\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013f\n"+
		"\17\3\20\7\20\u0142\n\20\f\20\16\20\u0145\13\20\3\21\3\21\3\21\7\21\u014a"+
		"\n\21\f\21\16\21\u014d\13\21\5\21\u014f\n\21\3\22\3\22\3\22\7\22\u0154"+
		"\n\22\f\22\16\22\u0157\13\22\5\22\u0159\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\5\25\u0161\n\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\2\3\f\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\27\30"+
		"\3\2\31\37\3\2 !\4\2\"#\63\63\4\2%%--\u018b\2\63\3\2\2\2\4C\3\2\2\2\6"+
		"E\3\2\2\2\bO\3\2\2\2\n\u009f\3\2\2\2\f\u00ae\3\2\2\2\16\u00d2\3\2\2\2"+
		"\20\u00e2\3\2\2\2\22\u0101\3\2\2\2\24\u0108\3\2\2\2\26\u0116\3\2\2\2\30"+
		"\u011e\3\2\2\2\32\u0120\3\2\2\2\34\u013e\3\2\2\2\36\u0143\3\2\2\2 \u014e"+
		"\3\2\2\2\"\u0158\3\2\2\2$\u015a\3\2\2\2&\u015c\3\2\2\2(\u0160\3\2\2\2"+
		"*\u0165\3\2\2\2,\u0167\3\2\2\2.\u0169\3\2\2\2\60\62\5\4\3\2\61\60\3\2"+
		"\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2"+
		"\2\2\66D\5\6\4\2\67D\5\n\6\28D\5\32\16\29:\7\3\2\2:;\5&\24\2;<\7\62\2"+
		"\2<D\3\2\2\2=>\7\3\2\2>?\7\4\2\2?@\5&\24\2@A\7\5\2\2AB\7\62\2\2BD\3\2"+
		"\2\2C\66\3\2\2\2C\67\3\2\2\2C8\3\2\2\2C9\3\2\2\2C=\3\2\2\2D\5\3\2\2\2"+
		"EG\7\6\2\2FH\5\24\13\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\4\2\2JK\5\"\22"+
		"\2KL\7\5\2\2LM\5\2\2\2MN\7\7\2\2N\7\3\2\2\2OP\5\24\13\2PQ\7\b\2\2QR\5"+
		"\f\7\2R\t\3\2\2\2ST\5\f\7\2TU\7\62\2\2U\u00a0\3\2\2\2VW\7\t\2\2WX\5\f"+
		"\7\2XY\7\n\2\2Y\\\5\2\2\2Z[\7\13\2\2[]\5\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"^\3\2\2\2^_\7\7\2\2_\u00a0\3\2\2\2`a\7\f\2\2ab\5\f\7\2bc\7\r\2\2cd\5\2"+
		"\2\2de\7\7\2\2e\u00a0\3\2\2\2fg\7\16\2\2g\u00a0\7\62\2\2hi\7\17\2\2ij"+
		"\5$\23\2jk\7\b\2\2kl\5\f\7\2lm\7\20\2\2mp\5\f\7\2no\7\20\2\2oq\5\f\7\2"+
		"pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\r\2\2st\5\2\2\2tu\7\7\2\2u\u00a0\3"+
		"\2\2\2vw\7\17\2\2wx\5$\23\2xy\7\20\2\2yz\5$\23\2z{\7\21\2\2{|\5\f\7\2"+
		"|}\7\r\2\2}~\5\2\2\2~\177\7\7\2\2\177\u00a0\3\2\2\2\u0080\u0081\7\22\2"+
		"\2\u0081\u0082\5$\23\2\u0082\u0083\7\21\2\2\u0083\u0084\5\f\7\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0086\5\2\2\2\u0086\u0087\7\7\2\2\u0087\u00a0\3\2"+
		"\2\2\u0088\u0089\7\23\2\2\u0089\u0091\5\f\7\2\u008a\u008b\7\24\2\2\u008b"+
		"\u008c\5\f\7\2\u008c\u008d\7\n\2\2\u008d\u008e\5\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008a\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0097\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\25"+
		"\2\2\u0095\u0096\7\n\2\2\u0096\u0098\5\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u00a0\3\2"+
		"\2\2\u009b\u009c\7\26\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7\62\2\2\u009e"+
		"\u00a0\3\2\2\2\u009fS\3\2\2\2\u009fV\3\2\2\2\u009f`\3\2\2\2\u009ff\3\2"+
		"\2\2\u009fh\3\2\2\2\u009fv\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u0088\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\b\7\1\2\u00a2\u00af"+
		"\5\20\t\2\u00a3\u00a5\5*\26\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9"+
		"\5 \21\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\f\7\2\u00ac"+
		"\u00ad\7\5\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a4\3\2"+
		"\2\2\u00ae\u00aa\3\2\2\2\u00af\u00c7\3\2\2\2\u00b0\u00b1\f\13\2\2\u00b1"+
		"\u00b2\t\2\2\2\u00b2\u00c6\5\f\7\f\u00b3\u00b4\f\n\2\2\u00b4\u00b5\t\3"+
		"\2\2\u00b5\u00c6\5\f\7\13\u00b6\u00b7\f\t\2\2\u00b7\u00b8\t\4\2\2\u00b8"+
		"\u00c6\5\f\7\n\u00b9\u00ba\f\b\2\2\u00ba\u00bb\t\5\2\2\u00bb\u00c6\5\f"+
		"\7\t\u00bc\u00bd\f\6\2\2\u00bd\u00be\7$\2\2\u00be\u00bf\5\f\7\2\u00bf"+
		"\u00c0\7%\2\2\u00c0\u00c1\5\f\7\7\u00c1\u00c6\3\2\2\2\u00c2\u00c3\f\3"+
		"\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bc\3\2"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\'\2\2"+
		"\u00cb\u00cc\5\f\7\2\u00cc\u00cd\7(\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf"+
		"\7\4\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\7\5\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\17\3\2\2\2\u00d4\u00e3\5(\25"+
		"\2\u00d5\u00e3\5\22\n\2\u00d6\u00d8\5.\30\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e3\5\24\13\2\u00da\u00e3\5"+
		"&\24\2\u00db\u00e3\5\6\4\2\u00dc\u00dd\7)\2\2\u00dd\u00de\5\"\22\2\u00de"+
		"\u00df\7%\2\2\u00df\u00e0\5\f\7\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3\7*\2"+
		"\2\u00e2\u00d4\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2\u00da"+
		"\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\21\3\2\2\2\u00e4\u00ed\7+\2\2\u00e5\u00ea\5\f\7\2\u00e6\u00e7\7\20\2"+
		"\2\u00e7\u00e9\5\f\7\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00e5\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0102\7,"+
		"\2\2\u00f0\u00fe\7+\2\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7\b\2\2\u00f3"+
		"\u00fb\5\f\7\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7"+
		"\b\2\2\u00f7\u00f8\5\f\7\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\7,\2\2\u0101\u00e4\3\2\2\2\u0101\u00f0\3\2"+
		"\2\2\u0102\23\3\2\2\2\u0103\u0109\5$\23\2\u0104\u0105\7\4\2\2\u0105\u0106"+
		"\5\f\7\2\u0106\u0107\7\5\2\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u010c\5\16\b\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0113\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\5\26\f\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\25\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\5\30\r\2\u0117\u011b\5$\23"+
		"\2\u0118\u011a\5\16\b\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\27\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011e\u011f\t\6\2\2\u011f\31\3\2\2\2\u0120\u0121\7.\2\2\u0121\u0124"+
		"\5\24\13\2\u0122\u0123\7/\2\2\u0123\u0125\5\24\13\2\u0124\u0122\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\60\2\2\u0127"+
		"\u0128\5\36\20\2\u0128\u0129\7\7\2\2\u0129\33\3\2\2\2\u012a\u012c\5,\27"+
		"\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\5$\23\2\u012e\u012f\7\b\2\2\u012f\u0130\5\f\7\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\62\2\2\u0132\u013f\3\2\2\2\u0133\u0135\5,\27\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013f\5\6\4\2\u0137"+
		"\u0138\7\61\2\2\u0138\u0139\7\4\2\2\u0139\u013a\5\"\22\2\u013a\u013b\7"+
		"\5\2\2\u013b\u013c\5\2\2\2\u013c\u013d\7\7\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u012b\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0137\3\2\2\2\u013f\35\3\2\2"+
		"\2\u0140\u0142\5\34\17\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\37\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u014b\5\f\7\2\u0147\u0148\7\20\2\2\u0148\u014a\5\f\7\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0146\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f!\3\2\2\2\u0150\u0155\5\24\13\2\u0151\u0152\7\20\2"+
		"\2\u0152\u0154\5\24\13\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u0150\3\2\2\2\u0158\u0159\3\2\2\2\u0159#\3\2\2\2\u015a\u015b"+
		"\7\67\2\2\u015b%\3\2\2\2\u015c\u015d\79\2\2\u015d\u015e\b\24\1\2\u015e"+
		"\'\3\2\2\2\u015f\u0161\7\63\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162\u0163\78\2\2\u0163\u0164\b\25\1\2\u0164)"+
		"\3\2\2\2\u0165\u0166\7\65\2\2\u0166+\3\2\2\2\u0167\u0168\7\66\2\2\u0168"+
		"-\3\2\2\2\u0169\u016a\7\64\2\2\u016a/\3\2\2\2$\63CG\\p\u0091\u0097\u009f"+
		"\u00a4\u00ae\u00c5\u00c7\u00d2\u00d7\u00e2\u00ea\u00ed\u00fb\u00fe\u0101"+
		"\u0108\u010d\u0113\u011b\u0124\u012b\u0134\u013e\u0143\u014b\u014e\u0155"+
		"\u0158\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}