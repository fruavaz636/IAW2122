package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Display the product of the first n odd numbers
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int i = 1;
		long productoFinal = 1;
		while (numero > 0) {
			productoFinal = productoFinal * i;
			i = i + 2;
			
			numero--;
		}
		
		System.out.println("Producto: " + productoFinal);
		
		sc.close();
	}

}
