package es.iestriana.poo.datos;

public class Punto {

	private double x;
	private double y;
	
	public Punto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double calcularDistanciaDesde(Punto p) {
		double c1 = this.x - p.getX();
		double c2 = this.y - p.getY();
		return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	}
}
