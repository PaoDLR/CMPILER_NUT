// Generated from D:/School/CMPILER/MP/CMPILER_NUT\NutParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NutParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSERT=1, BOOLEAN=2, BREAK=3, CASE=4, CHAR=5, CLASS=6, CONST=7, DEFAULT=8, 
		DO=9, DOUBLE=10, ELSE=11, FINAL=12, FLOAT=13, FOR=14, IF=15, INT=16, INTERFACE=17, 
		NEW=18, PRINT=19, PRIVATE=20, PUBLIC=21, RETURN=22, SCAN=23, STATIC=24, 
		STRING=25, SWITCH=26, VOID=27, WHILE=28, LPAREN=29, RPAREN=30, LBRACE=31, 
		RBRACE=32, LBRACK=33, RBRACK=34, SEMI=35, COMMA=36, DOT=37, QUOTATION=38, 
		ASSIGN=39, GT=40, LT=41, BANG=42, COLON=43, EQUAL=44, LE=45, GE=46, NOTEQUAL=47, 
		AND=48, OR=49, INC=50, DEC=51, ADD=52, SUB=53, MUL=54, DIV=55, MOD=56, 
		AMP=57, DOTS=58, AT=59, QM=60, ADD_ASSIGN=61, SUB_ASSIGN=62, MUL_ASSIGN=63, 
		DIV_ASSIGN=64, WS=65, IDENTIFIER=66, DECIMAL_LITERAL=67, HEX_LITERAL=68, 
		OCT_LITERAL=69, BINARY_LITERAL=70, FLOAT_LITERAL=71, HEX_FLOAT_LITERAL=72, 
		BOOL_LITERAL=73, CHAR_LITERAL=74, STRING_LITERAL=75, COMMENT=76, LINE_COMMENT=77;
	public static final int
		RULE_compilationUnit = 0, RULE_typeDeclaration = 1, RULE_modifier = 2, 
		RULE_classOrInterfaceModifier = 3, RULE_variableModifier = 4, RULE_classDeclaration = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeBound = 8, RULE_interfaceDeclaration = 9, 
		RULE_classBody = 10, RULE_interfaceBody = 11, RULE_classBodyDeclaration = 12, 
		RULE_memberDeclaration = 13, RULE_methodDeclaration = 14, RULE_methodBody = 15, 
		RULE_typeTypeOrVoid = 16, RULE_genericMethodDeclaration = 17, RULE_genericConstructorDeclaration = 18, 
		RULE_constructorDeclaration = 19, RULE_fieldDeclaration = 20, RULE_interfaceBodyDeclaration = 21, 
		RULE_interfaceMemberDeclaration = 22, RULE_constDeclaration = 23, RULE_constantDeclarator = 24, 
		RULE_interfaceMethodDeclaration = 25, RULE_interfaceMethodModifier = 26, 
		RULE_genericInterfaceMethodDeclaration = 27, RULE_variableDeclarators = 28, 
		RULE_variableDeclarator = 29, RULE_variableDeclaratorId = 30, RULE_variableInitializer = 31, 
		RULE_arrayInitializer = 32, RULE_classOrInterfaceType = 33, RULE_typeArgument = 34, 
		RULE_qualifiedNameList = 35, RULE_formalParameters = 36, RULE_formalParameterList = 37, 
		RULE_formalParameter = 38, RULE_lastFormalParameter = 39, RULE_qualifiedName = 40, 
		RULE_literal = 41, RULE_integerLiteral = 42, RULE_floatLiteral = 43, RULE_annotation = 44, 
		RULE_elementValuePairs = 45, RULE_elementValuePair = 46, RULE_elementValue = 47, 
		RULE_elementValueArrayInitializer = 48, RULE_annotationTypeDeclaration = 49, 
		RULE_annotationTypeBody = 50, RULE_annotationTypeElementDeclaration = 51, 
		RULE_annotationTypeElementRest = 52, RULE_annotationMethodOrConstantRest = 53, 
		RULE_annotationMethodRest = 54, RULE_annotationConstantRest = 55, RULE_defaultValue = 56, 
		RULE_block = 57, RULE_blockStatement = 58, RULE_localVariableDeclaration = 59, 
		RULE_localTypeDeclaration = 60, RULE_declaration = 61, RULE_statement = 62, 
		RULE_printStatement = 63, RULE_resourceSpecification = 64, RULE_resources = 65, 
		RULE_resource = 66, RULE_switchBlockStatementGroup = 67, RULE_switchLabel = 68, 
		RULE_forControl = 69, RULE_forInit = 70, RULE_enhancedForControl = 71, 
		RULE_parExpression = 72, RULE_expressionList = 73, RULE_methodCall = 74, 
		RULE_expression = 75, RULE_primary = 76, RULE_classType = 77, RULE_creator = 78, 
		RULE_createdName = 79, RULE_innerCreator = 80, RULE_classCreatorRest = 81, 
		RULE_explicitGenericInvocation = 82, RULE_typeArgumentsOrDiamond = 83, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 84, RULE_nonWildcardTypeArguments = 85, 
		RULE_typeList = 86, RULE_typeType = 87, RULE_primitiveType = 88, RULE_typeArguments = 89, 
		RULE_superSuffix = 90, RULE_explicitGenericInvocationSuffix = 91, RULE_arguments = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "typeDeclaration", "modifier", "classOrInterfaceModifier", 
			"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "interfaceDeclaration", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "classOrInterfaceType", "typeArgument", "qualifiedNameList", 
			"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
			"qualifiedName", "literal", "integerLiteral", "floatLiteral", "annotation", 
			"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
			"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
			"annotationConstantRest", "defaultValue", "block", "blockStatement", 
			"localVariableDeclaration", "localTypeDeclaration", "declaration", "statement", 
			"printStatement", "resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "primary", "classType", 
			"creator", "createdName", "innerCreator", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tpose'", "'maybe'", "'ubreak'", "'case'", "'charot'", "'sleep'", 
			"'ant'", "'standard'", "'glaz'", "'twice'", "'unless'", "'fantasy'", 
			"'drown'", "'iv'", "'can'", "'digimon'", "'ux'", "'new'", "'printing'", 
			"'stealth'", "'expose'", "'ups'", "'scan'", "'shiv'", "'string'", "'nintendo'", 
			"'kassadin'", "'during'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'\"'", "'='", "'>'", "'<'", "'!'", "':'", "'=='", "'<='", 
			"'>='", "'!='", "'also'", "'or'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&'", "'...'", "'@'", "'?'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONST", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", 
			"INTERFACE", "NEW", "PRINT", "PRIVATE", "PUBLIC", "RETURN", "SCAN", "STATIC", 
			"STRING", "SWITCH", "VOID", "WHILE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "QUOTATION", "ASSIGN", "GT", 
			"LT", "BANG", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
			"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "AMP", "DOTS", "AT", 
			"QM", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "WS", "IDENTIFIER", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "NutParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NutParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << SEMI) | (1L << AT))) != 0)) {
				{
				{
				setState(186);
				typeDeclaration();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(EOF);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			int _alt;
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PUBLIC:
			case STATIC:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(200);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(201);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(202);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			classOrInterfaceModifier();
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(NutParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(NutParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(NutParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(NutParser.FINAL, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceModifier);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(FINAL);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(NutParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableModifier);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(NutParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CLASS);
			setState(222);
			match(IDENTIFIER);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(223);
				typeParameters();
				}
			}

			setState(226);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NutParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(NutParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LT);
			setState(229);
			typeParameter();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				typeParameter();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(239);
				annotation();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(NutParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(NutParser.AMP, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			typeType();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(248);
				match(AMP);
				setState(249);
				typeType();
				}
				}
				setState(254);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(NutParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(INTERFACE);
			setState(256);
			match(IDENTIFIER);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(257);
				typeParameters();
				}
			}

			setState(260);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LBRACE);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRING) | (1L << VOID) | (1L << LBRACE) | (1L << SEMI) | (1L << LT) | (1L << AT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(263);
				classBodyDeclaration();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LBRACE);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRING) | (1L << VOID) | (1L << SEMI) | (1L << LT) | (1L << AT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(272);
				interfaceBodyDeclaration();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(NutParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(281);
					match(STATIC);
					}
				}

				setState(284);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						modifier();
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(291);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				classDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(NutParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(NutParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(NutParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(NutParser.RBRACK, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			typeTypeOrVoid();
			setState(305);
			match(IDENTIFIER);
			setState(306);
			formalParameters();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(307);
				match(LBRACK);
				setState(308);
				match(RBRACK);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			methodBody();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodBody);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(NutParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeTypeOrVoid);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			typeParameters();
			setState(325);
			methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			typeParameters();
			setState(328);
			constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IDENTIFIER);
			setState(331);
			formalParameters();
			setState(332);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			typeType();
			setState(335);
			variableDeclarators();
			setState(336);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case PRIVATE:
			case PUBLIC:
			case STATIC:
			case STRING:
			case VOID:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						modifier();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(344);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceMemberDeclaration);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				classDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			typeType();
			setState(357);
			constantDeclarator();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(358);
				match(COMMA);
				setState(359);
				constantDeclarator();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(NutParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(NutParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(NutParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(NutParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(NutParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(368);
				match(LBRACK);
				setState(369);
				match(RBRACK);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(ASSIGN);
			setState(376);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(NutParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(NutParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(NutParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(NutParser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					interfaceMethodModifier();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(384);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(385);
				typeParameters();
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(386);
						annotation();
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(392);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(396);
			match(IDENTIFIER);
			setState(397);
			formalParameters();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(398);
				match(LBRACK);
				setState(399);
				match(RBRACK);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(NutParser.PUBLIC, 0); }
		public TerminalNode DEFAULT() { return getToken(NutParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(NutParser.STATIC, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMethodModifier);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(PUBLIC);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(STATIC);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			typeParameters();
			setState(414);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			variableDeclarator();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(417);
				match(COMMA);
				setState(418);
				variableDeclarator();
				}
				}
				setState(423);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(NutParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			variableDeclaratorId();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(425);
				match(ASSIGN);
				setState(426);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(NutParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(NutParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(NutParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(NutParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(IDENTIFIER);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(430);
				match(LBRACK);
				setState(431);
				match(RBRACK);
				}
				}
				setState(436);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableInitializer);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case NEW:
			case STRING:
			case VOID:
			case LPAREN:
			case LT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LBRACE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
				{
				setState(442);
				variableInitializer();
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(443);
						match(COMMA);
						setState(444);
						variableInitializer();
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(450);
					match(COMMA);
					}
				}

				}
			}

			setState(455);
			match(RBRACE);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NutParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NutParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(NutParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NutParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classOrInterfaceType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(IDENTIFIER);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(458);
				typeArguments();
				}
			}

			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(DOT);
					setState(462);
					match(IDENTIFIER);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(463);
						typeArguments();
						}
					}

					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QM() { return getToken(NutParser.QM, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeArgument);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				typeType();
				}
				break;
			case QM:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(QM);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			qualifiedName();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(476);
				match(COMMA);
				setState(477);
				qualifiedName();
				}
				}
				setState(482);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(LPAREN);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << AT))) != 0) || _la==IDENTIFIER) {
				{
				setState(484);
				formalParameterList();
				}
			}

			setState(487);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				formalParameter();
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(490);
						match(COMMA);
						setState(491);
						formalParameter();
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(497);
					match(COMMA);
					setState(498);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(504);
					variableModifier();
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(510);
			typeType();
			setState(511);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(NutParser.DOTS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					variableModifier();
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(519);
			typeType();
			setState(520);
			match(DOTS);
			setState(521);
			variableDeclaratorId();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NutParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NutParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(NutParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NutParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(IDENTIFIER);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(524);
				match(DOT);
				setState(525);
				match(IDENTIFIER);
				}
				}
				setState(530);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(NutParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NutParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(NutParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				match(BOOL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(NutParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(NutParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(NutParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(NutParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(NutParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(NutParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NutParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(AT);
			setState(543);
			qualifiedName();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(544);
				match(LPAREN);
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(545);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(546);
					elementValue();
					}
					break;
				}
				setState(549);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			elementValuePair();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(553);
				match(COMMA);
				setState(554);
				elementValuePair();
				}
				}
				setState(559);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(NutParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(IDENTIFIER);
			setState(561);
			match(ASSIGN);
			setState(562);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_elementValue);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LBRACE);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
				{
				setState(570);
				elementValue();
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(571);
						match(COMMA);
						setState(572);
						elementValue();
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(580);
				match(COMMA);
				}
			}

			setState(583);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NutParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(NutParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(AT);
			setState(586);
			match(INTERFACE);
			setState(587);
			match(IDENTIFIER);
			setState(588);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(LBRACE);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRING) | (1L << SEMI) | (1L << AT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(591);
				annotationTypeElementDeclaration();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case PRIVATE:
			case PUBLIC:
			case STATIC:
			case STRING:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(599);
						modifier();
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(605);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotationTypeElementRest);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				typeType();
				setState(610);
				annotationMethodOrConstantRest();
				setState(611);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				classDeclaration();
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(614);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				interfaceDeclaration();
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(618);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				annotationTypeDeclaration();
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(622);
					match(SEMI);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationMethodOrConstantRest);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(IDENTIFIER);
			setState(632);
			match(LPAREN);
			setState(633);
			match(RPAREN);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(634);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(NutParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(DEFAULT);
			setState(640);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(LBRACE);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRINT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRING) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
				{
				{
				setState(643);
				blockStatement();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_blockStatement);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				localVariableDeclaration();
				setState(652);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					variableModifier();
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(664);
			typeType();
			setState(665);
			variableDeclarators();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PUBLIC:
			case STATIC:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << AT))) != 0)) {
					{
					{
					setState(667);
					classOrInterfaceModifier();
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(673);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(674);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(SEMI);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			typeType();
			setState(681);
			match(IDENTIFIER);
			setState(682);
			match(SEMI);
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
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(NutParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(NutParser.COLON, 0); }
		public TerminalNode IF() { return getToken(NutParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NutParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(NutParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(NutParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(NutParser.DO, 0); }
		public TerminalNode SWITCH() { return getToken(NutParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(NutParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NutParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(NutParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(NutParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(ASSERT);
				setState(686);
				expression(0);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(687);
					match(COLON);
					setState(688);
					expression(0);
					}
				}

				setState(691);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(IF);
				setState(694);
				parExpression();
				setState(695);
				statement();
				setState(698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(696);
					match(ELSE);
					setState(697);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(700);
				match(FOR);
				setState(701);
				match(LPAREN);
				setState(702);
				forControl();
				setState(703);
				match(RPAREN);
				setState(704);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				match(WHILE);
				setState(707);
				parExpression();
				setState(708);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(710);
				match(DO);
				setState(711);
				statement();
				setState(712);
				match(WHILE);
				setState(713);
				parExpression();
				setState(714);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(716);
				match(SWITCH);
				setState(717);
				parExpression();
				setState(718);
				match(LBRACE);
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(719);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(725);
					switchLabel();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
				match(RBRACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(733);
				match(RETURN);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
					{
					setState(734);
					expression(0);
					}
				}

				setState(737);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(738);
				match(BREAK);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(739);
					match(IDENTIFIER);
					}
				}

				setState(742);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(743);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(744);
				printStatement();
				setState(745);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(747);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(748);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(750);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(751);
				match(COLON);
				setState(752);
				statement();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NutParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_printStatement);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(PRINT);
				setState(757);
				match(LPAREN);
				setState(758);
				literal();
				setState(759);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				match(PRINT);
				setState(762);
				match(LPAREN);
				setState(763);
				qualifiedName();
				setState(764);
				match(RPAREN);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(NutParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(LPAREN);
			setState(769);
			resources();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(770);
				match(SEMI);
				}
			}

			setState(773);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(NutParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(NutParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			resource();
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					match(SEMI);
					setState(777);
					resource();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(NutParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(783);
				variableModifier();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			classOrInterfaceType();
			setState(790);
			variableDeclaratorId();
			setState(791);
			match(ASSIGN);
			setState(792);
			expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(794);
				switchLabel();
				}
				}
				setState(797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(799);
				blockStatement();
				}
				}
				setState(802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRINT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRING) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(NutParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(NutParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(NutParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_switchLabel);
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(CASE);
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(805);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(806);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(809);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(DEFAULT);
				setState(811);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(NutParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(NutParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_forControl);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
					{
					setState(815);
					forInit();
					}
				}

				setState(818);
				match(SEMI);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
					{
					setState(819);
					expression(0);
					}
				}

				setState(822);
				match(SEMI);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
					{
					setState(823);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forInit);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NutParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(832);
					variableModifier();
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(838);
			typeType();
			setState(839);
			variableDeclaratorId();
			setState(840);
			match(COLON);
			setState(841);
			expression(0);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(LPAREN);
			setState(844);
			expression(0);
			setState(845);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			expression(0);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(848);
				match(COMMA);
				setState(849);
				expression(0);
				}
				}
				setState(854);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(IDENTIFIER);
			setState(856);
			match(LPAREN);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
				{
				setState(857);
				expressionList();
				}
			}

			setState(860);
			match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(NutParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(NutParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(NutParser.SUB, 0); }
		public TerminalNode INC() { return getToken(NutParser.INC, 0); }
		public TerminalNode DEC() { return getToken(NutParser.DEC, 0); }
		public TerminalNode MUL() { return getToken(NutParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(NutParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(NutParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(NutParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(NutParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(NutParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(NutParser.GT, i);
		}
		public TerminalNode LE() { return getToken(NutParser.LE, 0); }
		public TerminalNode GE() { return getToken(NutParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(NutParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(NutParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(NutParser.AND, 0); }
		public TerminalNode OR() { return getToken(NutParser.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(NutParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(NutParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(NutParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(NutParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(NutParser.DIV_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(NutParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(NutParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(NutParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(863);
				primary();
				}
				break;
			case 2:
				{
				setState(864);
				methodCall();
				}
				break;
			case 3:
				{
				setState(865);
				match(NEW);
				setState(866);
				creator();
				}
				break;
			case 4:
				{
				setState(867);
				match(LPAREN);
				setState(868);
				typeType();
				setState(869);
				match(RPAREN);
				setState(870);
				expression(11);
				}
				break;
			case 5:
				{
				setState(872);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(873);
				expression(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(876);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(877);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(878);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(879);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(880);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(881);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(890);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
						case 1:
							{
							setState(883);
							match(LT);
							setState(884);
							match(LT);
							}
							break;
						case 2:
							{
							setState(885);
							match(GT);
							setState(886);
							match(GT);
							setState(887);
							match(GT);
							}
							break;
						case 3:
							{
							setState(888);
							match(GT);
							setState(889);
							match(GT);
							}
							break;
						}
						setState(892);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(893);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(894);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(895);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(897);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(898);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(900);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(901);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(904);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(905);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(906);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (ASSIGN - 39)) | (1L << (ADD_ASSIGN - 39)) | (1L << (SUB_ASSIGN - 39)) | (1L << (MUL_ASSIGN - 39)) | (1L << (DIV_ASSIGN - 39)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(907);
						expression(1);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(909);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(913);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(910);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(911);
							methodCall();
							}
							break;
						case 3:
							{
							setState(912);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(915);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(916);
						match(LBRACK);
						setState(917);
						expression(0);
						setState(918);
						match(RBRACK);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(920);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(921);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NutParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(NutParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_primary);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(LPAREN);
				setState(928);
				expression(0);
				setState(929);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(933);
				typeTypeOrVoid();
				setState(934);
				match(DOT);
				setState(935);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(937);
				nonWildcardTypeArguments();
				{
				setState(938);
				explicitGenericInvocationSuffix();
				}
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NutParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(942);
				classOrInterfaceType();
				setState(943);
				match(DOT);
				}
				break;
			}
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(947);
				annotation();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
			match(IDENTIFIER);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(954);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_creator);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				nonWildcardTypeArguments();
				setState(958);
				createdName();
				setState(959);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				createdName();
				{
				setState(962);
				classCreatorRest();
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NutParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NutParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(NutParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NutParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_createdName);
		int _la;
		try {
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(IDENTIFIER);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(967);
					typeArgumentsOrDiamond();
					}
				}

				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(970);
					match(DOT);
					setState(971);
					match(IDENTIFIER);
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(972);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(IDENTIFIER);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(984);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(987);
			classCreatorRest();
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			arguments();
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(990);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			nonWildcardTypeArguments();
			setState(994);
			explicitGenericInvocationSuffix();
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NutParser.LT, 0); }
		public TerminalNode GT() { return getToken(NutParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeArgumentsOrDiamond);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(LT);
				setState(997);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NutParser.LT, 0); }
		public TerminalNode GT() { return getToken(NutParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(LT);
				setState(1002);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NutParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(NutParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(LT);
			setState(1007);
			typeList();
			setState(1008);
			match(GT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			typeType();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1011);
				match(COMMA);
				setState(1012);
				typeType();
				}
				}
				setState(1017);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(NutParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(NutParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(NutParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(NutParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1018);
				annotation();
				}
			}

			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1021);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
				{
				setState(1022);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1025);
				match(LBRACK);
				setState(1026);
				match(RBRACK);
				}
				}
				setState(1031);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(NutParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(NutParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(NutParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(NutParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(NutParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(NutParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NutParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(NutParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NutParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NutParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(LT);
			setState(1035);
			typeArgument();
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1036);
				match(COMMA);
				setState(1037);
				typeArgument();
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			match(GT);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NutParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_superSuffix);
		int _la;
		try {
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(DOT);
				setState(1047);
				match(IDENTIFIER);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1048);
					arguments();
					}
				}

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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NutParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicitGenericInvocationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(IDENTIFIER);
			setState(1054);
			arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NutParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NutParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NutParserListener ) ((NutParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutParserVisitor ) return ((NutParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(LPAREN);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << STRING) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (DECIMAL_LITERAL - 66)) | (1L << (HEX_LITERAL - 66)) | (1L << (OCT_LITERAL - 66)) | (1L << (BINARY_LITERAL - 66)) | (1L << (FLOAT_LITERAL - 66)) | (1L << (HEX_FLOAT_LITERAL - 66)) | (1L << (BOOL_LITERAL - 66)) | (1L << (CHAR_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) {
				{
				setState(1057);
				expressionList();
				}
			}

			setState(1060);
			match(RPAREN);
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
		case 75:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0429\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\7\2"+
		"\u00be\n\2\f\2\16\2\u00c1\13\2\3\2\3\2\3\3\7\3\u00c6\n\3\f\3\16\3\u00c9"+
		"\13\3\3\3\3\3\3\3\5\3\u00ce\n\3\3\3\5\3\u00d1\n\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00da\n\5\3\6\3\6\5\6\u00de\n\6\3\7\3\7\3\7\5\7\u00e3\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00eb\n\b\f\b\16\b\u00ee\13\b\3\b\3\b\3\t"+
		"\7\t\u00f3\n\t\f\t\16\t\u00f6\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u00fd\n\n\f"+
		"\n\16\n\u0100\13\n\3\13\3\13\3\13\5\13\u0105\n\13\3\13\3\13\3\f\3\f\7"+
		"\f\u010b\n\f\f\f\16\f\u010e\13\f\3\f\3\f\3\r\3\r\7\r\u0114\n\r\f\r\16"+
		"\r\u0117\13\r\3\r\3\r\3\16\3\16\5\16\u011d\n\16\3\16\3\16\7\16\u0121\n"+
		"\16\f\16\16\16\u0124\13\16\3\16\5\16\u0127\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0131\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u0138"+
		"\n\20\f\20\16\20\u013b\13\20\3\20\3\20\3\21\3\21\5\21\u0141\n\21\3\22"+
		"\3\22\5\22\u0145\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\7\27\u0156\n\27\f\27\16\27\u0159\13\27\3\27"+
		"\3\27\5\27\u015d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0165\n\30\3"+
		"\31\3\31\3\31\3\31\7\31\u016b\n\31\f\31\16\31\u016e\13\31\3\31\3\31\3"+
		"\32\3\32\3\32\7\32\u0175\n\32\f\32\16\32\u0178\13\32\3\32\3\32\3\32\3"+
		"\33\7\33\u017e\n\33\f\33\16\33\u0181\13\33\3\33\3\33\3\33\7\33\u0186\n"+
		"\33\f\33\16\33\u0189\13\33\3\33\3\33\5\33\u018d\n\33\3\33\3\33\3\33\3"+
		"\33\7\33\u0193\n\33\f\33\16\33\u0196\13\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\5\34\u019e\n\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01a6\n\36\f\36"+
		"\16\36\u01a9\13\36\3\37\3\37\3\37\5\37\u01ae\n\37\3 \3 \3 \7 \u01b3\n"+
		" \f \16 \u01b6\13 \3!\3!\5!\u01ba\n!\3\"\3\"\3\"\3\"\7\"\u01c0\n\"\f\""+
		"\16\"\u01c3\13\"\3\"\5\"\u01c6\n\"\5\"\u01c8\n\"\3\"\3\"\3#\3#\5#\u01ce"+
		"\n#\3#\3#\3#\5#\u01d3\n#\7#\u01d5\n#\f#\16#\u01d8\13#\3$\3$\5$\u01dc\n"+
		"$\3%\3%\3%\7%\u01e1\n%\f%\16%\u01e4\13%\3&\3&\5&\u01e8\n&\3&\3&\3\'\3"+
		"\'\3\'\7\'\u01ef\n\'\f\'\16\'\u01f2\13\'\3\'\3\'\5\'\u01f6\n\'\3\'\5\'"+
		"\u01f9\n\'\3(\7(\u01fc\n(\f(\16(\u01ff\13(\3(\3(\3(\3)\7)\u0205\n)\f)"+
		"\16)\u0208\13)\3)\3)\3)\3)\3*\3*\3*\7*\u0211\n*\f*\16*\u0214\13*\3+\3"+
		"+\3+\3+\3+\5+\u021b\n+\3,\3,\3-\3-\3.\3.\3.\3.\3.\5.\u0226\n.\3.\5.\u0229"+
		"\n.\3/\3/\3/\7/\u022e\n/\f/\16/\u0231\13/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\5\61\u023a\n\61\3\62\3\62\3\62\3\62\7\62\u0240\n\62\f\62\16\62\u0243"+
		"\13\62\5\62\u0245\n\62\3\62\5\62\u0248\n\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\7\64\u0253\n\64\f\64\16\64\u0256\13\64\3\64\3\64\3"+
		"\65\7\65\u025b\n\65\f\65\16\65\u025e\13\65\3\65\3\65\5\65\u0262\n\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\5\66\u026a\n\66\3\66\3\66\5\66\u026e\n\66"+
		"\3\66\3\66\5\66\u0272\n\66\5\66\u0274\n\66\3\67\3\67\5\67\u0278\n\67\3"+
		"8\38\38\38\58\u027e\n8\39\39\3:\3:\3:\3;\3;\7;\u0287\n;\f;\16;\u028a\13"+
		";\3;\3;\3<\3<\3<\3<\3<\5<\u0293\n<\3=\7=\u0296\n=\f=\16=\u0299\13=\3="+
		"\3=\3=\3>\7>\u029f\n>\f>\16>\u02a2\13>\3>\3>\5>\u02a6\n>\3>\5>\u02a9\n"+
		">\3?\3?\3?\3?\3@\3@\3@\3@\3@\5@\u02b4\n@\3@\3@\3@\3@\3@\3@\3@\5@\u02bd"+
		"\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u02d3"+
		"\n@\f@\16@\u02d6\13@\3@\7@\u02d9\n@\f@\16@\u02dc\13@\3@\3@\3@\3@\5@\u02e2"+
		"\n@\3@\3@\3@\5@\u02e7\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02f4\n@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0301\nA\3B\3B\3B\5B\u0306\nB\3B"+
		"\3B\3C\3C\3C\7C\u030d\nC\fC\16C\u0310\13C\3D\7D\u0313\nD\fD\16D\u0316"+
		"\13D\3D\3D\3D\3D\3D\3E\6E\u031e\nE\rE\16E\u031f\3E\6E\u0323\nE\rE\16E"+
		"\u0324\3F\3F\3F\5F\u032a\nF\3F\3F\3F\5F\u032f\nF\3G\3G\5G\u0333\nG\3G"+
		"\3G\5G\u0337\nG\3G\3G\5G\u033b\nG\5G\u033d\nG\3H\3H\5H\u0341\nH\3I\7I"+
		"\u0344\nI\fI\16I\u0347\13I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\7K\u0355"+
		"\nK\fK\16K\u0358\13K\3L\3L\3L\5L\u035d\nL\3L\3L\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\5M\u036d\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5"+
		"M\u037d\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\5M\u0394\nM\3M\3M\3M\3M\3M\3M\3M\7M\u039d\nM\fM\16M\u03a0\13M\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u03af\nN\3O\3O\3O\5O\u03b4\nO"+
		"\3O\7O\u03b7\nO\fO\16O\u03ba\13O\3O\3O\5O\u03be\nO\3P\3P\3P\3P\3P\3P\3"+
		"P\5P\u03c7\nP\3Q\3Q\5Q\u03cb\nQ\3Q\3Q\3Q\5Q\u03d0\nQ\7Q\u03d2\nQ\fQ\16"+
		"Q\u03d5\13Q\3Q\5Q\u03d8\nQ\3R\3R\5R\u03dc\nR\3R\3R\3S\3S\5S\u03e2\nS\3"+
		"T\3T\3T\3U\3U\3U\5U\u03ea\nU\3V\3V\3V\5V\u03ef\nV\3W\3W\3W\3W\3X\3X\3"+
		"X\7X\u03f8\nX\fX\16X\u03fb\13X\3Y\5Y\u03fe\nY\3Y\3Y\5Y\u0402\nY\3Y\3Y"+
		"\7Y\u0406\nY\fY\16Y\u0409\13Y\3Z\3Z\3[\3[\3[\3[\7[\u0411\n[\f[\16[\u0414"+
		"\13[\3[\3[\3\\\3\\\3\\\3\\\5\\\u041c\n\\\5\\\u041e\n\\\3]\3]\3]\3^\3^"+
		"\5^\u0425\n^\3^\3^\3^\2\3\u0098_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\2\f\3\2EH\3\2IJ\3\2\64\67\3\28:\3\2\66\67\4\2"+
		"*+/\60\4\2..\61\61\4\2))?B\3\2\64\65\b\2\4\4\7\7\f\f\17\17\22\22\33\33"+
		"\2\u047a\2\u00bf\3\2\2\2\4\u00d0\3\2\2\2\6\u00d2\3\2\2\2\b\u00d9\3\2\2"+
		"\2\n\u00dd\3\2\2\2\f\u00df\3\2\2\2\16\u00e6\3\2\2\2\20\u00f4\3\2\2\2\22"+
		"\u00f9\3\2\2\2\24\u0101\3\2\2\2\26\u0108\3\2\2\2\30\u0111\3\2\2\2\32\u0126"+
		"\3\2\2\2\34\u0130\3\2\2\2\36\u0132\3\2\2\2 \u0140\3\2\2\2\"\u0144\3\2"+
		"\2\2$\u0146\3\2\2\2&\u0149\3\2\2\2(\u014c\3\2\2\2*\u0150\3\2\2\2,\u015c"+
		"\3\2\2\2.\u0164\3\2\2\2\60\u0166\3\2\2\2\62\u0171\3\2\2\2\64\u017f\3\2"+
		"\2\2\66\u019d\3\2\2\28\u019f\3\2\2\2:\u01a2\3\2\2\2<\u01aa\3\2\2\2>\u01af"+
		"\3\2\2\2@\u01b9\3\2\2\2B\u01bb\3\2\2\2D\u01cb\3\2\2\2F\u01db\3\2\2\2H"+
		"\u01dd\3\2\2\2J\u01e5\3\2\2\2L\u01f8\3\2\2\2N\u01fd\3\2\2\2P\u0206\3\2"+
		"\2\2R\u020d\3\2\2\2T\u021a\3\2\2\2V\u021c\3\2\2\2X\u021e\3\2\2\2Z\u0220"+
		"\3\2\2\2\\\u022a\3\2\2\2^\u0232\3\2\2\2`\u0239\3\2\2\2b\u023b\3\2\2\2"+
		"d\u024b\3\2\2\2f\u0250\3\2\2\2h\u0261\3\2\2\2j\u0273\3\2\2\2l\u0277\3"+
		"\2\2\2n\u0279\3\2\2\2p\u027f\3\2\2\2r\u0281\3\2\2\2t\u0284\3\2\2\2v\u0292"+
		"\3\2\2\2x\u0297\3\2\2\2z\u02a8\3\2\2\2|\u02aa\3\2\2\2~\u02f3\3\2\2\2\u0080"+
		"\u0300\3\2\2\2\u0082\u0302\3\2\2\2\u0084\u0309\3\2\2\2\u0086\u0314\3\2"+
		"\2\2\u0088\u031d\3\2\2\2\u008a\u032e\3\2\2\2\u008c\u033c\3\2\2\2\u008e"+
		"\u0340\3\2\2\2\u0090\u0345\3\2\2\2\u0092\u034d\3\2\2\2\u0094\u0351\3\2"+
		"\2\2\u0096\u0359\3\2\2\2\u0098\u036c\3\2\2\2\u009a\u03ae\3\2\2\2\u009c"+
		"\u03b3\3\2\2\2\u009e\u03c6\3\2\2\2\u00a0\u03d7\3\2\2\2\u00a2\u03d9\3\2"+
		"\2\2\u00a4\u03df\3\2\2\2\u00a6\u03e3\3\2\2\2\u00a8\u03e9\3\2\2\2\u00aa"+
		"\u03ee\3\2\2\2\u00ac\u03f0\3\2\2\2\u00ae\u03f4\3\2\2\2\u00b0\u03fd\3\2"+
		"\2\2\u00b2\u040a\3\2\2\2\u00b4\u040c\3\2\2\2\u00b6\u041d\3\2\2\2\u00b8"+
		"\u041f\3\2\2\2\u00ba\u0422\3\2\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\2\2\3\u00c3\3\3\2\2\2"+
		"\u00c4\u00c6\5\b\5\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00ce\5\f\7\2\u00cb\u00ce\5\24\13\2\u00cc\u00ce\5d\63\2\u00cd\u00ca\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00d1\7%\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\5\3\2\2\2"+
		"\u00d2\u00d3\5\b\5\2\u00d3\7\3\2\2\2\u00d4\u00da\5Z.\2\u00d5\u00da\7\27"+
		"\2\2\u00d6\u00da\7\26\2\2\u00d7\u00da\7\32\2\2\u00d8\u00da\7\16\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\t\3\2\2\2\u00db\u00de\7\16\2\2\u00dc\u00de"+
		"\5Z.\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\13\3\2\2\2\u00df"+
		"\u00e0\7\b\2\2\u00e0\u00e2\7D\2\2\u00e1\u00e3\5\16\b\2\u00e2\u00e1\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\26\f\2\u00e5"+
		"\r\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\u00ec\5\20\t\2\u00e8\u00e9\7&\2\2"+
		"\u00e9\u00eb\5\20\t\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7*\2\2\u00f0\17\3\2\2\2\u00f1\u00f3\5Z.\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7D\2\2\u00f8\21\3\2\2\2\u00f9\u00fe"+
		"\5\u00b0Y\2\u00fa\u00fb\7;\2\2\u00fb\u00fd\5\u00b0Y\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\23\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\23\2\2\u0102\u0104\7D\2"+
		"\2\u0103\u0105\5\16\b\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\5\30\r\2\u0107\25\3\2\2\2\u0108\u010c\7!\2"+
		"\2\u0109\u010b\5\32\16\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7\"\2\2\u0110\27\3\2\2\2\u0111\u0115\7!\2\2\u0112\u0114"+
		"\5,\27\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\""+
		"\2\2\u0119\31\3\2\2\2\u011a\u0127\7%\2\2\u011b\u011d\7\32\2\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0127\5t;\2\u011f"+
		"\u0121\5\6\4\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0127\5\34\17\2\u0126\u011a\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0122\3"+
		"\2\2\2\u0127\33\3\2\2\2\u0128\u0131\5\36\20\2\u0129\u0131\5$\23\2\u012a"+
		"\u0131\5*\26\2\u012b\u0131\5(\25\2\u012c\u0131\5&\24\2\u012d\u0131\5\24"+
		"\13\2\u012e\u0131\5d\63\2\u012f\u0131\5\f\7\2\u0130\u0128\3\2\2\2\u0130"+
		"\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\35\3\2\2\2\u0132\u0133\5\"\22\2\u0133\u0134\7D\2\2\u0134\u0139\5J&\2"+
		"\u0135\u0136\7#\2\2\u0136\u0138\7$\2\2\u0137\u0135\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\5 \21\2\u013d\37\3\2\2\2\u013e\u0141\5t;\2"+
		"\u013f\u0141\7%\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141!\3\2"+
		"\2\2\u0142\u0145\5\u00b0Y\2\u0143\u0145\7\35\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145#\3\2\2\2\u0146\u0147\5\16\b\2\u0147\u0148\5\36\20"+
		"\2\u0148%\3\2\2\2\u0149\u014a\5\16\b\2\u014a\u014b\5(\25\2\u014b\'\3\2"+
		"\2\2\u014c\u014d\7D\2\2\u014d\u014e\5J&\2\u014e\u014f\5t;\2\u014f)\3\2"+
		"\2\2\u0150\u0151\5\u00b0Y\2\u0151\u0152\5:\36\2\u0152\u0153\7%\2\2\u0153"+
		"+\3\2\2\2\u0154\u0156\5\6\4\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015d\5.\30\2\u015b\u015d\7%\2\2\u015c\u0157\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d-\3\2\2\2\u015e\u0165\5\60\31\2\u015f\u0165\5\64\33"+
		"\2\u0160\u0165\58\35\2\u0161\u0165\5\24\13\2\u0162\u0165\5d\63\2\u0163"+
		"\u0165\5\f\7\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2"+
		"\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"/\3\2\2\2\u0166\u0167\5\u00b0Y\2\u0167\u016c\5\62\32\2\u0168\u0169\7&"+
		"\2\2\u0169\u016b\5\62\32\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0170\7%\2\2\u0170\61\3\2\2\2\u0171\u0176\7D\2\2\u0172\u0173"+
		"\7#\2\2\u0173\u0175\7$\2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017a\7)\2\2\u017a\u017b\5@!\2\u017b\63\3\2\2\2\u017c\u017e"+
		"\5\66\34\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u018c\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u018d"+
		"\5\"\22\2\u0183\u0187\5\16\b\2\u0184\u0186\5Z.\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018b\5\"\22\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0182\3\2\2\2\u018c\u0183\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7D"+
		"\2\2\u018f\u0194\5J&\2\u0190\u0191\7#\2\2\u0191\u0193\7$\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5 \21\2\u0198\65\3\2\2"+
		"\2\u0199\u019e\5Z.\2\u019a\u019e\7\27\2\2\u019b\u019e\7\n\2\2\u019c\u019e"+
		"\7\32\2\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2"+
		"\u019d\u019c\3\2\2\2\u019e\67\3\2\2\2\u019f\u01a0\5\16\b\2\u01a0\u01a1"+
		"\5\64\33\2\u01a19\3\2\2\2\u01a2\u01a7\5<\37\2\u01a3\u01a4\7&\2\2\u01a4"+
		"\u01a6\5<\37\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8;\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad"+
		"\5> \2\u01ab\u01ac\7)\2\2\u01ac\u01ae\5@!\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae=\3\2\2\2\u01af\u01b4\7D\2\2\u01b0\u01b1\7#\2\2\u01b1"+
		"\u01b3\7$\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5?\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba"+
		"\5B\"\2\u01b8\u01ba\5\u0098M\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2"+
		"\u01baA\3\2\2\2\u01bb\u01c7\7!\2\2\u01bc\u01c1\5@!\2\u01bd\u01be\7&\2"+
		"\2\u01be\u01c0\5@!\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c6\7&\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01bc\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\7\"\2\2\u01caC\3\2\2\2\u01cb\u01cd\7D\2\2\u01cc\u01ce\5\u00b4["+
		"\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d6\3\2\2\2\u01cf\u01d0"+
		"\7\'\2\2\u01d0\u01d2\7D\2\2\u01d1\u01d3\5\u00b4[\2\u01d2\u01d1\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7E\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d9\u01dc\5\u00b0Y\2\u01da\u01dc\7>\2\2\u01db\u01d9\3"+
		"\2\2\2\u01db\u01da\3\2\2\2\u01dcG\3\2\2\2\u01dd\u01e2\5R*\2\u01de\u01df"+
		"\7&\2\2\u01df\u01e1\5R*\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3I\3\2\2\2\u01e4\u01e2\3\2\2\2"+
		"\u01e5\u01e7\7\37\2\2\u01e6\u01e8\5L\'\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7 \2\2\u01eaK\3\2\2\2\u01eb\u01f0"+
		"\5N(\2\u01ec\u01ed\7&\2\2\u01ed\u01ef\5N(\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f5\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7&\2\2\u01f4\u01f6\5P)\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\5P)\2\u01f8"+
		"\u01eb\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9M\3\2\2\2\u01fa\u01fc\5\n\6\2"+
		"\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\5\u00b0Y"+
		"\2\u0201\u0202\5> \2\u0202O\3\2\2\2\u0203\u0205\5\n\6\2\u0204\u0203\3"+
		"\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\5\u00b0Y\2\u020a\u020b"+
		"\7<\2\2\u020b\u020c\5> \2\u020cQ\3\2\2\2\u020d\u0212\7D\2\2\u020e\u020f"+
		"\7\'\2\2\u020f\u0211\7D\2\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213S\3\2\2\2\u0214\u0212\3\2\2\2"+
		"\u0215\u021b\5V,\2\u0216\u021b\5X-\2\u0217\u021b\7L\2\2\u0218\u021b\7"+
		"M\2\2\u0219\u021b\7K\2\2\u021a\u0215\3\2\2\2\u021a\u0216\3\2\2\2\u021a"+
		"\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021bU\3\2\2\2"+
		"\u021c\u021d\t\2\2\2\u021dW\3\2\2\2\u021e\u021f\t\3\2\2\u021fY\3\2\2\2"+
		"\u0220\u0221\7=\2\2\u0221\u0228\5R*\2\u0222\u0225\7\37\2\2\u0223\u0226"+
		"\5\\/\2\u0224\u0226\5`\61\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\7 \2\2\u0228\u0222\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229[\3\2\2\2\u022a\u022f\5^\60\2\u022b\u022c"+
		"\7&\2\2\u022c\u022e\5^\60\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230]\3\2\2\2\u0231\u022f\3\2\2\2"+
		"\u0232\u0233\7D\2\2\u0233\u0234\7)\2\2\u0234\u0235\5`\61\2\u0235_\3\2"+
		"\2\2\u0236\u023a\5\u0098M\2\u0237\u023a\5Z.\2\u0238\u023a\5b\62\2\u0239"+
		"\u0236\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023aa\3\2\2\2"+
		"\u023b\u0244\7!\2\2\u023c\u0241\5`\61\2\u023d\u023e\7&\2\2\u023e\u0240"+
		"\5`\61\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u023c\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\7&\2\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\""+
		"\2\2\u024ac\3\2\2\2\u024b\u024c\7=\2\2\u024c\u024d\7\23\2\2\u024d\u024e"+
		"\7D\2\2\u024e\u024f\5f\64\2\u024fe\3\2\2\2\u0250\u0254\7!\2\2\u0251\u0253"+
		"\5h\65\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\""+
		"\2\2\u0258g\3\2\2\2\u0259\u025b\5\6\4\2\u025a\u0259\3\2\2\2\u025b\u025e"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025f\u0262\5j\66\2\u0260\u0262\7%\2\2\u0261\u025c\3\2"+
		"\2\2\u0261\u0260\3\2\2\2\u0262i\3\2\2\2\u0263\u0264\5\u00b0Y\2\u0264\u0265"+
		"\5l\67\2\u0265\u0266\7%\2\2\u0266\u0274\3\2\2\2\u0267\u0269\5\f\7\2\u0268"+
		"\u026a\7%\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0274\3\2"+
		"\2\2\u026b\u026d\5\24\13\2\u026c\u026e\7%\2\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u0274\3\2\2\2\u026f\u0271\5d\63\2\u0270\u0272\7%"+
		"\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0263\3\2\2\2\u0273\u0267\3\2\2\2\u0273\u026b\3\2\2\2\u0273\u026f\3\2"+
		"\2\2\u0274k\3\2\2\2\u0275\u0278\5n8\2\u0276\u0278\5p9\2\u0277\u0275\3"+
		"\2\2\2\u0277\u0276\3\2\2\2\u0278m\3\2\2\2\u0279\u027a\7D\2\2\u027a\u027b"+
		"\7\37\2\2\u027b\u027d\7 \2\2\u027c\u027e\5r:\2\u027d\u027c\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027eo\3\2\2\2\u027f\u0280\5:\36\2\u0280q\3\2\2\2\u0281"+
		"\u0282\7\n\2\2\u0282\u0283\5`\61\2\u0283s\3\2\2\2\u0284\u0288\7!\2\2\u0285"+
		"\u0287\5v<\2\u0286\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2"+
		"\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c"+
		"\7\"\2\2\u028cu\3\2\2\2\u028d\u028e\5x=\2\u028e\u028f\7%\2\2\u028f\u0293"+
		"\3\2\2\2\u0290\u0293\5~@\2\u0291\u0293\5z>\2\u0292\u028d\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0291\3\2\2\2\u0293w\3\2\2\2\u0294\u0296\5\n\6\2"+
		"\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\5\u00b0Y"+
		"\2\u029b\u029c\5:\36\2\u029cy\3\2\2\2\u029d\u029f\5\b\5\2\u029e\u029d"+
		"\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a5\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\5\f\7\2\u02a4\u02a6\5\24"+
		"\13\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7"+
		"\u02a9\7%\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9{\3\2\2\2\u02aa"+
		"\u02ab\5\u00b0Y\2\u02ab\u02ac\7D\2\2\u02ac\u02ad\7%\2\2\u02ad}\3\2\2\2"+
		"\u02ae\u02f4\5t;\2\u02af\u02b0\7\3\2\2\u02b0\u02b3\5\u0098M\2\u02b1\u02b2"+
		"\7-\2\2\u02b2\u02b4\5\u0098M\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2"+
		"\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7%\2\2\u02b6\u02f4\3\2\2\2\u02b7\u02b8"+
		"\7\21\2\2\u02b8\u02b9\5\u0092J\2\u02b9\u02bc\5~@\2\u02ba\u02bb\7\r\2\2"+
		"\u02bb\u02bd\5~@\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02f4"+
		"\3\2\2\2\u02be\u02bf\7\20\2\2\u02bf\u02c0\7\37\2\2\u02c0\u02c1\5\u008c"+
		"G\2\u02c1\u02c2\7 \2\2\u02c2\u02c3\5~@\2\u02c3\u02f4\3\2\2\2\u02c4\u02c5"+
		"\7\36\2\2\u02c5\u02c6\5\u0092J\2\u02c6\u02c7\5~@\2\u02c7\u02f4\3\2\2\2"+
		"\u02c8\u02c9\7\13\2\2\u02c9\u02ca\5~@\2\u02ca\u02cb\7\36\2\2\u02cb\u02cc"+
		"\5\u0092J\2\u02cc\u02cd\7%\2\2\u02cd\u02f4\3\2\2\2\u02ce\u02cf\7\34\2"+
		"\2\u02cf\u02d0\5\u0092J\2\u02d0\u02d4\7!\2\2\u02d1\u02d3\5\u0088E\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02da\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\5\u008aF\2\u02d8"+
		"\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\7\"\2\2\u02de"+
		"\u02f4\3\2\2\2\u02df\u02e1\7\30\2\2\u02e0\u02e2\5\u0098M\2\u02e1\u02e0"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02f4\7%\2\2\u02e4"+
		"\u02e6\7\5\2\2\u02e5\u02e7\7D\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02f4\7%\2\2\u02e9\u02f4\7%\2\2\u02ea\u02eb"+
		"\5\u0080A\2\u02eb\u02ec\7%\2\2\u02ec\u02f4\3\2\2\2\u02ed\u02ee\5\u0098"+
		"M\2\u02ee\u02ef\7%\2\2\u02ef\u02f4\3\2\2\2\u02f0\u02f1\7D\2\2\u02f1\u02f2"+
		"\7-\2\2\u02f2\u02f4\5~@\2\u02f3\u02ae\3\2\2\2\u02f3\u02af\3\2\2\2\u02f3"+
		"\u02b7\3\2\2\2\u02f3\u02be\3\2\2\2\u02f3\u02c4\3\2\2\2\u02f3\u02c8\3\2"+
		"\2\2\u02f3\u02ce\3\2\2\2\u02f3\u02df\3\2\2\2\u02f3\u02e4\3\2\2\2\u02f3"+
		"\u02e9\3\2\2\2\u02f3\u02ea\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f3\u02f0\3\2"+
		"\2\2\u02f4\177\3\2\2\2\u02f5\u0301\3\2\2\2\u02f6\u02f7\7\25\2\2\u02f7"+
		"\u02f8\7\37\2\2\u02f8\u02f9\5T+\2\u02f9\u02fa\7 \2\2\u02fa\u0301\3\2\2"+
		"\2\u02fb\u02fc\7\25\2\2\u02fc\u02fd\7\37\2\2\u02fd\u02fe\5R*\2\u02fe\u02ff"+
		"\7 \2\2\u02ff\u0301\3\2\2\2\u0300\u02f5\3\2\2\2\u0300\u02f6\3\2\2\2\u0300"+
		"\u02fb\3\2\2\2\u0301\u0081\3\2\2\2\u0302\u0303\7\37\2\2\u0303\u0305\5"+
		"\u0084C\2\u0304\u0306\7%\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0308\7 \2\2\u0308\u0083\3\2\2\2\u0309\u030e\5\u0086"+
		"D\2\u030a\u030b\7%\2\2\u030b\u030d\5\u0086D\2\u030c\u030a\3\2\2\2\u030d"+
		"\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0085\3\2"+
		"\2\2\u0310\u030e\3\2\2\2\u0311\u0313\5\n\6\2\u0312\u0311\3\2\2\2\u0313"+
		"\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2"+
		"\2\2\u0316\u0314\3\2\2\2\u0317\u0318\5D#\2\u0318\u0319\5> \2\u0319\u031a"+
		"\7)\2\2\u031a\u031b\5\u0098M\2\u031b\u0087\3\2\2\2\u031c\u031e\5\u008a"+
		"F\2\u031d\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u0323\5v<\2\u0322\u0321\3\2\2"+
		"\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0089"+
		"\3\2\2\2\u0326\u0329\7\6\2\2\u0327\u032a\5\u0098M\2\u0328\u032a\7D\2\2"+
		"\u0329\u0327\3\2\2\2\u0329\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032f"+
		"\7-\2\2\u032c\u032d\7\n\2\2\u032d\u032f\7-\2\2\u032e\u0326\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032f\u008b\3\2\2\2\u0330\u033d\5\u0090I\2\u0331\u0333"+
		"\5\u008eH\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2"+
		"\2\u0334\u0336\7%\2\2\u0335\u0337\5\u0098M\2\u0336\u0335\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\7%\2\2\u0339\u033b\5\u0094"+
		"K\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c"+
		"\u0330\3\2\2\2\u033c\u0332\3\2\2\2\u033d\u008d\3\2\2\2\u033e\u0341\5x"+
		"=\2\u033f\u0341\5\u0094K\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"\u008f\3\2\2\2\u0342\u0344\5\n\6\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2"+
		"\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0348\u0349\5\u00b0Y\2\u0349\u034a\5> \2\u034a\u034b\7"+
		"-\2\2\u034b\u034c\5\u0098M\2\u034c\u0091\3\2\2\2\u034d\u034e\7\37\2\2"+
		"\u034e\u034f\5\u0098M\2\u034f\u0350\7 \2\2\u0350\u0093\3\2\2\2\u0351\u0356"+
		"\5\u0098M\2\u0352\u0353\7&\2\2\u0353\u0355\5\u0098M\2\u0354\u0352\3\2"+
		"\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0095\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035a\7D\2\2\u035a\u035c\7\37"+
		"\2\2\u035b\u035d\5\u0094K\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\7 \2\2\u035f\u0097\3\2\2\2\u0360\u0361\bM\1"+
		"\2\u0361\u036d\5\u009aN\2\u0362\u036d\5\u0096L\2\u0363\u0364\7\24\2\2"+
		"\u0364\u036d\5\u009eP\2\u0365\u0366\7\37\2\2\u0366\u0367\5\u00b0Y\2\u0367"+
		"\u0368\7 \2\2\u0368\u0369\5\u0098M\r\u0369\u036d\3\2\2\2\u036a\u036b\t"+
		"\4\2\2\u036b\u036d\5\u0098M\13\u036c\u0360\3\2\2\2\u036c\u0362\3\2\2\2"+
		"\u036c\u0363\3\2\2\2\u036c\u0365\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u039e"+
		"\3\2\2\2\u036e\u036f\f\n\2\2\u036f\u0370\t\5\2\2\u0370\u039d\5\u0098M"+
		"\13\u0371\u0372\f\t\2\2\u0372\u0373\t\6\2\2\u0373\u039d\5\u0098M\n\u0374"+
		"\u037c\f\b\2\2\u0375\u0376\7+\2\2\u0376\u037d\7+\2\2\u0377\u0378\7*\2"+
		"\2\u0378\u0379\7*\2\2\u0379\u037d\7*\2\2\u037a\u037b\7*\2\2\u037b\u037d"+
		"\7*\2\2\u037c\u0375\3\2\2\2\u037c\u0377\3\2\2\2\u037c\u037a\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037e\u039d\5\u0098M\t\u037f\u0380\f\7\2\2\u0380\u0381"+
		"\t\7\2\2\u0381\u039d\5\u0098M\b\u0382\u0383\f\6\2\2\u0383\u0384\t\b\2"+
		"\2\u0384\u039d\5\u0098M\7\u0385\u0386\f\5\2\2\u0386\u0387\7\62\2\2\u0387"+
		"\u039d\5\u0098M\6\u0388\u0389\f\4\2\2\u0389\u038a\7\63\2\2\u038a\u039d"+
		"\5\u0098M\5\u038b\u038c\f\3\2\2\u038c\u038d\t\t\2\2\u038d\u039d\5\u0098"+
		"M\3\u038e\u038f\f\21\2\2\u038f\u0393\7\'\2\2\u0390\u0394\7D\2\2\u0391"+
		"\u0394\5\u0096L\2\u0392\u0394\5\u00a6T\2\u0393\u0390\3\2\2\2\u0393\u0391"+
		"\3\2\2\2\u0393\u0392\3\2\2\2\u0394\u039d\3\2\2\2\u0395\u0396\f\20\2\2"+
		"\u0396\u0397\7#\2\2\u0397\u0398\5\u0098M\2\u0398\u0399\7$\2\2\u0399\u039d"+
		"\3\2\2\2\u039a\u039b\f\f\2\2\u039b\u039d\t\n\2\2\u039c\u036e\3\2\2\2\u039c"+
		"\u0371\3\2\2\2\u039c\u0374\3\2\2\2\u039c\u037f\3\2\2\2\u039c\u0382\3\2"+
		"\2\2\u039c\u0385\3\2\2\2\u039c\u0388\3\2\2\2\u039c\u038b\3\2\2\2\u039c"+
		"\u038e\3\2\2\2\u039c\u0395\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u03a0\3\2"+
		"\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u0099\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a1\u03a2\7\37\2\2\u03a2\u03a3\5\u0098M\2\u03a3\u03a4"+
		"\7 \2\2\u03a4\u03af\3\2\2\2\u03a5\u03af\5T+\2\u03a6\u03af\7D\2\2\u03a7"+
		"\u03a8\5\"\22\2\u03a8\u03a9\7\'\2\2\u03a9\u03aa\7\b\2\2\u03aa\u03af\3"+
		"\2\2\2\u03ab\u03ac\5\u00acW\2\u03ac\u03ad\5\u00b8]\2\u03ad\u03af\3\2\2"+
		"\2\u03ae\u03a1\3\2\2\2\u03ae\u03a5\3\2\2\2\u03ae\u03a6\3\2\2\2\u03ae\u03a7"+
		"\3\2\2\2\u03ae\u03ab\3\2\2\2\u03af\u009b\3\2\2\2\u03b0\u03b1\5D#\2\u03b1"+
		"\u03b2\7\'\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b0\3\2\2\2\u03b3\u03b4\3\2"+
		"\2\2\u03b4\u03b8\3\2\2\2\u03b5\u03b7\5Z.\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba"+
		"\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03bb\u03bd\7D\2\2\u03bc\u03be\5\u00b4[\2\u03bd\u03bc\3"+
		"\2\2\2\u03bd\u03be\3\2\2\2\u03be\u009d\3\2\2\2\u03bf\u03c0\5\u00acW\2"+
		"\u03c0\u03c1\5\u00a0Q\2\u03c1\u03c2\5\u00a4S\2\u03c2\u03c7\3\2\2\2\u03c3"+
		"\u03c4\5\u00a0Q\2\u03c4\u03c5\5\u00a4S\2\u03c5\u03c7\3\2\2\2\u03c6\u03bf"+
		"\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c7\u009f\3\2\2\2\u03c8\u03ca\7D\2\2\u03c9"+
		"\u03cb\5\u00a8U\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03d3"+
		"\3\2\2\2\u03cc\u03cd\7\'\2\2\u03cd\u03cf\7D\2\2\u03ce\u03d0\5\u00a8U\2"+
		"\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cc"+
		"\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d8\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d8\5\u00b2Z\2\u03d7\u03c8"+
		"\3\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\u00a1\3\2\2\2\u03d9\u03db\7D\2\2\u03da"+
		"\u03dc\5\u00aaV\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd\u03de\5\u00a4S\2\u03de\u00a3\3\2\2\2\u03df\u03e1\5\u00ba"+
		"^\2\u03e0\u03e2\5\26\f\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u00a5\3\2\2\2\u03e3\u03e4\5\u00acW\2\u03e4\u03e5\5\u00b8]\2\u03e5\u00a7"+
		"\3\2\2\2\u03e6\u03e7\7+\2\2\u03e7\u03ea\7*\2\2\u03e8\u03ea\5\u00b4[\2"+
		"\u03e9\u03e6\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea\u00a9\3\2\2\2\u03eb\u03ec"+
		"\7+\2\2\u03ec\u03ef\7*\2\2\u03ed\u03ef\5\u00acW\2\u03ee\u03eb\3\2\2\2"+
		"\u03ee\u03ed\3\2\2\2\u03ef\u00ab\3\2\2\2\u03f0\u03f1\7+\2\2\u03f1\u03f2"+
		"\5\u00aeX\2\u03f2\u03f3\7*\2\2\u03f3\u00ad\3\2\2\2\u03f4\u03f9\5\u00b0"+
		"Y\2\u03f5\u03f6\7&\2\2\u03f6\u03f8\5\u00b0Y\2\u03f7\u03f5\3\2\2\2\u03f8"+
		"\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u00af\3\2"+
		"\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fe\5Z.\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u0402\5D#\2\u0400\u0402\5\u00b2Z\2"+
		"\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402\u0407\3\2\2\2\u0403\u0404"+
		"\7#\2\2\u0404\u0406\7$\2\2\u0405\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00b1\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u040a\u040b\t\13\2\2\u040b\u00b3\3\2\2\2\u040c\u040d\7+\2\2\u040d"+
		"\u0412\5F$\2\u040e\u040f\7&\2\2\u040f\u0411\5F$\2\u0410\u040e\3\2\2\2"+
		"\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415"+
		"\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0416\7*\2\2\u0416\u00b5\3\2\2\2\u0417"+
		"\u041e\5\u00ba^\2\u0418\u0419\7\'\2\2\u0419\u041b\7D\2\2\u041a\u041c\5"+
		"\u00ba^\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2"+
		"\u041d\u0417\3\2\2\2\u041d\u0418\3\2\2\2\u041e\u00b7\3\2\2\2\u041f\u0420"+
		"\7D\2\2\u0420\u0421\5\u00ba^\2\u0421\u00b9\3\2\2\2\u0422\u0424\7\37\2"+
		"\2\u0423\u0425\5\u0094K\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0427\7 \2\2\u0427\u00bb\3\2\2\2{\u00bf\u00c7\u00cd"+
		"\u00d0\u00d9\u00dd\u00e2\u00ec\u00f4\u00fe\u0104\u010c\u0115\u011c\u0122"+
		"\u0126\u0130\u0139\u0140\u0144\u0157\u015c\u0164\u016c\u0176\u017f\u0187"+
		"\u018c\u0194\u019d\u01a7\u01ad\u01b4\u01b9\u01c1\u01c5\u01c7\u01cd\u01d2"+
		"\u01d6\u01db\u01e2\u01e7\u01f0\u01f5\u01f8\u01fd\u0206\u0212\u021a\u0225"+
		"\u0228\u022f\u0239\u0241\u0244\u0247\u0254\u025c\u0261\u0269\u026d\u0271"+
		"\u0273\u0277\u027d\u0288\u0292\u0297\u02a0\u02a5\u02a8\u02b3\u02bc\u02d4"+
		"\u02da\u02e1\u02e6\u02f3\u0300\u0305\u030e\u0314\u031f\u0324\u0329\u032e"+
		"\u0332\u0336\u033a\u033c\u0340\u0345\u0356\u035c\u036c\u037c\u0393\u039c"+
		"\u039e\u03ae\u03b3\u03b8\u03bd\u03c6\u03ca\u03cf\u03d3\u03d7\u03db\u03e1"+
		"\u03e9\u03ee\u03f9\u03fd\u0401\u0407\u0412\u041b\u041d\u0424";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}