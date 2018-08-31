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
public class ParaTest {
    public static void main(String[] args) {
        // Se agregan a las mascotas
        Heladeria heladeria= new Heladeria();
        
        heladeria.setCliente("rosso");
        heladeria.setCliente("rocky");
        heladeria.setCliente("rick");
        heladeria.setCliente("jack");
        heladeria.setCliente("storm");
        heladeria.setCliente("sonic");
        heladeria.setCliente("HitMonChan");
        heladeria.setCliente("Nick Root");
        heladeria.setCliente("Rex Rut");
        heladeria.setCliente("Dominic Valentino");
        heladeria.setCliente("Javier Pugliese");
        heladeria.setCliente("Godinez");
        heladeria.setCliente("Gengar");
        heladeria.setCliente("John Smith");
        heladeria.setCliente("Pandora Gutierrez");
        heladeria.setCliente("Poncho Parilla");
        heladeria.setCliente("Madoka");
        heladeria.setCliente("Pikachu");
        heladeria.setCliente("Stufful");
	heladeria.setCliente("Sawk");
        //Se ingresan a los entrenadores
        
	heladeria.setHeladero("Jorge Fernandez",1);	
	heladeria.setHeladero("Eduardo Gargarella",2);
	heladeria.setHeladero("Alvaro Duarte",3);
	heladeria.setHeladero("Andrea Maubert",4);
        
        heladeria.setDespachante("Emanuel Rodriguez");
        heladeria.setDespachante("Ricardo Duarte");
        heladeria.setDespachante("Facundo Felice");
        heladeria.setDespachante("Julieta Darti");
			
	//Se realiza la asignacion de los boxeadores por los entrenadores

       // int numeroHeladero,int numeroCliente, int numeroDespachante, int Tipo, 
        heladeria.setPedido(0,1,0,1, "Menta granizada", "Chocolate", "0", "0", "0");
        heladeria.setPedido(1,2,1,2, "Sambayon", "Banana Split", "Dulce de Leche", "0", "2");
        heladeria.setPedido(2,3,2,3, "Limon", "Mascarpone", "Frutilla", "Vainilla", "3");
        heladeria.setPedido(3,4,2,2, "Coco", "Tramontana", "Crema Americana", "0", "0");
        heladeria.setPedido(0,5,3,3, "Chocolate con Almendras", "Cookies and Cream", "Granizado", "0", "0");

         
        //Se muestra la cantidad fichada por cada entrenador
        
        heladeria.getClientesAtendidosPorHeladero(0);
        heladeria.getClientesAtendidosPorHeladero(1);
        heladeria.getClientesAtendidosPorHeladero(2);
        heladeria.getClientesAtendidosPorHeladero(3);
        
        //
        
        heladeria.getDespachosAtendidosPorDespachante(0);
        heladeria.getDespachosAtendidosPorDespachante(1);
        heladeria.getDespachosAtendidosPorDespachante(2);
        heladeria.getDespachosAtendidosPorDespachante(3);
        
         //Se muestra los boxeadores atendidos en su totalidad
        
        heladeria.getHeladeroVendioMasHelado();
        heladeria.getDespachanteConMasDespachos();

			
    }
} 
