package es.iestriana.poo.main;

import es.iestriana.poo.bean.Alumno;
import es.iestriana.poo.dao.AlumnoDAO;
import es.iestriana.poo.dao.AlumnoDAOListas;

public class Principal {

	public static void main(String[] args) {
		AlumnoDAO lista = new AlumnoDAOListas();
		
		Alumno a1 = new Alumno("yo","yo yo", 23, 5.5F);
		Alumno a2 = new Alumno("tu","tu tu", 32, 6.6F);
		
		lista.anadir(a1);
		lista.anadir(a2);
		
		lista.mostrarTodos();
		
		Alumno aux = lista.buscarPorEdad(32);
		if (aux!=null) {
			System.out.println("Alumno " + aux.getNombre() + " encontrado");
		}
		
		lista.borrar("tu", "tu tu");
		
		System.out.println("------------------");
		
		lista.mostrarTodos();
	}

}
