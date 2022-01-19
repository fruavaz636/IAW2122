package es.iestriana.dao;

import es.iestriana.bean.Conexion;

public interface UsuarioDAO {

	public boolean buscarLogin(String login, Conexion c);
}
