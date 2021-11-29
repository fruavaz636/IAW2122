package es.iestriana.poo.bean;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable {

	private String nombre;
	private String apellidos;
	private int edad;
	private float nota_expediente;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellidos, int edad, float nota_expediente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nota_expediente = nota_expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getNota_expediente() {
		return nota_expediente;
	}

	public void setNota_expediente(float nota_expediente) {
		this.nota_expediente = nota_expediente;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", nota_expediente="
				+ nota_expediente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre, nota_expediente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(nota_expediente) == Float.floatToIntBits(other.nota_expediente);
	}	
	
	
}
