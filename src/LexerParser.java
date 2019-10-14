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
		ASSERT=1, BOOLEAN=2, BREAK=3, CASE=4, CHAR=5, CONST=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, FINAL=11, FLOAT=12, FOR=13, IF=14, INT=15, NEW=16, 
		RETURN=17, STATIC=18, SWITCH=19, VOID=20, WHILE=21, LPAREN=22, RPAREN=23, 
		LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, DOT=30, 
		ASSIGN=31, GT=32, LT=33, BANG=34, COLON=35, EQUAL=36, LE=37, GE=38, NOTEQUAL=39, 
		AND=40, OR=41, INC=42, DEC=43, ADD=44, SUB=45, MUL=46, DIV=47, MOD=48, 
		ADD_ASSIGN=49, SUB_ASSIGN=50, MUL_ASSIGN=51, DIV_ASSIGN=52, WS=53, NUMBER=54, 
		ALPHABET=55, NUMORALPH=56, DECIMAL_LITERAL=57, STRING_LITERAL=58, NULL_LITERAL=59;
	public static final int
		RULE_keywords = 0, RULE_datatype = 1, RULE_separators = 2, RULE_operators = 3, 
		RULE_identifier = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"keywords", "datatype", "separators", "operators", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tpose'", "'maybe'", "'ubreak'", "'case'", "'charot'", "'ant'", 
			"'standard'", "'glaz'", "'twice'", "'unless'", "'fantasy'", "'drown'", 
			"'iv'", "'can'", "'digimon'", "'new'", "'ups'", "'shiv'", "'nintendo'", 
			"'kassadin'", "'during'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "':'", "'=='", "'<='", "'>='", 
			"'!='", "'also'", "'or'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", null, null, null, null, null, 
			null, "'naida'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "NEW", 
			"RETURN", "STATIC", "SWITCH", "VOID", "WHILE", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", 
			"LT", "BANG", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
			"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "WS", "NUMBER", "ALPHABET", "NUMORALPH", 
			"DECIMAL_LITERAL", "STRING_LITERAL", "NULL_LITERAL"
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

	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(LexerParser.ASSERT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LexerParser.BOOLEAN, 0); }
		public TerminalNode BREAK() { return getToken(LexerParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(LexerParser.CASE, 0); }
		public TerminalNode CONST() { return getToken(LexerParser.CONST, 0); }
		public TerminalNode DO() { return getToken(LexerParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(LexerParser.ELSE, 0); }
		public TerminalNode FINAL() { return getToken(LexerParser.FINAL, 0); }
		public TerminalNode FOR() { return getToken(LexerParser.FOR, 0); }
		public TerminalNode IF() { return getToken(LexerParser.IF, 0); }
		public TerminalNode NEW() { return getToken(LexerParser.NEW, 0); }
		public TerminalNode RETURN() { return getToken(LexerParser.RETURN, 0); }
		public TerminalNode STATIC() { return getToken(LexerParser.STATIC, 0); }
		public TerminalNode SWITCH() { return getToken(LexerParser.SWITCH, 0); }
		public TerminalNode VOID() { return getToken(LexerParser.VOID, 0); }
		public TerminalNode WHILE() { return getToken(LexerParser.WHILE, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitKeywords(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CASE) | (1L << CONST) | (1L << DO) | (1L << ELSE) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << STATIC) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(LexerParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(LexerParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(LexerParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LexerParser.INT, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SeparatorsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LexerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LexerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LexerParser.RBRACE, 0); }
		public TerminalNode LBRACK() { return getToken(LexerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LexerParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(LexerParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(LexerParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(LexerParser.DOT, 0); }
		public SeparatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterSeparators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitSeparators(this);
		}
	}

	public final SeparatorsContext separators() throws RecognitionException {
		SeparatorsContext _localctx = new SeparatorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_separators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACK) | (1L << RBRACK) | (1L << SEMI) | (1L << COMMA) | (1L << DOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(LexerParser.ASSIGN, 0); }
		public TerminalNode GT() { return getToken(LexerParser.GT, 0); }
		public TerminalNode LT() { return getToken(LexerParser.LT, 0); }
		public TerminalNode BANG() { return getToken(LexerParser.BANG, 0); }
		public TerminalNode COLON() { return getToken(LexerParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(LexerParser.EQUAL, 0); }
		public TerminalNode LE() { return getToken(LexerParser.LE, 0); }
		public TerminalNode GE() { return getToken(LexerParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(LexerParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(LexerParser.AND, 0); }
		public TerminalNode OR() { return getToken(LexerParser.OR, 0); }
		public TerminalNode INC() { return getToken(LexerParser.INC, 0); }
		public TerminalNode DEC() { return getToken(LexerParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(LexerParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LexerParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(LexerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LexerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LexerParser.MOD, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(LexerParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(LexerParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(LexerParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(LexerParser.DIV_ASSIGN, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << BANG) | (1L << COLON) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(LexerParser.ALPHABET, 0); }
		public List<TerminalNode> NUMORALPH() { return getTokens(LexerParser.NUMORALPH); }
		public TerminalNode NUMORALPH(int i) {
			return getToken(LexerParser.NUMORALPH, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerListener ) ((LexerListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ALPHABET);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMORALPH) {
				{
				{
				setState(19);
				match(NUMORALPH);
				}
				}
				setState(24);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\34\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6"+
		"\27\n\6\f\6\16\6\32\13\6\3\6\2\2\7\2\4\6\b\n\2\6\b\2\3\6\b\b\n\n\f\r\17"+
		"\20\22\27\6\2\7\7\13\13\16\16\21\21\3\2\30 \3\2!\66\2\27\2\f\3\2\2\2\4"+
		"\16\3\2\2\2\6\20\3\2\2\2\b\22\3\2\2\2\n\24\3\2\2\2\f\r\t\2\2\2\r\3\3\2"+
		"\2\2\16\17\t\3\2\2\17\5\3\2\2\2\20\21\t\4\2\2\21\7\3\2\2\2\22\23\t\5\2"+
		"\2\23\t\3\2\2\2\24\30\79\2\2\25\27\7:\2\2\26\25\3\2\2\2\27\32\3\2\2\2"+
		"\30\26\3\2\2\2\30\31\3\2\2\2\31\13\3\2\2\2\32\30\3\2\2\2\3\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}