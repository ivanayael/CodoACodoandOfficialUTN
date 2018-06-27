/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *10. Programa que lea una variable entera mes y compruebe si el valor 
 * corresponde a un mes de 30, 31 o 28 días. 
 * Se mostrará además el nombre del mes. 
 * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
 * @author Ivana Yael Currá
 */
public class Ejercicio10 {
      public static Scanner s = new Scanner (System.in);
      
      public static void main(String[] args) {
       
        int iMes  = 0;
        String sDias;
        String sMes;
        System.out.println("Ingrese el número de mes o ingrese 0 para salir");
        iMes = s.nextInt();
        if (iMes != 0 ){
            if (iMes >= 1 && iMes <= 12 ){
                switch (iMes) {
                case 1: 
                    sMes = "Enero";
                    sDias = "tiene 31 días";
                    break;
                case 3: 
                    sMes = "Marzo";
                    sDias = "tiene 31 días";
                    break;
                case 5: 
                    sMes = "Mayo";
                    sDias = "tiene 31 días";
                    break;
                case 7: 
                    sMes = "Julio";
                    sDias = "tiene 31 días";
                    break;
                case 8: 
                    sMes = "Agosto";
                    sDias = "tiene 31 días";
                    break;
                case 10: 
                    sMes = "Octubre";
                    sDias = "tiene 31 días";
                    break;
                case 12:
                    sMes = "Diciembre";
                    sDias = "tiene 31 días";
                    break;
                case 4:
                    sMes = "Abril";
                    sDias = "tiene 30 días";
                     break;
                case 6:
                    sMes = "Junio";
                    sDias = "tiene 30 días";
                     break;
                case 9:
                    sMes = "Septiembre";
                    sDias = "tiene 30 días";
                     break;
                case 11:
                    sMes = "Noviembre";
                    sDias = "tiene 30 días";
                    break;
                case 2:	
                    sMes = "Febrero";
                    sDias = "tiene 28 días (o 29 días, si es año bisiesto)";
                    break;		
                default:
                    sMes = "es incorrecto.";
                    sDias = "Días incalculables.";
                }
                System.out.println("El mes de " + sMes +" "+ sDias);
            } else {
                System.out.println("El mes debe ser entre 1 y 12");
            }
           
        }
    }
}

