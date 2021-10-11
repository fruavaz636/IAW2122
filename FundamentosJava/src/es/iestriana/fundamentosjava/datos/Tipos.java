package es.iestriana.fundamentosjava.datos;

public class Tipos {

	public static void main(String[] args) {
		System.out.println("Tipos");
		
		// Comentario de 1 línea
		/*
		 * Comentario de bloque
		 */
		
		// Tipos de Variable
		
		// Tipo Entero
		byte b; // (8 bits)
		short sh; // (16 bits)
		int i; // (32 bits)
		long l; // (64 bits)
		
		
		char c;
		char a = 'a';
		System.out.println((int)a);
		
		// Tipo Real
		float f = 3.1416F; // 32 bits
		double d = 3.1416; // 64 bits
		
		// Tipo Lógico
		boolean bol = true;
		
		// Cadenas
		String cadena = "Hola que tal";
		String cadena2 = "estás";
		System.out.println(cadena + " " + cadena2);
		
		// Tipos Complejos
		Integer ii = 23;
		System.out.println(ii.MAX_VALUE);
		
		System.out.println(cadena.charAt(0));
		
		
		
	}
}