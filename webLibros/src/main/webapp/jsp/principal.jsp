<!doctype html>
<%@page import="es.iestriana.bean.Libro"%>
<%@page import="java.util.List"%>
<%@page import="es.iestriana.dao.LibroDAOBD"%>
<%@page import="es.iestriana.dao.LibroDAO"%>
<%@page import="es.iestriana.bean.Conexion"%>
<%@page import="es.iestriana.bean.Usuario"%>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>WEB LIBROS</title>
  </head>
  <body>
	<div class="container">
		<%
		if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
			response.sendRedirect("../index.jsp?mensaje=Error de sesi�n");
		} else {
			ServletContext sc = getServletContext();
			String usu = sc.getInitParameter("usuario");
			String pass = sc.getInitParameter("password");
			String bd = sc.getInitParameter("database");
			String driver = sc.getInitParameter("driver");
			
			Conexion con = new Conexion(usu, pass, bd, driver);
			
			LibroDAO lDAO = new LibroDAOBD();
			List<Libro> libros = lDAO.listarLibros(con, (Usuario)session.getAttribute("usuarioWeb"));			
		%>
		
		<div class="row mt-2">
			<div class="col">
				<span></span>
				<nav aria-label="breadcrumb">
				  <ol class="breadcrumb">
				    <li class="breadcrumb-item">Hola <%=((Usuario)session.getAttribute("usuarioWeb")).getNombre() %></li>
				    <li class="breadcrumb-item active" aria-current="page">Principal</li>
				    <li class="breadcrumb-item"><a href="#">Cerrar Sesi�n</a></li>
				  </ol>
				</nav>
			</div>
		</div>
		
		<div class="row mt-2">
			<% 
			for(Libro aux: libros) {
			%>
				<div class="card" style="margin: 10px">
					<img alt="Libro" src="" class="card-img-top" style="width: 300px;height: 100px">
					<div class="card-body">
						<h5 class="card-title"></h5>
						<p class="card-text"></p>
						<p class="card-text"></p>
						<button type="button" class="btn btn-secondary">Actualizar</button>
						<button type="button" class="btn btn-warning">Borrar</button>
					</div>
				</div>
			<%
			}
			%>
		</div>
		
		<%
		}		
		%>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>
