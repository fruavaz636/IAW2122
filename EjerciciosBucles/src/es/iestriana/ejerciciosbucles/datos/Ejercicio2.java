package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Leer una serie de n números (del usuario). Mostrar si los números
	 * están en orden creciente, decreciente o desordenados
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidadNumeros = 0;
		do {
			System.out.println("Números: ");
			cantidadNumeros = sc.nextInt();
		} while (cantidadNumeros <= 0);
		
		int numero = 0, auxiliar = 0;
		boolean creciente = false, decreciente = false;
		
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("Nº: ");
			numero = sc.nextInt();
			
			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar) {
					creciente = true;
				} else if (numero < auxiliar) {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}
		
		if (creciente && decreciente) {
			System.out.println("DESORDENADOS");
		} else if (creciente && !decreciente) {
			System.out.println("CRECIENTE");
		} else {
			System.out.println("DECRECIENTE");
		}
		
		sc.close();
	}

}
