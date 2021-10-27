package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Read a number from the keyboard and performs the sum of the
	 * next 100 numbers, displaying the result on the screen
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int suma = 0;
		
		for (int i = numero; i < numero + 100; i++) {
			suma = suma + i;
		}
		
		int j = numero;
		while (j < numero + 100) {
			suma = suma + j;
			j++;
		}
		
		System.out.println("SUMA: " + suma);
		
		sc.close();
	}

}
