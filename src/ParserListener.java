// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#startCode}.
	 * @param ctx the parse tree
	 */
	void enterStartCode(Parser.StartCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#startCode}.
	 * @param ctx the parse tree
	 */
	void exitStartCode(Parser.StartCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(Parser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(Parser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(Parser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(Parser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(Parser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(Parser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Parser.PrimaryContext ctx);
}