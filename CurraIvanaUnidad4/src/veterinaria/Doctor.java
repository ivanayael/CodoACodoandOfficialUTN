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

public class Doctor {
    private String nombre;
    private int CantAtencion=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantAtencion() {
        return CantAtencion;
    }

    public void setCantAtencion(int CantAtencion) {
        this.CantAtencion = CantAtencion;
    }
    
    
    public Doctor(String nombre) {
        super();
        this.nombre = nombre;
    }
    
    public void setAtencion(Mascota mascota, String causa_de_atencion, String[] causas, String[] medicamentos ){
        if(this.CantAtencion <= 5){
            mascota.setAtencion(new Atencion(causa_de_atencion,causas,medicamentos));
            this.CantAtencion++;
            System.out.println("La mascota " + mascota.getNombre()+ " fué atendida por el doctor: " +this.nombre);
        } else {
            System.out.println("Este doctor no puede atender a más mascotas");
        }
    }
}