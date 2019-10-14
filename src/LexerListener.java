// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(LexerParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(LexerParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(LexerParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(LexerParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#separators}.
	 * @param ctx the parse tree
	 */
	void enterSeparators(LexerParser.SeparatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#separators}.
	 * @param ctx the parse tree
	 */
	void exitSeparators(LexerParser.SeparatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(LexerParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(LexerParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LexerParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LexerParser.IdentifierContext ctx);
}