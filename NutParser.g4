/*
*
*   @authors Cruz, De Castro, Delos Reyes, Mendoza
*
*/
parser grammar NutParser;

options { tokenVocab=NutLexer; }

startCode:
    typeVoid IDENTIFIER'('')' methodBody
    ;

typeVoid:
    VOID;

methodBody:
    block
    | ';'
    ;

//constantDeclarator
//    : IDENTIFIER '=' variableInitializer
//    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER
    ;

variableInitializer
    : expression
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    ;

statement
    : blockLabel=block // Keep
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
    | SCAN statement
    | PRINT statement
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
    : forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

localVariableDeclaration
    : primitiveType variableDeclarators
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | INT
    | FLOAT
    | DOUBLE
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | expression '[' expression ']'
    | methodCall
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='also' expression
    | expression bop='or' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/')
      expression
    ;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;

//arguments
//    : '(' expressionList? ')'
//    ;