/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 * 4. Programa que lea dos caracteres por teclado y compruebe si son iguales.
 * @author currai
 */
public class Ejercicio4 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
      
        String sIngreso1;
        String sIngreso2;
        System.out.println("Ingrese un caracter o escriba 0 para salir");
        sIngreso1 = s.nextLine();
        char c1 = sIngreso1.charAt(0);
        System.out.println("Ingrese un caracter o escriba 0 para salir");
        sIngreso2 = s.nextLine();
        char c2 = sIngreso2.charAt(0);
        if (!sIngreso1.equals("0") && !sIngreso2.equals("0")){
            if (sIngreso1.equals(sIngreso2)) {
                System.out.println("Las cadenas concuerdan.");
            } else {   
                System.out.println("Las cadenas no concuerdan.");
            }
            
            int iComparaCaracter;  
            iComparaCaracter = Character.compare(c2, c1);
            if( iComparaCaracter == 0 ) {
                System.out.println("Los caracteres "+ c1 + " y " +c2+ " son iguales.");
            } else if( iComparaCaracter > 0 ) {
                System.out.println("El primer caracter "+ c1 +" es numéricamente mayor que el segundo caracter " +c2+ ".");
            } else if( iComparaCaracter < 0 ) {
                System.out.println("El segundo caracter "+ c2 +" es numéricamente menor que el primer caracter " +c1 + ".");
            }      
        }
   }
}
