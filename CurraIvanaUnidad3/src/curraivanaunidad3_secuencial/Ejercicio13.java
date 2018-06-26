/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivanaunidad3_secuencial;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author currai
 */
public class Ejercicio13 {
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) throws ParseException  {
        String n;
        Date date = null;
        int sum_mes, sum_año, sum_año2, sum_dia, contador_año;
        System.out.println("Ingrese su fecha de nacimiento en el formato dd/mm/aaaa");
        n = s.nextLine();
        
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        date = formatoFecha.parse(n);

        DateFormat formatoFechaAño = new SimpleDateFormat("yyyy");
        DateFormat formatoFechaMes = new SimpleDateFormat("MM");
        DateFormat formatoFechaDia = new SimpleDateFormat("dd");
        String año = formatoFechaAño.format(date).toUpperCase();
        String mes = formatoFechaMes.format(date).toUpperCase();
        String dia = formatoFechaDia.format(date).toUpperCase();
        
        sum_año=0;  //guarda largo de cadena

        sum_mes=0;
        sum_dia=0;
        int largoa=año.length();
        int largom=mes.length();
        int largod=dia.length();
       
        
        for(int a=0; a<largoa; a++){  //recorre la cadena
           sum_año = sum_año + Integer.parseInt(año.charAt(a) + "");  //suma caracter 
        }  
        
        sum_año2=0;
        String año_2 = Integer.toString(sum_año);
        int largoa2= año_2.length();      
                 
        if (sum_año > 10){
           for(int a2=0; a2 < largoa2; a2++){  //recorre la cadena
              sum_año2 = sum_año2 + Integer.parseInt(año_2.charAt(a2) + ""); //suma caracter 
           }  
        }
        
        for(int m=0; m<largom; m++){  //recorre la cadena
           sum_mes = sum_mes +  Integer.parseInt(mes.charAt(m) + "");  //suma caracter        
        } 

         for(int d=0; d<largod; d++){  //recorre la cadena
           sum_dia = sum_dia + Integer.parseInt(dia.charAt(d) + "");  //suma caracter        
        } 
         
        
        int subtotal = 0;
        if (sum_año2 != 0)
        {
            subtotal = sum_año2 + sum_mes + sum_dia;
        } 
        else
        {
            subtotal = sum_año + sum_mes + sum_dia;
        }
         
        int total = 0;
        String subtotal_2 = Integer.toString(subtotal);
        int largototal = subtotal_2.length();
         
        if (subtotal > 10)
        {
            for(int st=0; st< largototal; st++){  //recorre la cadena
               total = total + Integer.parseInt(subtotal_2.charAt(st) + "");  //suma caracter 
           }  
        }
         
        if (total != 0) 
        {
            System.out.println("Su número de la suerte es " + total);
        } else {
            System.out.println("Su número de la suerte es " + subtotal);
        }
          
    }
}
