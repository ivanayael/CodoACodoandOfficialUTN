/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 *7. Programa lea la longitud de los catetos de un triángulo rectángulo
 * y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
 * @author Ivana Yael Currá
 */
public class Ejercicio7 {
      public static Scanner s = new Scanner (System.in);
      
      public static void main(String[] args) {
       
        double dCateto1 = 0;
        double dCateto2 = 0;
        double dHipotenusa = 0;
        double dVerificaRectangulo = 0;
        double dVerificaHipotenusa = 0;
        System.out.println("Ingrese la longitud del cateto 1 o cero para salir");
        dCateto1 = s.nextDouble();
        System.out.println("Ingrese la longitud del cateto 2 o cero para salir");
        dCateto2 = s.nextDouble();
        if (dCateto1 > 0 || dCateto2 > 0){
            dHipotenusa = Math.sqrt((dCateto1*dCateto1)+(dCateto2*dCateto2));
            dVerificaRectangulo = Math.pow(dCateto1,2) + Math.pow(dCateto2,2);
            dVerificaHipotenusa = Math.pow(dHipotenusa,2);
            if (dVerificaRectangulo == dVerificaHipotenusa){
                 System.out.println("el triangulo rectángulo con el cateto " + dCateto1 + " y el cateto " + dCateto2 + " tiene una hipotenusa de " + dHipotenusa + ".");
            }else{
                 System.out.println("el triangulo con el cateto " + dCateto1 + " y el cateto " + dCateto2 + " no es uno rectángulo.");
            }
        }
    }
}
