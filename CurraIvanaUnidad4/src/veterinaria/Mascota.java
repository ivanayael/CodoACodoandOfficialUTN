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
public class Mascota {
    
    private String nombre;
    private String tipo;  
    private String raza;    
    private int edad;
    private String causa_de_atencion;
    private Atencion atencion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCausa_de_atencion() {
        return causa_de_atencion;
    }

    public void setCausa_de_atencion(String causa_de_atencion) {
        this.causa_de_atencion = causa_de_atencion;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

    public Mascota(String nombre, String tipo, String raza, int edad, String causa_de_atencion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.causa_de_atencion = causa_de_atencion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipo=" + tipo + ", raza=" + raza + ", edad=" + edad + ", causa_de_atencion=" + causa_de_atencion + '}';
    }
    
}