/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 *
 * @author Ivana Yael Curra
 */
public class Ejercicio3 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        int Numero1 = 0;
        int eldoble = 0;
        int eltriple = 0;
        System.out.println("Ingrese un número entero para duplicar y triplicar o precione 0 para salir");
        Numero1 = s.nextInt();
        if (Numero1 > 0){
            eldoble = Numero1 * 2;
            eltriple = Numero1 * 3;
            System.out.println("El double del número ingresado es " + eldoble);
            System.out.println("El triple del número ingresado es " + eltriple);
        }
    }
   
}
