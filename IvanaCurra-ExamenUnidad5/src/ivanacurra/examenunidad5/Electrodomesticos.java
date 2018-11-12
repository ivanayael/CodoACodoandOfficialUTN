/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad5;

/**
 *
 * @author Usuario
 */
public class Electrodomesticos {
    
    double preciobase = 10000;
    String color = "blanco";
    char consumoenergetico = 'F';
    double peso = 5;



    public Electrodomesticos() {
       
    }

    public Electrodomesticos(double preciobase, double peso) {
        this.preciobase = preciobase;
        this.color = "blanco";
        this.consumoenergetico = 'F';
        this.peso = peso;
        precioFinal();
    }
    
 
    
    public Electrodomesticos(double preciobase, String color, char consumoenergetico, double peso) {
        this.preciobase = preciobase;
        this.color = comprobarColor(color);
        this.consumoenergetico = comprobarConsumoEnergetico(consumoenergetico);
        this.peso = peso;
        precioFinal();
    }
    

    public double getPreciobase() {
        return preciobase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoenergetico() {
        return consumoenergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    
   private char comprobarConsumoEnergetico(char letra){
       if (letra != 'A' ||  letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E'){
           letra = 'F';
       }
       return letra;
   }
   
   private String comprobarColor(String color){
       if (!color.toLowerCase().equals("negro") ||  !color.toLowerCase().equals("rojo") || !color.toLowerCase().equals("azul") || !color.toLowerCase().equals("gris")){
           color = "blanco";
       }
       return color;
   }
   
   private double precioFinal(){
       
        switch (consumoenergetico) {
            case 'A':
                preciobase = 10000;
                break;
            case 'B':
                preciobase = 8000;
                break;
            case 'C':
                preciobase = 7000;
                break;
            case 'D':
                preciobase = 5000;
                break;
            default: 
                break;
        }
        return preciobase;
   }
    
    
}
