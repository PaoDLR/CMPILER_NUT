/*
*
*   @authors Cruz, De Castro, Delos Reyes, Mendoza
*
*/

//testing
grammar Parser;

sum: Digits sum_op;
sum_op: '+' Digits sum_op | 'E';

//fragments
Digits: [0-9] ([0-9]* [0-9])?;

//Ignore whitespace
WS: [ \t\r\n]+ -> skip;