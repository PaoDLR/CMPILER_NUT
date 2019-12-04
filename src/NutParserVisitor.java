// Generated from C:/Users/Thomasraf/IdeaProjects/CMPILER_NUT\NutParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NutParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NutParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(NutParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(NutParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(NutParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(NutParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(NutParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(NutParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(NutParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(NutParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(NutParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(NutParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(NutParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(NutParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(NutParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(NutParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(NutParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(NutParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(NutParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(NutParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(NutParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(NutParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(NutParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(NutParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(NutParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(NutParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(NutParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(NutParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(NutParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(NutParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(NutParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(NutParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(NutParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(NutParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(NutParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(NutParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(NutParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(NutParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(NutParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(NutParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(NutParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(NutParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(NutParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(NutParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(NutParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(NutParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(NutParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(NutParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(NutParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(NutParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(NutParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(NutParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(NutParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(NutParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(NutParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(NutParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(NutParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(NutParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(NutParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NutParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(NutParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(NutParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(NutParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(NutParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NutParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(NutParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(NutParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(NutParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(NutParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(NutParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(NutParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(NutParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(NutParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(NutParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(NutParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(NutParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(NutParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NutParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(NutParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(NutParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(NutParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(NutParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(NutParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(NutParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(NutParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(NutParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(NutParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(NutParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(NutParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(NutParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(NutParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(NutParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(NutParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(NutParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(NutParser.ArgumentsContext ctx);
}