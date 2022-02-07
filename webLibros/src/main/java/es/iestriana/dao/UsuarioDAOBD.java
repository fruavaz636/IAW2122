package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public class UsuarioDAOBD implements UsuarioDAO {
	
	private String clave = "WEBLIBROS20212022";

	@Override
	public boolean buscarLogin(String login, Conexion c) {
		boolean existe = false;
		
		String sql = "SELECT * FROM usuarios WHERE login = ?";
		try {
			PreparedStatement ps = c.getConector().prepareStatement(sql);
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return existe;
	}

	@Override
	public int insertarUsuario(Usuario usuario, Conexion con) {
		int filas = 0;
		
		String sql = "INSERT INTO usuarios VALUES (null, ?, AES_ENCRYPT(?, ?), ?, ?, ?)";
		try {
			PreparedStatement ps = con.getConector().prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getPassword());
			ps.setString(3, clave);
			ps.setString(4, usuario.getNombre());
			ps.setString(5, usuario.getEmail());
			ps.setInt(6, usuario.getTipo());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return filas;
	}

	@Override
	public Usuario comprobarUsuario(String usuario, String password, Conexion con) {
		Usuario usuAux = null;
				
		String query = "SELECT * FROM usuarios "
				+ "WHERE login = ? AND password = AES_ENCRYPT(?, ?)";
		
		try {
			PreparedStatement ps = con.getConector().prepareStatement(query);
			
			ps.setString(1, usuario);
			ps.setString(2, password);
			ps.setString(3, clave);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				usuAux = new Usuario(rs.getInt("idUsuario"),
									rs.getString("login"), 
									rs.getString("password"), 
									rs.getString("nombre"), 
									rs.getString("email"), 
									rs.getInt("tipo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuAux;
	}

}
