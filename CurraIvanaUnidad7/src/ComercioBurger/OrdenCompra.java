/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComercioBurger;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class OrdenCompra {
    private Date fecha;
    private int cantReposicion;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = new Date();
    }

    public int getCantReposicion() {
        return cantReposicion;
    }

    public void setCantReposicion(int cantReposicion) {
        this.cantReposicion = cantReposicion;
    }

    public OrdenCompra() {
      
    }



    
    
}
