/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComercioBurger;

/**
 *
 * @author currai
 */

public class Cajero {
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

    
    
    public Cajero(String nombre, int NroCaja) {
        super();
        this.nombre = nombre;
        this.NroCaja = NroCaja;
    }

    public void setPedido(Cliente cliente, Despachante despachante, Venta venta, int NroPedido, int TipoCombo, int Hamburguesa, int Papas, int Queso, int Cebolla, int juguete_nena, int juguete_nene, int Ketchup, int Mayonesa, int GaseosaC,int GaseosaM, int GaseosaG, int AguaC, int Cerveza, int PanComun, int PanCenteno, int Gini, int Mobur, int cantidad, double precioUnitario, double Abono){
        int cantGaseosa = 0; 
        switch (this.NroCaja) {
            case 1: 
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                venta.setFecha();
                venta.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                venta.setAbono(Abono);
                venta.setPrecioTotal();
                venta.setVuelto();
                venta.setTicket();
                System.out.println(venta.getTicket().toString());
                break;
            case 2: 
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                venta.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                venta.setAbono(Abono);
                venta.setPrecioTotal();
                venta.setVuelto();
                venta.setTicket();
                System.out.println(venta.getTicket().toString());
                break;
            case 3: 
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                venta.setFecha();
                venta.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                venta.setAbono(Abono);
                venta.setPrecioTotal();
                venta.setVuelto();
                venta.setTicket();
                System.out.println(venta.getTicket().toString());
                break;
             case 4:  
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                venta.setFecha();
                venta.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                venta.setAbono(Abono);
                venta.setPrecioTotal();
                venta.setVuelto();
                venta.setTicket();
                System.out.println(venta.getTicket().toString());
                break;
             case 5:  
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                break;
             case 6:  
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                 despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                break;
            default: 
                cliente.setPedido(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario));
                System.out.println("El cliente " + cliente.getNombre()+ " hizo el pedido a la caja " + this.getNroCaja() + " y al heladero " + this.getNombre());           
                this.CantPedidos++;
                
                if (GaseosaC == 1){
                   cantGaseosa = 1;
                } 
                if (GaseosaM == 1){
                   cantGaseosa = 2;
                } 
                if (GaseosaG == 1){
                   cantGaseosa = 3;
                } 
                despachante.setDespacho(new Pedido(NroPedido, TipoCombo, Hamburguesa, Papas, Queso, Cebolla, juguete_nena, juguete_nene, Ketchup,  Mayonesa, GaseosaC,GaseosaM, GaseosaG,AguaC, Cerveza, PanComun, PanCenteno,Gini, Mobur, cantidad, precioUnitario), new Stock(Hamburguesa, Queso, Papas, Cebolla, juguete_nena, juguete_nene, Ketchup, Mayonesa, cantGaseosa, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur));
                break;
        }
    }

    @Override
    public String toString() {
        return "Cajero{" + "nombre=" + nombre + ", NroCaja=" + NroCaja + ", CantPedidos=" + CantPedidos + '}';
    }

 


}