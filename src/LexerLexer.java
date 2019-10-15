// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORDS", "DATATYPE", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", 
			"CONST", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", 
			"IF", "INT", "NEW", "RETURN", "STATIC", "SWITCH", "VOID", "WHILE", "SEPARATORS", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "OPERATORS", "ASSIGN", "GT", "LT", "BANG", "COLON", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", 
			"NUMBER", "ALPHABET", "NUMORALPH", "Digits", "LetterOrDigit", "Letter", 
			"IDENTIFIER", "DECIMAL_LITERAL", "STRING_LITERAL", "NULL_LITERAL"
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


	public LexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u009a\n\2\3\3\3\3\3\3\3\3\5\3"+
		"\u00a0\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u012c\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0156\n#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\6:\u0193\n"+
		":\r:\16:\u0194\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\7>\u01a1\n>\f>\16>\u01a4"+
		"\13>\3>\5>\u01a7\n>\3?\3?\5?\u01ab\n?\3@\3@\3@\3@\5@\u01b1\n@\3A\3A\7"+
		"A\u01b5\nA\fA\16A\u01b8\13A\3B\3B\3B\5B\u01bd\nB\3B\6B\u01c0\nB\rB\16"+
		"B\u01c1\3B\5B\u01c5\nB\5B\u01c7\nB\3B\5B\u01ca\nB\3C\3C\3C\7C\u01cf\n"+
		"C\fC\16C\u01d2\13C\3C\3C\3D\3D\3D\3D\3D\3D\2\2E\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{\2}\2\177"+
		"\2\u0081?\u0083@\u0085A\u0087B\3\2\n\5\2\13\f\17\17\"\"\3\2\62;\6\2&&"+
		"C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\3\2\63"+
		";\4\2NNnn\2\u0213\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\3\u0099\3\2\2\2\5\u009f\3\2\2\2\7\u00a1\3\2\2\2\t\u00a7\3\2\2"+
		"\2\13\u00ad\3\2\2\2\r\u00b4\3\2\2\2\17\u00b9\3\2\2\2\21\u00c0\3\2\2\2"+
		"\23\u00c4\3\2\2\2\25\u00cd\3\2\2\2\27\u00d2\3\2\2\2\31\u00d8\3\2\2\2\33"+
		"\u00df\3\2\2\2\35\u00e7\3\2\2\2\37\u00ed\3\2\2\2!\u00f0\3\2\2\2#\u00f4"+
		"\3\2\2\2%\u00fc\3\2\2\2\'\u0100\3\2\2\2)\u0104\3\2\2\2+\u0109\3\2\2\2"+
		"-\u0112\3\2\2\2/\u011b\3\2\2\2\61\u012b\3\2\2\2\63\u012d\3\2\2\2\65\u012f"+
		"\3\2\2\2\67\u0131\3\2\2\29\u0133\3\2\2\2;\u0135\3\2\2\2=\u0137\3\2\2\2"+
		"?\u0139\3\2\2\2A\u013b\3\2\2\2C\u013d\3\2\2\2E\u0155\3\2\2\2G\u0157\3"+
		"\2\2\2I\u0159\3\2\2\2K\u015b\3\2\2\2M\u015d\3\2\2\2O\u015f\3\2\2\2Q\u0161"+
		"\3\2\2\2S\u0164\3\2\2\2U\u0167\3\2\2\2W\u016a\3\2\2\2Y\u016d\3\2\2\2["+
		"\u0172\3\2\2\2]\u0175\3\2\2\2_\u0178\3\2\2\2a\u017b\3\2\2\2c\u017d\3\2"+
		"\2\2e\u017f\3\2\2\2g\u0181\3\2\2\2i\u0183\3\2\2\2k\u0185\3\2\2\2m\u0188"+
		"\3\2\2\2o\u018b\3\2\2\2q\u018e\3\2\2\2s\u0192\3\2\2\2u\u0198\3\2\2\2w"+
		"\u019a\3\2\2\2y\u019c\3\2\2\2{\u019e\3\2\2\2}\u01aa\3\2\2\2\177\u01b0"+
		"\3\2\2\2\u0081\u01b2\3\2\2\2\u0083\u01c6\3\2\2\2\u0085\u01cb\3\2\2\2\u0087"+
		"\u01d5\3\2\2\2\u0089\u009a\5\7\4\2\u008a\u009a\5\t\5\2\u008b\u009a\5\13"+
		"\6\2\u008c\u009a\5\r\7\2\u008d\u009a\5\21\t\2\u008e\u009a\5\25\13\2\u008f"+
		"\u009a\5\31\r\2\u0090\u009a\5\33\16\2\u0091\u009a\5\37\20\2\u0092\u009a"+
		"\5!\21\2\u0093\u009a\5%\23\2\u0094\u009a\5\'\24\2\u0095\u009a\5)\25\2"+
		"\u0096\u009a\5+\26\2\u0097\u009a\5-\27\2\u0098\u009a\5/\30\2\u0099\u0089"+
		"\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u008c\3\2\2\2\u0099"+
		"\u008d\3\2\2\2\u0099\u008e\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0090\3\2"+
		"\2\2\u0099\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\4\3\2\2\2\u009b\u00a0\5\17\b\2\u009c\u00a0"+
		"\5\27\f\2\u009d\u00a0\5\35\17\2\u009e\u00a0\5#\22\2\u009f\u009b\3\2\2"+
		"\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\6"+
		"\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7{\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\n\3\2\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\7t"+
		"\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7m\2\2\u00b3\f"+
		"\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\16\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\20\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7"+
		"v\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7f\2\2\u00cc\24\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7|\2\2\u00d1\26\3\2\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7e\2\2"+
		"\u00d6\u00d7\7g\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7"+
		"p\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de"+
		"\7u\2\2\u00de\32\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7u\2\2\u00e5"+
		"\u00e6\7{\2\2\u00e6\34\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7p\2\2\u00ec\36\3\2\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7x\2\2\u00ef \3\2\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		"\u00f6\7k\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7o\2\2"+
		"\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7p\2"+
		"\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7y\2\2\u00ff&\3\2\2\2\u0100\u0101\7"+
		"w\2\2\u0101\u0102\7r\2\2\u0102\u0103\7u\2\2\u0103(\3\2\2\2\u0104\u0105"+
		"\7u\2\2\u0105\u0106\7j\2\2\u0106\u0107\7k\2\2\u0107\u0108\7x\2\2\u0108"+
		"*\3\2\2\2\u0109\u010a\7p\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\u0110\7f\2\2"+
		"\u0110\u0111\7q\2\2\u0111,\3\2\2\2\u0112\u0113\7m\2\2\u0113\u0114\7c\2"+
		"\2\u0114\u0115\7u\2\2\u0115\u0116\7u\2\2\u0116\u0117\7c\2\2\u0117\u0118"+
		"\7f\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a.\3\2\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u011d\7w\2\2\u011d\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7i\2\2\u0121\60\3\2\2\2\u0122\u012c\5\63\32"+
		"\2\u0123\u012c\5\65\33\2\u0124\u012c\5\67\34\2\u0125\u012c\59\35\2\u0126"+
		"\u012c\5;\36\2\u0127\u012c\5=\37\2\u0128\u012c\5? \2\u0129\u012c\5A!\2"+
		"\u012a\u012c\5C\"\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0124"+
		"\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\62\3\2\2"+
		"\2\u012d\u012e\7*\2\2\u012e\64\3\2\2\2\u012f\u0130\7+\2\2\u0130\66\3\2"+
		"\2\2\u0131\u0132\7}\2\2\u01328\3\2\2\2\u0133\u0134\7\177\2\2\u0134:\3"+
		"\2\2\2\u0135\u0136\7]\2\2\u0136<\3\2\2\2\u0137\u0138\7_\2\2\u0138>\3\2"+
		"\2\2\u0139\u013a\7=\2\2\u013a@\3\2\2\2\u013b\u013c\7.\2\2\u013cB\3\2\2"+
		"\2\u013d\u013e\7\60\2\2\u013eD\3\2\2\2\u013f\u0156\5G$\2\u0140\u0156\5"+
		"I%\2\u0141\u0156\5K&\2\u0142\u0156\5M\'\2\u0143\u0156\5O(\2\u0144\u0156"+
		"\5Q)\2\u0145\u0156\5S*\2\u0146\u0156\5U+\2\u0147\u0156\5W,\2\u0148\u0156"+
		"\5Y-\2\u0149\u0156\5[.\2\u014a\u0156\5]/\2\u014b\u0156\5_\60\2\u014c\u0156"+
		"\5a\61\2\u014d\u0156\5c\62\2\u014e\u0156\5e\63\2\u014f\u0156\5g\64\2\u0150"+
		"\u0156\5i\65\2\u0151\u0156\5k\66\2\u0152\u0156\5m\67\2\u0153\u0156\5o"+
		"8\2\u0154\u0156\5q9\2\u0155\u013f\3\2\2\2\u0155\u0140\3\2\2\2\u0155\u0141"+
		"\3\2\2\2\u0155\u0142\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0144\3\2\2\2\u0155"+
		"\u0145\3\2\2\2\u0155\u0146\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u0148\3\2"+
		"\2\2\u0155\u0149\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u014b\3\2\2\2\u0155"+
		"\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f\3\2"+
		"\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156F\3\2\2\2\u0157\u0158\7?\2\2\u0158"+
		"H\3\2\2\2\u0159\u015a\7@\2\2\u015aJ\3\2\2\2\u015b\u015c\7>\2\2\u015cL"+
		"\3\2\2\2\u015d\u015e\7#\2\2\u015eN\3\2\2\2\u015f\u0160\7<\2\2\u0160P\3"+
		"\2\2\2\u0161\u0162\7?\2\2\u0162\u0163\7?\2\2\u0163R\3\2\2\2\u0164\u0165"+
		"\7>\2\2\u0165\u0166\7?\2\2\u0166T\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169"+
		"\7?\2\2\u0169V\3\2\2\2\u016a\u016b\7#\2\2\u016b\u016c\7?\2\2\u016cX\3"+
		"\2\2\2\u016d\u016e\7c\2\2\u016e\u016f\7n\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7q\2\2\u0171Z\3\2\2\2\u0172\u0173\7q\2\2\u0173\u0174\7t\2\2\u0174"+
		"\\\3\2\2\2\u0175\u0176\7-\2\2\u0176\u0177\7-\2\2\u0177^\3\2\2\2\u0178"+
		"\u0179\7/\2\2\u0179\u017a\7/\2\2\u017a`\3\2\2\2\u017b\u017c\7-\2\2\u017c"+
		"b\3\2\2\2\u017d\u017e\7/\2\2\u017ed\3\2\2\2\u017f\u0180\7,\2\2\u0180f"+
		"\3\2\2\2\u0181\u0182\7\61\2\2\u0182h\3\2\2\2\u0183\u0184\7\'\2\2\u0184"+
		"j\3\2\2\2\u0185\u0186\7-\2\2\u0186\u0187\7?\2\2\u0187l\3\2\2\2\u0188\u0189"+
		"\7/\2\2\u0189\u018a\7?\2\2\u018an\3\2\2\2\u018b\u018c\7,\2\2\u018c\u018d"+
		"\7?\2\2\u018dp\3\2\2\2\u018e\u018f\7\61\2\2\u018f\u0190\7?\2\2\u0190r"+
		"\3\2\2\2\u0191\u0193\t\2\2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\b:"+
		"\2\2\u0197t\3\2\2\2\u0198\u0199\5{>\2\u0199v\3\2\2\2\u019a\u019b\5\177"+
		"@\2\u019bx\3\2\2\2\u019c\u019d\5}?\2\u019dz\3\2\2\2\u019e\u01a6\t\3\2"+
		"\2\u019f\u01a1\t\3\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a7\t\3\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7|\3\2\2\2"+
		"\u01a8\u01ab\5\177@\2\u01a9\u01ab\t\3\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab~\3\2\2\2\u01ac\u01b1\t\4\2\2\u01ad\u01b1\n\5\2\2\u01ae"+
		"\u01af\t\6\2\2\u01af\u01b1\t\7\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01ad\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u0080\3\2\2\2\u01b2\u01b6\5w<\2\u01b3\u01b5"+
		"\5y=\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u0082\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01c7\7\62"+
		"\2\2\u01ba\u01c4\t\b\2\2\u01bb\u01bd\5{>\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01c5\3\2\2\2\u01be\u01c0\7a\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c5\5{>\2\u01c4\u01bc\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01b9\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ca\t\t\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u0084\3\2"+
		"\2\2\u01cb\u01cc\7$\2\2\u01cc\u01d0\5w<\2\u01cd\u01cf\5y=\2\u01ce\u01cd"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7$\2\2\u01d4\u0086\3\2"+
		"\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9"+
		"\7f\2\2\u01d9\u01da\7c\2\2\u01da\u0088\3\2\2\2\23\2\u0099\u009f\u012b"+
		"\u0155\u0194\u01a2\u01a6\u01aa\u01b0\u01b6\u01bc\u01c1\u01c4\u01c6\u01c9"+
		"\u01d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}