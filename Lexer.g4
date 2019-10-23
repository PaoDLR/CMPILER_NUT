/*
* @authors Cruz, De Castro, Delos Reyes, Mendoza E.
*/

grammar Lexer;
output: kw | dt | sp | op | id;
prule: kw;


//Keywords
kw: KEYWORDS;
KEYWORDS: ASSERT
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
          PRINT
          |
          RETURN
          |
          SCAN
          |
          STATIC
          |
          SWITCH
          |
          VOID
          |
          WHILE;

 //Datatype
 dt: DATATYPE;
 DATATYPE: CHAR
           |
           DOUBLE
           |
           FLOAT
           |
           INT
           |
           STRING;

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
PRINT: 'printing';
RETURN: 'ups';
SCAN: 'scan';
STATIC: 'shiv';
STRING: 'string';
SWITCH: 'nintendo';
VOID: 'kassadin';
WHILE: 'during';

//Separators
sp: SEPARATORS;
SEPARATORS: LPAREN
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
op: OPERATORS;
OPERATORS:  ASSIGN
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
fragment Digits: [0-9] ([0-9]* [0-9])?;
fragment LetterOrDigit: Letter
                        |
                        [0-9];
fragment Letter: [a-zA-Z$_] // these are the "java letters" below 0x7F
                 | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
                 | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
                 ;

fragment EscapeSequence
   : '\\' [btnfr"'\\]
   | '\\' ([0-3]? [0-7])? [0-7]
   | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
   ;

fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;


//Identifiers
id: IDENTIFIER;
IDENTIFIER: Letter LetterOrDigit*;

//Literals
DECIMAL_LITERAL: ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL: 'naida';
BOOLEAN_LITERAL: 'true' | 'false';
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);
