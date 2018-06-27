/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 *5. Programa que lee por teclado el valor del radio de una circunferencia 
 * y calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * Longitud de la circunferencia = 2*PI*Radio, 
 * Area de la circunferencia = PI*Radio^2
 * @author Ivana Yael Currá
 */
public class Ejercicio5 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
 
        double dRadioCirculo = 0;
        double dLogintudCirculo= 0;
        double dAreaCirculo = 0;
        System.out.println("Ingrese el valor del radio de la circunferencia o precione 0 para salir");
        dRadioCirculo = s.nextDouble();
        if (dRadioCirculo > 0){
            dLogintudCirculo = 2*Math.PI* dRadioCirculo;
            dAreaCirculo = Math.PI*Math.pow(dRadioCirculo,2);
            System.out.println("la circunferencia ingresada de un radio de " + dRadioCirculo);
            System.out.println("tiene una logintud de circuferencia de " + dLogintudCirculo);
            System.out.println("y un área de circuferencia de " + dAreaCirculo + ".");
        }
    }
    
}
