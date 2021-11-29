package es.iestriana.poo.dao;

import java.util.ArrayList;
import java.util.List;

import es.iestriana.poo.bean.Alumno;

public class AlumnoDAOListas implements AlumnoDAO {

	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void anadir(Alumno a) {
		alumnos.add(a);
	}

	@Override
	public Alumno buscarPorNota(float nota) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno aux = alumnos.get(i);
			if (aux.getNota_expediente() == nota) {
				return aux;
			}
		}
		
		for (Alumno a : alumnos) {
			if (a.getNota_expediente() == nota) {
				return a;
			}
		}
		
		return null;
	}

	@Override
	public Alumno buscarPorEdad(int edad) {
		for (Alumno a : alumnos) {
			if (a.getEdad() == edad) {
				return a;
			}
		}
		return null;
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre) && 
					alumnos.get(i).getApellidos().equalsIgnoreCase(apellidos)) {
				alumnos.remove(i);
			}
		}
		
	}

	@Override
	public void borrarTodos() {
		alumnos.clear();
	}

	@Override
	public Alumno cambiarNota(Alumno a, float nuevaNota) {
		for (Alumno alum : alumnos) {
			if (alum.equals(a)) {
				alum.setNota_expediente(nuevaNota);
				return alum;
			}
		}
		return null;
	}

	@Override
	public void mostrarTodos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
	}

}
