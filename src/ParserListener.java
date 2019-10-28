// Generated from D:/School/CMPILER/MP/CMPILER_NUT\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(Parser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(Parser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(Parser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(Parser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Parser.MethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(Parser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(Parser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(Parser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(Parser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(Parser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(Parser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(Parser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(Parser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(Parser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(Parser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(Parser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(Parser.QualifiedNameContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(Parser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(Parser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(Parser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(Parser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(Parser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(Parser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Parser.DefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(Parser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(Parser.LocalTypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(Parser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(Parser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(Parser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(Parser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Parser.ResourceContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(Parser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(Parser.EnhancedForControlContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Parser.LambdaBodyContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(Parser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(Parser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(Parser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(Parser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(Parser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(Parser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(Parser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(Parser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(Parser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(Parser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(Parser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(Parser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(Parser.TypeTypeContext ctx);
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
	 * Enter a parse tree produced by {@link Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(Parser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(Parser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Parser.ArgumentsContext ctx);
}