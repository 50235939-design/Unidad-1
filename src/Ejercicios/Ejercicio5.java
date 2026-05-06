package Ejercicios;

  import java.util.Scanner;

public class Ejercicio5 {

	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		int dias = 0 ;
		int ingTemp = 0;
		int tempTotal = 0;
		int tempMax = 0 ;
		double promedio = 0;
		System.out.println("¿Cuantos dias se van a registrar? ");
		
		dias = entrada.nextInt();
		
		for (int i = 1 ; i <= dias ; i++) {
			
			System.out.println("Temperatura del dia "+ i +" : ");
			
			ingTemp = entrada.nextInt();
			
			tempTotal += ingTemp;
			
			if (ingTemp > tempMax) {
				
				tempMax = ingTemp;
				
			}
		}
		
		promedio = (double) tempTotal / (double) dias; 
		
		System.out.println("Dias Procesados: "+ dias);
		System.out.println("Temperatura maxima : "+tempMax);
		System.out.println("Promedio : "+ promedio);
	}

}
