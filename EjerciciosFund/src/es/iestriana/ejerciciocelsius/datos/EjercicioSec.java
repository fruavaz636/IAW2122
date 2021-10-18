package es.iestriana.ejerciciocelsius.datos;

import java.util.Scanner;

public class EjercicioSec {

	/*
	 * Write a program to ask the user a time expressed in 
	 * seconds and print the hours, minutes and seconds.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int totalsegundos = sc.nextInt();
		
		int horas = totalsegundos / 3600;
		int minutos = (totalsegundos - (horas * 3600)) / 60;
		int segundos = totalsegundos - (horas * 3600) - (minutos * 60);
		
		System.out.println("Horas: " + horas + 
							"\nMinutos: " + minutos +
							"\nSegundos: " + segundos);
		
	}

}
