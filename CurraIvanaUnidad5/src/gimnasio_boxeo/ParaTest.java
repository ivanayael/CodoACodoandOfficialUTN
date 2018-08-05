/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio_boxeo;

/**
 *
 * @author currai
 */
public class ParaTest {
    public static void main(String[] args) {
        // Se agregan a las mascotas
        Gimnasio gimnasio= new Gimnasio();
        
        gimnasio.setBoxeador("rosso","48.988");
        gimnasio.setBoxeador("rocky","52.163");
        gimnasio.setBoxeador("rick","55.338");
        gimnasio.setBoxeador("jack","58.967");
        gimnasio.setBoxeador("storm","63.503");
        gimnasio.setBoxeador("sonic","69.853");
        gimnasio.setBoxeador("HitMonChan","76.205");
        gimnasio.setBoxeador("Nick Root","29.299");
        gimnasio.setBoxeador("Rex Rut","76.321");
        gimnasio.setBoxeador("Dominic Valentino","89.209");
        gimnasio.setBoxeador("Javier Pugliese","56.324");
        gimnasio.setBoxeador("Godinez","65.234");
        gimnasio.setBoxeador("Gengar","54.343");
        gimnasio.setBoxeador("John Smith","89.334");
        gimnasio.setBoxeador("Pandora Gutierrez","34.435");
        gimnasio.setBoxeador("Poncho Parilla","44.551");
        gimnasio.setBoxeador("Madoka","41.300");
        gimnasio.setBoxeador("Pikachu Lucha","60.000");
        gimnasio.setBoxeador("Stufful","60.800");
	gimnasio.setBoxeador("Sawk","51.000");
        //Se ingresan a los entrenadores
        
	 gimnasio.setEntrenador("Jorge Fernandez");	
	 gimnasio.setEntrenador("Eduardo Gargarella");
	 gimnasio.setEntrenador("Alvaro Duarte");
	 gimnasio.setEntrenador("Andrea Maubert");
			
	//Se realiza la asignacion de los boxeadores por los entrenadores
        
        gimnasio.setAsignacion(0,"48.988");
        gimnasio.setAsignacion(1,"52.163");
        gimnasio.setAsignacion(2,"55.338");
        gimnasio.setAsignacion(3,"58.967");
        gimnasio.setAsignacion(4,"63.503");
        gimnasio.setAsignacion(5,"69.853");
        gimnasio.setAsignacion(6,"76.205");
        gimnasio.setAsignacion(7,"29.299");
        gimnasio.setAsignacion(8,"76.321");
        gimnasio.setAsignacion(9,"89.209");
        gimnasio.setAsignacion(10,"56.324");
        gimnasio.setAsignacion(11,"65.234");
        gimnasio.setAsignacion(12,"54.343");
        gimnasio.setAsignacion(13,"89.334");
        gimnasio.setAsignacion(14,"34.435");
        gimnasio.setAsignacion(15,"44.551");
        gimnasio.setAsignacion(16,"41.300");
        gimnasio.setAsignacion(17,"60.000");
        gimnasio.setAsignacion(18,"60.800");
        gimnasio.setAsignacion(19,"51.000");
         
        //Se muestra la cantidad fichada por cada entrenador
        
        gimnasio.getBoxeadoresAtendidosPorEntrenador(0);
        gimnasio.getBoxeadoresAtendidosPorEntrenador(1);
        gimnasio.getBoxeadoresAtendidosPorEntrenador(2);
        gimnasio.getBoxeadoresAtendidosPorEntrenador(3);
        
         //Se muestra los boxeadores atendidos en su totalidad
        
        gimnasio.getBoxeadoresAtendidosTotales();

			
    }
} 
