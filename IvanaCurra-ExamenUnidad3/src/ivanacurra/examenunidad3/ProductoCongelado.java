/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad3;


/**
 *
 * @author Ivana Yael Currá ivanayael@hotmail.com
 */
public class ProductoCongelado extends Producto {
    private int temperaturaCongelacionRec;

    public ProductoCongelado(int temperaturaCongelacionRec, String fechaCaducidad, String NumeroLote) {
        super(fechaCaducidad, NumeroLote);
        this.temperaturaCongelacionRec = temperaturaCongelacionRec;
    }

    public int getTemperaturaCongelacionRec() {
        return temperaturaCongelacionRec;
    }

    public void setTemperaturaCongelacionRec(int temperaturaCongelacionRec) {
        this.temperaturaCongelacionRec = temperaturaCongelacionRec;
    }

    @Override
    public String toString() {
       return "Producto Tipo: Congelado" + 
              "\nFecha de Caducidad: " + fechaCaducidad + 
              "\nNúmero de Lote: " + NumeroLote + 
              "\nTemperadora de Congelación Recomendada: " + temperaturaCongelacionRec + "ºC\n" ;
    }
    
    
    
}
