/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curraivana.ejerciciotipo;

/**
 *
 * @author Usuario
 */
public class CurraIvanaEjercicioTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Empleado e = new Empleado("Orlando Arróliga","12345",17,true,2000);
      Programador p1 = new Programador("Flavio","3456",20,false,1000,123,"Visual Basic");
      p1.nombre = "Flavio";
      p1.salario = 1000;
      p1.AumentarSalario(0.25);
      p1.ImprimirEmpleado();
    }
    
}
