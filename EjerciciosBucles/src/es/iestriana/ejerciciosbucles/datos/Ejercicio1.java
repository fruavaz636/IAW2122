package es.iestriana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidadNumeros = 0;
		do {
			System.out.println("¿Cuántos? ");
			cantidadNumeros = sc.nextInt();
		} while (cantidadNumeros <= 0);
		
		// variables que necesito
		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				sumaPositivos += numero;
				contadorPositivos++;
			} else if(numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		System.out.println("Media Positivos: " + (sumaPositivos/contadorPositivos));
		System.out.println("Media Negativos: " + (sumaNegativos/contadorNegativos));
		System.out.println("Cantidad de Ceros: " + contadorCeros);
		
		sc.close();
	}

}
