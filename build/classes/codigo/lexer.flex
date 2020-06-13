0package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
A=[a-zA-Z]
B=[ ,\n,\r,\n]+
C=[(]
D=[)]
E=[;]
F=[,]
G=[=]
H=[]
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
"+" |
"-" |
"*" |
"/" {return OA;}
{C}|
{D} {lexeme=yytext(); return DEL;}

{E}|
{F} {lexeme=yytext(); return SEP;}

{A}{K} {lexeme=yytext(); return ID;}
{I}|
{I}"."{I} {lexeme=yytext(); return CNE;}

"!="|
"<="|
">="|
"<"|
">" {lexeme=yytext(); return OR;}

.  return ERROR;