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
public class Lavarropas extends Electrodomesticos{
    
    int carga = 5;
    
    Lavarropas(){
    }

    public Lavarropas(double preciobase, double peso) {
        super(preciobase, peso);
        this.carga = 5;
        precioFinal();
    }

    public Lavarropas(int carga, double preciobase, String color, char consumoenergetico, double peso) {
        super(preciobase,  color, consumoenergetico, peso);
        this.carga = carga;
        precioFinal();
    }

    public int getCarga() {
        return carga;
    }
    
        
    private double precioFinal(){
       
        if (carga >= 30){
            preciobase = preciobase + 10000;
        } else {
            if (peso <= 19){  
                preciobase = preciobase + 5000;
            }
            else if (peso >= 20 && peso <= 49){  
                preciobase = preciobase + 10000;
            }
            else if (peso >= 50 && peso <= 70){  
                preciobase = preciobase + 17000;
            }  
            else if (peso > 70){  
                preciobase = preciobase + 25000;
            }  
        }
      
        return preciobase;
   }

    @Override
    public String toString() {
        return "Lavarropas{" + "carga=" + carga + '}';
    }

    
}