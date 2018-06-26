/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 * 1. Programa Java que lea un número entero y calcule si es par o impar.
 * @author currai
 */
public class Ejercicio1 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero o precione 0 para salir");
        int iNumero = s.nextInt();
        if (iNumero != 0){
            if( iNumero%2==0 ){
                System.out.println(iNumero+ " es un número par");
            } else {
                System.out.println(iNumero+ " es un número impar");
            }   
        }
    }
}
