package es.iestriana.ejercicioscond.datos;

import java.util.Scanner;

public class EjercicioIMC {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Peso: ");
		double peso = sc.nextDouble();
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 16) {
			System.out.println();
		} else if (imc >= 16 && imc < 17) {
			System.out.println();
		}

		sc.close();

	}

}
