/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad6;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static String mensaje; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");  
        try {
            System.out.println("Instrucción 1.");  
            // Convierte un valor de tipo String a int
            mensaje = String.format(mensaje, "000.000.000");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage() + " Mensaje: "  + mensaje );
        } finally { 
            System.out.println("Instrucciones a ejecutar tanto si aparecen errores como si no.");
        } 
    }
}
