/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComercioBurger;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Contacto {
    
    private String fechaNacimiento;
    private String telefono;
    private int cantHijos;
    private String[] NombreCompletoHijos;
    private Cliente cliente;

   
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public String getNombreCompletoHijos() {
        String NombreHijos = "";
        for (String Nombre : NombreCompletoHijos) {
            NombreHijos = NombreHijos + " " + Nombre;
        }
	return NombreHijos;
    }

    public void setNombreCompletoHijos(String[] NombreCompletoHijos) {
        this.NombreCompletoHijos = NombreCompletoHijos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Contacto(String fechaNacimiento, String telefono, int cantHijos, String[] NombreCompletoHijos, Cliente cliente) {
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
        this.NombreCompletoHijos = NombreCompletoHijos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Contacto{" + "fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", cantHijos=" + cantHijos + ", NombreCompletoHijos=" + Arrays.toString(NombreCompletoHijos) + ", cliente=" + cliente + '}';
    }
    
    
    
    
    
    
}
