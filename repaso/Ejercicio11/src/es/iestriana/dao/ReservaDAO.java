package es.iestriana.dao;

import es.iestriana.bean.Reserva;

public interface ReservaDAO {

	/**
	 * Listar todos las reservas de un día pasado como parámetro de entrada.
	 * @param dia
	 */
	public void listar(String dia);
	
	/**
	 * Añadir una reserva a la lista siempre que el día y la hora no esté ya reservado.
	 * @param r
	 * @return
	 */
	public boolean anadir(Reserva r);
	
	/**
	 * Borrar todas las reservas de la lista.
	 */
	public void borrarTodas();
	
	
	/**
	 * Borrar las reservas equivocadas, es decir, todas las reservas realizadas para fines de 
	 * semana, horas equivocadas o número de alumnos menor que cero o mayor que 35. Mostrar 
	 * cuántas reservas se han borrado.
	 * @return
	 */
	public int borrarEquivocadas();
	
	
	/**
	 * Buscar todas las reservas de un curso pasado como parámetro de entrada.
	 * @param cursoBuscado
	 */
	public void buscarReservas(String cursoBuscado);
	
	
	/**
	 * Actualizar la reserva de un profesor para un día y una hora. Actualizar el curso y 
	 * el número de alumnos según los parámetros de entrada.
	 * @param profesor
	 * @param dia
	 * @param hora
	 * @param curso
	 * @param numero
	 * @return
	 */
	public boolean actualizar(String profesor, String dia, String hora, String curso, int numero);
	
	
	

}
