package es.iestriana.ejercicioscond.datos;

import java.util.Scanner;

public class EjercicioFechaSig {

	/*
	 * Ask for the day, month and year and show the date 
	 * of the next day. With months of 28, 30 and 31 days. 
	 * No leap years.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		
		// Suponer que la fecha es correcta
		
		// Averiguar los días del mes
		int diasdelmes = 0;
		switch (mes) {
		case 2:
			diasdelmes = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasdelmes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasdelmes = 30;
			break;
		default:
			break;
		}
		
		//dia = dia + 1;
		//dia += 1;
		dia++;
		
		sc.close();
	}

}
