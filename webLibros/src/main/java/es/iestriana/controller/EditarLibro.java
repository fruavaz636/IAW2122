package es.iestriana.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Libro;
import es.iestriana.bean.Usuario;
import es.iestriana.dao.LibroDAO;
import es.iestriana.dao.LibroDAOBD;

/**
 * Servlet implementation class EditarLibro
 */
@MultipartConfig
public class EditarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String uuid = request.getParameter("uuid");
		
		HttpSession sesion = request.getSession();
		int idUsuario = ((Usuario)sesion.getAttribute("usuarioWeb")).getIdUsuario();
		
		// Portada
		Part fichero = request.getPart("portada");
		InputStream inputS = null;
		ByteArrayOutputStream bos = null;
		byte[] res = null;
		
		Libro lb = null;
		
		if (!getFileName(fichero).equals("")) {
			inputS = fichero.getInputStream();
			
			// Escalar Imagen
			/*BufferedImage imageBuffer = ImageIO.read(inputS);
			Image tmp = imageBuffer.getScaledInstance(640, 640, BufferedImage.SCALE_FAST);
			BufferedImage buffered = new BufferedImage(640, 640, BufferedImage.TYPE_INT_RGB);
			buffered.getGraphics().drawImage(tmp, 0, 0, null);
					
			bos = new ByteArrayOutputStream();
			ImageIO.write(buffered, "jpg", bos);
			res = bos.toByteArray();*/
			
			
			bos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			while (true) {
			    int r = inputS.read(buffer);
			    if (r == -1) break;
			    bos.write(buffer, 0, r);
			}
			res = bos.toByteArray();
			
			lb = new Libro(titulo, autor, isbn, res, idUsuario, uuid);
		} else {
			lb = new Libro(titulo, autor, isbn, null, idUsuario, uuid);
		}
		
		
		
		LibroDAO lDAO = new LibroDAOBD();
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		lDAO.actualizarLibro(con, lb);
		
		response.sendRedirect("jsp/principal.jsp");
	}
	
	private Object getFileName(Part fichero) {
		for (String c : fichero.getHeader("content-disposition").split(";")) {
			if (c.trim().startsWith("filename")) {
				return c.substring(c.indexOf("=")+1).trim().replace("\"", "");
			}
			
		}
		
		return null;
	}

}
