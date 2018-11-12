/*
1-Se plantea desarrollar un programa Java que permita la gestión de una
empresa agroalimentaria que trabaja con tres tipos de productos:
productos frescos, productos refrigerados y productos congelados. Todos
los productos llevan esta información común: fecha de caducidad y número
de lote. A su vez, cada tipo de producto lleva alguna información específica.
Los productos frescos deben llevar la fecha de envasado y el país de origen.
Los productos refrigerados deben llevar el código del organismo de
supervisión alimentaria. Los productos congelados deben llevar la
temperatura de congelación recomendada. Crear el código de las clases
Java implementando una relación de herencia desde la superclase Producto
hasta las subclases Producto Fresco, Producto Refrigerado y Producto
Congelado. Cada clase debe disponer de constructor y permitir establecer
(set) y recuperar (get) el valor de sus atributos y tener un método que
permita mostrar la información del objeto. Crear una clase testHerencia2
con el método main donde se cree un objeto de cada tipo y se muestren los
datos de cada uno de los objetos creados.
 */
package ivanacurra.examenunidad3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivana Yael Currá ivanayael@hotmail.com
 */
public class testHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
	ProductoCongelado productoCong = new ProductoCongelado(102,"12/09/2018", "015A");
	ProductoFresco productoFres = new ProductoFresco("31/08/2018","Argentina","16/09/2018","016A");
        ProductoRefrigerado productoRefri = new ProductoRefrigerado("564456","30/09/2018","017A");
        
        ProductoCongelado productoCong2 = new ProductoCongelado(82,"15/09/2018", "015B");
	ProductoFresco productoFres2 = new ProductoFresco("30/08/2018","Uruguay","18/09/2018","016B");
        ProductoRefrigerado productoRefri2 = new ProductoRefrigerado("312478","21/09/2018","017B");
        
        
        
        JOptionPane.showMessageDialog(null,productoCong.toString(),"Producto Congelado Nro 1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,productoFres.toString(),"Producto Fresco Nro 1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,productoRefri.toString(),"Producto Refrigerado Nro 1",JOptionPane.INFORMATION_MESSAGE);
  
      
        JOptionPane.showMessageDialog(null,productoCong2.toString(),"Producto Congelado Nro 2",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,productoFres2.toString(),"Producto Fresco Nro 2",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,productoRefri2.toString(),"Producto Refrigerado Nro 2",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
