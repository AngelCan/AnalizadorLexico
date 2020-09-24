/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import codigo.Contador;
import codigo.Semantico;
import java.util.ArrayList;

/**
 *
 * @author angel-can
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Entrada2txt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Salidatxt = new javax.swing.JTextArea();
        btnAnalizar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Salidatxt1 = new javax.swing.JTextArea();
        btnAnalizar2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Prueba = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Entrada2txt.setColumns(20);
        Entrada2txt.setRows(5);
        jScrollPane1.setViewportView(Entrada2txt);

        Salidatxt.setColumns(20);
        Salidatxt.setRows(5);
        jScrollPane2.setViewportView(Salidatxt);

        btnAnalizar1.setText("Mostrar Tabla de simbolos");
        btnAnalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizar1ActionPerformed(evt);
            }
        });

        Salidatxt1.setColumns(20);
        Salidatxt1.setRows(5);
        jScrollPane3.setViewportView(Salidatxt1);

        btnAnalizar2.setText("Analizar");
        btnAnalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizar2ActionPerformed(evt);
            }
        });

        Prueba.setColumns(20);
        Prueba.setRows(5);
        jScrollPane4.setViewportView(Prueba);

        jLabel1.setText("Analizador Lexico");

        jButton1.setText("Mostrar Tabla de error");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Escriba lo que desea analizar aquí");

        jLabel3.setText("Tabla de tokens");

        jLabel4.setText("Tabla de simbolos");

        jLabel5.setText("Tabla de error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnalizar2)
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(btnAnalizar1)))
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel5)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAnalizar1)
                    .addComponent(btnAnalizar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizar1ActionPerformed
        File archivo = new File("Entrada2.txt");
        
        PrintWriter escribir;
        
        ArrayList<String> TD1 = new ArrayList<String>();
        ArrayList<String> ID1 = new ArrayList<String>();
        ArrayList<String> IC1 = new ArrayList<String>();
        ArrayList<String> IR1 = new ArrayList<String>();
        ArrayList<String> OA1 = new ArrayList<String>();
        ArrayList<String> DEL1 = new ArrayList<String>();
        ArrayList<String> SEP1 = new ArrayList<String>();
        ArrayList<String> OL1 = new ArrayList<String>();
        ArrayList<String> OR1 = new ArrayList<String>();
        ArrayList<String> CN1 = new ArrayList<String>();
        
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(Entrada2txt.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("Entrada2.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "Token         Lexema         Tipo de dato\n"+"";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    Salidatxt.setText(resultado);
                    return;
                }
                
                switch (tokens) {
                    case JPM:
                        resultado += "";
                        break;
                    case AS: 
                    resultado += tokens + "1                " + "=" + "\n";
                    break;
                        case ID:
                        if(ID1.isEmpty()){
                        ID1.add(lexer.lexeme);
                        resultado += "ID" + ID1.size() + "               " + lexer.lexeme  + "\n";
                        }
                        else{
                            if(!ID1.contains(lexer.lexeme)){
                            ID1.add(lexer.lexeme);
                            // FALTA OBTENER EL TIPO DE DATO DEL ID
                            // String c = TD1.get(TD1.size() - 1);
                            resultado += "ID" + ID1.size() + "               " + lexer.lexeme +  "         "  +   "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                        case TD:
                        if(TD1.isEmpty()){
                        TD1.add(lexer.lexeme);
                        resultado += "TD" + TD1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!TD1.contains(lexer.lexeme)){
                            TD1.add(lexer.lexeme);
                            resultado += "TD" + TD1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case IC:
                        if(IC1.isEmpty()){
                        IC1.add(lexer.lexeme);
                        resultado += "IC" + IC1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!IC1.contains(lexer.lexeme)){
                            IC1.add(lexer.lexeme);
                            resultado += "IC" + IC1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;    
                    case IR:
                        if(IR1.isEmpty()){
                        IR1.add(lexer.lexeme);
                        resultado += "IR" + IR1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!IR1.contains(lexer.lexeme)){
                            IR1.add(lexer.lexeme);
                            resultado += "IR" + IR1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case OA:
                        if(OA1.isEmpty()){
                        OA1.add(lexer.lexeme);
                        resultado += "OA" + OA1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!OA1.contains(lexer.lexeme)){
                            OA1.add(lexer.lexeme);
                            resultado += "TD" + OA1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case DEL:
                        if(DEL1.isEmpty()){
                        DEL1.add(lexer.lexeme);
                        resultado += "DEL" + DEL1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!DEL1.contains(lexer.lexeme)){
                            DEL1.add(lexer.lexeme);
                            resultado += "DEL" + DEL1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case SEP:
                        if(SEP1.isEmpty()){
                        SEP1.add(lexer.lexeme);
                        resultado += "SEP" + SEP1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!SEP1.contains(lexer.lexeme)){
                            SEP1.add(lexer.lexeme);
                            resultado += "SEP" + SEP1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case OL:
                        if(OL1.isEmpty()){
                        OL1.add(lexer.lexeme);
                        resultado += "OL" + OL1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!OL1.contains(lexer.lexeme)){
                            OL1.add(lexer.lexeme);
                            resultado += "OL" + OL1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case OR:
                        if(OR1.isEmpty()){
                        OR1.add(lexer.lexeme);
                        resultado += "OR" + OR1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!OR1.contains(lexer.lexeme)){
                            OR1.add(lexer.lexeme);
                            resultado += "OR" + OR1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;
                    case CN:
                        if(CN1.isEmpty()){
                        CN1.add(lexer.lexeme);
                        resultado += "CN" + CN1.size() + "               " + lexer.lexeme + "\n";
                        }
                        else{
                            if(!CN1.contains(lexer.lexeme)){
                            CN1.add(lexer.lexeme);
                            resultado += "CN" + CN1.size() + "               " + lexer.lexeme + "\n";
                            }
                            else{
                            
                            }
                        } 
                        break;    
                    default:
                    resultado += tokens + "               " + lexer.lexeme + "\n";
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizar1ActionPerformed

    private void btnAnalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizar2ActionPerformed
        File archivo = new File("Tokens.txt");
        
        PrintWriter escribir;
        
        ArrayList<String> TD1 = new ArrayList<String>();
        ArrayList<String> ID1 = new ArrayList<String>();
        ArrayList<String> IC1 = new ArrayList<String>();
        ArrayList<String> IR1 = new ArrayList<String>();
        ArrayList<String> OA1 = new ArrayList<String>();
        ArrayList<String> DEL1 = new ArrayList<String>();
        ArrayList<String> SEP1 = new ArrayList<String>();
        ArrayList<String> OL1 = new ArrayList<String>();
        ArrayList<String> OR1 = new ArrayList<String>();
        ArrayList<String> CN1 = new ArrayList<String>();
        
        
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(Entrada2txt.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("Tokens.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "\nFIN";
                    Salidatxt1.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                    resultado += "Simbolo no definido\n";
                    break;
                    case ID:
                        if(ID1.isEmpty()){
                        ID1.add(lexer.lexeme);
                        resultado += "ID" + ID1.size() + " ";
                        }
                        else{
                            if(!ID1.contains(lexer.lexeme)){
                            ID1.add(lexer.lexeme);
                            resultado += "ID" + ID1.size() + " ";
                            }
                            else{
                            int P = ID1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "ID" + P + " ";
                            }
                        } 
                        break;
                    case TD:
                        if(TD1.isEmpty()){
                        TD1.add(lexer.lexeme);
                        resultado += "TD" + TD1.size() + " ";
                        }
                        else{
                            if(!TD1.contains(lexer.lexeme)){
                            TD1.add(lexer.lexeme);
                            resultado += "TD" + TD1.size() + " ";
                            }
                            else{
                                int P = TD1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "TD" + P + " ";
                            }
                        } 
                        break;
                    case IC:
                        if(IC1.isEmpty()){
                        IC1.add(lexer.lexeme);
                        resultado += "IC" + IC1.size() + " ";
                        }
                        else{
                            if(!IC1.contains(lexer.lexeme)){
                            IC1.add(lexer.lexeme);
                            resultado += "IC" + IC1.size() + " ";
                            }
                            else{
                                int P = IC1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "IC" + P + " ";
                            }
                        } 
                        break;
                    case IR:
                        if(IR1.isEmpty()){
                        IR1.add(lexer.lexeme);
                        resultado += "IR" + IR1.size() + " ";
                        }
                        else{
                            if(!IR1.contains(lexer.lexeme)){
                            IR1.add(lexer.lexeme);
                            resultado += "IR" + IR1.size() + " ";
                            }
                            else{
                                int P = IR1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "IR" + P + " ";
                            }
                        } 
                        break;
                    case OA:
                        if(OA1.isEmpty()){
                        OA1.add(lexer.lexeme);
                        resultado += "OA" + OA1.size() + " ";
                        }
                        else{
                            if(!OA1.contains(lexer.lexeme)){
                            OA1.add(lexer.lexeme);
                            resultado += "OA" + OA1.size() + " ";
                            }
                            else{
                                int P = OA1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "OA" + P + " ";
                            }
                        } 
                        break;
                    case DEL:
                        if(DEL1.isEmpty()){
                        DEL1.add(lexer.lexeme);
                        resultado += "DEL" + DEL1.size() + " ";
                        }
                        else{
                            if(!DEL1.contains(lexer.lexeme)){
                            DEL1.add(lexer.lexeme);
                            resultado += "DEL" + DEL1.size() + " ";
                            }
                            else{
                                int P = DEL1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "DEL" + P + " ";
                            }
                        } 
                        break;
                    case SEP:
                        if(SEP1.isEmpty()){
                        SEP1.add(lexer.lexeme);
                        resultado += "SEP" + SEP1.size() + " ";
                        }
                        else{
                            if(!SEP1.contains(lexer.lexeme)){
                            SEP1.add(lexer.lexeme);
                            resultado += "SEP" + SEP1.size() + " ";
                            }
                            else{
                                int P = SEP1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "SEP" + P + " ";
                            }
                        } 
                        break;
                    case OL:
                        if(OL1.isEmpty()){
                        OL1.add(lexer.lexeme);
                        resultado += "OL" + OL1.size() + " ";
                        }
                        else{
                            if(!OL1.contains(lexer.lexeme)){
                            OL1.add(lexer.lexeme);
                            resultado += "OL" + OL1.size() + " ";
                            }
                            else{
                                int P = OL1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "OL" + P + " ";
                            }
                        } 
                        break;
                    case OR:
                        if(OR1.isEmpty()){
                        OR1.add(lexer.lexeme);
                        resultado += "OR" + OR1.size() + " ";
                        }
                        else{
                            if(!OR1.contains(lexer.lexeme)){
                            OR1.add(lexer.lexeme);
                            resultado += "OR" + OR1.size() + " ";
                            }
                            else{
                                int P = OR1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "OR" + P + " ";
                            }
                        } 
                        break;
                    case CN:
                        if(CN1.isEmpty()){
                        CN1.add(lexer.lexeme);
                        resultado += "CN" + CN1.size() + " ";
                        }
                        else{
                            if(!CN1.contains(lexer.lexeme)){
                            CN1.add(lexer.lexeme);
                            resultado += "CN" + CN1.size() + " ";
                            }
                            else{
                                int P = CN1.lastIndexOf(lexer.lexeme) + 1;
                            resultado += "CN" + P + " ";
                            }
                        } 
                        break;
                    case JPM:
                    resultado += "\n";
                    break;
                    default:
                    resultado += tokens + " ";
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File archivo = new File("TokensP.txt");
        ArrayList<String> Cont = new ArrayList<String>();
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(Entrada2txt.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("TokensP.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "TOKEN ERROR            LEXEMA      LINEA       DESCRIPCION\n";
            while (true) {
                Tokens tokens = lexer.yylex();
                
                if (tokens == null) {
                    resultado += "FIN";
                    Prueba.setText(resultado);
                    return;
                }
                
                switch (tokens) {
                    case ERROR:
                    resultado += "Simbolo no definido\n";
                    break;
                    case JPM:
                        Cont.add("linea");
                    resultado += "\n";
                    break;                                                                
                    case ERID:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "ID incorrecto\n";
                        break;
                    case ERCNE:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "CNE incorrecto\n";
                        break;                   
                    case ERSEP:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "uso de separadores incorrecto\n";
                        break;                    
                    case ERAS:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "uso de asignador incorrecto\n";
                        break;                                           
                    case EROA:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "operadores aritmeticos incorrectos\n";
                        break;                                            
                    case ERTD:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "NO se permiten dos tipos de datos juntos\n";
                        break;
                    case EROR:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "operadores relacionaes incorrectos\n";
                        break;
                    case ERIR:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "NO se permiten dos IR juntos\n";
                        break;
                    case ERIC:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "NO se permiten dos IC juntos\n";
                        break;
                    case ERDEL:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "Error en delimitadores\n";
                    break;
                    case IDERS:
                        resultado += tokens + "                      " + lexer.lexeme + "         " + "linea " +  Cont.size() + "       " + "Error en la declaracion de ID\n";
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Entrada2txt;
    private javax.swing.JTextArea Prueba;
    private javax.swing.JTextArea Salidatxt;
    private javax.swing.JTextArea Salidatxt1;
    private javax.swing.JButton btnAnalizar1;
    private javax.swing.JButton btnAnalizar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
