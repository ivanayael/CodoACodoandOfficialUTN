/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.Arrays;

/**
 *
 * @author currai
 */
public class Atencion {
    
    private String resultado_revisacion;
    private String[] causas;
    private String[] medicamentos;
    
    public Atencion() {
        super();
    }

    public String getResultado_revisacion() {
        return resultado_revisacion;
    }

    public void setResultado_revisacion(String resultado_revisacion) {
        this.resultado_revisacion = resultado_revisacion;
    }

    public String getCausas() {
        String causa_individual = "";
        for (String causa : causas) {
            causa_individual = causa_individual + " " + causa;
        }
	return causa_individual;
    }

    public void setCausas(String[] causas) {
        this.causas = causas;
    }

    public String getMedicamentos() {
        String medicacion="";
        for (String medicamento : medicamentos) {
            medicacion = medicacion + " " + medicamento;
        }
        return medicacion;
    }

    public void setMedicamentos(String[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Atencion(String resultado_revisacion, String[] causas, String[] medicamentos) {
        super();
        this.resultado_revisacion = resultado_revisacion;
        this.causas = causas;
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Atencion{" + "Resultado de la revisación es:" + resultado_revisacion + ", Causas:" + Arrays.toString(causas) + ", Medicamentos:" + Arrays.toString(medicamentos) + '}';
    }

}
