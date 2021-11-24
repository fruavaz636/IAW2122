package es.iestriana.poo.main;

import es.iestriana.poo.bean.Alumno;
import es.iestriana.poo.dao.AlumnoDAO;
import es.iestriana.poo.dao.AlumnoDAOBD;
import es.iestriana.poo.dao.AlumnoDAOFichero;
import es.iestriana.poo.dao.AlumnoDAOListas;

public class Principal {

	public static void main(String[] args) {
		AlumnoDAO al = new AlumnoDAOListas();
		
		Alumno alum = new Alumno();
		
		al.anadir(alum);
	}

}
