/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
/**
 *
 * @author angel-can
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import codigo.Tokens.*;
import static codigo.Tokens.TD;
import codigo.Lexer;
import static codigo.Tokens.ID;
import java.util.logging.Level;
import java.util.logging.Logger;
import codigo.FrmPrincipal;
import static codigo.Tokens.ID;

public class Semantico {
    
/*
int[a-z* = 0-9* ";"] {lexeme=yytext(); return Int;}
string[a-z* = a-z* ";"] {lexeme=yytext(); return String;}
double[a-z* = 0-9*"."0-9* ";"] {lexeme=yytext(); return Double;}
for[]
if[(a-z* OR ){} else{}]
*/

}


/*


    ArrayList<String> TD1 = new ArrayList<String>();
    
    ArrayList<String> ID1 = new ArrayList<String>();
        
    try {
    Reader lector = new BufferedReader(("TokensP.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "TOKEN ERROR            LEXEMA      LINEA       DESCRIPCION\n";
        while (true) {
            Tokens tokens = lexer.yylex();
    
            if(tokens == ID){
    

            }
    
        }   
    }

*/