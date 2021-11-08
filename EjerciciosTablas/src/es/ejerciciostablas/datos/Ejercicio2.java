package es.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Read the arrays of n numbers and 
	 * save the even number in another array 
	 * and the odd numbers in another array
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros; // Array principal
	private static int [] pares;
	private static int [] impares;
	
	private static int cursorPares = 0, cursorImpares = 0;
	
	public static void main(String[] args) {
		int cantidadNumeros = 0;
		do {
			System.out.println("Tamaño Array: ");
			cantidadNumeros = sc.nextInt();
		} while (cantidadNumeros <= 0);
		
		numeros = new int[cantidadNumeros];
		pares = new int[cantidadNumeros];
		impares = new int[cantidadNumeros];
		
		inicializarNumeros();
		
		dividirParesImpares();
		
		mostrarTablas();
		
		sc.close();
	}

	private static void mostrarTablas() {
		System.out.println("Números: " + Arrays.toString(numeros));
		System.out.println("Pares: " + Arrays.toString(pares));
		for (int i = 0; i < cursorPares; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println("Impares: " + Arrays.toString(impares));
	}

	private static void dividirParesImpares() {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2==0) {
				pares[cursorPares] = numeros[i];
				cursorPares++;
			} else {
				impares[cursorImpares] = numeros[i];
				cursorImpares++;
			}
		}
	}

	private static void inicializarNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
