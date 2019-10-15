// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, DATATYPE=2, ASSERT=3, BOOLEAN=4, BREAK=5, CASE=6, CHAR=7, 
		CONST=8, DEFAULT=9, DO=10, DOUBLE=11, ELSE=12, FINAL=13, FLOAT=14, FOR=15, 
		IF=16, INT=17, NEW=18, RETURN=19, STATIC=20, SWITCH=21, VOID=22, WHILE=23, 
		SEPARATORS=24, LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, 
		RBRACK=30, SEMI=31, COMMA=32, DOT=33, OPERATORS=34, ASSIGN=35, GT=36, 
		LT=37, BANG=38, COLON=39, EQUAL=40, LE=41, GE=42, NOTEQUAL=43, AND=44, 
		OR=45, INC=46, DEC=47, ADD=48, SUB=49, MUL=50, DIV=51, MOD=52, ADD_ASSIGN=53, 
		SUB_ASSIGN=54, MUL_ASSIGN=55, DIV_ASSIGN=56, WS=57, NUMBER=58, ALPHABET=59, 
		NUMORALPH=60, IDENTIFIER=61, DECIMAL_LITERAL=62, STRING_LITERAL=63, NULL_LITERAL=64;
	public static final int
		RULE_output = 0, RULE_prule = 1, RULE_kw = 2, RULE_dt = 3, RULE_sp = 4, 
		RULE_op = 5, RULE_id = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"output", "prule", "kw", "dt", "sp", "op", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'tpose'", "'maybe'", "'ubreak'", "'case'", "'charot'", 
			"'ant'", "'standard'", "'glaz'", "'twice'", "'unless'", "'fantasy'", 
			"'drown'", "'iv'", "'can'", "'digimon'", "'new'", "'ups'", "'shiv'", 
			"'nintendo'", "'kassadin'", "'during'", null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", null, "'='", "'>'", "'<'", "'!'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'also'", "'or'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", null, 
			null, null, null, null, null, null, "'naida'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORDS", "DATATYPE", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", 
			"CONST", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", 
			"IF", "INT", "NEW", "RETURN", "STATIC", "SWITCH", "VOID", "WHILE", "SEPARATORS", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "OPERATORS", "ASSIGN", "GT", "LT", "BANG", "COLON", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", 
			"NUMBER", "ALPHABET", "NUMORALPH", "IDENTIFIER", "DECIMAL_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OutputContext extends ParserRuleContext {
		public KwContext kw() {
			return getRuleContext(KwContext.class,0);
		}
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_output);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				kw();
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				dt();
				}
				break;
			case SEPARATORS:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				sp();
				}
				break;
			case OPERATORS:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				op();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				id();
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

	public static class PruleContext extends ParserRuleContext {
		public KwContext kw() {
			return getRuleContext(KwContext.class,0);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitPrule(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			kw();
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

	public static class KwContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(LexerParser.KEYWORDS, 0); }
		public KwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitKw(this);
		}
	}

	public final KwContext kw() throws RecognitionException {
		KwContext _localctx = new KwContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(KEYWORDS);
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

	public static class DtContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(LexerParser.DATATYPE, 0); }
		public DtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterDt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitDt(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(DATATYPE);
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

	public static class SpContext extends ParserRuleContext {
		public TerminalNode SEPARATORS() { return getToken(LexerParser.SEPARATORS, 0); }
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitSp(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(SEPARATORS);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode OPERATORS() { return getToken(LexerParser.OPERATORS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(OPERATORS);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexerParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B$\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\5\2\26\n"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\2\2 \2\25\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n\35"+
		"\3\2\2\2\f\37\3\2\2\2\16!\3\2\2\2\20\26\5\6\4\2\21\26\5\b\5\2\22\26\5"+
		"\n\6\2\23\26\5\f\7\2\24\26\5\16\b\2\25\20\3\2\2\2\25\21\3\2\2\2\25\22"+
		"\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\3\3\2\2\2\27\30\5\6\4\2\30\5\3"+
		"\2\2\2\31\32\7\3\2\2\32\7\3\2\2\2\33\34\7\4\2\2\34\t\3\2\2\2\35\36\7\32"+
		"\2\2\36\13\3\2\2\2\37 \7$\2\2 \r\3\2\2\2!\"\7?\2\2\"\17\3\2\2\2\3\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}