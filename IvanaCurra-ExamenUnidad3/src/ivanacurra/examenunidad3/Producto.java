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
public class Producto {
    protected String fechaCaducidad;
    protected String NumeroLote;

    public Producto(String fechaCaducidad, String NumeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.NumeroLote = NumeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return NumeroLote;
    }

    public void setNumeroLote(String NumeroLote) {
        this.NumeroLote = NumeroLote;
    }

    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", NumeroLote=" + NumeroLote + '}';
    }


    
}
