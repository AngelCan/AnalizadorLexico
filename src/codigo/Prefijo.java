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
    ArrayList<String> Dato_Fuente2 = new ArrayList<String>();
    ArrayList<String> Dato_ObjetoF = new ArrayList<String>();
    
    ArrayList<String> Inter = new ArrayList<String>();
    
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
    
    ArrayList<String> ID_Aux = new ArrayList<String>();
    
    ArrayList<String> OR1 = new ArrayList<String>();
    ArrayList<String> OL1 = new ArrayList<String>();
    
        try {
            Reader lector = new BufferedReader(new FileReader("Entrada2.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "Linea   Operador      Dato Objeto     Dato Fuente   \n";
            while (true) {
                Tokens tokens = lexer.yylex();
                
            if (tokens == null) {
                
                if(!Dato_Fuente2.isEmpty()){
                    int i = Dato_Objeto.size();
                            int l = Dato_Fuente.size();
                            int l2 = Dato_Fuente.size();
                            for(int n = i; n < l; n++){
                                Dato_Objeto.add("T1");
                                //String p1 = Dato_Fuente.get(Dato_Fuente.size() -1);
                                //resultado+= "\n" + p1 + "Flag";
                            }
                            
                            if(Dato_Fuente.contains("T1")){
                                int  s = Dato_Fuente.indexOf("T1");
                                String s2 = Dato_ObjetoF.get(0);
                                Dato_Objeto.set(s, s2);
                                //EL NUMERO QUE MUESTRA ES EL LUGAR DEL ARREGLO, NO DE LA TABLA, PARA TENER EL DE LA TABLA ES EL NUMERO
                                //MOSTRADO + 1
                                resultado+= "\n" + s;
                                
                                
                                
                            }
                            
                               if(Operador.contains("*") || Operador.contains("/")){
                                int sa = Operador.indexOf("*");
                                int sb = Operador.indexOf("/");
                                int sc = sa - sb;
                                String sd = "T2";
                                
                                
                                
                                for(int n = i; n < l2; n++){
                                    String f1 = Dato_Fuente.get(n);
                                    String f2 = Operador.get(n);
                                    Inter.add(f1);
                                    Inter.add(f2);
                                    int pru = Inter.size();
                                resultado += "\n" + pru;
                                if(sc != -1 && sc != 1){
                                    if(sa < sb){
                                       Dato_Objeto.set(sa, sd);
                                       //Operador.add("=");
                                       //Dato_Objeto.add(sd);
                                       //Dato_Fuente.add(sd);
                                       resultado += sc + "Flag1"; 
                                    } if(sa > sb){
                                        Dato_Objeto.set(sb, sd);
                                        resultado += sc + "Flag2";
                                    }
                                    
                                }
                                }    
                                
                                resultado += "\n" + sa + sb +"Flag";
                            } 
                            
                            
                    
                    
                } else{
                            int i = Dato_Objeto.size();
                            int l = Dato_Fuente.size();
                            for(int n = i; n < l; n++){
                                Dato_Objeto.add("T1");
                                //String p1 = Dato_Fuente.get(Dato_Fuente.size() -1);
                                //resultado+= "\n" + p1 + "Flag";
                            }
                            
                            if(Dato_Fuente.contains("T1")){
                                int  s = Dato_Fuente.indexOf("T1");
                                String s2 = Dato_ObjetoF.get(0);
                                Dato_Objeto.set(s, s2);
                                //EL NUMERO QUE MUESTRA ES EL LUGAR DEL ARREGLO, NO DE LA TABLA, PARA TENER EL DE LA TABLA ES EL NUMERO
                                //MOSTRADO + 1
                                resultado+= "\n" + s;
                            }
                            
                        }
                if(Dato_Objeto.size() == Dato_Fuente.size() && Dato_Fuente.size() == Operador.size()){
                           if(Linea.isEmpty()){
                               Linea.add("1");
                               String n = Linea.get(Linea.size() - 1);
                               
                               String n2 = Operador.get(Linea.size() - 1);
                               
                               String n3 = Dato_Fuente.get(Linea.size() -1);
                               String n4 = Dato_Objeto.get(Linea.size() - 1);
                               String n1 = n + "         " +n2 +"              " + n4 + "               " + n3;
                               
                               resultado+="\n"+ n1;
                           } 
                           if(!Linea.isEmpty()){
                               
                               //String n = Linea.get(Linea.size() - 1);
                                    int i = Dato_Objeto.size();
                                    int i2 = Linea.size();
                                    for(int n1 = i2; n1 < i; n1++){
                                        int n = Linea.size();
                                        int m = n + 1;
                               
                                        String n2 = Operador.get(Linea.size());
                              
                                        String n3 = Dato_Fuente.get(Linea.size());
                                        String n4 = Dato_Objeto.get(Linea.size());
                                        String m1 = n2 +"              " + n4 + "               " + n3; 
                                            
                                        resultado+= "\n" + m + "          " + m1;
                                        Linea.add("+1");
                                    }
                               
                           
                               
                           }
                           
                        }
                
                //resultado += "FIN";
                
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
                                    //Primer "=", para asignar un valor a el nuevo id
                                    //Operador.add("=");
                                    Dato_ObjetoF.add(p);
                                    //Dato_Fuente.add("T1");  
                                    resultado += "=" + p;
                                    // AQUI SE AGREGA LO QUE HAY DESPUÉS DEL SIGNO "=" A T1(SE AGREGA A LA COLUMNA QUE LLEVA T1)
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
                            // COMENZAR A TRABAJAR EN LAS SUMAS CON ID PARA CN Y CNE
                                
                                    if(!OA2.isEmpty()){
                                        ID_Aux.add(lexer.lexeme);
                                        // resultado += "buen camino" + t1;
                                        
                                        String n1 = ID_Aux.get(ID_Aux.size() - 1);
                                        resultado += n1;
                                        if(TD1.contains("double")){
                                            if(OA2.contains("*") || OA2.contains("/")){
                                                String p1 = Prefijo.get(Prefijo.size() - 1);
                                                
                                                String p3 = OA2.get(OA2.size() - 1);
                                                Prefijo.add(p3+n1+p1);
                                                String r = Prefijo.get(Prefijo.size() - 1);
                                                OA_AuxE.add(r);
                                                OA_Aux2.add(r);
                                                
                                                Operador.add(p3);
                                                Dato_Fuente.add(p1);
                                                
                                                OA2.set(OA2.size() - 1, "No");
                                                resultado+= r + "\n"; 
                                            }
                                            if(OA2.contains("+") || OA2.contains("-")){
                                                String f = Prefijo.get(Prefijo.size() - 1);
                                                String o = OA2.get(OA2.size() -1);
                                                
                                                Prefijo.add(n1);
                                                OA_AuxE1.add(f);
                                                OA_AuxE.add(o);
                                                
                                                Operador.add(f);
                                                Dato_Fuente.add(o);
                                                
                                                String m = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                                String n = OA_AuxE.get(OA_AuxE.size() - 1);
                                                OA2.set(OA2.size() - 1, "No");
                                                resultado+= m +"       " + n + "\n";
                                                
                                            }    
                                        }
                                        if(TD1.contains("int")){
                                            if(OA2.contains("*") || OA2.contains("/")){
                                                String p1 = Prefijo1.get(Prefijo1.size() - 1);
                                                
                                                String p3 = OA2.get(OA2.size() - 1);
                                                Prefijo1.add(p3+n1+p1);
                                                String r = Prefijo1.get(Prefijo1.size() - 1);
                                                OA3.add(r);
                                                OA_Aux1.add(r);
                                                OA2.set(OA2.size() - 1, "No");
                                                resultado+= r + "\n";
                                            }
                                            if(OA2.contains("*") || OA2.contains("/")){
                                                String f = Prefijo.get(Prefijo.size() - 1);
                                                String o = OA2.get(OA2.size() -1);
                                                
                                                Prefijo.add(n1);
                                                OA3.add(f);
                                                OA4.add(o);
                                            }
                                        }    
                                    }
                                    if(!OL1.isEmpty()){
                                        ID_Aux.add(lexer.lexeme);
                                        
                                    }    

                                
                            
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
                            if(!OR1.isEmpty()){
                                Prefijo.add(lexer.lexeme);
                                if(OL1.isEmpty()){
                            
                                    String m = Prefijo.get(Prefijo.size() - 1);
                                    String l = ID1.get(ID1.size() - 1);
                                    String o = OR1.get(OR1.size() - 1);
                                    OL1.add(o + m + l );
                                    String c = OL1.get(OL1.size() - 1);
                                    resultado+= c + "\n";
                                }else{
                           
                                    String m = Prefijo.get(Prefijo.size() - 1);
                                    String l = ID1.get(ID1.size() - 1);
                                    String o = OR1.get(OR1.size() - 1);
                                    OL1.add(o + m + l );
                                    String g = OL1.get(OL1.size() - 1);
                                    String g1 = OL1.get(OL1.size() - 2);
                                    resultado+= g1 + g + "\n";
                                    
                                }
                            }
                            if(!OA1.isEmpty()){
                                if(OA2.contains("*") || OA2.contains("/")){
                                    String p1 = Prefijo.get(Prefijo.size() - 1);
                                    String p2 = Prefijo.get(Prefijo.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    Prefijo.add(p3+p2+p1);
                                    String r = Prefijo.get(Prefijo.size() - 1);
                                    OA_AuxE.add(r);
                                    OA_Aux2.add(r);
                                    
                                    //IMPORTANTE PARA GENERAR LOS OA CORRECTOS EN LA TABLA
                                    
                                    if(Operador.isEmpty()){
                                        Operador.add("=");
                                    } else {
                                        
                                        
                                        String p31 = OA2.get(OA2.size() - 1);
                                        Operador.add(p31);
                                    }
                                    // FIN DE LA PARTE IMPORTANTE DE LOS OA CORRECTOS
                                    Dato_Fuente.add(p2);
                                    Dato_Fuente2.add(p1);
                                    
                                    OA2.set(OA2.size() - 1, "No");
                                    resultado+= r + "\n";
                                }
                                //Aqui me genera problemas con el ID cuando hago la suma de cne + id
                                if((OA2.contains("+") || OA2.contains("-")) && OA_Aux2.isEmpty()){
                                    String p1 = Prefijo.get(Prefijo.size() - 2);
                                    String p3 = OA2.get(OA2.size() - 1);
                                    OA_AuxE1.add(p3);
                                    OA_AuxE.add(p1);
                                    //IMPORTANTE PARA GENERAR LOS OA CORRECTOS EN LA TABLA
                                    if(Operador.isEmpty()){
                                        Operador.add("=");
                                    } else {
                                        String p31 = OA_AuxE1.get(OA_AuxE1.size() - 2);
                                        Operador.add(p31);
                                    }
                                    // FIN DE LA PARTE IMPORTANTE DE LOS OA CORRECTOS
                                    Dato_Fuente.add(p1);
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
                                        
                                        Operador.add(p3);
                                        Dato_Fuente.add(p1);
                                        
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
                                        
                                        Operador.add(p3);
                                        Dato_Fuente.add(p1);
                                        //Dato_Objeto.add("T1");
                                        
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
                            if(!OR1.isEmpty()){
                                Prefijo.add(lexer.lexeme);
                            }
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
                                        
                                        /*
                                        String p4 = OA_AuxE.get(OA_AuxE.size() - 1);
                                        if(p4 != "YA_No"){
                                            Dato_Fuente.add(p2);
                                            Operador.add(p3);
                                        }
                                        */    
                                        
                                        
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No-"); 
                                    }
                                    if((m != 0 && m != 0) && n > m){
                                        int n1 = m;
                                        
                                        String p1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                        String p2 = OA_AuxE.get(OA_AuxE.size() - 2);
                                        String p3 = "+";
                                        OA_AuxE.add(p3+p1+p2);
                                        
                                        Dato_Fuente.add(p2);
                                        Operador.add(p3);
                                        
                                        String r = OA_AuxE.get(OA_AuxE.size() - 1);
                                        Prefijo.add(r);
                                        resultado+= r + "\n";
                                        OA_AuxE1.set(n1, "YA_No+");
                                    }
                                    
                                }
                                if(!OA_AuxE1.contains("+") && !OA_AuxE1.contains("-")){
                                    String f1 = OA_AuxE.get(OA_AuxE.size() - 1);
                                    Prefijo.add(f1);
                                    String i2 = PrefijoF.get(PrefijoF.size() -1);
                                    resultado+= "=" + i2 + " " + f1;
                                    
                                    /*
                                    Dato_Fuente.add(f1);
                                    Operador.add(i2);
                                    */
                                    String r = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                    if(r == "YA_No+"){
                                        Operador.add("+");
                                    } else{
                                        Operador.add("-");
                                    }
                                    //Dato_Fuente.add("T1");
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
                                        /*
                                        String f12 = OA_AuxE1.get(OA_AuxE1.size() - 1);
                                        Dato_Fuente.add(f1);
                                        Operador.add(f12);
                                        */
                                        //Dato_Fuente.add(i2);
                                        Dato_Objeto.add(i2);
                                        Operador.add(f1);
                                        
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
                            
                            //REVISAR QUE PASA AQUÍ
                            //String pr = OA_Aux1.get(OA_Aux1.size() - 1);
                            //OA3.add(pr);
                            
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
                                    //    int n11 = m;
                                        
                                        String p1 = OA3.get(OA3.size() - 1);
                                        String p2 = OA3.get(OA3.size() - 2);
                                        String p3 = "+";
                                        OA3.add(p3+p1+p2);
                                        String r = OA3.get(OA3.size() - 1);
                                        Prefijo1.add(r);
                                        resultado+= r + "\n";
                                    //    OA4.set(n11, "YA_No");
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
                                        OA2.clear();
                                }
                            }
                                    
                            
                            
                        }
                        
                        //Cambiar de lugar, esta comparación no se debe de hacer solo en el caso de separador

                        //Esto "Esta bien"
                        if(OA_AuxE1.isEmpty()){
                          String i = PrefijoF.get(PrefijoF.size() -1);
                          //String p2 = OA2.get(OA2.size() -1);
                          Dato_Fuente.add(p);
                          //Operador.add(p2);
                          
                          Operador.add("=");
                          Dato_Fuente.add("T1");
                          resultado+= "\n" + "=" + i + p;
                              
                        }
                        
                        break;
                    case OL:
                        if(!OL1.isEmpty()){
                            OL1.add(lexer.lexeme);
                            int n = OL1.size();
                            if(n == 2){
                                String m = OL1.get(OL1.size() - 1);
                                String m2 = OL1.get(OL1.size() - 2);
                                OL1.add(m + m2);
                                //resultado+= m + "Flag\n"; 
                                resultado+= m + m2 + "\n";
                            }
                            
                        }
                        
                        break;
                    case OR:
                        
                        OR1.add(lexer.lexeme);
                        
                        break;
                    case DEL:
                        if(!OL1.isEmpty() && !OR1.isEmpty()){
                            OL1.clear();
                            OR1.clear();
                            
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
