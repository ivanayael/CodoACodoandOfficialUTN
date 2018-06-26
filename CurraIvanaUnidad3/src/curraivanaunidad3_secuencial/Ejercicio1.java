/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.util.Scanner;

/**
 *
 * @author Ivana Yael Currá
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int Numero1 = 0;
        int Numero2 = 0;
        System.out.println("Ingrese un numero");
        Numero1 = s.nextInt();
        System.out.println("Ingrese otro numero");
        Numero2 = s.nextInt();
        if (Numero1 > 0 && Numero2 > 0)
        {
            System.out.println("El primer numero es " + Numero1 + " y el segundo numero es " + Numero2);
        }
    }
    
}
