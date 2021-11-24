package es.iestriana.poo.datos;

import java.util.Random;

public class Garaje {
	
	private Coche coche;
	private String tipoAveria;
	private int numeroCochesAtendidos;
	
	public boolean aceptarCoche(Coche c, String averia) {
		if (this.coche != null) {
			return false;
		} else {
			this.coche = c;
			this.tipoAveria = averia;
			
			if (this.tipoAveria.equalsIgnoreCase("aceite")) {
				this.coche.getMotor().setLitros(this.coche.getMotor().getLitros()+10);
			}
		}
		
		this.coche.acumularAveria(new Random().nextDouble()*100);
		
		numeroCochesAtendidos++;
		
		return true;
	}
	
	public void devolverCoche() {
		this.coche = null;
	}
}
