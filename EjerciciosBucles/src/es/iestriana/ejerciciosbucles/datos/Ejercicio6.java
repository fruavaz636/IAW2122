package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Ask for a number and calculate its factorial
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero < 0);
		
		long factorial = 1;
		
		for (int i = numero; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("FACT: " + factorial);
		
		sc.close();
	}

}
