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
class Programador extends Empleado{
    int lineasDeCodigoPorHora;
    String lenguajeDominante;
    
    Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
        super.nombre = nombre;
        super.cedula = cedula;
        super.edad = edad;
        super.casado = casado;
        super.salario = salario;
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    Programador(){
    }
}