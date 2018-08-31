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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class OperacionArchivo {
	
	//crea el archivo en disco, recibe como parámetro la lista de estudiantes
	public static void crearArchivo(ArrayList lista) {
		FileWriter flwriter = null;
                Date myDate = new Date();
                DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
                
                File Carpeta = new File("C:\\pumper\\operacion");
                if (!Carpeta.exists()) {
                     Carpeta.mkdirs();
                }
                File archivo = new File("C:\\pumper\\operacion\\operaciones" + dateFormat.format(myDate) +".txt");
		try {
                      			
                        //crea el flujo para escribir en el archivo
			flwriter = new FileWriter(archivo);
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
                        
                    for (Iterator it = lista.iterator();  it.hasNext();) {
                        Operacion operacion = (Operacion) it.next();
                        //escribe los datos en el archivo
                        bfwriter.write(operacion.getNroPedido() + "," + operacion.getTipoCombo() + "," + operacion.getHamburguesa()
                                + "," + operacion.getPapas() + "," + operacion.getPanComun() + "," + operacion.getPanCenteno()
                                + "," + operacion.getAguaC() + "," + operacion.getGaseosaC() + "," + operacion.getGaseosaM()
                                + "," + operacion.getGaseosaG() + "," + operacion.getCerveza() + "," + operacion.getQueso()
                                + "," + operacion.getCebolla() + "," + operacion.getKetchup() + "," + operacion.getMayonesa()
                                + "," + operacion.getGini() + "," + operacion.getMobur() + "," + operacion.getJuguete_nena()
                                + "," + operacion.getJuguete_nene() + "," + operacion.getPrecioUnitario() + "," + operacion.getCantidad()
                                + "," + operacion.getSubtotal());
                        bfwriter.newLine();
                    }
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");
 
		} catch (IOException e) {
			e.getMessage();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.getMessage();
				}
			}
		}
	}
	
	//crea el archivo en disco, retorna la lista de operaciones
	public static ArrayList leerArchivo() {
                Date myDate = new Date();
                DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		// crea el flujo para leer desde el archivo
		File file = new File("C:\\pumper\\operacion\\operaciones" + dateFormat.format(myDate) +".txt");
		ArrayList listaOperaciones= new ArrayList<>();	
		Scanner scanner;
		try {
			//se pasa el flujo al objeto scanner
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				// el objeto scanner lee linea a linea desde el archivo
				String linea = scanner.nextLine();
				Scanner delimitar = new Scanner(linea);
				//se usa una expresión regular
				//que valida que antes o despues de una coma (,) exista cualquier cosa
				//parte la cadena recibida cada vez que encuentre una coma				
				delimitar.useDelimiter("\\s*,\\s*");
                                delimitar.useLocale(Locale.ENGLISH);
				Operacion e= new Operacion();
				e.setNroPedido(delimitar.nextInt());   
                                e.setTipoCombo(delimitar.nextInt());   
                                e.setHamburguesa(delimitar.nextInt());                                       
                                e.setPapas(delimitar.nextInt());   
                                e.setPanComun(delimitar.nextInt());   
                                e.setPanCenteno(delimitar.nextInt());		  
                                e.setAguaC(delimitar.nextInt());   
                                e.setGaseosaC(delimitar.nextInt());   
                                e.setGaseosaM(delimitar.nextInt());     
                                e.setGaseosaG(delimitar.nextInt());   
                                e.setCerveza(delimitar.nextInt());   
                                e.setQueso(delimitar.nextInt());                
                                e.setCebolla(delimitar.nextInt());   
                                e.setKetchup(delimitar.nextInt());   
                                e.setMayonesa(delimitar.nextInt());                              
                                e.setGini(delimitar.nextInt());   
                                e.setMobur(delimitar.nextInt());   
                                e.setJuguete_nena(delimitar.nextInt());                                  
                                e.setJuguete_nene(delimitar.nextInt());   
                                e.setPrecioUnitario(delimitar.nextDouble());   
                                e.setCantidad(delimitar.nextInt());                             
                                e.setSubtotal();  
                                listaOperaciones.add(e);
			}
			//se cierra el ojeto scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		return listaOperaciones;
	}
	
	//añadir más operaciones al archivo
	public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
                Date myDate = new Date();
                DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("C:\\pumper\\operacion\\operaciones" + dateFormat.format(myDate) +".txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
                    for (Iterator it = lista.iterator(); it.hasNext();) {
                        Operacion operacion = (Operacion) it.next();
                        //escribe los datos en el archivo
                        bfwriter.write(operacion.getNroPedido() + "," + operacion.getTipoCombo() + "," + operacion.getHamburguesa()
                                + "," + operacion.getPapas() + "," + operacion.getPanComun() + "," + operacion.getPanCenteno()
                                + "," + operacion.getAguaC() + "," + operacion.getGaseosaC() + "," + operacion.getGaseosaM()
                                + "," + operacion.getGaseosaG() + "," + operacion.getCerveza() + "," + operacion.getQueso()
                                + "," + operacion.getCebolla() + "," + operacion.getKetchup() + "," + operacion.getMayonesa()
                                + "," + operacion.getGini() + "," + operacion.getMobur() + "," + operacion.getJuguete_nena()
                                + "," + operacion.getJuguete_nene() + "," + operacion.getPrecioUnitario() + "," + operacion.getCantidad()
                                + "," + operacion.getSubtotal());
                        bfwriter.newLine();
                    }
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");
 
		} catch (IOException e) {
			e.getMessage();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.getMessage();
				}
			}
		}
	}	
}
