/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComercioBurger;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author currai
 */


public class ComercioBurger {
   
    private int clienteIngresado=0;
    private int contactoIngresado=0;
    private int cantCajeros=0;
    private int cantDespachantes=0;
    private int cantVentas=0;
    private final Despachante[] listaDespachantes = new Despachante[4];
    private final Contacto[] listaContactos = new Contacto[1000];
    private final Cliente[] listaClientes = new Cliente[1000];
    private final Cajero[] listaCajeros = new Cajero[6];
    private final Venta[] listaVentas = new Venta[1000];
    ArrayList listaOperaciones = new ArrayList<>();
    ArrayList listaOrdenesCompra = new ArrayList<>();
    private int max, min;
    private String cajero;
    private double precioUnitario = 0;
   
    public void setCliente(String nombre, String fechaNacimiento, String telefono, int cantHijos, String[] NombreCompletoHijos){
            this.listaClientes[this.clienteIngresado]= new Cliente(nombre);
            this.listaContactos[this.contactoIngresado]= new Contacto(fechaNacimiento, telefono, cantHijos, NombreCompletoHijos, this.listaClientes[this.clienteIngresado]);
            this.clienteIngresado++;
            this.contactoIngresado++;
    }
    
    
    public void setCajero(String nombre, int NroCaja){
            this.listaCajeros[this.cantCajeros]= new Cajero(nombre, NroCaja);
            this.cantCajeros ++;
    }

    public void setDespachante(String nombre){
            this.listaDespachantes[this.cantDespachantes]= new Despachante(nombre);
            this.cantDespachantes++;
    }
    
     
    public void setVenta(double abono){
            this.listaVentas[this.cantVentas]= new Venta(abono);
            this.cantVentas++;
    }
    
    public void setPedido(int numeroCajero,int numeroCliente, int numeroDespachante, int numeroVenta, int NroPedido, int TipoCombo, int Hamburguesa, int Papas, int Queso, int Cebolla, int juguete_nena, int juguete_nene, int Ketchup, int Mayonesa, int GaseosaC, int GaseosaM, int GaseosaG, int AguaC, int Cerveza, int PanComun, int PanCenteno, int Gini, int Mobur, int cantidad, double abono) { 
                
        switch (NroPedido) {
            case 1:
                precioUnitario = 1000;
                break;
            case 2:
                precioUnitario = 2000;
                break;
            case 3:
                precioUnitario = 3000;
                break;
            case 4:
                precioUnitario = 4000;
                break;
            default:
                break;
        }
        listaCajeros[numeroCajero].setPedido(listaClientes[numeroCliente], listaDespachantes[numeroDespachante], listaVentas[numeroVenta], NroPedido,  TipoCombo,  Hamburguesa,  Papas,  Queso,  Cebolla,  juguete_nena, juguete_nene, Ketchup, Mayonesa, GaseosaC, GaseosaM, GaseosaG, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur, cantidad, precioUnitario, abono);
        
        
        Operacion operacion = new Operacion();
       // NroPedido,  TipoCombo,  Hamburguesa,  Papas,  Queso,  Cebolla,  juguete_nena, juguete_nene, Ketchup, Mayonesa, GaseosaC, GaseosaM, GaseosaG, AguaC, Cerveza, PanComun, PanCenteno, Gini, Mobur, cantidad, precioUnitario , abono
        operacion.setAguaC(AguaC);
        operacion.setCantidad(cantidad);
        operacion.setCebolla(Cebolla);
        operacion.setCerveza(Cerveza);
        operacion.setGaseosaC(GaseosaC);
        operacion.setGaseosaG(GaseosaG);
        operacion.setGaseosaM(GaseosaM);
        operacion.setGini(Gini);
        operacion.setHamburguesa(Hamburguesa);
        operacion.setNroPedido(NroPedido);
        operacion.setPanCenteno(PanCenteno);
        operacion.setPanComun(PanComun);
        operacion.setPapas(Papas);
        operacion.setPrecioUnitario(precioUnitario);
        operacion.setTipoCombo(TipoCombo);
        operacion.setSubtotal();
        listaOperaciones.add(operacion);
        OperacionArchivo.crearArchivo(listaOperaciones);
        
        
        if(listaDespachantes[numeroDespachante].getCantAlertas() != 0){
             OrdenCompra orden = new OrdenCompra();
             orden.setFecha();
             orden.setCantReposicion(50);
             listaOrdenesCompra.add(operacion);
             OrdenCompraArchivo.crearArchivo(listaOrdenesCompra);
        }

    }
    
    public void getReporteVentasJefe(String usuario, String contrasenia){
        Login login = new Login(usuario,contrasenia);
        String usu = login.getUsuario();
        String pass = login.getContrasenia();
        
        if ("01354".equals(usu) && "frenchisDobles".equals(pass)){
             System.out.println("\n>>HA INGRESADO CORECTAMENTE EL USUARIO DE REPORTING<<");
             System.out.println("\n>>MOSTRANDO REPORTE<<");
         //    System.out.println(OperacionArchivo.leerArchivo());
         
         
         
         // lista para recibir los objetos operaciones desde el archivo
		ArrayList listaLeida = new ArrayList<>();

            // asignar a la lista los objetos
		listaLeida = OperacionArchivo.leerArchivo();
                 System.out.println("NRO. DE PEDIDO" + "     " + "TIPO DE COMBO" + "      " + "Con Hamburguesa"
                                + "    " + "Con Papas" + "          " + "Con Pan Comun" + "      " + "Con Pan Centeno"
                                + "    " + "Con Agua Chica" + "     " + "Con Gaseosa C." + "     " + "Con Gaseosa M."
                                + "     " + "Con Gaseosa G." + "     " + "Con Cerveza" + "        " + "Con Queso"
                                + "          " + "Con Cebolla" + "        " + "Con Ketchup" + "        " + "Con Mayonesa"
                                + "       " + "Con Gini" + "           " + "Con Mobur" + "          " + "Juguete para Niña"
                                + "  " + "Juguete de Niño" + "    " + "PRECIO UNITARIO" + "         " + "CANTIDAD"
                                + "           " + "SUBTOTAL");
            for (Iterator it = listaLeida.iterator(); it.hasNext();) {
                Operacion operacion = (Operacion) it.next();
                 
                  
                System.out.println(operacion.getNroPedido() + "                  " + operacion.getTipoCombo() + "                  " + operacion.getHamburguesa()
                                + "                  " + operacion.getPapas() + "                  " + operacion.getPanComun() + "                  " + operacion.getPanCenteno()
                                + "                  " + operacion.getAguaC() + "                  " + operacion.getGaseosaC() + "                  " + operacion.getGaseosaM()
                                + "                  " + operacion.getGaseosaG() + "                  " + operacion.getCerveza() + "                  " + operacion.getQueso()
                                + "                  " + operacion.getCebolla() + "                  " + operacion.getKetchup() + "                  " + operacion.getMayonesa()
                                + "                  " + operacion.getGini() + "                  " + operacion.getMobur() + "                  " + operacion.getJuguete_nena()
                                + "                  " + operacion.getJuguete_nene() + "                  " + operacion.getPrecioUnitario() + "                  " + operacion.getCantidad()
                                + "                  " + operacion.getSubtotal());
            }
         
         
         
        }
    }

    
    public void getClientesAtendidosPorCajero(int numeroCajero){
        System.out.println("El cajero " +  listaCajeros[numeroCajero].getNombre() +  " atendió: " + listaCajeros[numeroCajero].getCantPedidos() + " pedido/s");
    }
    
    
    
    
 

  
    
     
}
