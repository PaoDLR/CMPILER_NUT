// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LexerParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LexerParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(LexerParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(LexerParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#kw}.
	 * @param ctx the parse tree
	 */
	void enterKw(LexerParser.KwContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#kw}.
	 * @param ctx the parse tree
	 */
	void exitKw(LexerParser.KwContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#dt}.
	 * @param ctx the parse tree
	 */
	void enterDt(LexerParser.DtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#dt}.
	 * @param ctx the parse tree
	 */
	void exitDt(LexerParser.DtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(LexerParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(LexerParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LexerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LexerParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LexerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LexerParser.IdContext ctx);
}