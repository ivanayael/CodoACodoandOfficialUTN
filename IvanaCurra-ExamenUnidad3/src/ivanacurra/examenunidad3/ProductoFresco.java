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
public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, String NumeroLote) {
        super(fechaCaducidad, NumeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
       return "Producto Tipo: Fresco" + 
              "\nFecha de Envasado: " + fechaEnvasado + 
              "\nPaís de Origen: " + paisOrigen + 
              "\nFecha de Caducidad: " + fechaCaducidad + 
              "\nNúmero de Lote: " + NumeroLote + "\n";
    }

 
    
    
}
