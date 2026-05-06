package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
	int partidas = 0;
	
	int sumGoles = 0;
	
	int golesTotales = 0;
	
	double promedio = 0;
		
		System.out.println("¿Cuantas partidas jugó el jugador?");
		
		partidas = entrada.nextInt();
		
		for (int i = 1 ; i <=partidas ; i++) {
			
			
			System.out.println("Goles en el partido "+ i +" :");
			  
			sumGoles = entrada.nextInt();
			
			golesTotales += sumGoles;
			
		}
		
		System.out.println("Goles totales: "+ golesTotales);
		
		promedio = (double) golesTotales/(double) partidas;
		
		System.out.println("El promedio es de "+ promedio);	
}
}

