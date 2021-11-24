package es.iestriana.poo.main;

import es.iestriana.poo.datos.Alumno;
import es.iestriana.poo.datos.Asignatura;
import es.iestriana.poo.datos.Profesor;

public class Principal {

	public static void main(String[] args) {
		Asignatura iaw = new Asignatura(1);
		Asignatura bd = new Asignatura(2);
		Asignatura lm = new Asignatura(3);
		
		Alumno juan = new Alumno(iaw, bd, lm);
		
		Profesor p = new Profesor();
		p.ponerNotas(juan);
		System.out.println("La media de Juan es: " + p.calcularMedia(juan));
	}

}
