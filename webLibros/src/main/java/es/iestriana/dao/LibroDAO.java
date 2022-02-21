package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Libro;
import es.iestriana.bean.Usuario;

public interface LibroDAO {

	public List<Libro> listarLibros(Conexion c, Usuario u);
	
	public byte[] obtenerPortada(int idLibro, Conexion c);
	
	public int borrarLibro(Conexion c, String uuid);

	public void insertarLibro(Conexion con, Libro lb);
	
	public Libro obtenerLibro(Conexion con, String uuid);

	public void actualizarLibro(Conexion con, Libro lb);
}
