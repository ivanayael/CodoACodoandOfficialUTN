/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *
 * @author currai
 */
public class Ejercicio8 { 
     public static Scanner s = new Scanner (System.in);
      
      public static void main(String[] args) {
       
        int iNumero1 = 0;
        int iNumero2 = 0;
        int iNumero3 = 0;
        int iResultado = 0;
        System.out.println("Ingrese el primer número");
        iNumero1 = s.nextInt();
        System.out.println("Ingrese el segundo número");
        iNumero2 = s.nextInt();
        System.out.println("Ingrese el tercer número");
        iNumero3 = s.nextInt();
        try {
            if (iNumero1 == iNumero2 && iNumero1 == iNumero3 && iNumero2 == iNumero3) {
                System.out.println("Todos los números ingresados son iguales");
            } else {
                if (iNumero1 == iNumero2) {
                    System.out.println("El primer y el segundo numero son iguales");
                } else if (iNumero1 == iNumero3) {
                    System.out.println("El primer y el tercer numero son iguales");
                } else if (iNumero2 == iNumero3) {
                    System.out.println("El segundo y el tercer numero son iguales");
                } else if (iNumero1 > iNumero2) {
                    iResultado = iNumero1;
                    if (iNumero1 > iNumero3) {
                        iResultado = iNumero1;
                    } else {
                        iResultado = iNumero3;
                    }
                } else if (iNumero2 > iNumero3) {
                    iResultado = iNumero2;
                } else {
                    iResultado = iNumero3;
                }
            }
        } catch (NullPointerException ex) {
            iResultado = 0;
            System.out.println("ERROR: Valor nulo. Detalle: " + ex.getMessage());
        }
        finally {
            if (iResultado != 0){
                System.out.println("El número más grande es: " + iResultado);
            }
        }
    }
}