package es.iestriana.poo.datos;

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
	}
}
