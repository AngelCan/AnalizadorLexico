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

public class Prefijo {

public static void main(String[] args) throws IOException {
    ArrayList<String> TD1 = new ArrayList<String>();
    
    ArrayList<String> ID1 = new ArrayList<String>();
    ArrayList<String> Valor = new ArrayList<String>();
    ArrayList<String> Error = new ArrayList<String>();
    ArrayList<String> OA1 = new ArrayList<String>();
    ArrayList<String> OA2 = new ArrayList<String>();
    ArrayList<String> Cont = new ArrayList<String>();
    //CNE
    ArrayList<String> Prefijo = new ArrayList<String>();
    ArrayList<String> PrefijoListo = new ArrayList<String>();
    //CN
    ArrayList<String> Prefijo1 = new ArrayList<String>();
    ArrayList<String> PrefijoListo1 = new ArrayList<String>();
    
    ArrayList<String> Dato_Objeto = new ArrayList<String>();
    ArrayList<String> Dato_ObjetoAux = new ArrayList<String>();
    ArrayList<String> Dato_Fuente = new ArrayList<String>();
    ArrayList<String> Operador = new ArrayList<String>();
    ArrayList<String> Linea = new ArrayList<String>();
    //Contiene el prefijo de las multiplicaciones y divisiones
    ArrayList<String> OA_Aux1 = new ArrayList<String>();
    //Contiene el prefijo de las sumas y restas
    ArrayList<String> OA_Aux2 = new ArrayList<String>();
    //Si esta vacio, entonces no hay ningun * ni /, si tiene un Yes, entonces si tiene
    ArrayList<String> OA3 = new ArrayList<String>();
    //Guarda el signo de = y el id 
    ArrayList<String> PrefijoF = new ArrayList<String>(); 
    //Contiene las últimas 2 cosas que guardo prefijo y el OA actual
    ArrayList<String> OA_AuxE = new ArrayList<String>();
    ArrayList<String> OA_AuxE1 = new ArrayList<String>();
    ArrayList<String> OA4 = new ArrayList<String>();
    
        try {
            Reader lector = new BufferedReader(new FileReader("Entrada2.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "Linea   Operador      Dato Fuente     Dato Objeto  \n";
            while (true) {
                Tokens tokens = lexer.yylex();
                
            if (tokens == null) {
                resultado += "FIN";
                
                File archivo = new File("Pruebas_Prefijo.txt");
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
                    Cont.add("linea ");
                    resultado += "\n";
                    break;
                    
                    case TD:
                        if(TD1.isEmpty()){
                        TD1.add(lexer.lexeme);
                        /* Usar para realizar seguimiento
                        resultado += "TD" + TD1.size() + " "; */
                        }
                        else{
                            if(!TD1.contains(lexer.lexeme)){
                                TD1.add(lexer.lexeme);
                                /* Usar para realizar seguimiento
                                resultado += lexer.lexeme + TD1.size(); */
                            }
                            else{
                                TD1.add(lexer.lexeme);
                                //Para realizar el seguimiento, usar r entre las comillas
                                resultado += "";
                            }
                        }
                        break;
                    
                    case ID:
                    
                        if(TD1.isEmpty()){
                        Error.add(lexer.lexeme);
                        resultado += "IDES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " + "Variable no declarada\n";
                        }
                        else{
                            
                            if(!ID1.contains(lexer.lexeme)){
                                
                                ID1.add(lexer.lexeme);
                                if(ID1.size() == TD1.size()){
                                    //Para realizar el seguimiento, usar bien entre las comillas
                                    
                                    Prefijo.add(lexer.lexeme);
                                    String p = Prefijo.get(Prefijo.size() - 1);
                                    PrefijoF.add(p);
                                    resultado += "=" + p;
                                    
                                    if(!OA1.isEmpty()){
                                        String a = TD1.get(TD1.size() - 1);
                                        String b = OA1.get(OA1.size() - 1);
                                        
                                        if(a == b){
                                            //Para realizar el seguimiento, usar hola entre las comillas
                                            /*
                                            resultado += a + b + ""; */
                                            
                                            
                                        } else{
                                            resultado+= "IDES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " + "Incompatibilidad de tipos\n";
                                        }
                                            
                                        
                                        
                                    } //No hay OA
                                } //Hay un ID no declarado
                                else{
                                    Error.add(lexer.lexeme);
                                    //IDES = ID Error Semantico
                                    resultado += "IDES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " + "Variable no declarada\n";
                                }
                                
                            
                            }
                            else{
                            /* Usar para realizar seguimiento    
                            resultado += lexer.lexeme + ID1.lastIndexOf(lexer.lexeme); */
                            
                                
                            
                            }
                        } 
                        
                        break;
                    case CNE:
                        /* TD1.get(TD1.size());
                        ID1.get(ID1.size());
                         if(n == "double"){
                            
                        }else{
                            resultado += "Error\n";
                        } */
                        if(TD1.contains("double") && TD1.size() == ID1.size()){
                            Valor.add(lexer.lexeme);
                            /* */
                            Prefijo.add(lexer.lexeme);
                            String p = Prefijo.get(Prefijo.size() - 1);
                            
                            //SI EXISTE UN OPERADOR ARITMETICO AGREGAMOS EL ÚLTIMO NUMERO Y EL ANTEPENULTIMO NUMERO EXISTENTE EN EL ARRAY PREFIJO
                            if(!OA1.isEmpty()){
                                if(OA2.contains("*") || OA2.contains("/")){
                                    String p1 = Prefijo.get(Prefijo.size() - 1);
                                    String p2 = Prefijo.get(Prefijo.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    Prefijo.add(p3+p2+p1);
                                    String r = Prefijo.get(Prefijo.size() - 1);
                                    OA_AuxE.add(r);
                                    OA_Aux2.add(r);
                                    OA2.set(OA2.size() - 1, "No");
                                    resultado+= r + "\n";
                                }
                                
                                if((OA2.contains("+") || OA2.contains("-")) && OA_Aux2.isEmpty()){
                                    String p1 = Prefijo.get(Prefijo.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    OA_AuxE1.add(p3);
                                    OA_AuxE.add(p1);
                                    String m = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                    String n = OA_AuxE.get(OA_AuxE.size() - 1);
                                    OA2.set(OA2.size() - 1, "No");
                                    resultado+= m +"       " + n + "\n";
                                    
                                }
                                
                                if(OA2.contains("+") && !OA_Aux2.isEmpty()){
                                
                                        String p1 = Prefijo.get(Prefijo.size() - 2);
                                        
                                        String p3 = OA2.get(OA2.size() - 1);
                                        OA_AuxE1.add(p3);
                                        OA_AuxE.add(p1);
                                        String m = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                        String n = OA_AuxE.get(OA_AuxE.size() - 1);
                                        OA2.set(OA2.size() - 1, "No");
                                        resultado+= m + n + "\n";
                                    
                                }
                                if( OA2.contains("-") && !OA_Aux2.isEmpty()){
                                
                                        String p1 = Prefijo.get(Prefijo.size() - 2);
                                        
                                        String p3 = OA2.get(OA2.size() - 1);
                                        OA_AuxE1.add(p3);
                                        OA_AuxE.add(p1);
                                        String m = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                        String n = OA_AuxE.get(OA_AuxE.size() - 1);
                                        OA2.set(OA2.size() - 1, "No");
                                        resultado+= m + n + "\n";
                                    
                                }
                            }
                        }else{
                            // CNEES = CNE Error Semantico
                            Error.add(lexer.lexeme);
                            resultado += "CNEES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " + "Tipo de datos y valor Incompatibles\n"; 
                        }
                        
                        break;
                    case value:
                        if(TD1.contains("string") && TD1.size() == ID1.size()){
                            Valor.add(lexer.lexeme);
                            Prefijo.add(lexer.lexeme);
                            String p = Prefijo.get(Prefijo.size() - 1);
                            
                            //SI EXISTE UN OPERADOR ARITMETICO AGREGAMOS EL ÚLTIMO NUMERO Y EL ANTEPENULTIMO NUMERO EXISTENTE EN EL ARRAY PREFIJO
                            if(!OA1.isEmpty()){
                                String p1 = Prefijo.get(Prefijo.size() - 1);
                                String p2 = Prefijo.get(Prefijo.size() - 2);
                                String p3 = OA2.get(OA2.size() - 1);
                                Prefijo.add(p3+p2+p1);
                                
                                String r = Prefijo.get(Prefijo.size() - 1);
                                resultado+= r + "hola99" + "\n";
                                
                            }
                            /*
                            resultado += lexer.lexeme +  Valor.size()  + " " + "\n" ; */
                        }else{
                            // ValueES = CNE Error Semantico
                             Error.add(lexer.lexeme);
                            resultado += "ValueES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " +  "Tipo de datos y valor Incompatibles\n";
                        }
                        break;
                    case CN:
                        if(TD1.contains("int") && TD1.size() == ID1.size()){
                            Valor.add(lexer.lexeme);
                            Prefijo1.add(lexer.lexeme);
                            String p = Prefijo1.get(Prefijo1.size() - 1);
                            //resultado+= p + "hola2";
                            /* Usar para realizar seguimiento
                            resultado += lexer.lexeme +  Valor.size()  + " " + "\n" ; */
                            //SI EXISTE UN OPERADOR ARITMETICO AGREGAMOS EL ÚLTIMO NUMERO Y EL ANTEPENULTIMO NUMERO EXISTENTE EN EL ARRAY PREFIJO
                            if(!OA1.isEmpty()){
                                if(OA2.contains("*") || OA2.contains("/")){
                                    String p1 = Prefijo1.get(Prefijo1.size() - 1);
                                    String p2 = Prefijo1.get(Prefijo1.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    Prefijo1.add(p3+p2+p1);
                                    String r = Prefijo1.get(Prefijo1.size() - 1);
                                    OA3.add(r);
                                    OA_Aux1.add(r);
                                    OA2.set(OA2.size() - 1, "No");
                                    resultado+= r + "\n";
                                }
                                
                                if((OA2.contains("+") || OA2.contains("-")) && OA_Aux1.isEmpty()){
                                    String p1 = Prefijo1.get(Prefijo1.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    OA4.add(p3);
                                    OA3.add(p1);
                                    String m = OA4.get(OA4.size() - 1);
                                    String n = OA3.get(OA3.size() - 1);
                                    OA2.set(OA2.size() - 1, "No");
                                    resultado+= m +"       " + n + "\n";
                                    
                                }
                                
                                if(OA2.contains("+") && !OA_Aux1.isEmpty()){
                                
                                        String p1 = Prefijo1.get(Prefijo1.size() - 2);
                                        
                                        String p3 = OA2.get(OA2.size() - 1);
                                        OA4.add(p3);
                                        OA3.add(p1);
                                        String m = OA4.get(OA4.size() - 1);
                                        String n = OA3.get(OA3.size() - 1);
                                        OA2.set(OA2.size() - 1, "No");
                                        resultado+= m + n + "\n";
                                    
                                }
                                if( OA2.contains("-") && !OA_Aux1.isEmpty()){
                                
                                        String p1 = Prefijo1.get(Prefijo1.size() - 2);
                                        String p3 = OA2.get(OA2.size() - 1);
                                        OA4.add(p3);
                                        OA3.add(p1);
                                        String m = OA4.get(OA4.size() - 1);
                                        String n = OA3.get(OA3.size() - 1);
                                        OA2.set(OA2.size() - 1, "No");
                                        resultado+= m + n + "\n";
                                    
                                }
                            }
                                
                                // AQUI TERMINA ESA SECCION CON LA CUAL TRABAJAR
                            
                            
                        }else{
                            // CNES = CN Error Semantico
                             Error.add(lexer.lexeme);
                            resultado += "CNES" + Error.size() + "                    " + lexer.lexeme + "         " +   "linea " +  Cont.size() + "       " + "Tipo de datos y valor Incompatibles\n";
                        }
                    case OA:
                        // Guardo el último elemento de TD1 en OA1
                        // if(TD1.contains("double") )
                        String s = TD1.get(TD1.size() - 1);
                        OA1.add(s);
                        OA2.add(lexer.lexeme);
                        if(OA2.contains("*") || OA2.contains("/")){
                            OA3.add("YES");
                        }
                        
                        /* Usar para realizar seguimiento
                        resultado += OA1.size() + s + "Vas bien\n"; */
                        break;
                    case SEP:
                        String Pl = Prefijo.get(Prefijo.size() - 1);
                        PrefijoListo.add(Pl);
                        String p = PrefijoListo.get(PrefijoListo.size() - 1);
                        
                        String Plcne = Prefijo1.get(Prefijo1.size() - 1);
                        PrefijoListo1.add(Plcne);
                        String pcne = PrefijoListo.get(PrefijoListo1.size() - 1);
                        // PARA CNE
                        if(!OA_AuxE.isEmpty()){
                            
                            OA_AuxE.add(Pl);
                            
                            int f = OA_AuxE1.size();
                            int f2 = f - 1;
                           
                            if(f != 0 && f != 1){
                                for(int i = 0; i < f2; i++){
                                
                                
                                
                                if(OA_AuxE1.contains("+") || OA_AuxE1.contains("-")){
                                    int n = OA_AuxE1.indexOf("+");
                                    int m = OA_AuxE1.indexOf("-");
                                    
                                    if(n == 0){
                                        int n1 = n;
                                        int n2 = n + 2;
                                        String p1 = OA_AuxE.get(n1);
                                        String p2 = OA_AuxE.get(n2);
                                        String p3 = "+";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No");
                                    }
                                    if(m == 0){
                                        int n1 = m;
                                        int n2 = m + 2;
                                        String p1 = OA_AuxE.get(n1);
                                        String p2 = OA_AuxE.get(n2);
                                        String p3 = "-";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No");
                                    }
                                    if((m != 0 && m != 0) && m > n){
                                        int n1 = m;
                                        
                                        String p1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                        String p2 = OA_AuxE.get(OA_AuxE.size() - 2);
                                        String p3 = "-";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No"); 
                                    }
                                    if((m != 0 && m != 0) && n > m){
                                        int n1 = m;
                                        
                                        String p1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                        String p2 = OA_AuxE.get(OA_AuxE.size() - 2);
                                        String p3 = "+";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No");
                                    }
                                    
                                }
                                if(!OA_AuxE1.contains("+") && !OA_AuxE1.contains("-")){
                                    String f1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                    Prefijo.add(f1);
                                    String i2 = PrefijoF.get(PrefijoF.size() -1);
                                    resultado+= "=" + i2 + " " + f1;
                                    Prefijo.clear();
                                    OA_AuxE1.clear();
                                    OA_AuxE.clear();
                                    PrefijoListo.clear();
                                }
                            }
                            } if(f == 1){
                                int n = OA_AuxE1.indexOf("+");
                                int m = OA_AuxE1.indexOf("-");
                                   
                                    if(n == 0){
                                        int n1 = n;
                                        int n2 = n + 2;
                                        String p1 = OA_AuxE.get(n1);
                                        String p2 = OA_AuxE.get(n2);
                                        String p3 = "+";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No");
                                    }
                                    if(m == 0){
                                        int n1 = m;
                                        int n2 = m + 2;
                                        String p1 = OA_AuxE.get(n1);
                                        String p2 = OA_AuxE.get(n2);
                                        String p3 = "-";
                                        OA_AuxE.add(p3+p1+p2);
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No");
                                    }
                                    if(!OA_AuxE1.contains("+") && !OA_AuxE1.contains("-")){
                                        String f1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(f1);
                                        String i2 = PrefijoF.get(PrefijoF.size() -1);
                                        resultado+= "=" + i2 + " " + f1;
                                        Prefijo.clear();
                                        OA_AuxE1.clear();
                                        OA_AuxE.clear();
                                        PrefijoListo.clear();
                                }
                            }
                                    
                            
                            
                        }
                        // PARA CN
                        if(!OA3.isEmpty()){
                            
                            OA3.add(Plcne);
                            
                            int f = OA4.size();
                            int f2 = f - 1;
                           
                            if(f != 0 && f != 1){
                                for(int i = 0; i < f2; i++){
                                
                                
                                
                                if(OA4.contains("+") || OA4.contains("-")){
                                    int n = OA4.indexOf("+");
                                    int m = OA4.indexOf("-");
                                    
                                    if(n == 0){
                                        int n1 = n;
                                        int n2 = n + 2;
                                        String p1 = OA3.get(n1);
                                        String p2 = OA3.get(n2);
                                        String p3 = "+";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n1, "YA_No");
                                    }
                                    if(m == 0){
                                        int n1 = m;
                                        int n2 = m + 2;
                                        String p1 = OA3.get(n1);
                                        String p2 = OA3.get(n2);
                                        String p3 = "-";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n1, "YA_No");
                                    }
                                    if((m != 0 && m != 0) && m > n){
                                        int n1 = m;
                                        
                                        String p1 = OA3.get(OA3.size() - 1);
                                        String p2 = OA3.get(OA3.size() - 2);
                                        String p3 = "-";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n1, "YA_No"); 
                                    }
                                    if((m != 0 && m != 0) && n > m){
                                        int n11 = m;
                                        
                                        String p1 = OA3.get(OA3.size() - 1);
                                        String p2 = OA3.get(OA3.size() - 2);
                                        String p3 = "+";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n11, "YA_No");
                                    }
                                    
                                }
                                if(!OA4.contains("+") && !OA4.contains("-")){
                                    String f1 = OA3.get(OA3.size() - 1);
                                    Prefijo1.add(f1);
                                    String i2 = PrefijoF.get(PrefijoF.size() -1);
                                    resultado+= "=" + i2 + " " + f1;
                                    Prefijo1.clear();
                                    OA4.clear();
                                    OA3.clear();
                                    PrefijoListo1.clear();
                                }
                            }
                            } if(f == 1){
                                int n = OA4.indexOf("+");
                                int m = OA4.indexOf("-");
                                   
                                    if(n == 0){
                                        int n1 = n;
                                        int n2 = n + 2;
                                        String p1 = OA3.get(n1);
                                        String p2 = OA3.get(n2);
                                        String p3 = "+";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n1, "YA_No");
                                    }
                                    if(m == 0){
                                        int n1 = m;
                                        int n2 = m + 2;
                                        String p1 = OA3.get(n1);
                                        String p2 = OA3.get(n2);
                                        String p3 = "-";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                        OA4.set(n1, "YA_No");
                                    }
                                    if(!OA4.contains("+") && !OA4.contains("-")){
                                        String f1 = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(f1);
                                        String i2 = PrefijoF.get(PrefijoF.size() -1);
                                        resultado+= "=" + i2 + " " + f1;
                                        Prefijo1.clear();
                                        OA4.clear();
                                        OA3.clear();
                                        PrefijoListo1.clear();
                                }
                            }
                                    
                            
                            
                        }
                        
                        //Cambiar de lugar, esta comparación no se debe de hacer solo en el caso de separador
                        if(Dato_Objeto.size() == Dato_Fuente.size() && Dato_Fuente.size() == Operador.size()){
                           if(Linea.isEmpty()){
                               Linea.add("1");
                               String n = Linea.get(Linea.size() - 1);
                               resultado+="\n" + n;
                           } else{
                               //String n = Linea.get(Linea.size() - 1);
                               int n = Linea.size();
                               int m = n + 1;
                               resultado+= "\n" + m;
                           }
                           
                        }
                        //Esto "Esta bien"
                        if(OA_AuxE1.isEmpty()){
                          String i = PrefijoF.get(PrefijoF.size() -1);
                          resultado+= "\n" + "=" + i + p;
                              
                        }
                        if(OA4.isEmpty()){
                          String i = PrefijoF.get(PrefijoF.size() -1);
                          resultado+= "\n" + "=" + i + p;
                              
                        }
                        break;
                    case AS:
                        resultado+= "";
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }    
}
