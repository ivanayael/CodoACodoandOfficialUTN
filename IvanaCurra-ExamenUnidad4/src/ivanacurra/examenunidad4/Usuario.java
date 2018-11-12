/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad4;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    
    public Usuario() {
        this.nombre = Ventana.txtNombre.getText();
        this.apellido = Ventana.txtApellido.getText();
    }
    
    

    @Override
    public String toString() {
        return nombre + " " + apellido;
        
    }
    
    
    
}
