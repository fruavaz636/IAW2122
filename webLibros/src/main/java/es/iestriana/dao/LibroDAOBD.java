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
						rs.getInt("isbn"), 
						rs.getBytes("portada"), 
						rs.getInt("idUsuario"), 
						rs.getString("uuid"));
				
				libros.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
	}

	@Override
	public byte[] obtenerPortada(int idLibro, Conexion c) {
		byte[]portada = null;
		
		String query = "SELECT portada FROM libros WHERE idLibro = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			ps.setInt(1, idLibro);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				portada = rs.getBytes("portada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return portada;
	}

	@Override
	public int borrarLibro(Conexion c, String uuid) {
		int cuantos = 0;
		
		String sql = "DELETE FROM libros WHERE uuid = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(sql);
			ps.setString(1, uuid);
			
			cuantos = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cuantos;
	}

	@Override
	public void insertarLibro(Conexion con, Libro lb) {
		String sql = "INSERT INTO libros VALUES (null, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.getConector().prepareStatement(sql);
			ps.setString(1, lb.getTitulo());
			ps.setString(2, lb.getAutor());
			ps.setInt(3, lb.getIsbn());
			ps.setBytes(4, lb.getPortada());
			ps.setInt(5, lb.getIdUsuario());
			ps.setString(6, lb.getUuid());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Libro obtenerLibro(Conexion con, String uuid) {
		Libro aux = null;
		
		String query = "SELECT * FROM libros WHERE uuid = ?";
		
		try {
			PreparedStatement ps = con.getConector().prepareStatement(query);
			ps.setString(1, uuid);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				aux = new Libro(rs.getInt("idLibro"), rs.getString("titulo"), 
						rs.getString("autor"), rs.getInt("isbn"), 
						rs.getBytes("portada"), rs.getInt("idUsuario"), rs.getString("uuid"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}

	@Override
	public void actualizarLibro(Conexion con, Libro lb) {	
		try {
			PreparedStatement ps = null;
			if (lb.getPortada() != null) {
				String sql = "UPDATE libros SET titulo=?,autor=?,isbn=?,portada=? WHERE uuid=?";
				
				ps = con.getConector().prepareStatement(sql);
				ps.setString(1, lb.getTitulo());
				ps.setString(2, lb.getAutor());
				ps.setInt(3, lb.getIsbn());
				ps.setBytes(4, lb.getPortada());			
				ps.setString(5, lb.getUuid());
			} else {
				String sql = "UPDATE libros SET titulo=?,autor=?,isbn=? WHERE uuid=?";
				
				ps = con.getConector().prepareStatement(sql);
				ps.setString(1, lb.getTitulo());
				ps.setString(2, lb.getAutor());
				ps.setInt(3, lb.getIsbn());
				ps.setString(4, lb.getUuid());
			}					
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
