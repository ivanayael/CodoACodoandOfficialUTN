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
class Empleado{
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;
    
    Empleado(){
    }
    Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    public String Clasificacion(){
        String c="";
        if (edad <= 21){
            c = "Principiante";
        }
        if ((edad >=22) & (edad <= 35)){
            c = "Intermedio";
        }
        if (edad > 35){
            c = "Senior";
        }
        return c;
    }
    
    public void ImprimirEmpleado(){
        System.out.println(this.nombre);
        System.out.println(this.cedula);
        System.out.println(this.edad);
        if (casado) {
            System.out.println("Casado");
        }
        else
        {
            System.out.println("Soltero");
        }
        System.out.println(this.salario);
    }
    
    public void AumentarSalario(double incremento){
        salario = salario * (1 + incremento);
    }
}