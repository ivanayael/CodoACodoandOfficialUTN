/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author currai
 */


public class Veterinaria {
   
    private int mascotaIngresada=0;
    private int cantDoctores=0;
    private final Mascota[] listaMascotas = new Mascota[20];
    private final Doctor[] listaDoctores = new Doctor[5];
   
    
    public void setMascota(String nombre, String tipo, String raza, int edad, String causa_de_atencion){
        if( mascotaIngresada < 20){
            this.listaMascotas[this.mascotaIngresada]= new Mascota(nombre,tipo,raza,edad,causa_de_atencion);
            this.mascotaIngresada++;
        } else {
            System.out.println("No pueden ingresar más mascotas en este día");
        }
    }
    public void setMedico(String nombre){
        if(cantDoctores < 5){
            this.listaDoctores[this.cantDoctores]= new Doctor(nombre);
            this.cantDoctores++;
        } else { 
            System.out.println("Los doctores no pueden atender más mascotas");
        }
    }
    
	
    public void setAtencion(int numeroDoctor,int numeroMascota,String resultado_revisacion, String[] causas, String[] medicamentos) {
    listaDoctores[numeroDoctor].setAtencion(listaMascotas[numeroMascota],resultado_revisacion,causas,medicamentos);
    }
    
    
    public void getAnimalesAtendidosPorMedico(int numeroDoctor){
        System.out.println("El doctor " +  listaDoctores[numeroDoctor].getNombre() +  " atendió: " + listaDoctores[numeroDoctor].getCantAtencion());
    }
}
