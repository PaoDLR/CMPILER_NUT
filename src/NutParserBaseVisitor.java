// Generated from D:/School/CMPILER/MP/CMPILER_NUT\NutParser.g4 by ANTLR 4.7.2
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * This class provides an empty implementation of {@link NutParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class NutParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements NutParserVisitor<T> {

	private NutInterpreter nutInterpreter;
	private HashMap<String, String> stringVariable = new HashMap<String, String>();
	private HashMap<String, Character> charVariable = new HashMap<String, Character>();
	private HashMap<String, Integer> intVariable = new HashMap<String, Integer>();
	private HashMap<String, Float> floatVariable = new HashMap<String, Float>();
	private HashMap<String, Double> doubleVariable = new HashMap<String, Double>();
	private HashMap<String, Boolean> booleanVariable = new HashMap<String, Boolean>();

	public NutParserBaseVisitor(NutInterpreter nutInterpreter){

		this.nutInterpreter = nutInterpreter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCompilationUnit(NutParser.CompilationUnitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeDeclaration(NutParser.TypeDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitModifier(NutParser.ModifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassOrInterfaceModifier(NutParser.ClassOrInterfaceModifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableModifier(NutParser.VariableModifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassDeclaration(NutParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeParameters(NutParser.TypeParametersContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeParameter(NutParser.TypeParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeBound(NutParser.TypeBoundContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceDeclaration(NutParser.InterfaceDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassBody(NutParser.ClassBodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceBody(NutParser.InterfaceBodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassBodyDeclaration(NutParser.ClassBodyDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMemberDeclaration(NutParser.MemberDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodDeclaration(NutParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodBody(NutParser.MethodBodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeTypeOrVoid(NutParser.TypeTypeOrVoidContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGenericMethodDeclaration(NutParser.GenericMethodDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGenericConstructorDeclaration(NutParser.GenericConstructorDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstructorDeclaration(NutParser.ConstructorDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFieldDeclaration(NutParser.FieldDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceBodyDeclaration(NutParser.InterfaceBodyDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceMemberDeclaration(NutParser.InterfaceMemberDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstDeclaration(NutParser.ConstDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstantDeclarator(NutParser.ConstantDeclaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceMethodDeclaration(NutParser.InterfaceMethodDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInterfaceMethodModifier(NutParser.InterfaceMethodModifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGenericInterfaceMethodDeclaration(NutParser.GenericInterfaceMethodDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDeclarators(NutParser.VariableDeclaratorsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDeclarator(NutParser.VariableDeclaratorContext ctx) {
//		String varName = (String) visit(ctx.variableDeclaratorId());
//		String varValue = (String) visit(ctx.getChild(2));
//		stringVariable.put(varName, varValue.replaceAll("\"", ""));

//		System.out.println("potato" + varName + varValue.replaceAll("\"", ""));
		return (T) ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableDeclaratorId(NutParser.VariableDeclaratorIdContext ctx) { return (T) ctx.getChild(0).getText(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariableInitializer(NutParser.VariableInitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayInitializer(NutParser.ArrayInitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassOrInterfaceType(NutParser.ClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeArgument(NutParser.TypeArgumentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitQualifiedNameList(NutParser.QualifiedNameListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormalParameters(NutParser.FormalParametersContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormalParameterList(NutParser.FormalParameterListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormalParameter(NutParser.FormalParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLastFormalParameter(NutParser.LastFormalParameterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitQualifiedName(NutParser.QualifiedNameContext ctx) {
		return (T) ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral(NutParser.LiteralContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIntegerLiteral(NutParser.IntegerLiteralContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloatLiteral(NutParser.FloatLiteralContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotation(NutParser.AnnotationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValuePairs(NutParser.ElementValuePairsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValuePair(NutParser.ElementValuePairContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValue(NutParser.ElementValueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElementValueArrayInitializer(NutParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationTypeDeclaration(NutParser.AnnotationTypeDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationTypeBody(NutParser.AnnotationTypeBodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationTypeElementDeclaration(NutParser.AnnotationTypeElementDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationTypeElementRest(NutParser.AnnotationTypeElementRestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationMethodOrConstantRest(NutParser.AnnotationMethodOrConstantRestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationMethodRest(NutParser.AnnotationMethodRestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnnotationConstantRest(NutParser.AnnotationConstantRestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefaultValue(NutParser.DefaultValueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlock(NutParser.BlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlockStatement(NutParser.BlockStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLocalVariableDeclaration(NutParser.LocalVariableDeclarationContext ctx) {
		if( ctx.getChild(0).getChild(0).getText().equals("string")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());
			String varValue = (String) ctx.variableDeclarators().variableDeclarator(0).getChild(2).getText();

			stringVariable.put(varName, varValue.replaceAll("\"", ""));

		}else if(ctx.getChild(0).getChild(0).getText().equals("digimon")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());

			String expr = ctx.variableDeclarators().variableDeclarator(0).variableInitializer().expression().getText();
			System.out.println("Expression " + expr);

			String temp = expr;
			temp = temp.replaceAll("[-+/*><^!]", ",");
			String[] split = temp.split(",");

			for(int i = 0; i < split.length; i++){
				if(expr.contains(split[i]) && intVariable.containsKey(split[i])){
					expr = expr.replace(split[i].charAt(0), Integer.toString(intVariable.get(split[i])).charAt(0));
				}
			}

			Expression expression = new Expression(expr);
			int varValue = expression.eval().intValue();

			intVariable.put(varName, varValue);

		}else if(ctx.getChild(0).getChild(0).getText().equals("maybe")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());
			System.out.println((String) visit(ctx.variableDeclarators().variableDeclarator(0).getChild(0)));
			boolean varValue = Boolean.parseBoolean((String) visit(ctx.variableDeclarators().variableDeclarator(0).getChild(0)));

			booleanVariable.put(varName, varValue);

		}else if(ctx.getChild(0).getChild(0).getText().equals("charot")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());
			String toCharz = (String) visit(ctx.variableDeclarators().variableDeclarator(0).getChild(0));
			System.out.println(toCharz);
			char varValue = toCharz.charAt(0);

			charVariable.put(varName, varValue);

		}else if(ctx.getChild(0).getChild(0).getText().equals("drown")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());

			String expr = ctx.variableDeclarators().variableDeclarator(0).variableInitializer().expression().getText();
			System.out.println("Expression " + expr);

			Expression e = new Expression(expr);

			String temp = expr;
			temp = temp.replaceAll("[-+/*><^!]", ",");
			String[] split = temp.split(",");

			for(int i = 0; i < split.length; i++){
				if(expr.contains(split[i]) && floatVariable.containsKey(split[i])){
					expr = expr.replace(split[i].charAt(0), Float.toString(floatVariable.get(split[i])).charAt(0));
				}
			}

			System.out.println(e.eval());
			float varValue = e.eval().floatValue();

			floatVariable.put(varName, varValue);

		}else if(ctx.getChild(0).getChild(0).getText().equals("twice")){
			String varName = (String) visit(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId());

			String expr = ctx.variableDeclarators().variableDeclarator(0).variableInitializer().expression().getText();
			System.out.println("Expression " + expr);

			String temp = expr;
			temp = temp.replaceAll("[-+/*><^!]", ",");
			String[] split = temp.split(",");

			for(int i = 0; i < split.length; i++){
				if(expr.contains(split[i]) && doubleVariable.containsKey(split[i])){
					expr = expr.replace(split[i].charAt(0), Double.toString(doubleVariable.get(split[i])).charAt(0));
				}
			}

			Expression e = new Expression(expr);
			double varValue = e.eval().doubleValue();

			doubleVariable.put(varName, varValue);

		}


		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLocalTypeDeclaration(NutParser.LocalTypeDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaration(NutParser.DeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatement(NutParser.StatementContext ctx) {
		System.out.println(ctx.children.contains(ctx.expression(0)));
		if(ctx.getChild(0).getText().contains("can")){
			String splitz = ctx.getChild(1).getText().replaceAll("\\(", "");
			splitz = splitz.replaceAll("\\)", "");
			String temp = splitz;
			temp = splitz.replaceAll("[-+/*><^!=]", ",");
			String[] splice = temp.split(",");

			for(int i = 0; i < splice.length; i++){
				if(splitz.contains(splice[i]) && intVariable.containsKey(splice[i])){
					splitz = splitz.replace(splice[i].charAt(0), Integer.toString(intVariable.get(splice[i])).charAt(0));
				}else if(splitz.contains(splice[i]) && floatVariable.containsKey(splice[i])){
					splitz = splitz.replace(splice[i].charAt(0), Float.toString(floatVariable.get(splice[i])).charAt(0));
				}else if(splitz.contains(splice[i]) && doubleVariable.containsKey(splice[i])){
					splitz = splitz.replace(splice[i].charAt(0), Double.toString(doubleVariable.get(splice[i])).charAt(0));
				}
			}
			System.out.println(splitz);
			Expression expression = new Expression(splitz);
			//checks if, if if is not true, proceed to else.
			if(expression.eval() == BigDecimal.valueOf(1)){
				return this.visit(ctx.statement(0));
			}else{
				if(ctx.ELSE() != null){
					return this.visit(ctx.statement(1));
				}
			}
		}

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrintStatement(NutParser.PrintStatementContext ctx) {
		if(ctx.getChild(0).getText().equals("printing") && ctx.getChild(2) instanceof NutParser.LiteralContext){
			String s = ctx.literal().getChild(0).getText();
			nutInterpreter.setOutputStream(s.replaceAll("\"", ""));
		}else if(ctx.getChild(0).getText().equals("printing") && ctx.getChild(2) instanceof NutParser.QualifiedNameContext){
			String s = ctx.qualifiedName().getText();

			if(stringVariable.containsKey(s)){
				String varName = stringVariable.get(s);
				nutInterpreter.setOutputStream(varName);
			}else if(charVariable.containsKey(s)){
				char varName = charVariable.get(s);
				nutInterpreter.setOutputStream(Character.toString(varName));
			}else if(intVariable.containsKey(s)){
				int varName = intVariable.get(s);
				nutInterpreter.setOutputStream(Integer.toString(varName));
			}else if(floatVariable.containsKey(s)){
				float varName = floatVariable.get(s);
				nutInterpreter.setOutputStream(Float.toString(varName));
			}else if(doubleVariable.containsKey(s)){
				double varName = doubleVariable.get(s);
				nutInterpreter.setOutputStream(Double.toString(varName));
			}else if(booleanVariable.containsKey(s)){
				boolean varName = booleanVariable.get(s);
				nutInterpreter.setOutputStream(Boolean.toString(varName));
			}


		}else if(ctx.getChild(0).getText().equals("printing") && ctx.getChild(2) instanceof NutParser.ExpressionContext){
			String expr = ctx.expression().getText();
			System.out.println("Expression " + expr);
			Expression e = new Expression(expr);
			System.out.println(e.eval());
			nutInterpreter.setOutputStream(Double.toString(e.eval().doubleValue()));
		}
		return visitChildren(ctx);
	}

	@Override
	public T visitScanStatement(NutParser.ScanStatementContext ctx) {
		String splice = ctx.getText().replaceAll("\\(", ",");
		String[] split1 = splice.split(",");
		String split2 = split1[1].replaceAll("\\)", "");
		System.out.println(split2);

		//String
		if(ctx.getChild(0).getText().equals("xray") && stringVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			stringVariable.put(split2, nutInterpreter.valueOfScan());
		}//Integer
		else if(ctx.getChild(0).getText().equals("xray") && intVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			if(nutInterpreter.valueOfScan().matches("[0-9]+")) {
				intVariable.put(split2, Integer.parseInt(nutInterpreter.valueOfScan()));
			}else{
				nutInterpreter.setOutputStream("Variable type error! Variable " + split2 + " is not a digimon!");
			}
		}//Boolean
		else if(ctx.getChild(0).getText().equals("xray") && booleanVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			if(nutInterpreter.valueOfScan().equalsIgnoreCase("true") | nutInterpreter.valueOfScan().equalsIgnoreCase("false")) {
				booleanVariable.put(split2, Boolean.parseBoolean(nutInterpreter.valueOfScan()));
			}else{
				nutInterpreter.setOutputStream("Variable type error! Variable " + split2 + " is not a maybe!");
			}

		}//Character
		else if(ctx.getChild(0).getText().equals("xray") && charVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			if(nutInterpreter.valueOfScan().matches("[A-z]")){
				charVariable.put(split2, nutInterpreter.valueOfScan().charAt(0));
			}else{
				nutInterpreter.setOutputStream("Variable type error! Variable " + split2 + " is not a charot!");
			}
		}//Float
		else if(ctx.getChild(0).getText().equals("xray") && floatVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			if(nutInterpreter.valueOfScan().matches("[-+]?[0-9]*\\.?[0-9]+")){
				floatVariable.put(split2, Float.parseFloat(nutInterpreter.valueOfScan()));
			}else{
				nutInterpreter.setOutputStream("Variable type error! Variable " + split2 + " is not a drowning!");
			}
		}//Double
		else if(ctx.getChild(0).getText().equals("xray") && doubleVariable.containsKey(split2)){
			nutInterpreter.newScanner("Scan statement");
			if(nutInterpreter.valueOfScan().matches("[-+]?[0-9]*\\.?[0-9]+")){
				doubleVariable.put(split2, Double.parseDouble(nutInterpreter.valueOfScan()));
			}else{
				nutInterpreter.setOutputStream("Variable type error! Variable " + split2 + " is not a twice");
			}
		}

		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResourceSpecification(NutParser.ResourceSpecificationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResources(NutParser.ResourcesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource(NutParser.ResourceContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSwitchBlockStatementGroup(NutParser.SwitchBlockStatementGroupContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSwitchLabel(NutParser.SwitchLabelContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForControl(NutParser.ForControlContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForInit(NutParser.ForInitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEnhancedForControl(NutParser.EnhancedForControlContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParExpression(NutParser.ParExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpressionList(NutParser.ExpressionListContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodCall(NutParser.MethodCallContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(NutParser.ExpressionContext ctx) {

//		if(ctx.getParent() instanceof NutParser.PrintStatementContext){
//			String expr = ctx.getText();
//			System.out.println("Expression " + expr);
//			Expression e = new ExpressionBuilder(expr).build();
//			System.out.println(e.evaluate());
//
//			return (T) e.evaluate();
//		}
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrimary(NutParser.PrimaryContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassType(NutParser.ClassTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCreator(NutParser.CreatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCreatedName(NutParser.CreatedNameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInnerCreator(NutParser.InnerCreatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassCreatorRest(NutParser.ClassCreatorRestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExplicitGenericInvocation(NutParser.ExplicitGenericInvocationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeArgumentsOrDiamond(NutParser.TypeArgumentsOrDiamondContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNonWildcardTypeArgumentsOrDiamond(NutParser.NonWildcardTypeArgumentsOrDiamondContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNonWildcardTypeArguments(NutParser.NonWildcardTypeArgumentsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeList(NutParser.TypeListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeType(NutParser.TypeTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrimitiveType(NutParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeArguments(NutParser.TypeArgumentsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSuperSuffix(NutParser.SuperSuffixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExplicitGenericInvocationSuffix(NutParser.ExplicitGenericInvocationSuffixContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArguments(NutParser.ArgumentsContext ctx) { return visitChildren(ctx); }
}