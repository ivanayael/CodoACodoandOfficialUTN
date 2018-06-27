/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_condicional;

import java.util.Scanner;

/**
 *5. Programa que lea dos caracteres y compruebe si son dos letras minúsculas.
 * @author Ivana Yael Currá
 */
public class Ejercicio5 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
      
        String sIngreso;
        System.out.println("Ingrese un caracter o escriba 0 para salir");
        sIngreso = s.nextLine();
        if (sIngreso.length() == 1){
            if (!sIngreso.equals("0")) {
                char[] cCadena = sIngreso.toCharArray();
                for(int i=0; i < cCadena.length; i++){
                    if( Character.isLetter(cCadena[i]))
                    {
                        if(Character.isLowerCase(cCadena[i]))
                        {
                            System.out.println(sIngreso + " es un caracter en minúsculas.");
                        } else {
                            System.out.println(sIngreso + " NO es un caracter en minúsculas.");
                        }
                    }else{
                        System.out.println(sIngreso + " no es un caracter.");
                    }
                }
            }
        }else{
            System.out.println(sIngreso + " tiene más de un caracter.");
        }
    }
}
