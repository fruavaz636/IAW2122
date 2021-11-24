package es.iestriana.poo.datos;

public class Asignatura {
	
	private int identificador;
	private double calificacion;
	
	public Asignatura(int identificador) {
		super();
		this.identificador = identificador;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getIdentificador() {
		return identificador;
	}

	@Override
	public String toString() {
		return "Asignatura [identificador=" + identificador + ", calificacion=" + calificacion + "]";
	}
}
