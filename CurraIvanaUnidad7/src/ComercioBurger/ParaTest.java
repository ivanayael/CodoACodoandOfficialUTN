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
public class ParaTest {
    public static void main(String[] args) {
        // Se agregan a las mascotas
        ComercioBurger burger= new ComercioBurger();
      
       
      
        burger.setCliente("rosso","14/03/1934", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("rocky","13/04/1942", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("rick","04/03/1934", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("jack","03/03/1934", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("storm","12/03/1934", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("sonic","14/03/1934", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("HitMonChan","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Nick Root","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Rex Rut","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Dominic Valentino","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Javier Pugliese","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Godinez","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Gengar","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("John Smith","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Pandora Gutierrez","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Poncho Parilla","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Madoka","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Pikachu","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
        burger.setCliente("Stufful","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
	burger.setCliente("Sawk","14/03/1234", "32490430", 0, new String[]{"Ninguno"});
       
        
        //Se ingresan a los cajeros

	burger.setCajero("Jorge Fernandez",1);	
	burger.setCajero("Eduardo Gargarella",2);
	burger.setCajero("Alvaro Duarte",3);
	burger.setCajero("Andrea Maubert",4);
        burger.setCajero("Carolina Andrada",5);
        burger.setCajero("Gonzalo Gomez",6);
        
        burger.setDespachante("Emanuel Rodriguez");
        burger.setDespachante("Ricardo Duarte");
        burger.setDespachante("Facundo Felice");
        burger.setDespachante("Julieta Darti");	
        
	//Se realiza el abono de la venta en caja y se realiza el pedido
        // Datos: numeroCajero,  numeroCliente, numeroDespachante,numeroVenta,NroPedido,TipoCombo,Hamburguesa, Papas,Queso, Cebolla,juguete_nena,juguete_nene, Ketchup, Mayonesa, GaseosaC, GaseosaM, GaseosaG, AguaC, Cerveza,PanComun, PanCenteno, Gini, Mobur, cantidad, abono
        burger.setVenta(1500);
        burger.setPedido(0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1,1500);
        
        burger.setVenta(4000);
        burger.setPedido(1, 2, 1, 1, 2, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,4000);
        
        burger.setVenta(6500);
        burger.setPedido(1, 3, 2, 2, 3, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,6500);
        
        burger.setVenta(8000);
        burger.setPedido(2, 4, 2, 3, 4, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);
        
        burger.setVenta(8000);
        burger.setPedido(2, 5, 3, 4, 5, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);
        
        burger.setVenta(8000);
        burger.setPedido(2, 6, 3, 5, 6, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);
        
        burger.setVenta(8150);
        burger.setPedido(3, 7, 3, 6, 7, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);
        
        burger.setVenta(8300);
        burger.setPedido(3, 8, 3, 7, 8, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);
        
        burger.setVenta(8300);
        burger.setPedido(2, 9, 3, 8, 9, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2,8000);

        //Se muestra la cantidad atendidos por cajero
        
       burger.getClientesAtendidosPorCajero(0);
       burger.getClientesAtendidosPorCajero(1);
       burger.getClientesAtendidosPorCajero(2);
       burger.getClientesAtendidosPorCajero(3);
       burger.getClientesAtendidosPorCajero(4);
       burger.getClientesAtendidosPorCajero(5);

       
       //Se muestra el reporte de las ventas para administrador
       
     
       burger.getReporteVentasJefe("01354","frenchisDobles");

			
    }
} 
