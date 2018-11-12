/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args){
        
        //Se tomo una cantidad de 30 alumnos
        int cantAlumnos = 30;
        List<Integer> lista = new ArrayList<>(cantAlumnos);
        int cBajo = 0, cReg = 0, cBueno = 0, cMuyBueno = 0 , cExcelente= 0;
        Random random = new Random();
        
        for(int i=0;i<cantAlumnos;i++){
            lista.add(random.nextInt(11));
        }
        JOptionPane.showMessageDialog(null,"La cantidad de notas de los " + cantAlumnos + " alumnos son " + lista.toString(),"bajo de conocimientos",JOptionPane.INFORMATION_MESSAGE);
        for (int numerolistado: lista) {
        // Bajo de conocimientos de 0-4
        // Regulares de mayor de 4 hasta 5
        // Buenos mayor a 5 hasta 7
        // Muy buenos mayor de 7 a 9
        // Excelentes mayor a 9

          if (numerolistado > 0 && numerolistado <= 4){
              cBajo=cBajo+1;
          } else if (numerolistado > 4 && numerolistado <= 5){
              cReg=cReg+1;
          } else if (numerolistado > 5 && numerolistado <= 7){
              cBueno=cBueno+1;
          } else if (numerolistado > 7 && numerolistado <= 9){
              cMuyBueno=cMuyBueno+1;
          } else if (numerolistado > 9){
              cExcelente=cExcelente+1;
          }
        }
        
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos con bajo de conocimientos de 0-4 son " +cBajo ,"bajo de conocimientos",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos con Regulares conocimientos de mayor de 4 hasta 5 son " +cReg ,"Regulares conocimientos de mayor de 4 hasta 5",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos con Buenos conocimientos mayor a 5 hasta 7 son " +cBueno ,"Buenos conocimientos mayor a 5 hasta 7",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos con Muy buenos conocimientos mayor a 5 hasta 7 son " +cMuyBueno ,"Muy buenos conocimientos mayor a 5 hasta 7",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos con Excelentes conocimientos mayor a 9 son " +cExcelente ,"Excelentes conocimientos mayor a 9",JOptionPane.INFORMATION_MESSAGE);
    }
          
    }

