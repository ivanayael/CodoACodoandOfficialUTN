/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad3;


/**
 *
 * @author Ivana Yael Currá ivanayael@hotmail.com
 */
public class ProductoRefrigerado extends Producto {
    private String CodigoOrganismoSup;

    public ProductoRefrigerado(String CodigoOrganismoSup, String fechaCaducidad, String NumeroLote) {
        super(fechaCaducidad, NumeroLote);
        this.CodigoOrganismoSup = CodigoOrganismoSup;
    }

 
    public String getCodigoOrganismoSup() {
        return CodigoOrganismoSup;
    }

    public void setCodigoOrganismoSup(String CodigoOrganismoSup) {
        this.CodigoOrganismoSup = CodigoOrganismoSup;
    }

    @Override
    public String toString() {
        return "Tipo de Producto: Refrigerado" +
                "\nCodigo de Organismo Supervisor: " + CodigoOrganismoSup +
                "\nFecha de Caducidad: " + fechaCaducidad + 
                "\nNúmero de Lote: " + NumeroLote + "\n";
    }
    
    
    
}
