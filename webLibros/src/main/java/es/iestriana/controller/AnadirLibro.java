package es.iestriana.controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import es.iestriana.bean.Usuario;

/**
 * Servlet implementation class AnadirLibro
 */
@MultipartConfig
public class AnadirLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String uuid = UUID.randomUUID().toString();
		
		HttpSession sesion = request.getSession();
		int idUsuario = ((Usuario)sesion.getAttribute("usuarioWeb")).getIdUsuario();
		
		// Portada
		Part fichero = request.getPart("portada");
		InputStream inputS = null;
		ByteArrayOutputStream bos = null;
		if (!getFileName(fichero).equals("")) {
			inputS = fichero.getInputStream();
			
			// Escalar Imagen
			BufferedImage imageBuffer = ImageIO.read(inputS);
			Image tmp = imageBuffer.getScaledInstance(640, 640, BufferedImage.SCALE_FAST);
			BufferedImage buffered = new BufferedImage(640, 640, BufferedImage.TYPE_INT_RGB);
			buffered.getGraphics().drawImage(tmp, 0, 0, null);
					
			bos = new ByteArrayOutputStream();
			ImageIO.write(buffered, "jpg", bos);
			
		}
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
