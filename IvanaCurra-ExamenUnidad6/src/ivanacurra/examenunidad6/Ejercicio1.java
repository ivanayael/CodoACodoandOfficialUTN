/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad6;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");  
        try {
            System.out.println("Instrucción 1.");  
            // Convierte un valor de tipo String a int
            int numero = Integer.parseInt("123");
        
            System.out.println("Instrucción 2.");  
            int numero2 = numero + 456;
            
            System.out.println("Instrucción 3, etc");  
            String cadena = String.valueOf(numero2);
        } catch(Exception e) {
            System.out.println("Intruccion a ejecutar si se produce un error");
        } finally { 
            System.out.println("Instrucciones a ejecutar tanto si aparecen errores como si no");
        } 
    }
    
}
