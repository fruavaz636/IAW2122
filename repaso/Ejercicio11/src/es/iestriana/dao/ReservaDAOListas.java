package es.iestriana.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.iestriana.bean.Reserva;

public class ReservaDAOListas implements ReservaDAO {
	
	private List<Reserva> reservas = new ArrayList<Reserva>();

	@Override
	public void listar(String dia) {
		for (Reserva r : reservas) {
			if (r.getDiaSemana() .equalsIgnoreCase(dia)) {
				System.out.println(r);
			}
		}
	}

	@Override
	public boolean anadir(Reserva aux) {
		boolean enc = false;
		
		for (Reserva r : reservas) {
			if (r.getDiaSemana().equalsIgnoreCase(aux.getDiaSemana()) 
					&& r.getHoraDía().equalsIgnoreCase(aux.getHoraDía())) {
				enc = true;
			}
		}
		
		if (!enc) {
			reservas.add(aux);
		}
		
		return enc;
	}

	@Override
	public void borrarTodas() {
		reservas.clear();
	}

	@Override
	public int borrarEquivocadas() {
		int cuantos = 0;
		
		for (Reserva r : reservas) {
			if (r.getDiaSemana().equalsIgnoreCase("sábado") 
					|| r.getDiaSemana().equalsIgnoreCase("domingo")) {
				reservas.remove(r);
				cuantos++;
			} else if (!r.getHoraDía().equalsIgnoreCase("primera")
					&& !r.getHoraDía().equalsIgnoreCase("segunda")
					&& !r.getHoraDía().equalsIgnoreCase("tercera")
					&& !r.getHoraDía().equalsIgnoreCase("cuarta")
					&& !r.getHoraDía().equalsIgnoreCase("quinta")
					&& !r.getHoraDía().equalsIgnoreCase("sexta")) {
				reservas.remove(r);
				cuantos++;
			} else if (r.getNumeroAlumnos() < 0 || r.getNumeroAlumnos() > 35) {
				reservas.remove(r);
				cuantos++;
			}
		}
		
		return cuantos;
	}

	@Override
	public void buscarReservas(String cursoBuscado) {
		for (Reserva r : reservas) {
			if (r.getCurso().equalsIgnoreCase(cursoBuscado)) {
				System.out.println(r);
			}
		}
	}

	@Override
	public boolean actualizar(String profesor, String dia, String hora, String curso, int numero) {
		boolean act = false;
		
		for (Reserva r : reservas) {
			if (r.getProfesor().equalsIgnoreCase(profesor) 
					&& r.getDiaSemana().equalsIgnoreCase(dia)
					&& r.getHoraDía().equalsIgnoreCase(hora)) {
				r.setCurso(curso);
				r.setNumeroAlumnos(numero);
				
				act = true;
			}
		}
		
		return act;
	}

}
