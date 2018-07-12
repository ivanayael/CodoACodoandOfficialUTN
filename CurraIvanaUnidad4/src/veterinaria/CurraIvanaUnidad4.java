/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.Scanner;
/**
 *
 * @author currai
 */
public class CurraIvanaUnidad4 {

    /**
     */
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema de la veterinaria");
       
        int cantMaxMascotas = 20;
        int cantMaxDoctores = 5;
       
        String tipo;
        String diagnostico_temprano;
        String raza;
        String nombre;
        String edad;
        String resultado_revisacion;
        String causas;
        String medicamentos;
        String nombreMedico;
        
        Veterinaria veterinaria= new Veterinaria();
        
            for (int i = 0; i < cantMaxMascotas; i++) {
                System.out.println("Ingreso de nueva mascota para atender");
                System.out.println("------------------------");
                System.out.println("Nombre:");
                nombre = s.nextLine();
                do{
                    System.out.println("Tipo (perro, gato o conejo):");
                    tipo = s.nextLine();
                } while (!tipo.equals("perro") && !tipo.equals("gato") && !tipo.equals("conejo"));
                System.out.println("Raza:");
                raza = s.nextLine();
                System.out.println("Edad:");
                edad = s.nextLine();
                System.out.println("Causa de Atención:");
                diagnostico_temprano = s.nextLine();
                
                veterinaria.setMascota(nombre, tipo, raza, Integer.parseInt(edad), diagnostico_temprano);
                for (int j = 0; j < cantMaxDoctores; j++) {
                    System.out.println("Escriba el nombre del doctor que la va a atender:");
                    nombreMedico = s.nextLine();
                    veterinaria.setMedico(nombreMedico);
                    System.out.println("El resultado de la revisación es:");
                    resultado_revisacion = s.nextLine();
                    System.out.println("Causas:");
                    causas = s.nextLine();    
                    System.out.println("Medicamentos:");
                    medicamentos = s.nextLine();
                
                    veterinaria.setAtencion(i,j, resultado_revisacion , new String[]{causas}, new String[]{medicamentos});
                }
            }
            for (int z = 0; z < cantMaxDoctores; z++) {
              veterinaria.getAnimalesAtendidosPorMedico(z);
            }
    } 
}
