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
 * 4. Programa que lea una cantidad de 
 * grados centígrados y la pase a grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 */

public class Ejercicio4 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        float fGradosCentigrados = 0;
        float fGradosFahrenheit = 0;
        System.out.println("Ingrese los grados centígrados para pasarlos a grados Fahrenheit o precione 0 para salir");
        fGradosCentigrados = s.nextFloat();
        if (fGradosCentigrados > 0){
            fGradosFahrenheit = 32 + (( 9 * fGradosCentigrados) / 5);
            System.out.println("los " + fGradosCentigrados + "°C son " + fGradosFahrenheit + "°F");
        }
    }
}
