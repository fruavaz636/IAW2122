package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Ask the user for a number and indicate how many prime numbers
	 * there are between 1 and the number
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int contadorPrimos = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (esPrimo(i)) {
				contadorPrimos++;
			}
		}
		
		System.out.println("Entre 1 y " + numero + " hay " + 
						contadorPrimos + " números primos");

		sc.close();
	}

	private static boolean esPrimo(int i) {
		boolean primo = true;
		
		for (int j = 2; j < i && primo; j++) {
			if (i%j==0) {
				primo = false;
			}
		}
		
		return primo;
	}

}
