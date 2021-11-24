package es.iestriana.poo.datos;

public class Motor {

	private int litros;
	private int cv;
	
	public Motor() {
		// TODO Auto-generated constructor stub
	}
	
	public Motor(int cv) {
		this.cv = cv;
	}
	
	public int getLitros() {
		return litros;
	}
	
	public int getCv() {
		return cv;
	}
	
	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Motor [litros=" + litros + ", cv=" + cv + "]";
	}
}
