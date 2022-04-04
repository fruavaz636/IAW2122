package es.iestriana.bean;

import java.io.Serializable;

public class Ordenador implements Serializable {
	
	private int identificador;
	private String marca;
	private int memoriaRam;
	private String procesador;
	private int anyodecompra;
	private boolean funciona;
	
	public Ordenador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ordenador(int identificador, String marca, int memoriaRam, String procesador, int anyodecompra,
			boolean funciona) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.procesador = procesador;
		this.anyodecompra = anyodecompra;
		this.funciona = funciona;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getAnyodecompra() {
		return anyodecompra;
	}

	public void setAnyodecompra(int anyodecompra) {
		this.anyodecompra = anyodecompra;
	}

	public boolean isFunciona() {
		return funciona;
	}

	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	@Override
	public String toString() {
		return "Ordenador [identificador=" + identificador + ", marca=" + marca + ", memoriaRam=" + memoriaRam
				+ ", procesador=" + procesador + ", anyodecompra=" + anyodecompra + ", funciona=" + funciona + "]";
	}
}
