/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComercioBurger;

/**
 *
 * @author Usuario
 */
public class Despachante {
    private String nombre;
    private int CantDespachos=0;
    private int CantAlertas=0;

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

    public int getCantAlertas() {
        return CantAlertas;
    }

    public void setCantAlertas(int CantAlertas) {
        this.CantAlertas = CantAlertas;
    }
    

    public Despachante(String nombre) {
        super();
        this.nombre = nombre;
    }
    
    public void setDespacho(Pedido pedido, Stock stock){
        if ( Stock.getCantAgua() <= 10 || Stock.getCantCerveza() <= 10 || Stock.getCantCerveza() <= 10 || Stock.getCantGaseosa() <= 10 || Stock.getCantGini() <= 10 || Stock.getCantHamburguesa() <= 10 || Stock.getCantJugueteNena() <= 10 || Stock.getCantJugueteNene() <= 10 || Stock.getCantKetchup() <= 10 || Stock.getCantMayonesa() <= 10 || Stock.getCantMobur() <= 10 || Stock.getCantPan() <= 10 || Stock.getCantPanCenteno() <= 10 || Stock.getCantPapas() <= 10 || Stock.getCantQueso() <= 10){
            System.out.println("\n >>>>>>>>>>>>>ALERTA DE STOCK FALTANTE<<<<<<<<<<<<<<");
            this.CantAlertas++;
        }
        System.out.println("\nEl despachante " + this.nombre + " despachó el pedido " + pedido.getNroPedido()); 
        System.out.println("\nEL STOCK FUÉ ACTUALIZADO POR EL DESPACHANTE " + this.nombre);
        System.out.println("\nDetalle de Stock: " + stock.toString()+"\n");
        this.CantDespachos++;
    }
    


    @Override
    public String toString() {
        return "Despachante{" + "nombre=" + nombre + ", CantDespachos=" + CantDespachos + '}';
    }
    
}

