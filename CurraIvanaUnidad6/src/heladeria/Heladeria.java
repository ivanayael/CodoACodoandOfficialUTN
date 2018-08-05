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


public class Heladeria {
   
    private int clienteIngresado=0;
    private int cantHeladeros=0;
    private int cantDespachantes=0;
    private final Cliente[] listaClientes = new Cliente[30];
    private final Heladero[] listaHeladeros = new Heladero[4];
    private final Despachante[] listaDespachantes = new Despachante[4];
    private int max, min;
    private String cajero;
    private String despachante;
    
    public void setCliente(String nombre){
            this.listaClientes[this.clienteIngresado]= new Cliente(nombre);
            this.clienteIngresado++;
    }
    
    public void setHeladero(String nombre, int NroCaja){
        if(cantHeladeros < 4){
            this.listaHeladeros[this.cantHeladeros]= new Heladero(nombre, NroCaja);
            this.cantHeladeros++;
        } else { 
            System.out.println("Los heladeros no pueden atender más clientes");
        }
    }
     public void setDespachante(String nombre){
        if(cantDespachantes < 4){
            this.listaDespachantes[this.cantDespachantes]= new Despachante(nombre);
            this.cantDespachantes++;
        } else { 
            System.out.println("Los Despachantes no pueden atender más pedidos");
        }
    }
    
    
    public void setPedido(int numeroHeladero,int numeroCliente, int numeroDespachante, int Tipo, String Gusto1, String Gusto2, String Gusto3, String Gusto4, String Plus) {
        if (Tipo == 1) {
            Gusto3.equals("0");
            Gusto4.equals("0");
            Plus.equals("0");
        } else if (Tipo == 2) {
            Gusto4.equals("0");
        }    
        listaHeladeros[numeroHeladero].setPedido(listaClientes[numeroCliente], listaDespachantes[numeroDespachante], Tipo,Gusto1, Gusto2, Gusto3, Gusto4, Plus);
    }
    

    public void getClientesAtendidosPorHeladero(int numeroHeladero){
        System.out.println("El heladero " +  listaHeladeros[numeroHeladero].getNombre() +  " atendió: " + listaHeladeros[numeroHeladero].getCantPedidos() + " pedido/s");
    }
    
     public void getDespachosAtendidosPorDespachante(int numeroDespachante){
        System.out.println("El despachante " +  listaDespachantes[numeroDespachante].getNombre() +  " atendió: " + listaDespachantes[numeroDespachante].getCantDespachos() + " despacho/s");
    }
    
    public void getHeladeroVendioMasHelado(){
        min = 0;
        max = 0;
        for (Heladero listaHeladero : listaHeladeros) {
             if (min != 0 && max != 0) {
                if (listaHeladero.getCantPedidos() > max) {
                    max = listaHeladero.getCantPedidos();
                    cajero = listaHeladero.getNombre();
                }
                if (listaHeladero.getCantPedidos() < min) {
                    min = listaHeladero.getCantPedidos();
                    cajero = listaHeladero.getNombre();
                }
            } else {
                min = listaHeladero.getCantPedidos();
                max = listaHeladero.getCantPedidos();
                cajero = listaHeladero.getNombre();
            }
        }
        System.out.println("El repartidor (heladero) que vendió más helado fué: " + cajero + ". Vendió " + max + " helados.\nMerece el bono mensual por alto desempeño");
    }
    
     public void getDespachanteConMasDespachos(){
        min = 0;
        max = 0;
        for (Despachante listaDespachante : listaDespachantes) {
             if (min != 0 && max != 0) {
                if (listaDespachante.getCantDespachos() > max) {
                    max = listaDespachante.getCantDespachos();
                    despachante = listaDespachante.getNombre();
                }
                if (listaDespachante.getCantDespachos() < min) {
                    min = listaDespachante.getCantDespachos();
                    despachante = listaDespachante.getNombre();
                }
            } else {
                min = listaDespachante.getCantDespachos();
                max = listaDespachante.getCantDespachos();
                despachante = listaDespachante.getNombre();
            }
        }
        System.out.println("El despachante que despachó más helado fué: " + despachante + ". Despachó " + max + " pedidos.\nMerece el bono mensual por alto desempeño");
    }
    
     
}
