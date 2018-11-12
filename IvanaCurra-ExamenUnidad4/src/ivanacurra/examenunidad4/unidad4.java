/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanacurra.examenunidad4;
import java.awt.Dimension;
import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana window = new Ventana();
        
        window.setTitle("Alumnos");
        window.setPreferredSize(new Dimension(600, 400));
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
      
        Ventana2 window1 = new Ventana2();

        window1.setTitle("Flores");
        window1.setPreferredSize(new Dimension(550, 450));
        window1.pack();
        window1.setLocationRelativeTo(null);
        
        window1.cbTipoFlor.addItem("Girasol");
        window1.cbTipoFlor.addItem("Cerezo");
        window1.cbTipoFlor.addItem("Margarita");
        window1.cbTipoFlor.addItem("Durazno");
        window1.cbTipoFlor.addItem("Alelí");
         
        window1.setVisible(true);
        



        
    }
    
}
