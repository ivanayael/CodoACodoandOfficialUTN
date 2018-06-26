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
 * 10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 */
public class Ejercicio10 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        String sNumero;
        String sNumeroPrimero;
        String sNumeroSegundo;
        String sNumeroTercero;
        System.out.println("Ingrese un numero de tres cifras o precione 0 para salir");
        sNumero = s.nextLine();
        if (sNumero.equals("0")) {
        } else {
            if (sNumero.length() == 3){
                sNumeroPrimero = sNumero.substring(0,1);
                sNumeroSegundo = sNumero.substring(1,2);
                sNumeroTercero = sNumero.substring(2);
                System.out.println("El primer numero es " + sNumeroPrimero + ", el segundo es " + sNumeroSegundo + " y el tercero es " + sNumeroTercero + ".");
            } else {
                 System.out.println("El número no tiene 3 cifras");
            }
        }
    }
}
