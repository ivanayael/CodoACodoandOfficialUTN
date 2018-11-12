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
public class Televisor extends Electrodomesticos{
    
    double resolucion;
    boolean sintonizadortdt;
    
    Televisor(){
    }


    public Televisor(double preciobase, double peso) {
        super(preciobase, peso);
        this.resolucion = 20;
        this.sintonizadortdt = false;
        precioFinal();
    }

    public Televisor(double resolucion, boolean sintonizadortdt, double preciobase, String color, char consumoenergetico, double peso) {
        super(preciobase, color, consumoenergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadortdt = sintonizadortdt;
        precioFinal();
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadortdt() {
        return sintonizadortdt;
    }
 
        
    private double precioFinal(){
       
        if (resolucion >= 40){
            preciobase = preciobase * 0.3;
        } 
        if (sintonizadortdt = true){
            preciobase = preciobase + 7000;
        } 
           
        return preciobase;
   }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadortdt=" + sintonizadortdt + '}';
    }

    
    

    
}
