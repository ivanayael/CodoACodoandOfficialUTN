/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

/**
 *
 * @author Usuario
 */
public class Despachante {
    private String nombre;
    private int CantDespachos=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantDespachos() {
        return CantDespachos;
    }

    public void setCantDespachos(int CantDespachos) {
        this.CantDespachos = CantDespachos;
    }

    public Despachante(String nombre) {
        super();
        this.nombre = nombre;
    }
    
    public void setDespacho(Pedido pedido){
        System.out.println("\nEl despachante " + this.nombre + " despachó el pedido " + pedido.getTipo());           
        this.CantDespachos++;
    }

    @Override
    public String toString() {
        return "Despachante{" + "nombre=" + nombre + ", CantDespachos=" + CantDespachos + '}';
    }
    
}
