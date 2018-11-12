/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        boolean continuar = true; 
        while(continuar) {        
            try {                
                System.out.print("Ingrese un número entero para determinar par o impar: ");
                InputStreamReader numeroIng = new InputStreamReader(System.in);
                BufferedReader dato = new BufferedReader(numeroIng);
                
                String lectura = dato.readLine();
                int numero = Integer.parseInt(lectura);
                
                if( numero%2==0 ){
                    System.out.println("El Número " + numero + " es par");
                } else {
                    System.out.println("El Número " + numero + " no es par");
                }
                continuar = false;
            } catch(Exception e) {
                System.out.println(e.getMessage());                
           }            
       }        
    }
}


