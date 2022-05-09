package datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Principal {

	/*
	 * Declare 2 one-dimensional tables of n elements. Stores in the first the
	 * names and in the second the marks of the students. Automatically initializes
	 * values ​​from the two tables (uses random and randomuuid). Create a method that
	 * display the names of the students and their grades. Create another method that stores in
	 * another table the students who have passed. Show the result. Create another method
	 * to modify the grade of a student requested from the user. Create another method that
	 * return a table with the students who have scored more than the grade they
	 * one requested from the user
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static String [] nombres = new String[10];
	private static float [] notas = new float[10];
	private static String [] aprobados = new String[10];
	
	public static void main(String[] args) {
		inicializar();
		
		mostrar();
		
		mostrarAlumnoNota();
		
		mostrarAprobados();
		
		System.out.println("Nombre Alumno: ");
		String alumno = sc.next();
		System.out.println("Nota: ");
		float nota = sc.nextFloat();
		
		if (cambiarAlumnoNota(alumno, nota)) {
			System.out.println("Alumno Nota Cambiada");
			mostrarAlumnoNota();
		} else {
			System.out.println("Alumno Nota No Cambiada");
		}
		
		sc.close();
	}

	private static boolean cambiarAlumnoNota(String alumno, float nota) {
		boolean enc = false;
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(alumno)) {
				notas[i] = nota;
				enc = true;
			}
		}
		
		return enc;
	}

	private static void mostrarAprobados() {
		int pos = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprobados[pos] = nombres[i];
				pos++;
			}
		}
		System.out.print("APROBADOS: ");
		for (int i = 0; i < aprobados.length && aprobados[i]!=null; i++) {
			System.out.print(aprobados[i] + " ");		
		}
		System.out.println();
	}

	private static void mostrarAlumnoNota() {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + ": " + notas[i]);
		}
	}

	private static void mostrar() {
		System.out.println("-- NOMBRES --");
		System.out.println(Arrays.toString(nombres));
		System.out.println("-- NOTAS --");
		System.out.println(Arrays.toString(notas));
	}

	private static void inicializar() {
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Random().nextFloat()*10;
		}
		for (int i = 0; i < nombres.length; i++) {
			//nombres[i] = UUID.randomUUID().toString().replace("-", "");
			nombres[i] = "alumno" + (i+1);
		}
	}

}
