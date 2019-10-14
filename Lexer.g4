/*
* @authors Cruz, De Castro, Delos Reyes, Mendoza E.
*/

grammar Lexer;
output: keywords | datatype | separators | operators | identifier;

//Keywords
keywords: ASSERT
          |
          BOOLEAN
          |
          BREAK
          |
          CASE
          |
          CONST
          |
          DO
          |
          ELSE
          |
          FINAL
          |
          FOR
          |
          IF
          |
          NEW
          |
          RETURN
          |
          STATIC
          |
          SWITCH
          |
          VOID
          |
          WHILE;

 //Datatype
 datatype: CHAR
           |
           DOUBLE
           |
           FLOAT
           |
           INT;

ASSERT: 'tpose';
BOOLEAN: 'maybe';
BREAK: 'ubreak';
CASE: 'case';
CHAR: 'charot';
CONST: 'ant';
DEFAULT: 'standard';
DO: 'glaz';
DOUBLE: 'twice';
ELSE: 'unless';
FINAL: 'fantasy';
FLOAT: 'drown';
FOR: 'iv';
IF: 'can';
INT: 'digimon';
NEW: 'new';
RETURN: 'ups';
STATIC: 'shiv';
SWITCH: 'nintendo';
VOID: 'kassadin';
WHILE: 'during';

//Separators
separators: LPAREN
            |
            RPAREN
            |
            LBRACE
            |
            RBRACE
            |
            LBRACK
            |
            RBRACK
            |
            SEMI
            |
            COMMA
            |
            DOT;

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMI: ';';
COMMA: ',';
DOT: '.';

//Operators
operators:  ASSIGN
            |
            GT
            |
            LT
            |
            BANG
            |
            COLON
            |
            EQUAL
            |
            LE
            |
            GE
            |
            NOTEQUAL
            |
            AND
            |
            OR
            |
            INC
            |
            DEC
            |
            ADD
            |
            SUB
            |
            MUL
            |
            DIV
            |
            MOD
            |
            ADD_ASSIGN
            |
            SUB_ASSIGN
            |
            MUL_ASSIGN
            |
            DIV_ASSIGN;

ASSIGN: '=';
GT: '>';
LT: '<';
BANG: '!';
COLON: ':';
EQUAL: '==';
LE: '<=';
GE: '>=';
NOTEQUAL: '!=';
AND: 'also';
OR: 'or';
INC: '++';
DEC: '--';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';

//Ignore whitespace
WS: [ \t\r\n]+ -> skip;

//Fragments
NUMBER: Digits;
ALPHABET: Letter;
NUMORALPH: LetterOrDigit;

fragment Digits: [0-9] ([0-9]* [0-9])?;
fragment LetterOrDigit: Letter
                        |
                        [0-9];
fragment Letter: [a-zA-Z$_] // these are the "java letters" below 0x7F
                 | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
                 | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
                 ;

//Identifiers
identifier: ALPHABET NUMORALPH*;

//Literals
DECIMAL_LITERAL: ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
STRING_LITERAL: '"' ALPHABET NUMORALPH* '"';
NULL_LITERAL: 'naida';