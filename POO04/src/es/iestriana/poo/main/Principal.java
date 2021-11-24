package es.iestriana.poo.main;

import es.iestriana.poo.datos.Coche;
import es.iestriana.poo.datos.Garaje;

public class Principal {

	public static void main(String[] args) {
		Coche c1 = new Coche("Ford", "Focus");
		
		Garaje g = new Garaje();
		
		if (g.aceptarCoche(c1, "frenos")) {
			System.out.println("Coche aceptado");
		} else {
			System.out.println("Coche no aceptado");
		}
		
		g.devolverCoche();
		
		if (g.aceptarCoche(c1, "aceite")) {
			System.out.println("Coche aceptado");
		} else {
			System.out.println("Coche no aceptado");
		}
	}

}
