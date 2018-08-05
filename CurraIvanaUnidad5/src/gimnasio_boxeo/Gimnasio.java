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


public class Gimnasio {
   
    private int boxeadorIngresado=0;
    private int cantEntrenadores=0;
    private final Boxeador[] listaBoxeadores = new Boxeador[20];
    private final Entrenador[] listaEntrenadores = new Entrenador[4];
   
    
    public void setBoxeador(String nombre, String peso){
            this.listaBoxeadores[this.boxeadorIngresado]= new Boxeador(nombre, peso);
            this.boxeadorIngresado++;
    }
    
    public void setEntrenador(String nombre){
        if(cantEntrenadores < 5){
            this.listaEntrenadores[this.cantEntrenadores]= new Entrenador(nombre);
            this.cantEntrenadores++;
        } else { 
            System.out.println("Los entrenadores no pueden atender más boxeadores");
        }
    }
    
    public void setAsignacion(int numeroBoxeador, String peso) {
             float pesaje = Float.parseFloat(peso);
             if  (pesaje >= 48.988 && pesaje <= 55.337)
             {
                 listaEntrenadores[0].setAsignacion(listaBoxeadores[numeroBoxeador]);
             }
             else if  (pesaje >= 55.338 && pesaje <= 63.502)
             {
                 listaEntrenadores[1].setAsignacion(listaBoxeadores[numeroBoxeador]);
             }
             else if  (pesaje >= 63.503 && pesaje <= 76.204)
             {
                 listaEntrenadores[2].setAsignacion(listaBoxeadores[numeroBoxeador]);
             }
             else
             {
                 listaEntrenadores[3].setAsignacion(listaBoxeadores[numeroBoxeador]);
             }
    }

    public void getBoxeadoresAtendidosPorEntrenador(int numeroEntrenador){
        System.out.println("El entrenador " +  listaEntrenadores[numeroEntrenador].getNombre() +  " atendió: " + listaEntrenadores[numeroEntrenador].getFichado());
    }
    
    public void getBoxeadoresAtendidosTotales(){
        int acumulador = 0;
        for (Entrenador listaEntrenador : listaEntrenadores) {
            acumulador += listaEntrenador.getFichado();
        }
         System.out.println("El Total de Boxeadores atendidos por entrenador es: " + acumulador);
    }
}
