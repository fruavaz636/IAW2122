package es.iestriana.repasoexamen.datos;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Request a number and show the square of the number.
	 * The square of a number is obtained by adding as
	 * many odd numbers as the number indicates.
	 * The square of 1 is 1. 2 is 4, that is, 1 + 3 = 4
	 * The square of 3 is 9, that is, 1 + 3 + 5 = 9 
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		System.out.println("El cuadrado de " + num + " es " + cuadrado(num));
		
		sc.close();
	}

	private static int cuadrado(int num) {
		int resultado = 0;
		
		for (int i = 1; i < num*2; i=i+2) {
			resultado = resultado + i;
		}

		int impares = 1;
		for (int i = 1; i < num; i++) {
			resultado = resultado + impares;
			impares = impares + 2;
		}
		
		return resultado;
	}

}
