package es.iestriana.poo.datos;

public class Circulo {

	private Punto centro;
	private double radio;
	
	public Circulo() {
		centro = new Punto();
	}

	public Circulo(Punto centro, double radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}
	
	public Circulo(double x, double y, double radio) {
		this.centro = new Punto(x, y); 
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double calcularDistanciaDesde(Punto aux) {
		return centro.calcularDistanciaDesde(aux);
	}
}
