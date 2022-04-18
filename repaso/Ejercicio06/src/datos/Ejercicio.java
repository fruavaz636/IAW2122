package datos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio {

	/**
	 * Partimos de 2 tablas de 10 elementos cada uno. Rellenarlas. 
	 * Genere una nueva tabla con los elementos repetidos en las 2 tablas. 
	 * Además, genere una nueva tabla con los elementos de la primera tabla 
	 * que no se encuentran repetidos en la segunda tabla.
	 * 
	 */
	
	private static int [] tabla1 = new int[10];
	private static int [] tabla2 = new int[10];
	
	private static int [] tablaRepetidos = new int[20];
	
	private static int [] tablaSinRepetidos = new int[10];
	
	public static void main(String[] args) {
		rellenarTablas();
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));

		crearRepetidos();
		
		crearSinRepetidos();
	}

	private static void crearSinRepetidos() {
		int pos = 0;
		for (int i = 0; i < tabla1.length; i++) {
			int aux = tabla1[i];
			if (!buscar(aux)) {
				tablaSinRepetidos[pos]=aux;
				pos++;
			}
		}
		System.out.println(Arrays.toString(tablaSinRepetidos));
	}

	private static boolean buscar(int aux) {
		boolean enc = false;
		
		for (int i = 0; i < tabla2.length; i++) {
			if (aux == tabla2[i]) {
				enc = true;
			}
		}
		
		return enc;
	}

	private static void crearRepetidos() {
		for (int i = 0; i < tabla1.length; i++) {
			int aux = tabla1[i];
			for (int j = 0; j < tabla2.length; j++) {
				if (aux == tabla2[j]) {
					tablaRepetidos[aux]++;
				}
			}
		}
		System.out.println("-- Repetidos --");
		for (int i = 0; i < tablaRepetidos.length; i++) {
			if (tablaRepetidos[i] != 0) {
				System.out.println(i);
			}
		}
	}

	private static void rellenarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(20);
			tabla2[i] = new Random().nextInt(20);
		}
	}

}
