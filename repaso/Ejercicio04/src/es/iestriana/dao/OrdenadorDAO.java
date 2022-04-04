package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Ordenador;

public interface OrdenadorDAO {

	/**
	 * Añadir un ordenador a la lista de ordenadores siempre que el ordenador no esté en la lista.
	 */
	public void anadir(Ordenador o);
	
	/**
	 * Borrar todos los ordenadores de la lista
	 */
	public void borrar();
	
	/**
	 * Borrar los ordenadores que no funcionen cuyo año sea menor que el 2017.
	 */
	public void borrarNoFuncionenMenor2017();
	
	
	/**
	 * Buscar un ordenador por marca, ram y procesador indicados por el usuario en el 
	 * programa principal.
	 */
	public Ordenador buscarPorMarcaRamProcesador(String marca, int ram, String procesador);
	
	
	/**
	 * Buscar todos los ordenadores que tengan una determinada ram y estén funcionando.
	 */
	public List<Ordenador> buscarPorRamFuncionando(int ram);
	
	
	/**
	 * Actualizar la ram de los ordenadores del 2019 con un valor solicitado por el usuario.
	 */
	public void actualizarRam2019(int ram);
	
	/**
	 * Listar todos los ordenadores que sean de 512 de ram, del año 2018 y funcionen.
	 */
	public void listar512Ram2018Funcionen();
	
	/**
	 * Listar todos
	 */
	public void listar();
}
