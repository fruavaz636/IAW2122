<%@page import="es.iestriana.bean.Conexion"%><%@page import="java.io.OutputStream"%><%@page import="es.iestriana.dao.LibroDAOBD"%><%@page import="es.iestriana.dao.LibroDAO"%><%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%try{
	ServletContext sc = getServletContext();
	String usu = sc.getInitParameter("usuario");
	String pass = sc.getInitParameter("password");
	String bd = sc.getInitParameter("database");
	String driver = sc.getInitParameter("driver");	
	Conexion con = new Conexion(usu, pass, bd, driver);
	String idLibro = request.getParameter("idLibro");
	LibroDAO lDAO = new LibroDAOBD();
	byte[] portada = lDAO.obtenerPortada(Integer.parseInt(idLibro), con);
	try {
		if (portada != null) {
			response.setContentType("image/jpeg");
			response.setHeader("Content-Disposition", "attachment");
			OutputStream o = response.getOutputStream();
			o.write(portada);
			o.flush();
			o.close();
			return;
		}
	} catch (IllegalStateException e) {}
} catch (Exception e) {}%>