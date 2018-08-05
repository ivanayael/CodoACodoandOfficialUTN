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
public class Boxeador {
    
    private String nombre;
    private String peso; 
    private Asignacion asignacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
   
    public String setCategoria(String peso) {
        String categoria;
        float pesaje = Float.parseFloat(peso);
        if  (pesaje >= 48.988 && pesaje <= 52.162)
        {
            categoria = "Califica en categoria Mosca";
        }
        else if  (pesaje >= 52.163 && pesaje <= 55.337)
        {
           categoria = "Califica en categoria Gallo";
        }
        else if  (pesaje >= 55.338 && pesaje <= 58.966)
        {
            categoria = "Califica en categoria Pluma";
        }
        else if  (pesaje >= 58.967 && pesaje <= 63.502)
        {
            categoria = "Califica en categoria Ligero";
        }
        else if  (pesaje >= 63.503 && pesaje <= 69.852)
        {
            categoria = "Califica en categoria Welter";
        }
        else if  (pesaje >= 69.853 && pesaje <= 76.204)
        {
            categoria = "Califica en categoria Mediano";
        }
        else if  (pesaje >= 76.205 && pesaje <= 90.999)
        {
           categoria = "Califica en categoria Mediopesado";
        }
        else if  (pesaje >= 91)
        {
            categoria = "Califica en categoria Mediopesado";
        }
        else
        {
            categoria = "Debe hacer dieta y repesaje";
        }
        return categoria;

    }

  
    public String setDieta(String peso){
        String dieta;
        float dietaengorde = Float.parseFloat(peso);
        if  (dietaengorde < 48.988)
        {
            dieta = "Debe hacer dieta para Mosca";
        }
        else if  (dietaengorde > 50.802 && dietaengorde < 52.163)
        {
            dieta = "Debe hacer dieta para Gallo";
        }
        else if  (dietaengorde > 53.525 && dietaengorde < 55.338)
        {
            dieta = "Debe hacer dieta para Pluma";
        }
        else if  (dietaengorde > 57.152 && dietaengorde < 58.967)
        {
            dieta = "Debe hacer dieta para Ligero";
        }
        else if  (dietaengorde > 61.237 && dietaengorde < 63.503)
        {
            dieta = "Debe hacer dieta para Welter";
        }
        else if  (dietaengorde > 66.678 && dietaengorde < 69.853)
        {
            dieta = "Debe hacer dieta para Mediano";
        }
        else if  (dietaengorde > 72.562 && dietaengorde < 76.205)
        {
            dieta = "Debe hacer dieta para Mediopesado";
        }
        else if  (dietaengorde > 79.378 && dietaengorde < 91)
        {
            dieta = "Debe hacer dieta para Pesado";
        }
        else
        {
           dieta = "No es necesaria la dieta";
        }
        return dieta;
    }

    /**
     *
     * @return
     */
    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }
    

    public Boxeador(String nombre, String peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Boxeado \nNombre" + getNombre() + "\npeso" + getPeso();
    }

    
    
  
}