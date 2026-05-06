
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
		
	public static void limpiezaDePantalla() {
		
		for (int i = 0 ; i < 50; i++) {
			
			System.out.println("");
			
		}
		
	}
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);	
	
	boolean repetir = true;
	
	int opcion = 0 ;
	
	int puntaje = 0 ;
	
	int newRecord = 0 ;
	
	String letra = "";
	
	boolean maxRecord = false; 
	
	do {
		
		limpiezaDePantalla();
		
		System.out.println("1- Ingresar nuevo puntaje ");
		System.out.println("2- Record ");
		System.out.println("3- Salir ");
		
		opcion = entrada.nextInt();
		
		switch (opcion) {
		
		case 1: 
			
			System.out.println("Ingrese su nuevo puntaje ");
			
			puntaje = entrada.nextInt();
			
		    if (puntaje > newRecord) {
		    
		    	newRecord = puntaje;
		    	
		    	if (newRecord > 500) {
		    
		    	newRecord = 500;
		    	
		    	maxRecord = true;
		    }
		    	
		    }	
		    	
		    System.out.println("Press any char for continue");
		    
		    letra = entrada.next();
			
			break;
			
		case 2:
			
			System.out.println("Tu record es de "+ newRecord + " puntos." );
			if (maxRecord) {
				
				System.out.println("HAZ ALCANZADO EL PUNTAJE MAXIMO.");
				
			}
			
            System.out.println("Press any char for continue");
		    
		    letra = entrada.next(); 
			
			break;
		case 3: 
			
			repetir = false; break;
		}
		
	}while (repetir);
	}
}

