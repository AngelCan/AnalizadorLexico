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
import java.io.FileWriter;

public class Semantico {
    
/*
int[a-z* = 0-9* ";"] {lexeme=yytext(); return Int;}
string[a-z* = a-z* ";"] {lexeme=yytext(); return String;}
double[a-z* = 0-9*"."0-9* ";"] {lexeme=yytext(); return Double;}
for[]
if[(ID OR (0-9*|false|true|null)(&& | || (ID OR (0-9*|false|true|null))*){} else{}]
*/
    
    public static void main(String[] args) throws IOException {
        
    ArrayList<String> TD1 = new ArrayList<String>();
    
    ArrayList<String> ID1 = new ArrayList<String>();
    ArrayList<String> Valor = new ArrayList<String>();
    
        try {
            Reader lector = new BufferedReader(new FileReader("Entrada2.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "TOKEN ERROR            LEXEMA      LINEA       DESCRIPCION\n";
            while (true) {
                Tokens tokens = lexer.yylex();
                
            if (tokens == null) {
                resultado += "FIN";
                
                File archivo = new File("ErroresSemanticos.txt");
                PrintWriter escribir;
                try {
                    escribir = new PrintWriter(archivo);
                    escribir.print(resultado);
                    escribir.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return;
                }
            switch (tokens) {
                    case ERROR:
                    resultado += "Simbolo no definido\n";
                    break;
                    case JPM:
                    resultado += "\n";
                    break;
                    
                    case TD:
                        if(TD1.isEmpty()){
                        TD1.add(lexer.lexeme);
                        resultado += "TD" + TD1.size() + " ";
                        }
                        else{
                            if(!TD1.contains(lexer.lexeme)){
                                TD1.add(lexer.lexeme);
                                resultado += lexer.lexeme + TD1.size();
                            }
                            else{
                                TD1.add(lexer.lexeme);
                            }
                        }
                        break;
                    
                    case ID:
                    
                        if(TD1.isEmpty()){
                        
                        resultado += "Variable no declarada" + ID1.size() + " ";
                        }
                        else{
                            if(!ID1.contains(lexer.lexeme)){
                            ID1.add(lexer.lexeme);
                            resultado += lexer.lexeme + ID1.size();
                            }
                            else{
                            resultado += lexer.lexeme + ID1.lastIndexOf(lexer.lexeme);
                            
                            }
                        } 
                        
                        break;
                    case CNE:
                        Valor.add(lexer.lexeme);
                        resultado += Valor.size() + "";
                        break;
                    case value:
                        Valor.add(lexer.lexeme);
                        resultado += Valor.size() + "";
                        break;
                    case ERDEL:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " + "       " + "Error en delimitadores\n";
                    break;
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }    
/*

*/
}    