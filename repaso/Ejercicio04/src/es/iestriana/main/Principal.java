package es.iestriana.main;

import java.util.List;

import es.iestriana.bean.Ordenador;
import es.iestriana.dao.OrdenadorDAO;
import es.iestriana.dao.OrdenadorDAOListas;

public class Principal {

	public static void main(String[] args) {
		OrdenadorDAO oDAO = new OrdenadorDAOListas();
		
		Ordenador o1 = new Ordenador(1, "dell", 16, "i7", 2019, true);
		Ordenador o2 = new Ordenador(2, "asus", 8, "i5", 2016, false);
		Ordenador o3 = new Ordenador(3, "toshiba", 16, "i3", 2018, true);
		Ordenador o4 = new Ordenador(4, "hp", 512, "Dual core", 2018, true);
		
		oDAO.anadir(o1);
		oDAO.anadir(o2);
		oDAO.anadir(o3);
		oDAO.anadir(o4);
		
		System.out.println("4 añadidos");
		oDAO.listar();
		
		//oDAO.borrarNoFuncionenMenor2017();
		
		//System.out.println("Borra el asus");
		//oDAO.listar();
		
		System.out.println("Muestra el toshiba");
		System.out.println(oDAO.buscarPorMarcaRamProcesador("toshiba", 16, "i3"));
		
		System.out.println("Muestra el dell y el toshiba");
		List<Ordenador> auxiliar = oDAO.buscarPorRamFuncionando(16);
		for (Ordenador ord : auxiliar) {
			System.out.println(ord);
		}
		
		oDAO.actualizarRam2019(32);
		
		System.out.println("Actualiza dell a 32gb");
		oDAO.listar();
		
		System.out.println("Muestra el hp");
		oDAO.listar512Ram2018Funcionen();
		
		oDAO.borrar();
		
		System.out.println("Vacío");
		oDAO.listar();
	}

}
