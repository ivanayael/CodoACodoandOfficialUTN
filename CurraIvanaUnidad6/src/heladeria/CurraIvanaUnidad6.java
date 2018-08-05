/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author currai
 */
public class CurraIvanaUnidad6 {

    /**
     */
    public static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema del gimnasio");
       
        int cantMaxClientes = 20;
        int cantMaxHeladeros = 4;
        int cantMaxDespachantes = 4;
        int heladeroRandom = 0;
        int despachanteRandom = 0;
        int numeroCaja = 0;
       
        String nombre;
        String tipo;
        String nombreHeladero;
        String nombreDespachante;
        String gusto1 = "0";
        String gusto2 = "0";
        String gusto3 = "0";
        String gusto4 = "0";
        String plus = "0";
        
        Heladeria heladeria= new Heladeria();
        
        System.out.println("Escriba el nombre de cada heladero y precione enter:");
        for (int j = 0; j < cantMaxHeladeros; j++) {
             nombreHeladero = s.nextLine();
              Random random = new Random();
              for(int a=0; a < 4; a++){
                  numeroCaja = random.nextInt(4);
              }
              heladeria.setHeladero(nombreHeladero,numeroCaja);
         }
        
        System.out.println("Escriba el nombre de cada despachante y precione enter:");
        for (int w = 0; w < cantMaxDespachantes; w++) {
             nombreDespachante = s.nextLine();
             heladeria.setDespachante(nombreDespachante);
         }
        
        try {
             for (int i = 0; i < cantMaxClientes; i++) 
             {
                 System.out.println("Ingreso el nuevo cliente de la heladeria");
                 System.out.println("--------------------------------------");
                 System.out.println("Nombre:");
                 nombre = s.nextLine();
                 System.out.println("Tipo de Pedido:");
                 tipo = s.nextLine();
                 switch (tipo) {
                     case "1":
                         System.out.println("Tipo de Gusto Nro 1: Escribalo o Cero para ninguno");
                         gusto1 = s.nextLine();
                         System.out.println("Tipo de Gusto Nro 2: Escribalo o Cero para ninguno");
                         gusto2 = s.nextLine();
                         break;
                     case "2":
                         System.out.println("Tipo de Gusto: Escribalo o Cero para ninguno");
                         gusto1 = s.nextLine();
                         System.out.println("Tipo de Gusto: Escribalo o Cero para ninguno");
                         gusto2 = s.nextLine();
                         System.out.println("Tipo de Gusto: Escribalo o Cero para ninguno");
                         gusto3 = s.nextLine();
                         System.out.println("Tipo de Plus: 0-Ninguno 1-Chocolate Fundido 2-Almendrado 3-Crema Vainilla");
                         plus = s.nextLine();
                         break;
                     case "3":
                         System.out.println("Tipo de Gusto Nro 1: Escribalo o Cero para ninguno");
                         gusto1 = s.nextLine();
                         System.out.println("Tipo de Gusto Nro 2: Escribalo o Cero para ninguno");
                         gusto2 = s.nextLine();
                         System.out.println("Tipo de Gusto Nro 3: Escribalo o Cero para ninguno");
                         gusto3 = s.nextLine();
                         System.out.println("Tipo de Gusto Nro 4: Escribalo o Cero para ninguno");
                         gusto4 = s.nextLine();
                         System.out.println("Tipo de Plus: 0-Ninguno 1-Chocolate Fundido 2-Almendrado 3-Crema Vainilla");
                         plus = s.nextLine();
                         break;
                     default:
                         break;
                 }
                 heladeria.setCliente(nombre);
                 Random random = new Random();
                 for(int a=0; a<4; a++){
                     heladeroRandom = random.nextInt(4);
                     despachanteRandom = random.nextInt(4);
                 }
                 heladeria.setPedido(heladeroRandom, i, despachanteRandom, Integer.parseInt(tipo),gusto1,gusto2,gusto3,gusto4,plus);
             }
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Error numerico " + ex.getMessage());
        }
   
         for (int z = 0; z < cantMaxHeladeros; z++) {
             heladeria.getClientesAtendidosPorHeladero(z);
         }
         
         heladeria.getHeladeroVendioMasHelado();
         heladeria.getDespachanteConMasDespachos();
    } 
}
