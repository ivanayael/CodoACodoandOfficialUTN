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
public class Ejercicio9 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        double dCateto1 = 0;
        double dCateto2 = 0;
        double dArea = 0;
        System.out.println("Ingrese la base del triángulo o cero para salir");
        dCateto1 = s.nextDouble();
        System.out.println("Ingrese la altura del triángulo o  cero para salir");
        dCateto2 = s.nextDouble();
        if (dCateto1 > 0 || dCateto2 > 0){
            dArea = ((dCateto1 * dCateto2)/2);
            System.out.println("el triangulo con la base " + dCateto1 + " y la altura " + dCateto2 + " tiene un área de " + (double)dArea + ".");
        }
    }
}
