/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

/**
 *
 * @author currai
 */
public class Pedido {
    
    private int Tipo;
    private String Gusto1;
    private String Gusto2;
    private String Gusto3;
    private String Gusto4;
    private String Plus;
    
    public Pedido() {
        super();
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public String getGusto1() {
        return Gusto1;
    }

    public void setGusto1(String Gusto1) {
        this.Gusto1 = Gusto1;
    }

    public String getGusto2() {
        return Gusto2;
    }

    public void setGusto2(String Gusto2) {
        this.Gusto2 = Gusto2;
    }

    public String getGusto3() {
        return Gusto3;
    }

    public void setGusto3(String Gusto3) {
        this.Gusto3 = Gusto3;
    }

    public String getGusto4() {
        return Gusto4;
    }

    public void setGusto4(String Gusto4) {
        this.Gusto4 = Gusto4;
    }

    public String getPlus() {
        return Plus;
    }

    public void setPlus(String Plus) {
        this.Plus = Plus;
    }

    public Pedido(int Tipo, String Gusto1, String Gusto2, String Gusto3, String Gusto4, String Plus) {
        super();
        this.Tipo = Tipo;
        this.Gusto1 = Gusto1;
        this.Gusto2 = Gusto2;
        this.Gusto3 = Gusto3;
        this.Gusto4 = Gusto4;
        this.Plus = Plus;
    }

    @Override
    public String toString() {
        return "Pedido{" + "Tipo=" + Tipo + ", Gusto1=" + Gusto1 + ", Gusto2=" + Gusto2 + ", Gusto3=" + Gusto3 + ", Gusto4=" + Gusto4 + ", Plus=" + Plus + '}';
    }
    

}