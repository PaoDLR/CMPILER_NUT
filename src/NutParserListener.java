// Generated from C:/Users/Ashen One/Desktop/CMPILER_NUT\NutParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NutParser}.
 */
public interface NutParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NutParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(NutParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(NutParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(NutParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(NutParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(NutParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(NutParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(NutParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(NutParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(NutParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(NutParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(NutParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(NutParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(NutParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(NutParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(NutParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(NutParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(NutParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(NutParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(NutParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(NutParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(NutParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(NutParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(NutParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(NutParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(NutParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(NutParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(NutParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(NutParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(NutParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(NutParser.MethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(NutParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(NutParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(NutParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(NutParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(NutParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(NutParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(NutParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(NutParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(NutParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(NutParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(NutParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(NutParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(NutParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(NutParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(NutParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(NutParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(NutParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(NutParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(NutParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(NutParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(NutParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(NutParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(NutParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(NutParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(NutParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(NutParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(NutParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(NutParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(NutParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(NutParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(NutParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(NutParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(NutParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(NutParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(NutParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(NutParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(NutParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(NutParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(NutParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(NutParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(NutParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(NutParser.QualifiedNameContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(NutParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(NutParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(NutParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(NutParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(NutParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(NutParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(NutParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(NutParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(NutParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(NutParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(NutParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(NutParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(NutParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(NutParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(NutParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(NutParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(NutParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(NutParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(NutParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(NutParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(NutParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(NutParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(NutParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(NutParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(NutParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(NutParser.DefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(NutParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(NutParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NutParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NutParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(NutParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(NutParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(NutParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(NutParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(NutParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(NutParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(NutParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(NutParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(NutParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(NutParser.ResourceContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(NutParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(NutParser.EnhancedForControlContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link NutParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(NutParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(NutParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(NutParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(NutParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(NutParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(NutParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(NutParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(NutParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(NutParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(NutParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(NutParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(NutParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(NutParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(NutParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(NutParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(NutParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(NutParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(NutParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(NutParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(NutParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(NutParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(NutParser.TypeTypeContext ctx);
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
	 * Enter a parse tree produced by {@link NutParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(NutParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(NutParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(NutParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(NutParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(NutParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(NutParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NutParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(NutParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NutParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(NutParser.ArgumentsContext ctx);
}