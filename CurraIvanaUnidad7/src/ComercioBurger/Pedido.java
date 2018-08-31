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
public class Pedido {
    
    private int NroPedido;
    private int TipoCombo;
    private int Hamburguesa;
    private int Papas;
    private int Queso;
    private int Cebolla;
    private int juguete_nena;
    private int juguete_nene;
    private int Ketchup;
    private int Mayonesa;
    private int GaseosaC;
    private int GaseosaM;
    private int GaseosaG;
    private int AguaC;
    private int Cerveza;  
    private int PanComun;
    private int PanCenteno;
    private int Gini;
    private int Mobur;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    String Bebida;

    public Pedido(int NroPedido, int TipoCombo, int Hamburguesa, int Papas, int Queso, int Cebolla, int juguete_nena, int juguete_nene, int Ketchup, int Mayonesa, int GaseosaC, int GaseosaM, int GaseosaG, int AguaC, int Cerveza, int PanComun, int PanCenteno, int Gini, int Mobur, int cantidad, double precioUnitario) {
        this.NroPedido = NroPedido;
        this.TipoCombo = TipoCombo;
        this.Hamburguesa = Hamburguesa;
        this.Papas = Papas;
        this.Queso = Queso;
        this.Cebolla = Cebolla;
        this.juguete_nena = juguete_nena;
        this.juguete_nene = juguete_nene;
        this.Ketchup = Ketchup;
        this.Mayonesa = Mayonesa;
        this.GaseosaC = GaseosaC;
        this.GaseosaM = GaseosaM;
        this.GaseosaG = GaseosaG;
        this.AguaC = AguaC;
        this.Cerveza = Cerveza;  
        this.PanComun = PanComun;
        this.PanCenteno = PanCenteno;
        this.Gini = Gini;
        this.Mobur = Mobur;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getNroPedido() {
        return NroPedido;
    }

    public void setNroPedido(int NroPedido) {
        this.NroPedido = NroPedido;
    }

    public int getTipoCombo() {
        return TipoCombo;
    }

    public void setTipoCombo(int TipoCombo) {
        this.TipoCombo = TipoCombo;
    }

    public int getHamburguesa() {
        return Hamburguesa;
    }

    public void setHamburguesa(int Hamburguesa) {
        this.Hamburguesa = Hamburguesa;
    }

    public int getPapas() {
        return Papas;
    }

    public void setPapas(int Papas) {
        this.Papas = Papas;
    }

    public int getQueso() {
        return Queso;
    }

    public void setQueso(int Queso) {
        this.Queso = Queso;
    }

    public int getCebolla() {
        return Cebolla;
    }

    public void setCebolla(int Cebolla) {
        this.Cebolla = Cebolla;
    }

    public int getJuguete_nena() {
        return juguete_nena;
    }

    public void setJuguete_nena(int juguete_nena) {
        this.juguete_nena = juguete_nena;
    }

    public int getJuguete_nene() {
        return juguete_nene;
    }

    public void setJuguete_nene(int juguete_nene) {
        this.juguete_nene = juguete_nene;
    }

    public int getKetchup() {
        return Ketchup;
    }

    public void setKetchup(int Ketchup) {
        this.Ketchup = Ketchup;
    }

    public int getMayonesa() {
        return Mayonesa;
    }

    public void setMayonesa(int Mayonesa) {
        this.Mayonesa = Mayonesa;
    }

    public int getGaseosaC() {
        return GaseosaC;
    }

    public void setGaseosaC(int GaseosaC) {
        this.GaseosaC = GaseosaC;
    }

    public int getGaseosaM() {
        return GaseosaM;
    }

    public void setGaseosaM(int GaseosaM) {
        this.GaseosaM = GaseosaM;
    }

    public int getGaseosaG() {
        return GaseosaG;
    }

    public void setGaseosaG(int GaseosaG) {
        this.GaseosaG = GaseosaG;
    }

    public int getAguaC() {
        return AguaC;
    }

    public void setAguaC(int AguaC) {
        this.AguaC = AguaC;
    }

    public int getCerveza() {
        return Cerveza;
    }

    public void setCerveza(int Cerveza) {
        this.Cerveza = Cerveza;
    }

    public int getPanComun() {
        return PanComun;
    }

    public void setPanComun(int PanComun) {
        this.PanComun = PanComun;
    }

    public int getPanCenteno() {
        return PanCenteno;
    }

    public void setPanCenteno(int PanCenteno) {
        this.PanCenteno = PanCenteno;
    }


    public int getGini() {
        return Gini;
    }

    public void setGini(int Gini) {
        this.Gini = Gini;
    }

    public int getMobur() {
        return Mobur;
    }

    public void setMobur(int Mobur) {
        this.Mobur = Mobur;
    }

    @Override
    public String toString() {
   
    if (GaseosaC != 0)
    {
       Bebida = "Gaseosa Chica";         
    } else if(GaseosaM != 0)
    {
       Bebida = "Gaseosa Mediana";         
    } else if(GaseosaG != 0)
    {
       Bebida = "Gaseosa Grande";         
    } else if(AguaC!= 0)
    {
       Bebida = "Agua sin Gas Chica";         
    } else if(Cerveza!= 0)
    {
       Bebida = "Lata de Cerveza";         
    }
    
    return "Número de Pedido=" + NroPedido + "\n" + 
           "Tipo de Combo=" + TipoCombo + " x " + cantidad + "\n" +
               "Precio Unitario= " + precioUnitario + "\n" +
               "Subtotal= " + subtotal + "\n" +
               "------ DETALLE DEL PEDIDO ------\n" +
               "Cant. de Hamburguesas =" + Hamburguesa + "\n" +
               "Cant. de Papas =" + Papas + "\n" +
               "Cant. de Queso =" + Queso + "\n" +
               "Cant. de Cebolla=" + Cebolla + "\n" +
               "Bebida=" + Bebida + "\n" + 
               "Cant. juguete de niñas =" + juguete_nena+ "\n" +
               "Cant. juguete de niños =" + juguete_nene+ "\n" + 
               "----------- Condimentos ----------\n" +
               "Ketchup=" + Ketchup + "\n" + 
               "Mayonesa=" + Mayonesa + "\n" + 
               "Gini=" + Gini + "\n" + 
               "Mobur=" + Mobur + "\n" + 
               "----------- Tipo de Pan ----------\n" +
               "Pan Comun=" + PanComun + "\n" + 
               "Pan de Centeno=" + PanCenteno + "\n"; 
    }

}