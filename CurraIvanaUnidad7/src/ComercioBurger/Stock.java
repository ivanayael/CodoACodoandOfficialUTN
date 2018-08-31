
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
public class Stock {
    private static int MAX_HAMBURGUESA = 100;
    private static int MAX_QUESO = 300;
    private static int MAX_PAPAS = 1000;
    private static int MAX_CEBOLLA = 300;
    private static int MAX_JUGUETE_NENA = 100;
    private static int MAX_JUGUETE_NENE = 100;
    private static int MAX_KETCHUP = 70;
    private static int MAX_MAYONESA = 70;
    private static int MAX_GASEOSA = 600;
    private static int MAX_AGUA = 600;
    private static int MAX_PAN = 100;
    private static int MAX_PAN_CENTENO = 100;
    private static int MAX_GINI = 100;
    private static int MAX_MOBUR = 100;
    private static int MAX_CERVEZA = 600;
    private static double PRECIO_COMBO1 = 1000;
    private static double PRECIO_COMBO2 = 2000;
    private static double PRECIO_COMBO3 = 4000;
    private static double PRECIO_COMBO4 = 5000;
    public static int cantHamburguesa;
    public static int cantQueso;
    public static int cantPapas;
    public static int cantCebolla;
    public static int cantJugueteNena; 
    public static int cantJugueteNene; 
    public static int cantKetchup; 
    public static int cantMayonesa; 
    public static int cantGaseosa; 
    public static int cantAgua;
    public static int cantPan; 
    public static int cantPanCenteno; 
    public static int cantGini; 
    public static int cantMobur; 
    public static int cantCerveza;

    
   
     
 public Stock(int cantHamburguesa, int cantQueso, int cantPapas,int cantCebolla, int cantJugueteNena, int cantJugueteNene, int cantKetchup, int cantMayonesa, int cantGaseosa, int cantAgua, int cantCerveza, int cantPan, int cantPanCenteno, int cantGini, int cantMobur) {
      setCantHamburguesa(cantHamburguesa);
      setCantQueso(cantQueso);
      setCantPapas(cantPapas); 
      setCantCebolla(cantCebolla);
      setCantJugueteNena(cantJugueteNena); 
      setCantJugueteNene(cantJugueteNene);
      setCantKetchup(cantKetchup);
      setCantMayonesa(cantMayonesa);
      setCantGaseosa(cantGaseosa);
      setCantAgua(cantAgua);
      setCantCerveza(cantCerveza);
      setCantPan(cantPan);
      setCantPanCenteno(cantPanCenteno);
      setCantGini(cantGini);
      setCantMobur(cantMobur);

    }

    public static int getCantHamburguesa() {
        return cantHamburguesa;
    }

    public void setCantHamburguesa(int cantHamburguesa) {
        if (cantHamburguesa > 0 && cantHamburguesa <= this.MAX_HAMBURGUESA && this.MAX_HAMBURGUESA > 50) {
            this.cantHamburguesa = this.MAX_HAMBURGUESA - cantHamburguesa;
            this.MAX_HAMBURGUESA = this.cantHamburguesa;
        } else if (this.MAX_CERVEZA <= 50) {
            this.cantHamburguesa = 0;
        } else {
            this.cantHamburguesa = 0;
        }   
    } 
    
       
    public static int getCantCerveza() {
        return cantCerveza;
    }

    public void setCantCerveza(int cantCerveza) {
        if (cantCerveza <= this.MAX_CERVEZA && this.MAX_CERVEZA > 50) {
            this.cantCerveza = this.MAX_CERVEZA - cantCerveza;
            this.MAX_CERVEZA = this.cantCerveza;
        } else if (this.MAX_CERVEZA <= 50) {
            this.cantCerveza = 0;
        } else {
            this.cantCerveza = 0;
        }
    }

    public static int getCantQueso() {
        return cantQueso;
    }

    public void setCantQueso(int cantQueso) {
        if (cantQueso > 0 && cantQueso <= this.MAX_QUESO && this.MAX_QUESO > 50) {
            this.cantQueso = this.MAX_QUESO - cantQueso;
            this.MAX_QUESO = this.cantQueso;
        } else if (this.MAX_QUESO <= 50) {
            this.cantQueso = this.MAX_QUESO;
        } else {
            this.cantQueso = 0;
        }
    }

