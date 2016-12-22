// Generated from OOL.g4 by ANTLR 4.5.3
package org.midnightas.ool.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OOLParser extends Parser {
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
		T__45=46, T__46=47, UNARY_MINUS=48, LEN_OPERATOR=49, LOCAL=50, STATIC=51, 
		IDENTIFIER=52, NUMBER=53, STRING=54, BLOCK_COMMENT=55, LINE_COMMENT=56, 
		WHITESPACE=57;
	public static final int
		RULE_program = 0, RULE_programThing = 1, RULE_funcDecl = 2, RULE_varHeader = 3, 
		RULE_statement = 4, RULE_expr = 5, RULE_exprAtomSugar = 6, RULE_exprAtom = 7, 
		RULE_table = 8, RULE_dotNotation = 9, RULE_dotNotationSection = 10, RULE_dotNotationSeperator = 11, 
		RULE_classCreate = 12, RULE_classMember = 13, RULE_newLine = 14, RULE_classBlock = 15, 
		RULE_funcCallArgs = 16, RULE_funcDeclArgs = 17, RULE_identifier = 18, 
		RULE_string = 19, RULE_number = 20, RULE_local = 21, RULE_staticKeyword = 22, 
		RULE_lenOperator = 23;
	public static final String[] ruleNames = {
		"program", "programThing", "funcDecl", "varHeader", "statement", "expr", 
		"exprAtomSugar", "exprAtom", "table", "dotNotation", "dotNotationSection", 
		"dotNotationSeperator", "classCreate", "classMember", "newLine", "classBlock", 
		"funcCallArgs", "funcDeclArgs", "identifier", "string", "number", "local", 
		"staticKeyword", "lenOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "';'", "'function'", "'('", "')'", "'end'", "'='", 
		"'if'", "'then'", "'else'", "'while'", "'do'", "'break'", "'for'", "','", 
		"'in'", "'foreach'", "'return'", "'and'", "'or'", "'%'", "'=='", "'~='", 
		"'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'+'", "'..'", "'?'", "':'", 
		"'instanceof'", "'['", "']'", "'lambda'", "'nil'", "'{'", "'}'", "'.'", 
		"'class'", "'extending'", "'contains'", "'constructor'", "'\r'", "'\n'", 
		"'-'", "'#'", "'local'", "'static'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"UNARY_MINUS", "LEN_OPERATOR", "LOCAL", "STATIC", "IDENTIFIER", "NUMBER", 
		"STRING", "BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "OOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OOLParser(TokenStream input) {
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << UNARY_MINUS) | (1L << LEN_OPERATOR) | (1L << LOCAL) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(48);
				programThing();
				}
				}
				setState(53);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterClassThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitClassThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitClassThing(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncDeclThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncDeclThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncDeclThing(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterStatementThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitStatementThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitStatementThing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncludeThingContext extends ProgramThingContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IncludeThingContext(ProgramThingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterIncludeThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitIncludeThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitIncludeThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramThingContext programThing() throws RecognitionException {
		ProgramThingContext _localctx = new ProgramThingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programThing);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FuncDeclThingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				funcDecl();
				}
				break;
			case 2:
				_localctx = new StatementThingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				statement();
				}
				break;
			case 3:
				_localctx = new ClassThingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				classCreate();
				}
				break;
			case 4:
				_localctx = new IncludeThingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(T__0);
				setState(58);
				string();
				setState(59);
				match(T__1);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__2);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(64);
				dotNotation();
				}
				break;
			}
			setState(67);
			match(T__3);
			setState(68);
			funcDeclArgs();
			setState(69);
			match(T__4);
			setState(70);
			program();
			setState(71);
			match(T__5);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterVarHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitVarHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitVarHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHeaderContext varHeader() throws RecognitionException {
		VarHeaderContext _localctx = new VarHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			dotNotation();
			setState(74);
			match(T__6);
			setState(75);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitWhileStatement(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitForEachStatement(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterForKVStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitForKVStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitForKVStatement(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterOolForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitOolForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitOolForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitBreakStatement(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				expr(0);
				setState(78);
				newLine();
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__7);
				setState(81);
				expr(0);
				setState(82);
				match(T__8);
				setState(83);
				((IfStatementContext)_localctx).yes = program();
				setState(86);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(84);
					match(T__9);
					setState(85);
					((IfStatementContext)_localctx).no = program();
					}
				}

				setState(88);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__10);
				setState(91);
				expr(0);
				setState(92);
				match(T__11);
				setState(93);
				((WhileStatementContext)_localctx).yes = program();
				setState(94);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__12);
				setState(97);
				newLine();
				}
				break;
			case 5:
				_localctx = new ForKVStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(T__13);
				setState(99);
				identifier();
				setState(100);
				match(T__6);
				setState(101);
				((ForKVStatementContext)_localctx).start = expr(0);
				setState(102);
				match(T__14);
				setState(103);
				((ForKVStatementContext)_localctx).check = expr(0);
				setState(106);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(104);
					match(T__14);
					setState(105);
					((ForKVStatementContext)_localctx).steps = expr(0);
					}
				}

				setState(108);
				match(T__11);
				setState(109);
				program();
				setState(110);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(T__13);
				setState(113);
				identifier();
				setState(114);
				match(T__14);
				setState(115);
				identifier();
				setState(116);
				match(T__15);
				setState(117);
				expr(0);
				setState(118);
				match(T__11);
				setState(119);
				program();
				setState(120);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new OolForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(T__16);
				setState(123);
				identifier();
				setState(124);
				match(T__15);
				setState(125);
				expr(0);
				setState(126);
				match(T__11);
				setState(127);
				program();
				setState(128);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(T__17);
				setState(131);
				expr(0);
				setState(132);
				newLine();
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterSetVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitSetVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitSetVarExpr(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterInstanceofExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitInstanceofExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitInstanceofExpr(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitSimpleExpr(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitOpExpr(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitTernaryExpr(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitParenExpr(this);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				exprAtom();
				}
				break;
			case 2:
				{
				_localctx = new SetVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(138);
					local();
					}
				}

				setState(141);
				funcDeclArgs();
				setState(142);
				match(T__6);
				setState(143);
				funcCallArgs();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__3);
				setState(146);
				expr(0);
				setState(147);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(152);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(153);
						((OpExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(156);
						((OpExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(159);
						((OpExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(161);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << UNARY_MINUS))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(162);
						((OpExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new TernaryExprContext(new ExprContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						match(T__31);
						setState(165);
						((TernaryExprContext)_localctx).yes = expr(0);
						setState(166);
						match(T__32);
						setState(167);
						((TernaryExprContext)_localctx).no = expr(5);
						}
						break;
					case 6:
						{
						_localctx = new InstanceofExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						match(T__33);
						setState(171);
						dotNotation();
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncCallSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncCallSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncCallSugar(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterTableIndexSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitTableIndexSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitTableIndexSugar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomSugarContext exprAtomSugar() throws RecognitionException {
		ExprAtomSugarContext _localctx = new ExprAtomSugarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprAtomSugar);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case T__34:
				_localctx = new TableIndexSugarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__34);
				setState(178);
				expr(0);
				setState(179);
				match(T__35);
				}
				break;
			case T__3:
				_localctx = new FuncCallSugarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__3);
				setState(182);
				funcCallArgs();
				setState(183);
				match(T__4);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitIdentifierAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitIdentifierAtom(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends ExprAtomContext {
		public NilAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitNilAtom(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitNumberAtom(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncAtom(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterTableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitTableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitTableAtom(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterLambdaAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitLambdaAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitLambdaAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprAtom);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case UNARY_MINUS:
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				number();
				}
				break;
			case T__38:
				_localctx = new TableAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				table();
				}
				break;
			case T__3:
			case LEN_OPERATOR:
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				_la = _input.LA(1);
				if (_la==LEN_OPERATOR) {
					{
					setState(189);
					lenOperator();
					}
				}

				setState(192);
				dotNotation();
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				string();
				}
				break;
			case T__2:
				_localctx = new FuncAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				funcDecl();
				}
				break;
			case T__36:
				_localctx = new LambdaAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(T__36);
				setState(196);
				funcDeclArgs();
				setState(197);
				match(T__32);
				setState(198);
				expr(0);
				}
				break;
			case T__37:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(T__37);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterArrayTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitArrayTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitArrayTable(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterKeyTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitKeyTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitKeyTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ArrayTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__38);
				setState(212);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << UNARY_MINUS) | (1L << LEN_OPERATOR) | (1L << LOCAL) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(204);
					expr(0);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(205);
						match(T__14);
						setState(206);
						expr(0);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(T__39);
				}
				break;
			case 2:
				_localctx = new KeyTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__38);
				setState(229);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(216);
					identifier();
					setState(217);
					match(T__6);
					setState(218);
					expr(0);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(219);
						match(T__14);
						setState(220);
						identifier();
						setState(221);
						match(T__6);
						setState(222);
						expr(0);
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(231);
				match(T__39);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterDotNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitDotNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitDotNotation(this);
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
			setState(239);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(234);
				identifier();
				}
				break;
			case T__3:
				{
				setState(235);
				match(T__3);
				setState(236);
				expr(0);
				setState(237);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					exprAtomSugar();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					dotNotationSection();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterDotNotationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitDotNotationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitDotNotationSection(this);
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
			setState(253);
			dotNotationSeperator();
			setState(254);
			identifier();
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					exprAtomSugar();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterDotNotationSeperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitDotNotationSeperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitDotNotationSeperator(this);
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
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__40) ) {
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
		public IdentifierContext name;
		public IdentifierContext extending;
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ClassCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterClassCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitClassCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitClassCreate(this);
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
			setState(263);
			match(T__41);
			setState(264);
			((ClassCreateContext)_localctx).name = identifier();
			setState(267);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(265);
				match(T__42);
				setState(266);
				((ClassCreateContext)_localctx).extending = identifier();
				}
			}

			setState(269);
			match(T__43);
			setState(270);
			classBlock();
			setState(271);
			match(T__5);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncMember(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterConstructorMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitConstructorMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitConstructorMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarMemberContext extends ClassMemberContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StaticKeywordContext staticKeyword() {
			return getRuleContext(StaticKeywordContext.class,0);
		}
		public VarMemberContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterVarMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitVarMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitVarMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classMember);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VarMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(273);
					staticKeyword();
					}
				}

				setState(276);
				identifier();
				{
				setState(277);
				match(T__6);
				setState(278);
				expr(0);
				}
				setState(280);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new FuncMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(282);
					staticKeyword();
					}
				}

				setState(285);
				funcDecl();
				}
				break;
			case 3:
				_localctx = new ConstructorMemberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(T__44);
				setState(287);
				match(T__3);
				setState(288);
				funcDeclArgs();
				setState(289);
				match(T__4);
				setState(290);
				program();
				setState(291);
				match(T__5);
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

	public static class NewLineContext extends ParserRuleContext {
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
				{
				setState(296);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(295);
					match(T__45);
					}
				}

				setState(298);
				match(T__46);
				}
				break;
			case T__1:
				{
				setState(299);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__44) | (1L << STATIC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(302);
				classMember();
				}
				}
				setState(307);
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
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
		FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcCallArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(308);
				expr(0);
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						match(T__14);
						setState(310);
						expr(0);
						}
						} 
					}
					setState(315);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FuncDeclArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterFuncDeclArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitFuncDeclArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitFuncDeclArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclArgsContext funcDeclArgs() throws RecognitionException {
		FuncDeclArgsContext _localctx = new FuncDeclArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcDeclArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(318);
				identifier();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(319);
					match(T__14);
					setState(320);
					identifier();
					}
					}
					setState(325);
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
		public TerminalNode IDENTIFIER() { return getToken(OOLParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		public TerminalNode STRING() { return getToken(OOLParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		public TerminalNode NUMBER() { return getToken(OOLParser.NUMBER, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(OOLParser.UNARY_MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if (_la==UNARY_MINUS) {
				{
				setState(333);
				((NumberContext)_localctx).UNARY_MINUS = match(UNARY_MINUS);
				}
			}

			setState(336);
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
		public TerminalNode LOCAL() { return getToken(OOLParser.LOCAL, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		public TerminalNode STATIC() { return getToken(OOLParser.STATIC, 0); }
		public StaticKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterStaticKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitStaticKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitStaticKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticKeywordContext staticKeyword() throws RecognitionException {
		StaticKeywordContext _localctx = new StaticKeywordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		public TerminalNode LEN_OPERATOR() { return getToken(OOLParser.LEN_OPERATOR, 0); }
		public LenOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).enterLenOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOLListener ) ((OOLListener)listener).exitLenOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OOLVisitor ) return ((OOLVisitor<? extends T>)visitor).visitLenOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenOperatorContext lenOperator() throws RecognitionException {
		LenOperatorContext _localctx = new LenOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lenOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\5\4D\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\5\7\u008e\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0098\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\5\t\u00c1"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3\n\3\n"+
		"\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\5\n\u00d7\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\5\n\u00e8\n\n\3\n"+
		"\5\n\u00eb\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f2\n\13\3\13\7\13\u00f5"+
		"\n\13\f\13\16\13\u00f8\13\13\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe\13"+
		"\13\3\f\3\f\3\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\5\16\u010e\n\16\3\16\3\16\3\16\3\16\3\17\5\17\u0115\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011e\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0128\n\17\3\20\5\20\u012b\n\20\3\20\3\20\5\20\u012f"+
		"\n\20\3\21\7\21\u0132\n\21\f\21\16\21\u0135\13\21\3\22\3\22\3\22\7\22"+
		"\u013a\n\22\f\22\16\22\u013d\13\22\5\22\u013f\n\22\3\23\3\23\3\23\7\23"+
		"\u0144\n\23\f\23\16\23\u0147\13\23\5\23\u0149\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\5\26\u0151\n\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\2\3\f\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7"+
		"\3\2\25\26\3\2\27\35\3\2\36\37\4\2 !\62\62\4\2##++\u0178\2\65\3\2\2\2"+
		"\4?\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\n\u0088\3\2\2\2\f\u0097\3\2\2\2\16\u00bb"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00ea\3\2\2\2\24\u00f1\3\2\2\2\26\u00ff\3"+
		"\2\2\2\30\u0107\3\2\2\2\32\u0109\3\2\2\2\34\u0127\3\2\2\2\36\u012e\3\2"+
		"\2\2 \u0133\3\2\2\2\"\u013e\3\2\2\2$\u0148\3\2\2\2&\u014a\3\2\2\2(\u014c"+
		"\3\2\2\2*\u0150\3\2\2\2,\u0155\3\2\2\2.\u0157\3\2\2\2\60\u0159\3\2\2\2"+
		"\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2"+
		"\66\3\3\2\2\2\67\65\3\2\2\28@\5\6\4\29@\5\n\6\2:@\5\32\16\2;<\7\3\2\2"+
		"<=\5(\25\2=>\7\4\2\2>@\3\2\2\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2"+
		"@\5\3\2\2\2AC\7\5\2\2BD\5\24\13\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\6"+
		"\2\2FG\5$\23\2GH\7\7\2\2HI\5\2\2\2IJ\7\b\2\2J\7\3\2\2\2KL\5\24\13\2LM"+
		"\7\t\2\2MN\5\f\7\2N\t\3\2\2\2OP\5\f\7\2PQ\5\36\20\2Q\u0089\3\2\2\2RS\7"+
		"\n\2\2ST\5\f\7\2TU\7\13\2\2UX\5\2\2\2VW\7\f\2\2WY\5\2\2\2XV\3\2\2\2XY"+
		"\3\2\2\2YZ\3\2\2\2Z[\7\b\2\2[\u0089\3\2\2\2\\]\7\r\2\2]^\5\f\7\2^_\7\16"+
		"\2\2_`\5\2\2\2`a\7\b\2\2a\u0089\3\2\2\2bc\7\17\2\2c\u0089\5\36\20\2de"+
		"\7\20\2\2ef\5&\24\2fg\7\t\2\2gh\5\f\7\2hi\7\21\2\2il\5\f\7\2jk\7\21\2"+
		"\2km\5\f\7\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\16\2\2op\5\2\2\2pq\7\b"+
		"\2\2q\u0089\3\2\2\2rs\7\20\2\2st\5&\24\2tu\7\21\2\2uv\5&\24\2vw\7\22\2"+
		"\2wx\5\f\7\2xy\7\16\2\2yz\5\2\2\2z{\7\b\2\2{\u0089\3\2\2\2|}\7\23\2\2"+
		"}~\5&\24\2~\177\7\22\2\2\177\u0080\5\f\7\2\u0080\u0081\7\16\2\2\u0081"+
		"\u0082\5\2\2\2\u0082\u0083\7\b\2\2\u0083\u0089\3\2\2\2\u0084\u0085\7\24"+
		"\2\2\u0085\u0086\5\f\7\2\u0086\u0087\5\36\20\2\u0087\u0089\3\2\2\2\u0088"+
		"O\3\2\2\2\u0088R\3\2\2\2\u0088\\\3\2\2\2\u0088b\3\2\2\2\u0088d\3\2\2\2"+
		"\u0088r\3\2\2\2\u0088|\3\2\2\2\u0088\u0084\3\2\2\2\u0089\13\3\2\2\2\u008a"+
		"\u008b\b\7\1\2\u008b\u0098\5\20\t\2\u008c\u008e\5,\27\2\u008d\u008c\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5$\23\2\u0090"+
		"\u0091\7\t\2\2\u0091\u0092\5\"\22\2\u0092\u0098\3\2\2\2\u0093\u0094\7"+
		"\6\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\7\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u008a\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u00b0\3\2"+
		"\2\2\u0099\u009a\f\13\2\2\u009a\u009b\t\2\2\2\u009b\u00af\5\f\7\f\u009c"+
		"\u009d\f\n\2\2\u009d\u009e\t\3\2\2\u009e\u00af\5\f\7\13\u009f\u00a0\f"+
		"\t\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00af\5\f\7\n\u00a2\u00a3\f\b\2\2\u00a3"+
		"\u00a4\t\5\2\2\u00a4\u00af\5\f\7\t\u00a5\u00a6\f\6\2\2\u00a6\u00a7\7\""+
		"\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\5\f\7\7\u00aa"+
		"\u00af\3\2\2\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\7$\2\2\u00ad\u00af\5\24"+
		"\13\2\u00ae\u0099\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae"+
		"\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7&\2\2\u00b6"+
		"\u00bc\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7"+
		"\7\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc"+
		"\17\3\2\2\2\u00bd\u00cc\5*\26\2\u00be\u00cc\5\22\n\2\u00bf\u00c1\5\60"+
		"\31\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00cc\5\24\13\2\u00c3\u00cc\5(\25\2\u00c4\u00cc\5\6\4\2\u00c5\u00c6\7"+
		"\'\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\5\f\7\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00cc\7(\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00be\3\2"+
		"\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00d6\7)\2\2"+
		"\u00ce\u00d3\5\f\7\2\u00cf\u00d0\7\21\2\2\u00d0\u00d2\5\f\7\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00eb\7*\2\2\u00d9\u00e7\7)\2\2\u00da\u00db"+
		"\5&\24\2\u00db\u00dc\7\t\2\2\u00dc\u00e4\5\f\7\2\u00dd\u00de\7\21\2\2"+
		"\u00de\u00df\5&\24\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5\f\7\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00da\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7*\2\2\u00ea"+
		"\u00cd\3\2\2\2\u00ea\u00d9\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00f2\5&\24"+
		"\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\f\7\2\u00ef\u00f0\7\7\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3"+
		"\u00f5\5\16\b\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fc\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\5\26\f\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\25\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\5\30\r\2\u0100\u0104\5&\24\2\u0101\u0103\5\16\b\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\27\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\t\6\2\2\u0108\31\3\2\2\2\u0109"+
		"\u010a\7,\2\2\u010a\u010d\5&\24\2\u010b\u010c\7-\2\2\u010c\u010e\5&\24"+
		"\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\7.\2\2\u0110\u0111\5 \21\2\u0111\u0112\7\b\2\2\u0112\33\3\2\2\2\u0113"+
		"\u0115\5.\30\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0117\5&\24\2\u0117\u0118\7\t\2\2\u0118\u0119\5\f\7\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u0128\3\2\2\2\u011c\u011e\5."+
		"\30\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0128\5\6\4\2\u0120\u0121\7/\2\2\u0121\u0122\7\6\2\2\u0122\u0123\5$\23"+
		"\2\u0123\u0124\7\7\2\2\u0124\u0125\5\2\2\2\u0125\u0126\7\b\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0114\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u0120\3\2\2\2\u0128"+
		"\35\3\2\2\2\u0129\u012b\7\60\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u012f\7\61\2\2\u012d\u012f\7\4\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012d\3\2\2\2\u012f\37\3\2\2\2\u0130\u0132\5\34\17"+
		"\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134!\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013b\5\f\7\2\u0137"+
		"\u0138\7\21\2\2\u0138\u013a\5\f\7\2\u0139\u0137\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013f\3\2\2\2\u013f#\3\2\2\2"+
		"\u0140\u0145\5&\24\2\u0141\u0142\7\21\2\2\u0142\u0144\5&\24\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149%\3\2\2\2\u014a\u014b\7\66\2\2\u014b\'\3\2\2\2\u014c\u014d\7"+
		"8\2\2\u014d\u014e\b\25\1\2\u014e)\3\2\2\2\u014f\u0151\7\62\2\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\67\2\2"+
		"\u0153\u0154\b\26\1\2\u0154+\3\2\2\2\u0155\u0156\7\64\2\2\u0156-\3\2\2"+
		"\2\u0157\u0158\7\65\2\2\u0158/\3\2\2\2\u0159\u015a\7\63\2\2\u015a\61\3"+
		"\2\2\2$\65?CXl\u0088\u008d\u0097\u00ae\u00b0\u00bb\u00c0\u00cb\u00d3\u00d6"+
		"\u00e4\u00e7\u00ea\u00f1\u00f6\u00fc\u0104\u010d\u0114\u011d\u0127\u012a"+
		"\u012e\u0133\u013b\u013e\u0145\u0148\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}