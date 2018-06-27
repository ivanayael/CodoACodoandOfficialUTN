/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 * 11. Programa que lea un número entero N de 5 cifras 
 * y muestre sus cifras desde el principio como en el ejemplo.
 * @author Ivana Yael Currá
 * 
 */
public class Ejercicio11 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        String N;
        System.out.println("Ingrese un numero entero de cinco cifras o cero para salir");
        N = s.nextLine();
        System.out.println(N.length());
        if (N.equals("0")) {
        } else {
            if (N.length() == 5){
                  char [] deCadena = N.toCharArray();
                  for (int i = 0; i < deCadena.length; i++) {
                      System.out.println("El número " + deCadena[i] + " ocupa la posición " + i + ".");
                  }
            } else {
                System.out.println("El número no tiene 5 cifras");
            }
        }
    }
}
