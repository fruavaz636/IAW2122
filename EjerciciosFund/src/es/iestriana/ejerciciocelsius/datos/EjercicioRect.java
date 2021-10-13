package es.iestriana.ejerciciocelsius.datos;

import java.util.Scanner;

public class EjercicioRect {
	
	/*
	 * Write a program that defines two integer variables to 
	 * describe the lengths of the sides of a rectangle. The 
	 * program must calculate and write on the screen the 
	 * lengths of the sides, the perimeter and the area of 
	 * the rectangle.
	 */

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Base: ");
		int base = sc.nextInt();
		
		System.out.println("Altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
	}

}
