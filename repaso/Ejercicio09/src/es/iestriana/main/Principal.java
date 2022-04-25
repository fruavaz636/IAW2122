package es.iestriana.main;

import es.iestriana.bean.Equipo;
import es.iestriana.dao.EquipoDAO;
import es.iestriana.dao.EquipoDAOListas;

public class Principal {

	public static void main(String[] args) {
		Equipo e1 = new Equipo(1, "Betis", 1907, 2000000, 234567, true, false, false);
		
		EquipoDAO eqDAO = new EquipoDAOListas();
		eqDAO.anadir(e1);
		eqDAO.listar();
		
	}

}
