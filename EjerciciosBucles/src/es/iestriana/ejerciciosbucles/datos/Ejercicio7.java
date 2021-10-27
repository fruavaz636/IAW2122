package es.iestriana.ejerciciosbucles.datos;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Design an application that displays the multiplication tables
	 * from 1 to 10. In addition, ask the user which table wants to show
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("--- TABLA " + i + " ---");
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		System.out.println("--- TABLA " + numero + " ---");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + (numero*i));
		}
		
		sc.close();
	}

}
