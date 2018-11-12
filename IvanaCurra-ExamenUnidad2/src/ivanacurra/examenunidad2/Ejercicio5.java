/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad2;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
   
    public static void main(String[] args){


    int longitud = 0;
    
    longitud = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del vector","Tamaño del vector",JOptionPane.QUESTION_MESSAGE) );
    
   // int[] VectorA = new int[longitud];
    Vector<Integer> VectorA=new Vector<>(longitud);
    Vector<Integer> VectorB=new Vector<>(longitud);
    Vector<Integer> VectorC=new Vector<>(longitud);
    Vector<Integer> VectorD=new Vector<>(longitud);
    int cantMaxVectorA = 100;
    int cantMaxVectorB = 100;
    int cantMinVectorA = -100;
    int cantMinVectorB = -100;
    String VisualizaVectorA = "";
    String VisualizaVectorB = "";
    String VisualizaVectorC = "";
    String VisualizaVectorD = "";
    Random random = new Random();
     
    for(int i=0;i<longitud;i++){
        VectorA.add((random.nextInt(cantMaxVectorA)+1));
    }
    JOptionPane.showMessageDialog(null," El Vector A es = " + VectorA.toString(),"Listado de Vector A",JOptionPane.INFORMATION_MESSAGE);
    
    for(int i=0;i<longitud;i++){
       VectorB.add((random.nextInt(cantMaxVectorB)+1));

    }
 
    JOptionPane.showMessageDialog(null," El Vector B es = " + VectorB.toString(),"Listado de Vector B",JOptionPane.INFORMATION_MESSAGE);
    
    
    
    for(int i=0;i<longitud;i++){
        if ((VectorA.get(i) <= cantMinVectorA && VectorA.get(i) >= cantMaxVectorA)){
            JOptionPane.showMessageDialog(null,"El número "+ VectorA.get(i) +"  no se encuentra dentro del rango -100 y 100" ,"No cumple la condición",JOptionPane.INFORMATION_MESSAGE);
        } else if(VectorB.get(i) <= cantMinVectorB && VectorB.get(i) >= cantMaxVectorB){
            JOptionPane.showMessageDialog(null,"El número "+ VectorB.get(i) +"  no se encuentra dentro del rango -100 y 100" ,"No cumple la condición",JOptionPane.INFORMATION_MESSAGE);
        } else {
            VectorC.add(VectorA.get(i)+VectorB.get(i));
            VisualizaVectorC += "A (" + VectorA.get(i) + ")+B(" + VectorB.get(i) + ") = " +VectorC.get(i) + "\n";
        }
       
    }
    JOptionPane.showMessageDialog(null,VisualizaVectorC,"Suma de Vector A y Vector B",JOptionPane.INFORMATION_MESSAGE);
    
     for(int i=0;i<longitud;i++){
        if ((VectorA.get(i) <= cantMinVectorA && VectorA.get(i) >= cantMaxVectorA)){
            JOptionPane.showMessageDialog(null,"El número "+ VectorA.get(i) +"  no se encuentra dentro del rango -100 y 100" ,"No cumple la condición",JOptionPane.INFORMATION_MESSAGE);
        } else if(VectorB.get(i) <= cantMinVectorB && VectorB.get(i) >= cantMaxVectorB){
            JOptionPane.showMessageDialog(null,"El número "+ VectorB.get(i) +"  no se encuentra dentro del rango -100 y 100" ,"No cumple la condición",JOptionPane.INFORMATION_MESSAGE);
        } else {
             VectorD.add(VectorB.get(i)-VectorA.get(i));
             VisualizaVectorD += "B(" + VectorB.get(i) + ")-A (" + VectorA.get(i) + ")= " +VectorD.get(i) + "\n";
             
        }
       
    }
     JOptionPane.showMessageDialog(null,VisualizaVectorD,"Resta de Vector B y Vector A",JOptionPane.INFORMATION_MESSAGE);
   
        
        
    }

}


