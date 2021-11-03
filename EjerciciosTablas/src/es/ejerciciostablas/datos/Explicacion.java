package es.ejerciciostablas.datos;

import java.util.Random;
import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Unidimensionales
		int [] numeros = new int[10];
		
		// Multidimensionales
		float [][] temperaturas = new float[2][3];
		
		int [] datos = {1,2,3,4,5};
		System.out.println(datos.length);
		
		//int [][] valores = new int[3][3];
		int [][] valores = {{1,2,3},{4,5,6},{7,8,9}};
		
		String [][] cadenas = {{"cad1", "cad2"},{"cad3","cad4"}};
		System.out.println(cadenas[0][1]);
		
		int n = valores[1][2];
		int n1 = numeros[3];
		
		cadenas[0][1] = "cadena2";
		valores[1][1]++;
		valores[0][0] = valores[0][1] + valores[0][2];
		numeros[0]--;
		numeros[1] = numeros[2] * numeros[3];		

		for (int i = 0; i < numeros.length; i++) {
			//System.out.println("Nº: ");
			//numeros[i] = sc.nextInt();
			numeros[i] = new Random().nextInt(20)+1;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Número de repeticiones de un número en la tabla
		System.out.println("Nº BUSCADO: ");
		int buscado = sc.nextInt();
		
		int veces = calcularRepeticiones(numeros, buscado);
		
		System.out.println("El número " + buscado + 
				" se repite en la tabla " + veces + " veces");
		
		sc.close();
	}

	private static int calcularRepeticiones(int[] numeros, int buscado) {
		int repeticiones = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==buscado) {
				repeticiones++;
			}
		}
		
		return repeticiones;
	}

	
	
	
	
	
}
