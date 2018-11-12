/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) throws ParseException {
        int dia,mes,anio;
        String diaFecha, mesFecha, anioFecha, fecha = null, fechaFin = null;
        System.out.println("Ingrese el día de 1 a 31");
        dia=s.nextInt();
        System.out.println("Ingrese el mes en número de 1 a 12");
        mes=s.nextInt();
        System.out.println("Ingrese el mes en número desde 1 hasta el año actual");
        anio=s.nextInt();
        if (dia >= 0 && mes >=0 && anio >= 0){
           try {
               if (dia < 10)
               {
                   diaFecha = Integer.toString(dia);
                   diaFecha = "0" + diaFecha;
               } else {
                   diaFecha = Integer.toString(dia);
               }
               if (mes < 10)
               {
                   mesFecha = Integer.toString(mes);
                   mesFecha = "0" + mesFecha;
               } else {
                   mesFecha = Integer.toString(mes);
               }
               anioFecha = Integer.toString(anio);
               fecha = diaFecha + "/"+ mesFecha + "/" + anioFecha;
               fechaFin = diaFecha + "/"+ mesFecha + "/" + anioFecha;
               SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
               formatoFecha.setLenient(false);
               formatoFecha.parse(fecha);
           } catch (ParseException ex) {
               System.out.println("La fecha no es válida. Detalle: " + ex.getMessage());
           } finally {
                Date fecha1=new SimpleDateFormat("dd/MM/yyyy").parse(fechaFin);  
                SimpleDateFormat formatoFechaFin = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
                System.out.println("La fecha " + formatoFechaFin.format(fecha1) + " es válida");
           }
        } else {
            System.out.println("Los numeros no pueden ser inferiores a cero");
        }
    }
}
