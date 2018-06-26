/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 *
 * @author currai
 */
public class Ejercicio12 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        String N;
        System.out.println("Ingrese un numero entero de cinco cifras o cero para salir");
        N = s.nextLine();
        if (N.equals("0")) {
        } else {
            if (N.length() == 5){
                  char [] deCadena = N.toCharArray();
                  for (int i = deCadena.length-1; i >= 0; i--) {
                      System.out.println("El número " + deCadena[i] + " ocupa la posición " + i + ".");
                  }
            } else {
                System.out.println("El número no tiene 5 cifras");
            }
        }
    }
}
