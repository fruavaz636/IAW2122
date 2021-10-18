package es.iestriana.ejercicioscond.datos;

import java.util.Scanner;

public class EjercicioNotas {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Calificación: ");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");			
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable"); 
		} else if (nota >= 9 && nota < 10) {
			System.out.println("Sobresaliente");
		} else if (nota == 10) {
			System.out.println("Matrícula");
		} else {
			System.out.println("Nota Incorrecta");
		}
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matrícula");
			break;
		default:
			System.out.println("Nota Incorrecta");
			break;
		}
		
		sc.close();
	}

}
