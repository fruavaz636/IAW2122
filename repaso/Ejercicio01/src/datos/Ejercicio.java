package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio {
	/**
	 * Rellena un array con n números aleatorios entre 1 y 15 
	 * (solicita la cantidad al usuario). Debes generar un nuevo 
	 * array sin elementos repetidos. En este nuevo array no puede 
	 * haber ningún número repetido del original.
	 */
	
	private static int[] numeros;
	private static int[] numerosSin;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cuántos Números: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		numeros = new int[cantidad];
		numerosSin = new int[cantidad];
		
		rellenar();
		
		System.out.println("NÚMEROS");
		System.out.println(Arrays.toString(numeros));
		
		sinrepetidos();
		
		System.out.println("NÚMEROS SIN REPETIDOS");
		System.out.println(Arrays.toString(numerosSin));
	}

	private static void sinrepetidos() {
		int posSin = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (cuantosHay(numeros[i])==1) {
				// No se repite
				// Añadir a numerosSin
				numerosSin[posSin] = numeros[i];
				posSin++;
			}
		}
	}

	private static int cuantosHay(int numeroBuscado) {
		int cuantos = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroBuscado) {
				cuantos++;
			}
		}
		
		return cuantos;
	}

	private static void rellenar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(15) + 1;
		}
	}
}
