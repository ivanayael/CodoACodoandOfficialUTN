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
 * 
 * Programa que pase una velocidad en Km/h a m/s.
 * La velocidad se lee por teclado.
 */
public class Ejercicio6 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        double dKilometrosHora = 0;
        double dMentrosSegundo = 0;
        System.out.println("Ingrese la velocidad en Km/h o precione 0 para salir");
        dKilometrosHora = s.nextDouble();
        if (dKilometrosHora > 0){
            dMentrosSegundo = (dKilometrosHora * 5) / 18;
            System.out.println("Los " + dKilometrosHora + " Km/h son " + dMentrosSegundo + " m/s");
        }
    }
}
