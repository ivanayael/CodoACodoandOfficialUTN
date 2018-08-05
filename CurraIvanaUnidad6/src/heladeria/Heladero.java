/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

/**
 *
 * @author currai
 */

public class Heladero {
    private String nombre;
    private int NroCaja;
    private int CantPedidos=0;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNroCaja() {
        return NroCaja;
    }

    public void setNroCaja(int NroCaja) {
        this.NroCaja = NroCaja;
    }
   
    public int getCantPedidos() {
        return CantPedidos;
    }

    public void setCantPedidos(int CantPedidos) {
        this.CantPedidos = CantPedidos;
    }

    public Heladero(String nombre, int NroCaja) {
        super();
        this.nombre = nombre;
        this.NroCaja = NroCaja;
    }

    public void setPedido(Cliente cliente, Despachante despachante, int Tipo, String Gusto1, String Gusto2, String Gusto3, String Gusto4, String Plus){
         switch (this.NroCaja) {
            case 1:  
                if(this.CantPedidos < 10){
                    cliente.setPedido(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4,Plus));
                    System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                    despachante.setDespacho(new Pedido(Tipo,Gusto1,Gusto2, Gusto3,Gusto4,Plus));
                    this.CantPedidos++;
                   
                }
                
                break;
            case 2: 
                if(this.CantPedidos < 5){
                    cliente.setPedido(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4, Plus));
                    System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                    despachante.setDespacho(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4,Plus));
                    this.CantPedidos++;
                   
                }
                break;
            case 3:  
                  if(this.CantPedidos < 15){
                    cliente.setPedido(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4, Plus));
                    System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());   
                    despachante.setDespacho(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4,Plus));
                    this.CantPedidos++;
                  }
                  break;
         
            default: 
                cliente.setPedido(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4, Plus));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                despachante.setDespacho(new Pedido(Tipo,Gusto1,Gusto2, Gusto3, Gusto4,Plus));
                this.CantPedidos++;
                break;
        }
    }

    @Override
    public String toString() {
        return "Heladero{" + "nombre=" + nombre + ", NroCaja=" + NroCaja + ", CantPedidos=" + CantPedidos + '}';
    }
    


}