// Generated from C:/Users/GeneralTank/Documents/4th Year 1st Term/CMPILER/CMPILER_NUT\NutParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NutParser}.
 */
public interface NutParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NutParser#startCode}.
	 * @param ctx the parse tree
	 */
	void enterStartCode(NutParser.StartCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#startCode}.
	 * @param ctx the parse tree
	 */
	void exitStartCode(NutParser.StartCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(NutParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(NutParser.TypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(NutParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(NutParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(NutParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(NutParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(NutParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(NutParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(NutParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(NutParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(NutParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(NutParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NutParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NutParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(NutParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(NutParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(NutParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(NutParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NutParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NutParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(NutParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(NutParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NutParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NutParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(NutParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(NutParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(NutParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(NutParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(NutParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(NutParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(NutParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(NutParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(NutParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(NutParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(NutParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(NutParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(NutParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(NutParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(NutParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(NutParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(NutParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(NutParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NutParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NutParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(NutParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(NutParser.PrimaryContext ctx);
}