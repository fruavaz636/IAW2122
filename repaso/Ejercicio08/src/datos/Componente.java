package datos;

import java.io.Serializable;

public class Componente implements Serializable {

	// Atributos
	private int codigo;
	private String nombreComercial;
	private String tipoComponente;
	private double precioComponente;
	private int anyoFabricacion;
	private int estado; //(2: muy bien, 1: aceptable, 0: con desperfectos)
	private String webReferencia;
	private int numeroVentas;
	
	// Constructores
	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Componente(int codigo, String nombreComercial, String tipoComponente, double precioComponente,
			int anyoFabricacion, int estado, String webReferencia, int numeroVentas) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.tipoComponente = tipoComponente;
		this.precioComponente = precioComponente;
		this.anyoFabricacion = anyoFabricacion;
		this.estado = estado;
		this.webReferencia = webReferencia;
		this.numeroVentas = numeroVentas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getTipoComponente() {
		return tipoComponente;
	}

	public void setTipoComponente(String tipoComponente) {
		this.tipoComponente = tipoComponente;
	}

	public double getPrecioComponente() {
		return precioComponente;
	}

	public void setPrecioComponente(double precioComponente) {
		this.precioComponente = precioComponente;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getWebReferencia() {
		return webReferencia;
	}

	public void setWebReferencia(String webReferencia) {
		this.webReferencia = webReferencia;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	@Override
	public String toString() {
		return "Componente [codigo=" + codigo + ", nombreComercial=" + nombreComercial + ", tipoComponente="
				+ tipoComponente + ", precioComponente=" + precioComponente + ", anyoFabricacion=" + anyoFabricacion
				+ ", estado=" + estado + ", webReferencia=" + webReferencia + ", numeroVentas=" + numeroVentas + "]";
	}
	
	/**
	 * Método que actualice el estado del componente según las ventas realizadas del mismo. 
	 * Si se han vendido más de 1000, actualizar a muy bien, si se han vendido más de 500 
	 * actualizar a aceptable, en otro caso actualizar a con desperfectos.
	 */
	public void actualizarEstado() {
		if (this.numeroVentas > 1000) {
			this.estado = 2;
		} else if (numeroVentas > 500) {
			this.estado = 1;
		} else {
			this.estado = 0;
		}
	}
	
	/**
	 * Método que incremente el número de ventas en uno para los componentes de este año 
	 * de fabricación.
	 */
	public void incrementar() {
		if (this.anyoFabricacion == 2022) {
			this.numeroVentas++;
		}
	}
	
	
	/**
	 * Método que rebaje el precio del componente un determinado porcentaje si el año 
	 * de fabricación es menor que el 2010 y sean de tipo “peluche”.
	 */
	public void rebajar(double porcentaje) {
		if (this.anyoFabricacion < 2010 && this.tipoComponente.equalsIgnoreCase("peluche")) {
			this.precioComponente = this.precioComponente - (this.precioComponente * porcentaje)/100;
		}
	}
	
	
	/**
	 * Método que compruebe que la web de referencia del componente es Amazon, 
	 * PCComponentes o MediaMarkt. 
	 */
	public boolean comprobar() {
		if (this.webReferencia.equalsIgnoreCase("www.amazon.com") || 
				this.webReferencia.equalsIgnoreCase("www.pccomponentes.com") || 
				this.webReferencia.equalsIgnoreCase("www.mediamarkt.com")) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
