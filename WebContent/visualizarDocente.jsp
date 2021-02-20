<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Docente: M�dulo Visualizar Informacion</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
        crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link
        href="https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap"
        rel="stylesheet">
  <style>

    html, body{
        height: 100%;
    }

    body {
        background-color: #fbf9f6;
        font-family: 'Poppins';
        color: #2f3640;
    }

    .purpura{
        background-color: rgb(87,16,178);
        color: white;
        font-weight: 600;
    }

    .purpura2{
        background-color: rgba(79,12,164,1);
    }

    nav{
        text-align: end;
    }

    a{
        color: white !important;
    }
      a:hover{
        background-color: white;
        color:black !important;
    }

    .btn-primary{
        width: 100%;
        background-color: rgb(87,16,178);
        border-color: rgb(87,16,178);
    }

    .btn-primary:hover{
        background-color: rgba(79,12,164,1);
        border-color: rgba(79,12,164,1);
    }

    #altura{
      height:100%;
    }

    .edicion{
          background-color: inherit !important;
          color:black !important;
    }
      
    nav div a {
        background-color:inherit !important;
        color: white !important;
        font-weight: 600 !important;
    }
    nav div a:hover {
        color: white !important;
        font-weight: 800 !important;
    }
    #acciones{
        width: 35%
    }
    
    li:hover {
        background-color: white;
    }
    ul li  a:hover{
        color: black !important;
    }

    .aOn {
        background-color: white;
        color: black !important;
    }

    .bordes {
        position: relative;
        width: 50%;
        padding: 20px;
        float:right;
        right:10%;
        bottom:80%;
    }
  </style>
</head>


<body>

    <div class="container-fluid" id="altura">
      <nav class="row purpura" style="height: 6%" >
        <div class="col-9 d-flex flex-column justify-content-center align-items-start">
            Tutor�as
        </div>
        <div class="col-3 d-flex flex-row justify-content-end align-items-center">
              <a href="ModuloDocente.jsp" class="btn">Docente</a>
              <div class="btn-group">
                  <button type="button" class="btn text-white dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false"></button>
                  <ul class="dropdown-menu  purpura2">
                    <li><a class="dropdown-item " href="docentePasswd.jsp">Cambiar Contrase�a</a></li>
                    <li><a class="dropdown-item " href="index.jsp">Salir</a></li>
                  </ul>
                </div>
        </div>
      </nav>

      <div class="row" style="height: 94%;">

            <div class="col-3 purpura2 d-flex flex-column justify-content-start">
              <a class="btn py-3 my-4 text-center" href="#">Tutorias</a>
              <a class="btn py-3 my-4 text-center" href="listarHorarioTutorias.jsp">Horarios Tutorias</a>
              <a class="btn py-3 my-4 text-center aOn" href="#">Informacion Docente</a>
            </div>
        </div>

        <div class="bordes bg-white rounded-3 container-fluid shadow-sm my-3 col-lg-7 col-md-7 col-sm-10 col-xs-10" >
            <form>
              <div class="d-grid gap-2 d-md-flex justify-content-md-end">
              <button type="button" class="btn btn-success text-end ">Editar</button></div>
              <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" readonly>
              </div>
              <div class="form-group">
                <label for="apellido">Apellido</label>
                <input type="text" class="form-control" id="apellido" readonly>
              </div>
              <div class="form-group">
                <label for="cedula">C�dula</label>
                <input type="text" class="form-control" id="cedula" readonly>
              </div>
              <div class="form-group">
                <label for="departamento">Departamento</label>
                <input type="text" class="form-control" id="departamento" readonly >
              </div>
            </form>
        </div>
    </div>

    <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
    crossorigin="anonymous"></script>
</body>

</html>