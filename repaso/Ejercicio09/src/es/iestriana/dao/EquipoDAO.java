package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Equipo;

public interface EquipoDAO {

	//Listar todos los equipos de la lista.
	public void listar();
	
	//Añadir un equipo a la lista siempre que el equipo no esté ya en la lista.
	public void anadir(Equipo nuevo);
	
	//Borrar todos los equipos de la lista.
	public void borrarTodos();
	
	//Borrar los equipos cuyo año de fundación sea menor que el 1930 
	//y tenga menos de 1000 abonados. Mostrar cuántos equipos se han borrado.
	public int borrarAnyoAbonados();
	
	//Buscar todos los equipos de la Champions League con un ranking fifa mayor 
	//que uno especificado por el usuario.
	public void buscarChampions(int ranking); 
	
	//Buscar todos los equipos de la Europa League con un ranking fifa 
	//y número de abonados mayor que los valores especificados por el usuario.
	public List<Equipo> buscarEuropaLeague(int ranking);
	
	//Actualizar el ranking fifa (incrementarlo en 10) de los equipos de la Conference League.
	public void actualizar();

}
