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
public class Ejercicio2 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_introducido;
        System.out.println("Ingrese su nombre");
        nombre_introducido = s.nextLine();
        System.out.println("Buenos días " + nombre_introducido );
    }
}
