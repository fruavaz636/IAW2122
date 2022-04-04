package es.iestriana.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.iestriana.bean.Ordenador;

public class OrdenadorDAOListas implements OrdenadorDAO {

	private List<Ordenador> ordenadores = new ArrayList<Ordenador>();
	
	@Override
	public void anadir(Ordenador o) {
		if (!ordenadores.contains(o)) {
			ordenadores.add(o);
		}
	}

	@Override
	public void borrar() {
		ordenadores.clear();
	}

	@Override
	public void borrarNoFuncionenMenor2017() {
		for (Ordenador ord : ordenadores) {
			if (ord.getAnyodecompra() < 2017 && !ord.isFunciona()) {
				ordenadores.remove(ord);
			}
		}
	}

	@Override
	public Ordenador buscarPorMarcaRamProcesador(String marca, int ram, String procesador) {
		Ordenador aux = null;
		
		for (Ordenador ord : ordenadores) {
			if (ord.getMarca().equalsIgnoreCase(marca) 
					&& ord.getMemoriaRam() == ram
					&& ord.getProcesador().equalsIgnoreCase(procesador)) {
				aux = ord;
			}				
		}
		
		return aux;
	}

	@Override
	public List<Ordenador> buscarPorRamFuncionando(int ram) {
		List<Ordenador> auxiliar = new ArrayList<Ordenador>();
		
		for (Ordenador ord : ordenadores) {
			if (ord.getMemoriaRam() == ram && ord.isFunciona()) {
				auxiliar.add(ord);
			}
		}
		
		return auxiliar;
	}

	@Override
	public void actualizarRam2019(int ram) {
		for (Ordenador ord : ordenadores) {
			if (ord.getAnyodecompra() == 2019) {
				ord.setMemoriaRam(ram);
			}
		}
	}

	@Override
	public void listar512Ram2018Funcionen() {
		for (Ordenador ord : ordenadores) {
			if (ord.getMemoriaRam() == 512 
					&& ord.getAnyodecompra() == 2018
					&& ord.isFunciona()) {
				System.out.println(ord);
			}
		}
	}

	@Override
	public void listar() {
		for (Ordenador ord : ordenadores) {
			System.out.println(ord);
		}
	}

}
