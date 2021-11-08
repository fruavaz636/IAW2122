package es.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Read 2 arrays of n numbers and mix it in a third
	 * array in the following way: 1st from A, 1st from B,
	 * 2nd from A, 2nd from B, 3rd from A, 3rd from B, ...
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] A;
	private static int [] B;
	private static int [] AB;
		
	
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cantidad: ");
			cantidad = sc.nextInt();
		} while (cantidad <=0);
		
		A = new int[cantidad];
		B = new int[cantidad];
		AB = new int[cantidad*2];
		
		inicializarAyB();
		
		mezclarAyB();
		
		mostrar();

		sc.close();
	}


	private static void mostrar() {
		System.out.println("A: " + Arrays.toString(A)); 
		System.out.println("B: " + Arrays.toString(B));
		System.out.println("AB: " + Arrays.toString(AB));
	}


	private static void mezclarAyB() {
		int cursorAB = 0;
		for (int i = 0; i < A.length; i++) {
			AB[cursorAB] = A[i];
			cursorAB++;
			AB[cursorAB] = B[i];
			cursorAB++;
		}
	}


	private static void inicializarAyB() {
		for (int i = 0; i < A.length; i++) {
			A[i] = new Random().nextInt(50) + 1;
			B[i] = new Random().nextInt(50) + 1;
		}
	}

}
