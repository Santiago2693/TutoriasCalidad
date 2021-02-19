package controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.DAOFactory;
import modelo.entidad.Departamento;
import modelo.entidad.Docente;
import modelo.entidad.Estudiante;
import modelo.jpa.JPAFactory;

@WebServlet("/actualizarContrasenaDocenteController")
public class actualizarContrasenaDocenteController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public actualizarContrasenaDocenteController() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		String cedula = (String) sesion.getAttribute("usuario");//Usuario jsp
		
		String contrase�aActual = request.getParameter("passwd");
		String nuevaContrase�a = request.getParameter("passwd1");
		String nuevaContrase�aVerificar = request.getParameter("passwd2");

		DAOFactory fabrica = new JPAFactory();
		Docente docente = (Docente) fabrica.crearUsuarioDAO(JPAFactory.DOCENTE).leer(cedula);
		if ( nuevaContrase�a.equals(nuevaContrase�aVerificar) && cedula.equals(docente.getCedula()) 
				&& contrase�aActual.equals(docente.getContrase�a())){
			Docente docenteNuevo = new Docente(cedula, nuevaContrase�a, docente.getNombre(), docente.getApellido());
			fabrica.crearUsuarioDAO(JPAFactory.DOCENTE).actualizar(docenteNuevo);
			response.sendRedirect("docentePasswd.jsp");
		}else{
			request.setAttribute("mensajeError", "Las contrase�as no coinciden");
			getServletContext().getRequestDispatcher("/docentePasswd.jsp").forward(request, response);
		}
	}
	
}