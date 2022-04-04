package es.ies.triana.datos;

public class Regalos {

	private String nombre;
	private String marca;
	private int anyodecompra;
	private float precio;
	private boolean existencias;
	private String tipoderegalo;
	
	public Regalos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Regalos(String nombre, String marca, int anyodecompra, float precio, boolean existencias,
			String tipoderegalo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.anyodecompra = anyodecompra;
		this.precio = precio;
		this.existencias = existencias;
		this.tipoderegalo = tipoderegalo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnyodecompra() {
		return anyodecompra;
	}

	public void setAnyodecompra(int anyodecompra) {
		this.anyodecompra = anyodecompra;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isExistencias() {
		return existencias;
	}

	public void setExistencias(boolean existencias) {
		this.existencias = existencias;
	}

	public String getTipoderegalo() {
		return tipoderegalo;
	}

	public void setTipoderegalo(String tipoderegalo) {
		this.tipoderegalo = tipoderegalo;
	}

	@Override
	public String toString() {
		return "Regalos [nombre=" + nombre + ", marca=" + marca + ", anyodecompra=" + anyodecompra + ", precio="
				+ precio + ", existencias=" + existencias + ", tipoderegalo=" + tipoderegalo + "]";
	}

	// Método que actualice la posibilidad de existencias de un regalo al contrario del que tiene.
	public void actualizarExistencias() {
		// Versión 1
		if (this.existencias) {
			this.existencias = false;
		} else {
			this.existencias = true;
		}
		// Versión 2
		//this.existencias = !this.existencias;
	}
	
	// Método que incremente el precio del regalo un determinado porcentaje 
	// indicado en el parámetro de entrada.
	public void incrementarPrecio(float porcentaje) {
		this.precio = this.precio + (this.precio*porcentaje)/100;
		//this.precio += (this.precio*porcentaje)/100;
	}
	
	
	// Método que modifique el tipo de regalo según el parámetro de entrada.
	public void modificarRegalo(String nuevoTipo) {
		this.tipoderegalo = nuevoTipo;
	}
	
	// Método para comprobar si un regalo es de tipo coches, es de este año 
	// y tiene un precio mayor que 50€. Si es así debe devolver cierto, en caso contrario, falso.
	public boolean comprobar() {
		boolean comprobacion = false;
		
		if (this.tipoderegalo.equalsIgnoreCase("coche") 
				&& this.anyodecompra == 2022 
				&& this.precio > 50) {
			comprobacion = true;
		}
		
		return comprobacion;
	}

}
