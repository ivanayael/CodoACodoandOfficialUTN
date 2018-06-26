/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *
 * @author currai
 */
public class Ejercicio7 {
      public static Scanner s = new Scanner (System.in);
      
      public static void main(String[] args) {
       
        int iDividendo = 0;
        int iDivisor = 0;
        int iResultado = 0;
        System.out.println("Ingrese el dividendo");
        iDividendo = s.nextInt();
        System.out.println("Ingrese el divisor");
        iDivisor = s.nextInt();
        try {
            iResultado = iDividendo / iDivisor;
        } catch (ArithmeticException ex) {
            iResultado = 0;
            System.out.println("ERROR: El divisor es cero. Detalle:" + ex.getMessage());
        } catch (NullPointerException ex) {
            iResultado = 0;
            System.out.println("ERROR: Valor nulo. Detalle: " + ex.getMessage());
        }
        finally {
            if (iResultado != 0){
                System.out.println("El Resultado de la división es: " + iResultado);
            }
        }
    }
}
