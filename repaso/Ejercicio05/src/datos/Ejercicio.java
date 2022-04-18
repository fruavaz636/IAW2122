package datos;

import java.util.Scanner;

public class Ejercicio {
	
	/**
	 * Programa que solicita tres números y realiza las siguientes acciones:
	 * - Muestra el valor central de los tres valores numéricos
	 * - Muestra si alguno de los valores es múltiplo de otro de los valores
	 * - Debe mostrar un mensaje diciendo si el valor central está más cerca 
	 * del menor que del mayor. Por ejemplo, si los tres valores fueran 1,15,200 
	 * debería decir que "El valor central 15 está más cerca del valor 1"
	 * 
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int num1, num2, num3;

	public static void main(String[] args) {
		do {
			System.out.println("Nº 1:");
			num1 = sc.nextInt();
		} while (num1 <= 0);
		
		do {
			System.out.println("Nº 2:");
			num2 = sc.nextInt();
		} while (num2 <= 0);
		
		do {
			System.out.println("Nº 3:");
			num3 = sc.nextInt();
		} while (num3 <= 0);
		
		int central = mostrarCentral();
		System.out.println("CENTRAL: " + central);
		
		comprobarMultiplos(); 
		
		System.out.println(distanciaCentral(central));
		
		sc.close();
	}

	private static String distanciaCentral(int central) {
		String mensaje = "";
		
		if (central == num1) {
			if (Math.abs(num2 - central) > Math.abs(num3 - central)) {
				mensaje = num3 + " está más cerca";
			} else {
				mensaje = num2 + " está más cerca";
			}
		} else if (central == num2) {
			if (Math.abs(num1 - central) > Math.abs(num3 - central)) {
				mensaje = num3 + " está más cerca";
			} else {
				mensaje = num1 + " está más cerca";
			}
		} else if (central == num3) {
			if (Math.abs(num1 - central) > Math.abs(num2 - central)) {
				mensaje = num2 + " está más cerca";
			} else {
				mensaje = num1 + " está más cerca";
			}
		}
		
		return mensaje;
	}

	private static void comprobarMultiplos() {
		if (num1 % num2 == 0) {
			System.out.println(num2 + " es múltiplo de " + num1);
		} 
		if (num1 % num3 == 0) {
			System.out.println(num3 + " es múltiplo de " + num1);
		} 
		if (num2 % num1 == 0) {
			System.out.println(num1 + " es múltiplo de " + num2);
		} 
		if (num2 % num3 == 0) {
			System.out.println(num3 + " es múltiplo de " + num2);
		}
		if (num3 % num1 == 0) {
			System.out.println(num1 + " es múltiplo de " + num3);
		}
		if (num3 % num2 == 0) {
			System.out.println(num2 + " es múltiplo de " + num3);
		}
	}

	private static int mostrarCentral() {
		int centro = 0;
		
		if ((num1 > num2) && (num1 > num3)) {
			if (num2 > num3) {
				centro = num2;
			} else {
				centro = num3;
			}
		} else if ((num2 > num1) && (num2 > num3)) {
			if (num1 > num3) {
				centro = num1;
			} else {
				centro = num3;
			}
		} else if ((num3 > num2) && (num3 > num1)) {
			if (num2 > num1) {
				centro = num2;
			} else {
				centro = num1;
			}
		}
		
		return centro;
	}

}
