package es.iestriana.bean;

import java.io.Serializable;

public class Equipo implements Serializable {

	// Atributos
	private int codigo;
	private String nombre;
	private int anyoFundacion;
	private int abonados;
	private int rankingFifa;
	private boolean participaChampions;
	private boolean participaEuropaLeague;
	private boolean participaConferenceLeague;
	
	// Constructores
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipo(int codigo, String nombre, int anyoFundacion, int abonados, int rankingFifa,
			boolean participaChampions, boolean participaEuropaLeague, boolean participaConferenceLeague) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.anyoFundacion = anyoFundacion;
		this.abonados = abonados;
		this.rankingFifa = rankingFifa;
		this.participaChampions = participaChampions;
		this.participaEuropaLeague = participaEuropaLeague;
		this.participaConferenceLeague = participaConferenceLeague;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoFundacion() {
		return anyoFundacion;
	}

	public void setAnyoFundacion(int anyoFundacion) {
		this.anyoFundacion = anyoFundacion;
	}

	public int getAbonados() {
		return abonados;
	}

	public void setAbonados(int abonados) {
		this.abonados = abonados;
	}

	public int getRankingFifa() {
		return rankingFifa;
	}

	public void setRankingFifa(int rankingFifa) {
		this.rankingFifa = rankingFifa;
	}

	public boolean isParticipaChampions() {
		return participaChampions;
	}

	public void setParticipaChampions(boolean participaChampions) {
		this.participaChampions = participaChampions;
	}

	public boolean isParticipaEuropaLeague() {
		return participaEuropaLeague;
	}

	public void setParticipaEuropaLeague(boolean participaEuropaLeague) {
		this.participaEuropaLeague = participaEuropaLeague;
	}

	public boolean isParticipaConferenceLeague() {
		return participaConferenceLeague;
	}

	public void setParticipaConferenceLeague(boolean participaConferenceLeague) {
		this.participaConferenceLeague = participaConferenceLeague;
	}

	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", anyoFundacion=" + anyoFundacion + ", abonados="
				+ abonados + ", rankingFifa=" + rankingFifa + ", participaChampions=" + participaChampions
				+ ", participaEuropaLeague=" + participaEuropaLeague + ", participaConferenceLeague="
				+ participaConferenceLeague + "]";
	}	
	
}
