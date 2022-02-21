<!doctype html>
<%@page import="es.iestriana.bean.Libro"%>
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

    <title>WEB LIBROS - EDITAR</title>
  </head>
  <body>
	<div class="container">
	<%
		if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
			response.sendRedirect("../index.jsp?mensaje=Error de sesión");
		} else {
			ServletContext sc = getServletContext();
			String usu = sc.getInitParameter("usuario");
			String pass = sc.getInitParameter("password");
			String bd = sc.getInitParameter("database");
			String driver = sc.getInitParameter("driver");
			
			Conexion con = new Conexion(usu, pass, bd, driver);
			
			LibroDAO lDAO = new LibroDAOBD();
			
			Libro aux = lDAO.obtenerLibro(con, (String)request.getParameter("uuid"));
	%>
		<div class="row mt-2">
			<div class="col">
				<span></span>
				<nav aria-label="breadcrumb">
				  <ol class="breadcrumb">
				    <li class="breadcrumb-item">Hola <%=((Usuario)session.getAttribute("usuarioWeb")).getNombre() %></li>
				    <li class="breadcrumb-item active" aria-current="page"><a href="principal.jsp">Principal</a></li>				    
				    <li class="breadcrumb-item"><a href="../CerrarSesion">Cerrar Sesión</a></li>
				  </ol>
				</nav>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<h2>Añadir Libro</h2><!doctype html>
				<form method="post" action="../EditarLibro" enctype="multipart/form-data">
					<input type="hidden" name="uuid" id="uuid" value="<%=aux.getUuid()%>">
				  <div class="mb-3">
				    <label for="titulo" class="form-label">Título</label>
				    <input type="text" class="form-control" id="titulo" name="titulo" 
				    		aria-describedby="tituloHelp" autofocus="autofocus" value="<%=aux.getTitulo()%>">				    
				  </div>
				  <div class="mb-3">
				    <label for="autor" class="form-label">Autor</label>
				    <input type="text" class="form-control" id="autor" name="autor" value="<%=aux.getAutor()%>">
				  </div>
				  <div class="mb-3">
				    <label for="isbn" class="form-label">ISBN</label>
				    <input type="text" class="form-control" id="isbn" name="isbn" value="<%=aux.getIsbn()%>">
				  </div>
				  <div class="mb-3">
				  	<img alt="Portada" src="image.jsp?idLibro=<%=aux.getIdLibro()%>" style="width: 40px;height: 60px">
				    <label for="portada" class="form-label">Portada</label>
				    <input type="file" class="form-control" id="portada" name="portada">
				  </div>
				  <button type="submit" class="btn btn-primary">Actualizar</button>
				</form>
				
				<%
				String mensaje = request.getParameter("mensaje");
				if (mensaje != null) {
				%>
				<div class="alert alert-warning alert-dismissible fade show" role="alert">
				  <strong>Error!!!</strong> <% out.print(mensaje); %> <%=mensaje %> 
				  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
				<%
				}
				%>
			</div>
		</div>
	<%			
		}
	%>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>