    public static int getCantPapas() {
        return cantPapas;
    }

    public void setCantPapas(int cantPapas) {
        if (cantPapas > 0 &&  cantPapas <= this.MAX_PAPAS && this.MAX_PAPAS > 50) {
            this.cantPapas = this.MAX_PAPAS - cantPapas;
            this.MAX_PAPAS = this.cantPapas;
        } else if (this.MAX_PAPAS <= 50) {
            this.cantPapas = this.MAX_PAPAS;
        } else {
            this.cantPapas = 0;
        } 
    }

    public static int getCantCebolla() {
        return cantCebolla;
    }

    public void setCantCebolla(int cantCebolla) {
        if (cantCebolla > 0 && cantCebolla <= this.MAX_CEBOLLA && this.MAX_CEBOLLA > 50) {
            this.cantCebolla = this.MAX_CEBOLLA - cantCebolla;
            this.MAX_CEBOLLA = this.cantCebolla;
        } else if (this.MAX_CEBOLLA <= 50) {
            this.cantCebolla = this.MAX_CEBOLLA;
        } else {
            this.cantCebolla = 0;
        } 
    }

    public static int getCantJugueteNena() {
        return cantJugueteNena;
    }

    public void setCantJugueteNena(int cantJugueteNena) {
        if (cantJugueteNena <= this.MAX_JUGUETE_NENA && this.MAX_JUGUETE_NENA > 50) {
            this.cantJugueteNena = this.MAX_JUGUETE_NENA - cantJugueteNena;
            this.MAX_JUGUETE_NENA = this.cantJugueteNena; 
        } else if (this.MAX_JUGUETE_NENA <= 50) {
            this.cantJugueteNena = 0;
        } else {
            this.cantJugueteNena = 0;
        } 
    }

    public static int getCantJugueteNene() {
        return cantJugueteNene;
    }

    public void setCantJugueteNene(int cantJugueteNene) {
        if (cantJugueteNene <= this.MAX_JUGUETE_NENE && this.MAX_JUGUETE_NENE > 50) {
        this.cantJugueteNene = this.MAX_JUGUETE_NENE - cantJugueteNene;
        this.MAX_JUGUETE_NENE = this.cantJugueteNene;
        } else if (this.MAX_JUGUETE_NENE <= 50) {
            this.cantJugueteNene = 0;
        } else {
            this.cantJugueteNene = 0;
        }
    }

    public static int getCantKetchup() {
        return cantKetchup;
    }

    public void setCantKetchup(int cantKetchup) {
        if (cantKetchup <= this.MAX_KETCHUP && this.MAX_KETCHUP > 50) {
        this.cantKetchup = this.MAX_KETCHUP - cantKetchup;
        this.MAX_KETCHUP = this.cantKetchup;
        } else if (this.MAX_KETCHUP <= 50) {
            this.cantKetchup = 0;
        } else {
            this.cantKetchup = 0;
        }
    }

    public static int getCantMayonesa() {
        return cantMayonesa;
    }

    public void setCantMayonesa(int cantMayonesa) {
        if (cantMayonesa <= this.MAX_MAYONESA && this.MAX_MAYONESA > 50) {
        this.cantMayonesa = this.MAX_MAYONESA - cantMayonesa;
        this.MAX_MAYONESA = this.cantMayonesa;
        } else if (this.MAX_MAYONESA <= 50) {
            this.cantMayonesa = 0;
        } else {
            this.cantMayonesa = 0;
        }
    }

    public static int getCantGaseosa() {
        return cantGaseosa;
    }

    public void setCantGaseosa(int cantGaseosa) {
        if (cantGaseosa <= this.MAX_GASEOSA && this.MAX_GASEOSA > 50) {
            this.cantGaseosa = this.MAX_GASEOSA - cantGaseosa;
            this.MAX_GASEOSA = this.cantGaseosa;
        } else if (this.MAX_GASEOSA <= 50) {
            this.cantGaseosa = 0;
        } else {
            this.cantGaseosa = 0;
        }
    }

    public static int getCantAgua() {
        return cantAgua;
    }

