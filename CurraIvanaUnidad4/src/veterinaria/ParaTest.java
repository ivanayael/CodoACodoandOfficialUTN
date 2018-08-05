/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author currai
 */
public class ParaTest {
    public static void main(String[] args) {
        // Se agregan a las mascotas
        
        int A = 53;
        int B = 1953786;
        
        String binaryA = Integer.toBinaryString(A);
        String binaryB = Integer.toBinaryString(B);
        
        
        int indexOf = binaryB.indexOf(binaryA);
        
        System.out.println(indexOf);
        
        
        Veterinaria veterinaria= new Veterinaria();
        veterinaria.setMascota("gonzalo","perro","labrador",3,"Problemas para caminar");
        veterinaria.setMascota("mimosa","gato","siames",5,"Fiebre");
        veterinaria.setMascota("rosso","perro","mastin",3,"dolor abdominal");
        veterinaria.setMascota("paco","perro","labrador",3,"Tiene problemas para dormir");
        veterinaria.setMascota("luna","perro","grifon",3,"No puede caminar bien");
        veterinaria.setMascota("lunaII","perro","border terrier",2,"Descompostura");
        veterinaria.setMascota("sakura","perro","samoyedo",4,"No puede sentarse");
        veterinaria.setMascota("kiara","perro","labrador",4,"Pata doblada");
	veterinaria.setMascota("celestin","perro","crestado chino",4,"Accidente con bicicleta");
	veterinaria.setMascota("ramón","perro","labrador",3,"Tiene problemas para dormir");
	veterinaria.setMascota("steven","perro","pastor",3,"Descompostura");
	veterinaria.setMascota("Ben","gato","bengala",3,"Problemas para sentarse");
	veterinaria.setMascota("Goro","gato","munchkin",3,"Cola rígida");
	veterinaria.setMascota("Merida","gato","siberiano",3,"Pata doblada");
	veterinaria.setMascota("bob","conejo","belier",5,"Descompostura");
	veterinaria.setMascota("malibú","conejo","enano",3,"Oreja caida");
	veterinaria.setMascota("tom","conejo","labrador",3,"Descompostura");
	veterinaria.setMascota("cintia","gato","ragdoll",3,"Dificultad para moverse");
	veterinaria.setMascota("blake","gato","korat",3,"Accidente con auto");
	veterinaria.setMascota("angela","conejo","hyplus",3,"Descompostura");
	veterinaria.setMascota("pixie","conejo","nebelung",3,"Descompostura");
	
        //Se ingresan a los doctores
        
	veterinaria.setMedico("Jorge Fernandez");	
	veterinaria.setMedico("Eduardo Gargarella");
	veterinaria.setMedico("Alvaro Duarte");
	veterinaria.setMedico("Andrea Maubert");
	veterinaria.setMedico("Carolina Andrada");
	veterinaria.setMedico("Ariel Devello");
			
	//Se realiza la atención de las mascotas por los doctores
        veterinaria.setAtencion(0,1, "Infeccion cutanea", new String[]{"Falta de limpieza"}, new String[]{"desinflamatorio"});
        veterinaria.setAtencion(1,2, "Esguince", new String[]{"Falta de ejercicio"}, new String[]{"reposo en el hogar"});
        veterinaria.setAtencion(2,3, "Rotura", new String[]{"Accidente grave"}, new String[]{"bendas y cuello ortopédico"});
        veterinaria.setAtencion(3,4, "Mala digestión", new String[]{"Intestino delgado rotado"}, new String[]{"reposo"});
        veterinaria.setAtencion(4,5, "Infección urinaria", new String[]{"´calculos en el riñon"}, new String[]{"4 litros de agua al día"});
        veterinaria.setAtencion(4,6, "Gripe", new String[]{"Mucha exposición al frío"}, new String[]{"abrigo y reposo"});
        veterinaria.setAtencion(0,7, "Infeccion cutanea", new String[]{"pulgas"}, new String[]{"collar antipulgas"});

        //Se muestra la cantidad atendida por cada doctor
        
        veterinaria.getAnimalesAtendidosPorMedico(0);
        veterinaria.getAnimalesAtendidosPorMedico(1);
        veterinaria.getAnimalesAtendidosPorMedico(2);
        veterinaria.getAnimalesAtendidosPorMedico(3);
        veterinaria.getAnimalesAtendidosPorMedico(4);

			
    }
} 
