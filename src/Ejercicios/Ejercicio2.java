/*Generar el número: Usar lógica aleatoria para obtener un número del 1 al 50. 🎲. Acá tenés un ejemplo de cómo generar un número random en Java: https://github.com/psebastian92/claseMathJava/blob/main/random.java
Ciclo de intentos: El jugador tiene un máximo de 5 intentos.
Pistas inteligentes: 💡
Si el número ingresado es menor al secreto: "El número secreto es mayor".
Si el número ingresado es mayor al secreto: "El número secreto es menor".
Contador: El sistema debe avisar en qué número de intento está el jugador (Ej: "Intento 1", "Intento 2"...).
Resultado final: 🏁
Si adivina: "¡Hackeo exitoso! Adivinaste en X intentos".
Si se queda sin intentos: "Sistema bloqueado. El código era: X".
*/

package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	Random aleatorio = new Random();
	int numero = aleatorio.nextInt(50);
	int intentos = 0;
	boolean acierto = false;
    int contrasena = 0;
	
	
	do {
	
    System.out.println("Ingrese la contraseña: ");
    
    contrasena = entrada.nextInt();
    
    if (contrasena != numero) {
    	
    	intentos++;
    	
    	System.out.println("Intentos "+intentos);
    	
        if (numero < contrasena) {
        	
        	System.out.println("El numero secreto es menor");

        }
        else if (numero > contrasena) {
        	
        	System.out.println("El numero secreto es mayor");
        	
        }
        
    }
    
    else if ( contrasena == numero) {
    	
    	acierto = true;
    	
    }
    
	}while( contrasena != numero && intentos != 5);
			
	if (acierto) {
		
		System.out.println("Hackeo exitoso!, adivinaste en " + intentos + " intentos!");
		
	}
	else if (acierto == false) {
		
		System.out.println("Sistema bloqueado! el codigo era " + numero);
		
	}
	
	}
}
