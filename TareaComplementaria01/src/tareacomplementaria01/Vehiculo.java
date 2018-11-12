/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomplementaria01;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
   private String Fabricante;
   private String Matrícula;
   private int AniodeFabricacion;
   private double VelocidadMaxima;
   
    public Vehiculo() {
    }
    
    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getMatrícula() {
        return Matrícula;
    }

    public void setMatrícula(String Matrícula) {
        this.Matrícula = Matrícula;
    }

    public int getAniodeFabricacion() {
        return AniodeFabricacion;
    }

    public void setAniodeFabricacion(int AniodeFabricacion) {
        this.AniodeFabricacion = AniodeFabricacion;
    }

    public double getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(double VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public void arrancar ( ){
       this.VelocidadMaxima=10;
    }
    public void acelerar (double VelocidadMaxima){
       this.VelocidadMaxima++;
    }
    public void  frenar (double VelocidadMaxima){
       this.VelocidadMaxima--;
    }
    public void apagar ( ){
       this.VelocidadMaxima=0;
    }
   
   
}
