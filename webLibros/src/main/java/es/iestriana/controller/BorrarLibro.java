package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.iestriana.bean.Conexion;
import es.iestriana.dao.LibroDAO;
import es.iestriana.dao.LibroDAOBD;

/**
 * Servlet implementation class BorrarLibro
 */
public class BorrarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uuid = request.getParameter("uuid");
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		LibroDAO lDAO = new LibroDAOBD();
		
		int cuantos = lDAO.borrarLibro(con, uuid);
		
		if (cuantos == 1) {
			response.sendRedirect("jsp/principal.jsp");
		} else {
			response.sendRedirect("jsp/principal.jsp?error=Error al borrar el libro");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