    public void setCantAgua(int cantAgua) {
        if (cantAgua <= this.MAX_AGUA && this.MAX_AGUA > 50) {
            this.cantAgua = this.MAX_AGUA - cantAgua;
            this.MAX_AGUA = this.cantAgua;
        } else if (this.MAX_AGUA <= 50) {
            this.cantAgua = 0;
        } else {
            this.cantAgua = 0;
        }
    }

    public static int getCantPan() {
        return cantPan;
    }

    public void setCantPan(int cantPan) {
        if (cantPan <= this.MAX_PAN && this.MAX_PAN > 50) {
           this.cantPan = this.MAX_PAN - cantPan;
           this.MAX_PAN = this.cantPan;
        } else if (this.MAX_PAN <= 50) {
            this.cantPan = 0;
        } else {
            this.cantPan = 0;
        }
    }

    public static int getCantPanCenteno() {
        return cantPanCenteno;
    }

    public void setCantPanCenteno(int cantPanCenteno) {
        if (cantPanCenteno <= this.MAX_PAN_CENTENO && this.MAX_PAN_CENTENO > 50 ) {
           this.cantPanCenteno = this.MAX_PAN_CENTENO - cantPanCenteno;
           this.MAX_PAN_CENTENO = this.cantPanCenteno;
        } else if (this.MAX_PAN_CENTENO <= 50) {
            this.cantPanCenteno = 0;
        } else {
            this.cantPanCenteno = 0;
        }
        
    }

    public static int getCantGini() {
        return cantGini;
    }

    public void setCantGini(int cantGini) {
        if (cantGini <= this.MAX_GINI && this.MAX_GINI > 50 ) {
            this.cantGini = this.MAX_GINI - cantGini;
            this.MAX_GINI = this.cantGini;
        } else if (this.MAX_GINI <= 50) {
            this.cantGini = 0;
        } else {
            this.cantGini = 0;
        }
    }

    public static int getCantMobur() {
        return cantMobur;
    }

    public void setCantMobur(int cantMobur) {
        if (cantMobur <= this.MAX_MOBUR && this.MAX_MOBUR > 50 ) {
            this.cantMobur = this.MAX_MOBUR - cantMobur;
            this.MAX_MOBUR = this.cantMobur;
        } else if (this.MAX_MOBUR <= 50) {
            this.cantMobur = 0;
        } else {
            this.cantMobur = 0;
        }
    }

    @Override
    public String toString() {
        return "Stock{" + "MAX_HAMBURGUESA=" + MAX_HAMBURGUESA + ", MAX_QUESO=" + MAX_QUESO + ", MAX_PAPAS=" + MAX_PAPAS + ", MAX_CEBOLLA=" + MAX_CEBOLLA + ", MAX_JUGUETE_NENA=" + MAX_JUGUETE_NENA + ", MAX_JUGUETE_NENE=" + MAX_JUGUETE_NENE + ", MAX_KETCHUP=" + MAX_KETCHUP + ", MAX_MAYONESA=" + MAX_MAYONESA + ", MAX_GASEOSA=" + MAX_GASEOSA + ", MAX_AGUA=" + MAX_AGUA + ", MAX_PAN=" + MAX_PAN + ", MAX_PAN_CENTENO=" + MAX_PAN_CENTENO + ", MAX_GINI=" + MAX_GINI + ", MAX_MOBUR=" + MAX_MOBUR + ", MAX_CERVEZA=" + MAX_CERVEZA + ", PRECIO_COMBO1=" + PRECIO_COMBO1 + ", PRECIO_COMBO2=" + PRECIO_COMBO2 + ", PRECIO_COMBO3=" + PRECIO_COMBO3 + ", PRECIO_COMBO4=" + PRECIO_COMBO4 + ", cantHamburguesa=" + cantHamburguesa + ", cantQueso=" + cantQueso + ", cantPapas=" + cantPapas + ", cantCebolla=" + cantCebolla + ", cantJugueteNena=" + cantJugueteNena + ", cantJugueteNene=" + cantJugueteNene + ", cantKetchup=" + cantKetchup + ", cantMayonesa=" + cantMayonesa + ", cantGaseosa=" + cantGaseosa + ", cantAgua=" + cantAgua + ", cantPan=" + cantPan + ", cantPanCenteno=" + cantPanCenteno + ", cantGini=" + cantGini + ", cantMobur=" + cantMobur + ", cantCerveza=" + cantCerveza + '}';
    }
    
}
