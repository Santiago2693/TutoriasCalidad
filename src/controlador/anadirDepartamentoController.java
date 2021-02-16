package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidad.Departamento;
import modelo.entidad.Docente;
import modelo.jpa.JPAFactory;

@WebServlet("/anadirDepartamentoController")
public class anadirDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	private void procesarSolicitud(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nombre = req.getParameter("nombreDepartamento");
		
        Departamento departamento = new Departamento(nombre);
        
        DAOFactory fabrica = new JPAFactory();
        List<Departamento> dptos = fabrica.crearDepartamentoDAO().listar();
        
        boolean bandera = true;
        if (dptos == null) {
            bandera = false;
        } else {
            for (Departamento d: dptos) {
                bandera = !d.getNombre().equals(nombre);
                if (!bandera) {break;}
            }
        }
        
        if (bandera) {
        	fabrica.crearDepartamentoDAO().crear(departamento);	
            //resp.sendRedirect("listaDepartamentos.jsp");
        	req.setAttribute("mensajeExito", "Se ha registrado el departamento");//mensaje
			getServletContext().getRequestDispatcher("/aņadirDepartamento.jsp").forward(req, resp);
        } else {
        	req.setAttribute("departamento", dptos);//Docente
			req.setAttribute("mensajeError", "No se ha podido registrar el departamento");//mensaje
			//Navego hacia el JSP
			getServletContext().getRequestDispatcher("/aņadirDocente.jsp").forward(req, resp);
        }
        
	}

}
