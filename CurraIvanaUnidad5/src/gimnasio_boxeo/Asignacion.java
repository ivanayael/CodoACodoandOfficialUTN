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
public class Asignacion {
    
    private int NumeroAsignacion;
    
    public int getNumeroAsignacion() {
        return NumeroAsignacion;
    }

    public void setNumeroAsignacion(int NumeroAsignacion) {
        this.NumeroAsignacion = NumeroAsignacion;
    }

    public Asignacion(int NumeroAsignacion) {
        super();
        this.NumeroAsignacion = NumeroAsignacion;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "NumeroAsignacion=" + NumeroAsignacion + '}';
    }
     
    
}
