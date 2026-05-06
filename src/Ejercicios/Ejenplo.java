/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

public class Ejenplo {

	public static void main(String[] args) {
 
		String rango;
		
		boolean destacados = false;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Escribe el nombre de la experiencia: ");
		
		String nombreExperiencia = entrada.nextLine();
		
		System.out.print("Ingrese las visitas totales: ");
		
		int visitas = entrada.nextInt();
		
		if (visitas >= 0 && visitas <= 1000) {
			
			rango = "Novato";
			
		}
		
         else if (visitas >= 1001 && visitas <= 50000) {
			
			rango = "Promesa";
			
		}
		
         else if (visitas >= 50001 && visitas <= 500000) {
			
			rango = "Desarrolador Pro";
			
		}

         else {
	
	      rango = "Dueño de Estudio";
	
}
		System.out.print("Ingrese el precio de las entradas:");
		
		int precioEntrada = entrada.nextInt();
		
		if (visitas >= 10000) {
		
	    destacados = true;
	   
		}
	    
	    String esDestacado = "NO DESTACA";
	    
	    if (destacados == true) {
	    	
	    	esDestacado = "DESTACA";
	    	
	    }
	    
	    
	    
		int gananciaBruta = visitas * precioEntrada;
		
		System.out.println("Experiencia: "+ nombreExperiencia);
		System.out.println("Visitas: "+visitas);
		System.out.println("Estado de Front page: "+ esDestacado);
		System.out.println("Ganacia estimada "+ gananciaBruta +" Robux");
		System.out.println("Rango de Desarrolador: "+ rango);
		
		
	}
	}

