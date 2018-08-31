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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    private String encabezado = "";
    private String cuerpo = "";
    private String pie = "";
    
    public Ticket(Date fecha, Pedido pedido, double abono, double vuelto, double precioTotal) {
        armarEncabezado(fecha);
        armarCuerpo(pedido);
        armarPie(abono, vuelto, precioTotal);
    }
    
    private void armarEncabezado(Date fecha)
    {
        
        this.encabezado = ">>>TICKET DE COMPRA<<< \n" +
                          "Comercio Burger \n" +
                          "CUIT Nro 27-341230425-5\n" +
                          "IVA RESPONSABLE INSCRIPTO\n" +
                          devolverFechaFormateada(fecha) + "\n\n";
    }
    
    private void armarCuerpo(Pedido pedido)
    {
        if (pedido.getCantidad() > 0) {
                this.cuerpo += pedido.toString() + "\n";
            }
        this.cuerpo += "\n";
    }
    
    private void armarPie(double abono, double vuelto, double precioTotal)
    {
        this.pie = "TOTAL:\t\t\t" + precioTotal + "\n" +
                          "Abona con:\t\t" + abono + "\n" +
                          "Su vuelto:\t\t" + vuelto + "\n\n" +
                          "GRACIAS POR CONFIAR EN NOSOTROS !\n";
    }
    
    private String devolverFechaFormateada(Date fecha)
    {
        fecha = new Date();
        DateFormat miFormato = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        return miFormato.format(fecha);
    }

    @Override
    public String toString() {
        return this.encabezado + this.cuerpo + this.pie;
    }
}
