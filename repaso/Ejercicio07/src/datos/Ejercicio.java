package datos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio {
	
	/*
	 * Rellena una tabla de 15 números. Muestra la tabla. Muestra el mayor, 
	 * el menor y las posiciones en las que se encuentran
	 */

	private static int [] tabla = new int[15];
	
	public static void main(String[] args) {
		rellenar();
		
		System.out.println(Arrays.toString(tabla));
		
		mostrar();
	}

	private static void mostrar() {
		int posMayor = -1;
		int posMenor = -1;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > mayor) {
				mayor = tabla[i];
				posMayor = i;
			}
			if (tabla[i] < menor) {
				menor = tabla[i];
				posMenor = i;
			}
		}
		System.out.println("Mayor: " + mayor + ". Pos: " + posMayor);
		System.out.println("Menor: " + menor + ". Pos: " + posMenor);
	}

	private static void rellenar() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(30);
		}
	}

}
