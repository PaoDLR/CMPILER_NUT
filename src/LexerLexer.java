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
		ASSERT=1, BOOLEAN=2, BREAK=3, CASE=4, CHAR=5, CONST=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, FINAL=11, FLOAT=12, FOR=13, IF=14, INT=15, NEW=16, 
		RETURN=17, STATIC=18, SWITCH=19, VOID=20, WHILE=21, LPAREN=22, RPAREN=23, 
		LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, DOT=30, 
		ASSIGN=31, GT=32, LT=33, BANG=34, COLON=35, EQUAL=36, LE=37, GE=38, NOTEQUAL=39, 
		AND=40, OR=41, INC=42, DEC=43, ADD=44, SUB=45, MUL=46, DIV=47, MOD=48, 
		ADD_ASSIGN=49, SUB_ASSIGN=50, MUL_ASSIGN=51, DIV_ASSIGN=52, WS=53, NUMBER=54, 
		ALPHABET=55, NUMORALPH=56, DECIMAL_LITERAL=57, STRING_LITERAL=58, NULL_LITERAL=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "DEFAULT", "DO", 
			"DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "NEW", "RETURN", 
			"STATIC", "SWITCH", "VOID", "WHILE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "WS", "NUMBER", "ALPHABET", "NUMORALPH", "Digits", "LetterOrDigit", 
			"Letter", "DECIMAL_LITERAL", "STRING_LITERAL", "NULL_LITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\6\66\u014e"+
		"\n\66\r\66\16\66\u014f\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\7:\u015c"+
		"\n:\f:\16:\u015f\13:\3:\5:\u0162\n:\3;\3;\5;\u0166\n;\3<\3<\3<\3<\5<\u016c"+
		"\n<\3=\3=\3=\5=\u0171\n=\3=\6=\u0174\n=\r=\16=\u0175\3=\5=\u0179\n=\5"+
		"=\u017b\n=\3=\5=\u017e\n=\3>\3>\3>\7>\u0183\n>\f>\16>\u0186\13>\3>\3>"+
		"\3?\3?\3?\3?\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s\2u\2w\2y;{<}=\3\2\n\5\2\13\f\17\17\"\"\3\2"+
		"\62;\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\3\2\63;\4\2NNnn\2\u0197\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\3\177\3\2\2\2\5\u0085\3\2\2\2\7\u008b\3\2\2\2\t\u0092\3\2\2"+
		"\2\13\u0097\3\2\2\2\r\u009e\3\2\2\2\17\u00a2\3\2\2\2\21\u00ab\3\2\2\2"+
		"\23\u00b0\3\2\2\2\25\u00b6\3\2\2\2\27\u00bd\3\2\2\2\31\u00c5\3\2\2\2\33"+
		"\u00cb\3\2\2\2\35\u00ce\3\2\2\2\37\u00d2\3\2\2\2!\u00da\3\2\2\2#\u00de"+
		"\3\2\2\2%\u00e2\3\2\2\2\'\u00e7\3\2\2\2)\u00f0\3\2\2\2+\u00f9\3\2\2\2"+
		"-\u0100\3\2\2\2/\u0102\3\2\2\2\61\u0104\3\2\2\2\63\u0106\3\2\2\2\65\u0108"+
		"\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u010e\3\2\2\2=\u0110\3\2\2\2"+
		"?\u0112\3\2\2\2A\u0114\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G\u011a\3"+
		"\2\2\2I\u011c\3\2\2\2K\u011f\3\2\2\2M\u0122\3\2\2\2O\u0125\3\2\2\2Q\u0128"+
		"\3\2\2\2S\u012d\3\2\2\2U\u0130\3\2\2\2W\u0133\3\2\2\2Y\u0136\3\2\2\2["+
		"\u0138\3\2\2\2]\u013a\3\2\2\2_\u013c\3\2\2\2a\u013e\3\2\2\2c\u0140\3\2"+
		"\2\2e\u0143\3\2\2\2g\u0146\3\2\2\2i\u0149\3\2\2\2k\u014d\3\2\2\2m\u0153"+
		"\3\2\2\2o\u0155\3\2\2\2q\u0157\3\2\2\2s\u0159\3\2\2\2u\u0165\3\2\2\2w"+
		"\u016b\3\2\2\2y\u017a\3\2\2\2{\u017f\3\2\2\2}\u0189\3\2\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7r\2\2\u0081\u0082\7q\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7g\2\2\u0084\4\3\2\2\2\u0085\u0086\7o\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7{\2\2\u0088\u0089\7d\2\2\u0089\u008a\7g\2\2\u008a\6\3\2\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7d\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7m\2\2\u0091\b\3\2\2\2\u0092\u0093\7e"+
		"\2\2\u0093\u0094\7c\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\n"+
		"\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7j\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7q\2\2\u009c\u009d\7v\2\2\u009d\f\3\2\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\16\3\2\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\u00a7\7f\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7f\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\u00af\7|\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7y\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\24\3\2\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7u\2\2\u00bc\26\3\2\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1\u00c2\7c\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7{\2\2\u00c4\30\3\2"+
		"\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9"+
		"\7y\2\2\u00c9\u00ca\7p\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7x\2\2\u00cd\34\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5"+
		"\7i\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9 \3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7y\2\2\u00dd\"\3\2\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7r\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7j\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7x\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7q\2\2\u00ef(\3\2\2"+
		"\2\u00f0\u00f1\7m\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7w\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7i\2\2"+
		"\u00ff,\3\2\2\2\u0100\u0101\7*\2\2\u0101.\3\2\2\2\u0102\u0103\7+\2\2\u0103"+
		"\60\3\2\2\2\u0104\u0105\7}\2\2\u0105\62\3\2\2\2\u0106\u0107\7\177\2\2"+
		"\u0107\64\3\2\2\2\u0108\u0109\7]\2\2\u0109\66\3\2\2\2\u010a\u010b\7_\2"+
		"\2\u010b8\3\2\2\2\u010c\u010d\7=\2\2\u010d:\3\2\2\2\u010e\u010f\7.\2\2"+
		"\u010f<\3\2\2\2\u0110\u0111\7\60\2\2\u0111>\3\2\2\2\u0112\u0113\7?\2\2"+
		"\u0113@\3\2\2\2\u0114\u0115\7@\2\2\u0115B\3\2\2\2\u0116\u0117\7>\2\2\u0117"+
		"D\3\2\2\2\u0118\u0119\7#\2\2\u0119F\3\2\2\2\u011a\u011b\7<\2\2\u011bH"+
		"\3\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7>\2\2\u0120\u0121\7?\2\2\u0121L\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124"+
		"\7?\2\2\u0124N\3\2\2\2\u0125\u0126\7#\2\2\u0126\u0127\7?\2\2\u0127P\3"+
		"\2\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b"+
		"\u012c\7q\2\2\u012cR\3\2\2\2\u012d\u012e\7q\2\2\u012e\u012f\7t\2\2\u012f"+
		"T\3\2\2\2\u0130\u0131\7-\2\2\u0131\u0132\7-\2\2\u0132V\3\2\2\2\u0133\u0134"+
		"\7/\2\2\u0134\u0135\7/\2\2\u0135X\3\2\2\2\u0136\u0137\7-\2\2\u0137Z\3"+
		"\2\2\2\u0138\u0139\7/\2\2\u0139\\\3\2\2\2\u013a\u013b\7,\2\2\u013b^\3"+
		"\2\2\2\u013c\u013d\7\61\2\2\u013d`\3\2\2\2\u013e\u013f\7\'\2\2\u013fb"+
		"\3\2\2\2\u0140\u0141\7-\2\2\u0141\u0142\7?\2\2\u0142d\3\2\2\2\u0143\u0144"+
		"\7/\2\2\u0144\u0145\7?\2\2\u0145f\3\2\2\2\u0146\u0147\7,\2\2\u0147\u0148"+
		"\7?\2\2\u0148h\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b\7?\2\2\u014bj"+
		"\3\2\2\2\u014c\u014e\t\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\66"+
		"\2\2\u0152l\3\2\2\2\u0153\u0154\5s:\2\u0154n\3\2\2\2\u0155\u0156\5w<\2"+
		"\u0156p\3\2\2\2\u0157\u0158\5u;\2\u0158r\3\2\2\2\u0159\u0161\t\3\2\2\u015a"+
		"\u015c\t\3\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0162\t\3\2\2\u0161\u015d\3\2\2\2\u0161\u0162\3\2\2\2\u0162t\3\2\2\2"+
		"\u0163\u0166\5w<\2\u0164\u0166\t\3\2\2\u0165\u0163\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166v\3\2\2\2\u0167\u016c\t\4\2\2\u0168\u016c\n\5\2\2\u0169"+
		"\u016a\t\6\2\2\u016a\u016c\t\7\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016cx\3\2\2\2\u016d\u017b\7\62\2\2\u016e\u0178"+
		"\t\b\2\2\u016f\u0171\5s:\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0179\3\2\2\2\u0172\u0174\7a\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\5s:\2\u0178\u0170\3\2\2\2\u0178\u0173\3\2\2\2\u0179\u017b\3\2\2"+
		"\2\u017a\u016d\3\2\2\2\u017a\u016e\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017e"+
		"\t\t\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017ez\3\2\2\2\u017f"+
		"\u0180\7$\2\2\u0180\u0184\5o8\2\u0181\u0183\5q9\2\u0182\u0181\3\2\2\2"+
		"\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7$\2\2\u0188|\3\2\2\2\u0189\u018a"+
		"\7p\2\2\u018a\u018b\7c\2\2\u018b\u018c\7k\2\2\u018c\u018d\7f\2\2\u018d"+
		"\u018e\7c\2\2\u018e~\3\2\2\2\16\2\u014f\u015d\u0161\u0165\u016b\u0170"+
		"\u0175\u0178\u017a\u017d\u0184\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}