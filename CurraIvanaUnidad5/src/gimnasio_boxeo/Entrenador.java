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

public class Entrenador {
    private String nombre;
    private int Fichado=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFichado() {
        return Fichado;
    }

    public void setFichado(int Fichado) {
        this.Fichado = Fichado;
    }

    public Entrenador(String nombre) {
        super();
        this.nombre = nombre;
    }
    
    public void setAsignacion(Boxeador boxeador){
        if(this.Fichado < 5){
            boxeador.setAsignacion(new Asignacion(this.Fichado));
            System.out.println("El boxeador " + boxeador.getNombre()+ " fué fichado y asignado al entrenador : " +this.nombre);
            System.out.println(boxeador.setCategoria(boxeador.getPeso()));
            System.out.println(boxeador.setDieta(boxeador.getPeso()));
            this.Fichado++;
        } else {
            System.out.println("El entrenado " + this.nombre + " no puede antender a mas boxeadores");
        }
    }
    
    public void getAsignacion(Boxeador boxeador){
            System.out.println("El boxeador " + boxeador.getNombre());
            System.out.println("Tiene el Peso " + boxeador.getPeso());
    }
}