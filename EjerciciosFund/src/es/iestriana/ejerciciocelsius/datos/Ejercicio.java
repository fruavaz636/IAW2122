package es.iestriana.ejerciciocelsius.datos;

import java.util.Scanner;

public class Ejercicio {

	/*
	 * Make a program that converts from Fahrenheit to Celsius. 
	 * The degrees Celsius must be requested from the user.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();
		
		// Convertir a Fahrenheit
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
		
		System.out.println(gradosCelsius + " grados celsius son " 
							+ gradosFahrenheit + " grados fahrenheit");				
	}

}
