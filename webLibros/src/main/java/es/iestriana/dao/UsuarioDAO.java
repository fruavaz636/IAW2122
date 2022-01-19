package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public interface UsuarioDAO {

	public boolean buscarLogin(String login, Conexion c);

	public int insertarUsuario(Usuario usuario, Conexion con);
}
