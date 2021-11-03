package es.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Fill the array with 20 positive random number. 
	 * Ask the user for a number. Show the number position
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int[20];
	
	public static void main(String[] args) {
		rellenarTabla();
		System.out.println(Arrays.toString(numeros));
		
		int valor;
		do {
			System.out.println("Nº: ");
			valor = sc.nextInt();
		} while (valor <= 0);
		
		mostrarPosiciones(valor);		
		
		sc.close();
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(30)+1;
		}
	}

	private static void mostrarPosiciones(int valor) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				System.out.println("Posición: " + i);
				contador++;
			}
		}
		if (contador==0) {
			System.out.println("Número no encontrado");
		}
	}

}
