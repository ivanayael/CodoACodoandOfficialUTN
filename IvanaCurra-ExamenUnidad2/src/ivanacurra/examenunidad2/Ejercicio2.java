/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args) {
            int potencia =0;
            float raiz =0;      
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero","Raiz y Cuadrado",JOptionPane.QUESTION_MESSAGE) );
            if (numero1<=0) {
                 JOptionPane.showMessageDialog(null,"El número no puede ser inferior o igual a cero","Raiz y Cuadrado",JOptionPane.INFORMATION_MESSAGE);
            } else {
                 potencia = (int) Math.pow(numero1,2);
                 raiz = (float) Math.sqrt(numero1);
                 JOptionPane.showMessageDialog(null,"Del número " + numero1 + " su potencia es " + potencia + " y su raíz " + String.format("%.2f", raiz),"Raiz y Cuadrado",JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
