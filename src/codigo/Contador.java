/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.util.Scanner;
/**
 *
 * @author angel-can
 */
public class Contador {
    private int cont;

    //constructor por defecto
    public Contador() {
    }

    //constructor con parámetros
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //constructor copia
    public Contador(final Contador c) {                                                                           
        cont = c.cont;
    }

    //getter
    public int getCont() {
        return cont;
    }

    //setter
    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //método incrementar contador
    public void incrementar() {
        cont++;
    }
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        String n = null;
        
        if(n == "\n"){
        //incrementar el contador
        contador1.incrementar();
        }        
    //mostrar el valor actual
    System.out.println(contador1.getCont());    
    }
}
