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
import java.util.Date;

public class Venta {
    private Date fecha;
    private Pedido pedido;
    private double abono;
    private double vuelto;
    private double precioTotal;
    private Ticket ticket;
    
    public Venta(double abono) {
        this.abono = abono;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = new Date();
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto() {
        //  this.vuelto = vuelto;
        this.vuelto = this.abono - this.precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
       // this.precioTotal = precioTotal;
        this.precioTotal += this.pedido.getSubtotal();
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket() {
        this.ticket = new Ticket(this.fecha, this.pedido, this.abono, this.vuelto, this.precioTotal);
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", pedido=" + pedido + ", abono=" + abono + ", vuelto=" + vuelto + ", precioTotal=" + precioTotal + ", ticket=" + ticket + '}';
    }
    
    
    
   
   


    
}
