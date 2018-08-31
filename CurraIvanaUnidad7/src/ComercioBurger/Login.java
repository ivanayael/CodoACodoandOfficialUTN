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
public class Login {
    private String Usuario;
    private String Contrasenia;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public Login(String Usuario, String Contrasenia) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
    }

    @Override
    public String toString() {
        return "Login{" + "Usuario=" + Usuario + ", Contrasenia=" + Contrasenia + '}';
    }
    
    
    
    
}
