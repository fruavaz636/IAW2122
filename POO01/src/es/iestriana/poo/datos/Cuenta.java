package es.iestriana.poo.datos;

public class Cuenta {

	private String nombre;
	private String ccc;
	private double saldo;
	private double tipoDeInteres;
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cuenta(String nombre, String ccc, double saldo, double tipoDeInteres) {
		super();
		this.nombre = nombre;
		this.ccc = ccc;
		this.saldo = saldo;
		this.tipoDeInteres = tipoDeInteres;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCcc() {
		return ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoDeInteres() {
		return tipoDeInteres;
	}
	public void setTipoDeInteres(double tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}
	
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", ccc=" + ccc + ", saldo=" + saldo + ", tipoDeInteres=" + tipoDeInteres
				+ "]";
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		}
	}
	
	public void reintegro(double cantidad) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo = saldo - cantidad;
		}
	}
}
