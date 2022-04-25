package es.iestriana.dao;

import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Equipo;

public class EquipoDAOListas implements EquipoDAO {
	
	List<Equipo> fifa = new ArrayList<Equipo>();

	@Override
	public void listar() {
		for (Equipo equipo : fifa) {
			System.out.println(equipo);
		}
	}

	@Override
	public void anadir(Equipo nuevo) {
		if (!fifa.contains(nuevo)) {
			fifa.add(nuevo);
		}
	}

	@Override
	public void borrarTodos() {
		fifa.clear();
	}

	@Override
	public int borrarAnyoAbonados() {
		int cuantos = 0;
		
		for (Equipo equipo : fifa) {
			if (equipo.getAnyoFundacion() < 1930 && equipo.getAbonados() < 1000) {
				cuantos++;
				fifa.remove(equipo);
			}
		}
		
		return cuantos;
	}

	@Override
	public void buscarChampions(int ranking) {
		for (Equipo equipo : fifa) {
			if (equipo.isParticipaChampions() && equipo.getRankingFifa() > ranking) {
				System.out.println(equipo);
			}
		}
	}

	@Override
	public List<Equipo> buscarEuropaLeague(int ranking) {
		List<Equipo> auxiliar = new ArrayList<Equipo>();
		
		for (Equipo equipo : auxiliar) {
			if (equipo.isParticipaEuropaLeague() && equipo.getRankingFifa() > ranking) {
				auxiliar.add(equipo);
			}
		}
		
		return auxiliar;
	}

	@Override
	public void actualizar() {
		for (Equipo equipo : fifa) {
			if (equipo.isParticipaConferenceLeague()) {
				equipo.setRankingFifa(equipo.getRankingFifa() + 10);
			}
		}
	}

}
