/*Ingreso de datos:
Pedir el nombre del jugador.
Pedir la cantidad de misiones completadas. ⚔️
Determinar el nivel: 🏆
0 → Jugador novato 🐣
1 a 5 → Jugador principiante 🛡️
6 a 15 → Jugador experimentado ⚔️
Más de 15 → Jugador veterano 👑
Resumen final: 🖥️
Si todo está bien, mostrar:
Jugador: [Nombre]
Misiones completadas: [Número]
Nivel: [El rango que le toca]*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String rangoFinal = "";
		
		int misiones = 0;
		
		System.out.print("Ingrese su nombre: ");
		
		String nombre = entrada.next();
		
		System.out.print("Ingrese la cantidad de misiones completadas: ");
		
		misiones = entrada.nextInt();
		
        if (misiones == 0) {
			
        	rangoFinal = "Novato.";
			
			
		}
		else if (misiones > 0 && misiones <= 5 ) {
			
			rangoFinal = "Principiante.";
			
		}
        else if (misiones >= 6 && misiones <= 15 ) {
			
			rangoFinal = "Experimentado.";
			
		}
        else if (misiones > 15 ) {
	
        	rangoFinal = "Veterano.";
	
        }
		
		System.out.println("Jugador: " + nombre);
		
		System.out.println("Misiones completadas: " + misiones);
		
		System.out.println("Rango: "+ rangoFinal);
		}
	}


