package codigo;
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
bool |
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
{H} {lexeme=yytext(); return OA;}
{C}|
{D} {lexeme=yytext(); return DEL;}

"\n" {lexeme=yytext(); return JPM;}

"}"|
"{"|
{E} {lexeme=yytext(); return SEP;}
{F} {lexeme=yytext(); return SEP1;}

{A}{K} {lexeme=yytext(); return ID;}
{I} {lexeme=yytext(); return CN;}
{I}"."{I} {lexeme=yytext(); return CNE;}

"=="|
"!="|
"<="|
">="|
"<"|
">" {lexeme=yytext(); return OR;}


"||"|
"&&" {lexeme=yytext(); return OL;}

{J}{I}|
{I}{J}|
{J}{J}|
{I}{K}|
{I}{J}{K} {lexeme=yytext(); return ERCNE;}
{K}|
{I}{A}|
{K}{J}{I} {lexeme=yytext(); return ERID;}


{G}{F}|
{G}{J}| 
{G}{H} {lexeme=yytext(); return EROA;}

{H}{H} |
{H}{J} |
{H}{D} {lexeme=yytext(); return ERAS;}

{C}{F} {lexeme=yytext(); return ERDEL;}

{F}{E}|
{F}{F}|
{E}{A}|
{E}{C}|
{E}{D}|
{E}{F}|
{E}{G}|
{E}{H}|
{E}{I}|
{E}{J}|
{E}{K}|
{E}{E} {lexeme=yytext(); return ERSEP;}


"int int"|
"int boolean"|
"int string"|
"int long"|
"int char"|
"int void"|
"int float"|
"int double"|
"boolean int"|
"boolean boolean"|
"boolean string"|
"boolean long"|
"boolean char"|
"boolean void"|
"boolean float"|
"boolean double"|
"string int"|
"string boolean"|
"string string"|
"string long"|
"string char"|
"string void"|
"string float"|
"string double"|
"long int"|
"long boolean"|
"long string"|
"long long"|
"long char"|
"long void"|
"long float"|
"long double"|
"char int"|
"char boolean"|
"char string"|
"char long"|
"char char"|
"char void"|
"char float"|
"char double"|
"void int"|
"void boolean"|
"void string"|
"void long"|
"void char"|
"void void"|
"void float"|
"void double"|
"float int"|
"float boolean"|
"float string"|
"float long"|
"float char"|
"float void"|
"float float"|
"float double"|
"double int"|
"double boolean"|
"double string"|
"double long"|
"double char"|
"double void"|
"double float"|
"double double" {lexeme=yytext(); return ERTD;}

"!= <="|
"!= >="|
"< !="|
"> !="|
"< <=" {lexeme=yytext(); return EROR;}


"int"{K}|
"in" {K} "t" {lexeme=yytext(); return IDERS;} 


"if if" |
"if else" |
"if switch"|
"if case"|
"else if" |
"else else" |
"else switch"|
"else case"|
"switch if" |
"switch else" |
"switch switch"|
"switch case"
"case if" |
"case else" |
"case switch"|
"case case"   {lexeme=yytext(); return ERIC;}

"for for"|
"for do"|
"for while"
"do for"|
"do do"|
"do while"
"while for"|
"while do"|
"while while" {lexeme=yytext(); return ERIR;}


"'"{K}"'" {lexeme=yytext(); return value;}

"boolean"{A}{K} {lexeme=yytext(); return ER1;}
{A}{K}{G}({I}|{I}"."{I}|{A}{K})(H({I}|{I}"."{I}|{A}{K}))*{E} {lexeme=yytext(); return ER2;}

.  {return ERROR;}