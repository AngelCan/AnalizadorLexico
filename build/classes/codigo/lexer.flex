0package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
A=[a-zA-Z]
B=[ ,\r]+
C=[(]
D=[)]
E=[;]
F=[,]
G=[=]
H=[+-/*]
I=[0-9]+
J=[.]
K=[a-zA-Z_0-9]*
%{
    public String lexeme;
%}
%%
double|
float|
void|
char|
long|
string | 
boolean | 
int {lexeme=yytext(); return TD;}
if |
else |
switch|
case {lexeme=yytext(); return IC;}
for|
do|
while {lexeme=yytext(); return IR;}
{B} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return AS;}
{H} {return OA;}
{C}|
{D} {lexeme=yytext(); return DEL;}

"\n" {lexeme=yytext(); return JPM;}

"}"|
"{"|
{E} {lexeme=yytext(); return SEP;}
{F} {lexeme=yytext(); return SEP1;}

{A}{K} {lexeme=yytext(); return ID;}
{I}|
{I}"."{I} {lexeme=yytext(); return CNE;}

"!="|
"<="|
">="|
"<"|
">" {lexeme=yytext(); return OR;}

{I}{K} {lexeme=yytext(); return ERROR1;}
{I}{J}{K} {lexeme=yytext(); return ERROR2;}
{K}{J}{I} {lexeme=yytext(); return ERROR3;}
{J}{I} {lexeme=yytext(); return ERROR4;}
{I}{J} {lexeme=yytext(); return ERROR5;}
{J}{J} {lexeme=yytext(); return ERROR6;}
{F}{E} {lexeme=yytext(); return ERROR7;}
{F}{F} {lexeme=yytext(); return ERROR8;}
{G}{F} {lexeme=yytext(); return ERROR9;}
{G}{J} {lexeme=yytext(); return ERROR10;}
{G}{H} {lexeme=yytext(); return ERROR11;}
{H}{H} {lexeme=yytext(); return ERROR12;}
{H}{J} {lexeme=yytext(); return ERROR13;}
{H}{D} {lexeme=yytext(); return ERROR14;}
{C}{F} {lexeme=yytext(); return ERROR15;}

{E}{A}|
{E}{C}|
{E}{D}|
{E}{F}|
{E}{G}|
{E}{H}|
{E}{I}|
{E}{J}|
{E}{K}|
{E}{E} {lexeme=yytext(); return ERROR16;}


"boolean"{A}{K} {lexeme=yytext(); return ER1;}
{A}{K}{G}({I}|{I}"."{I}|{A}{K})(H({I}|{I}"."{I}|{A}{K}))*{E} {lexeme=yytext(); return ER2;}

.  {return ERROR;}