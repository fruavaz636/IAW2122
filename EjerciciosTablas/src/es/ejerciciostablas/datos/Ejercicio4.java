package es.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Create an array of n numbers and move it down one position, that is,
	 * the first becomes second, second becomes third, and so on successively.
	 * The last becomes the first.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cantidad: ");
			cantidad = sc.nextInt();
		} while (cantidad <=0);
		
		numeros = new int[cantidad];

		inicializar();
		
		mostrar();
		
		girar();
		
		mostrar();
		
		sc.close();
	}
	
	private static void girar() {
		int ultimo = numeros[numeros.length - 1];
		for (int i = numeros.length - 2; i >= 0; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
	}

	private static void inicializar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
