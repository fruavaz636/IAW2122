package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;

public class UsuarioDAOBD implements UsuarioDAO {

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

}
