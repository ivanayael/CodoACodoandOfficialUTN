/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_Estructura_Iterativa_o_Repetitiva;

/**
 *5. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while 
 * @author Ivana Yael Currá
 */
public class Ejercicio5 {
    public static void main(String[] args) {
         int i = 100;
         System.out.println("Numeros del 100 al 1: ");
         do{
             System.out.println(i);
             i--;
         }while(i>=1);
    }
}
