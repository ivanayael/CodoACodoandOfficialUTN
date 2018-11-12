/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad5;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre = "";
    private  int edad = 0;
    private String DNI = "";
    private char sexo = 'H';
    
    Persona(){
    }
    
    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
    }

    Persona(String nombre, int edad, String DNI, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean esMayorDeEdad(){
        boolean mayor;
        mayor = edad >= 18;
        return mayor;
    }
    
    public String generarDNI(){
        Random rnd = new Random();
        for(int i = 1; i<=8; i++)
            DNI = DNI + rnd.nextInt(9-0+1);
        return DNI;
    }  
    
    private char comprobarSexo(char sexo){
      char ingreso = 'M';
      if (ingreso == sexo){
          sexo = 'M';
      } else {
          sexo = 'H';
      }
      return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + '}';
    }


}