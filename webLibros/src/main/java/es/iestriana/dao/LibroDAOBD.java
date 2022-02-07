package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Libro;
import es.iestriana.bean.Usuario;

public class LibroDAOBD implements LibroDAO {

	@Override
	public List<Libro> listarLibros(Conexion c, Usuario u) {
		System.out.println(u.getIdUsuario());
		List<Libro> libros = new ArrayList<Libro>();		
		
		String query = "SELECT * FROM libros WHERE idUsuario = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			ps.setInt(1, u.getIdUsuario());
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Libro auxiliar = new Libro(rs.getInt("idLibro"), 
						rs.getString("titulo"), 
						rs.getString("autor"), 
						rs.getString("isbn"), 
						rs.getBytes("portada"), 
						rs.getInt("idUsuario"), 
						rs.getString("uuid"));
				
				libros.add(auxiliar);
				System.out.println(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
	}

}
