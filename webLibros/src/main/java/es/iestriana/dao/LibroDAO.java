package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Libro;
import es.iestriana.bean.Usuario;

public interface LibroDAO {

	public List<Libro> listarLibros(Conexion c, Usuario u);
}
