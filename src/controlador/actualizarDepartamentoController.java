package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidad.Departamento;
import modelo.jpa.JPAFactory;

@WebServlet("/actualizarDepartamentoController")
public class actualizarDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public actualizarDepartamentoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String nuevoNombre = request.getParameter("nombre");
		DAOFactory fabrica = new JPAFactory();
		Departamento dpto = new Departamento(nuevoNombre);
		dpto.setId(id);
		fabrica.crearDepartamentoDAO().actualizar(dpto);
		response.sendRedirect("listarDepartamentoController");
	}

}