/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *2. Programa que lea un número entero y muestre si el número es múltiplo de 10.
 * @author Ivana Yael Currá
 */
public class Ejercicio2 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
      
        int iMultiplo = 10;
        int iNumero = 0;
        int resto = 0;
        System.out.println("Ingrese un numero o precione 0 para salir");
        iNumero = s.nextInt();
        if (iNumero != 0){
            resto = iNumero%iMultiplo;
            if (resto==0) {
               System.out.println(iNumero + " es múltiplo de " + iMultiplo);
            } else {
               System.out.println(iNumero + " NO es múltiplo de " + iMultiplo);
            }   
        }
    }
}
