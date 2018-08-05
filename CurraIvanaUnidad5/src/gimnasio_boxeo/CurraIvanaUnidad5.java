/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio_boxeo;

import java.util.Scanner;
/**
 *
 * @author currai
 */
public class CurraIvanaUnidad5 {

    /**
     */
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema del gimnasio");
       
        int cantMaxBoxeadores = 20;
        int cantMaxEntrenadores = 4;
       
        String nombre;
        String peso;
        String nombreEntrenador;
        
        Gimnasio gimnasio= new Gimnasio();
        
        System.out.println("Escriba el nombre de cada entrenador y precione enter:");
        for (int j = 0; j < cantMaxEntrenadores; j++) {
             nombreEntrenador = s.nextLine();
             gimnasio.setEntrenador(nombreEntrenador);
         }
        
        try {
             for (int i = 0; i < cantMaxBoxeadores; i++) 
             {
                 System.out.println("Ingreso el nuevo boxeador para pesaje");
                 System.out.println("--------------------------------------");
                 System.out.println("Nombre:");
                 nombre = s.nextLine();
                 System.out.println("Peso:");
                 peso = s.nextLine();
                 gimnasio.setBoxeador(nombre, peso);
                 gimnasio.setAsignacion(i, peso);
             }
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Error numerico " + ex.getMessage());
        }
   
         for (int z = 0; z < cantMaxEntrenadores; z++) {
             gimnasio.getBoxeadoresAtendidosPorEntrenador(z);
         }
         
         gimnasio.getBoxeadoresAtendidosTotales();
    } 
}
