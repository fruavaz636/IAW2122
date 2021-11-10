package es.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Read n numbers in increasing order. Ask the user for a number
	 * and look it up in the table. Your current position should be displayed.
	 * If not, indicate it with a message
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	
	public static void main(String[] args) {
		int cuantos = 0;
		do {
			System.out.println("¿CUÁNTOS? ");
			cuantos = sc.nextInt();
		} while (cuantos <= 0);
		
		numeros = new int[cuantos];
		
		rellenarTabla();
		
		System.out.println(Arrays.toString(numeros));
		
		int valor;
		do {
			System.out.println("Valor: ");
			valor = sc.nextInt();
		} while (valor < 0);		
		
		int posicion = buscarValor(valor);		
		
		if (posicion == -1) {
			System.out.println("Número " + valor + " no encontrado");
		} else {
			System.out.println("Número " + valor + 
					" encontrado en la posición " + posicion);
		}
		
		System.out.println(Arrays.toString(numeros));

		sc.close();
	}

	private static int buscarValor(int valor) {
		int posicion = -1;
		
		for (int i = 0; i < numeros.length && posicion == -1; i++) {
			if (numeros[i] == valor) {
				posicion = i;
			}
		}
		
		return posicion;
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50);
		}
		Arrays.sort(numeros); // Ordenar el array
	}

}
