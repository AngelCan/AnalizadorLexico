0package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
A=[a-zA-Z]+
B=[ ,\t,\r,\n]+
C=[(]
D=[)]
E=[;]
F=[,]
G=[=]
H=[]
I=[0-9]+
J=[.]
K=[a-zA-Z_0-9]+
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
int |
if |
else |
while {lexeme=yytext(); return Reservadas;}
{B} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return AS;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
C|
D {lexeme=yytext(); return DEL;}

{A}{K} {lexeme=yytext(); return ID;}
{I}|
{I}"."{I} {lexeme=yytext(); return CNE;}
 . {return ERROR;}
