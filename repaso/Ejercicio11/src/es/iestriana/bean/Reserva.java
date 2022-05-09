package es.iestriana.bean;

import java.io.Serializable;

public class Reserva implements Serializable {

	private int codigo;
	private String profesor;
	private String diaSemana; //lunes,...,viernes
	private String horaDía; //primera,..., sexta
	private String curso;
	private int numeroAlumnos;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int codigo, String profesor, String diaSemana, String horaDía, String curso, int numeroAlumnos) {
		super();
		this.codigo = codigo;
		this.profesor = profesor;
		this.diaSemana = diaSemana;
		this.horaDía = horaDía;
		this.curso = curso;
		this.numeroAlumnos = numeroAlumnos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHoraDía() {
		return horaDía;
	}

	public void setHoraDía(String horaDía) {
		this.horaDía = horaDía;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", profesor=" + profesor + ", diaSemana=" + diaSemana + ", horaDía="
				+ horaDía + ", curso=" + curso + ", numeroAlumnos=" + numeroAlumnos + "]";
	}
}
