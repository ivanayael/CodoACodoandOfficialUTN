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
 * 8. Programa que calcula el volumen de una esfera.
 */
public class Ejercicio8 {
     public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        double dRadioEsfera = 0;
        double dAreaEsfera = 0;
        System.out.println("Ingrese el valor del radio de la esfera o precione 0 para salir");
        dRadioEsfera = s.nextDouble();
        if (dRadioEsfera > 0){
            dAreaEsfera = (4/3)*(Math.PI)*(Math.pow(dRadioEsfera,3));
            System.out.println("la circunferencia ingresada de un radio de " + dRadioEsfera);
            System.out.println("tiene un área de circuferencia de " + dAreaEsfera);
        }
    }
}
