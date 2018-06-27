/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *9. Programa que lea tres números enteros H, M, S que contienen hora,
 * minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
 * @author Ivana Yael Currá
 */
public class Ejercicio9 {
      public static Scanner s = new Scanner (System.in);
      
      public static void main(String[] args) {
       
        int iH = 0;
        int iM = 0;
        int iS = 0;
        System.out.println("Ingrese el numero que corresponda a la hora");
        iH = s.nextInt();
        System.out.println("Ingrese el numero que corresponda a el minuto");
        iM = s.nextInt();
        System.out.println("Ingrese el numero que corresponda a el segundo");
        iS = s.nextInt();
        
        if (iH <= 24 && iM <= 60 && iS <=60){
            System.out.println("La hora: " + iH+ ":" + iM+ ":"+ iS + " es válida");
        }  else {
            System.out.println("La hora: " + iH+ ":" + iM+ ":"+ iS + " NO es válida");
        }
    }
}
