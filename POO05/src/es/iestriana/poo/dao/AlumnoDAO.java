package es.iestriana.poo.dao;

import es.iestriana.poo.bean.Alumno;

public interface AlumnoDAO {

	public void anadir(Alumno a);
	
	public Alumno buscarPorNota(float nota);
	
	public Alumno buscarPorEdad(int edad);
	
	public void borrar(String nombre, String apellidos);
	
	public void borrarTodos();
	
	public Alumno cambiarNota(Alumno a, float nuevaNota);
	
	public void mostrarTodos();
}
