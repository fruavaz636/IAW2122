package datos;

import java.util.Random;

public class Ejercicio {

	/**
	 * 
	 * Genera de manera repetida 20 números aleatorios entre 0 y 99. 
	 * Con cada uno de ellos debes realizar las siguientes operaciones:
		- Mostrar el número
		- Indicar si es un cero
		- Indicar si es positivo mayor que 50 o menor que 50
		- Indicar si es primo o no lo es
		- Indicar si es un número completo: el número es igual a la suma de sus divisores
	 */
	
	public static void main(String[] args) {
		int i = 0;
		while (i < 20) {
			int num = new Random().nextInt(100);
			
			System.out.println("Nº: " + num);
			
			if (num == 0) {
				System.out.println("El número es 0");
			} else if (num > 50) {
				System.out.println("El número " + num + " es positivo y mayor que 50");
			} else if (num < 50) {
				System.out.println("El número " + num + " es positivo y menor que 50");
			}
			
			if (esPrimo(num)) {
				System.out.println(num + " es Primo");
			} else {
				System.out.println(num + " no es Primo");
			}
			
			if (esCompleto(num)) {
				System.out.println(num + " es Completo");
			} else {
				System.out.println(num + " no es Completo");
			}
			
			i++;
		}
	}

	private static boolean esCompleto(int num) {
		boolean completo = false;
		
		int sumaDivisores = 0;
		for (int i = 1; i < num; i++) {
			if (num%i==0)
				sumaDivisores+=i;
				//sumaDivisores = sumaDivisores + i;
		}
		
		if (sumaDivisores == num) {
			completo = true;
		}
		
		return completo;
	}

	private static boolean esPrimo(int num) {
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num%i!=0) {
				primo = false;
			}
		}
		
		return primo;
	}
}
