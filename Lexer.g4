/*
* @authors Cruz, De Castro, Delos Reyes, Mendoza E.
*/

lexer grammar Lexer;

//Keywords
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
FINAL: 'fantasy'; // We don't need it (Pao)
FLOAT: 'drown';
FOR: 'iv';
IF: 'can';
INT: 'digimon';
NEW: 'new';
PRINT: 'print';
RETURN: 'ups';
SCAN: 'scan';
STATIC: 'shiv'; // We don't need it (Pao)
STRING: 'string';
SWITCH: 'nintendo';
VOID: 'kassadin';
WHILE: 'during';

//Separators
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

fragment ExponentPart
    : [eE] [+-]? Digits
    ;


//Identifiers
//id: IDENTIFIER;
IDENTIFIER: Letter LetterOrDigit*;

//Literals
DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);
