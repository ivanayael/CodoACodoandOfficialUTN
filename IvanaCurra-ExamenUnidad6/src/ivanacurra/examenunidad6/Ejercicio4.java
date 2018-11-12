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

// A Class that represents use-defined expception 
class MiExcepcion extends Exception 
{ 
    private String mensaje;
    public MiExcepcion(String mensaje) {
       this.mensaje = mensaje;
    }
    public String getMensaje() {
      return mensaje;
    }
} 
  

public class Ejercicio4 {

     public static void main(String args[]) 
    { 
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");  
        try
        { 
            String mensaje = "Hola Excepcion en Java";
            if (!mensaje.equals("Hola sin Excepcion")){
                throw new MiExcepcion("No es aceptable"); 
            }           
        } 
        catch (MiExcepcion e) 
        { 
            // Print the message from MyException object 
            System.out.println("excepción: " + e.getMensaje()); 
        } 
        finally{
             System.out.println("Instrucciones a ejecutar tanto si aparecen errores como si no.");
        }
    } 
}
