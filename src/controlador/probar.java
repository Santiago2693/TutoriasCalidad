package controlador;

import java.util.Date;

import modelo.dao.DAOFactory;
import modelo.entidad.Departamento;
import modelo.entidad.Docente;
import modelo.entidad.Estudiante;
import modelo.entidad.Turno;
import modelo.entidad.Tutoria;
import modelo.jpa.JPAFactory;
import modelo.jpa.JPAGenericDAO;

public class probar {

	public static void main(String[] args) {
		
		DAOFactory fabrica = new JPAFactory();
        
       	Estudiante estudiante = new Estudiante("18", "55", "dfsers", "sddfdf");
       	fabrica.crearUsuarioDAO(JPAFactory.ESTUDIANTE).crear(estudiante);
       
	  	Departamento dpto = new Departamento("asdasdasd");
	   	fabrica.crearDepartamentoDAO().crear(dpto);
       
       	Docente docente = new Docente("1723171714", "seaer", "sdeaw", dpto);
       	fabrica.crearUsuarioDAO(JPAFactory.DOCENTE).crear(docente);
       
       	Turno turno = new Turno("gfgf", "L 7-185", docente);
       	fabrica.crearTurnoDAO().crear(turno);
		
		DAOFactory f2 = new JPAFactory();

        /* 
		Date fecha = new Date(2005, 10, 1);
		Tutoria tutoria = new Tutoria("07:15", fecha, docente, estudiante);
		f2.crearTutoriaDAO().crear(tutoria);*/
		DAOFactory f3 = new JPAFactory();
		Docente d = (Docente) f3.crearUsuarioDAO(JPAFactory.DOCENTE).leer("1723171714");
		System.out.println(d);
	   
	   
		/*f3.crearTutoriaDAO().eliminar(tutoria);*/
		f3.crearUsuarioDAO(JPAFactory.DOCENTE).eliminar(d);
		
		
		/*
		//fabrica.crearTutoriaDAO().eliminar(tutoria);
		
		//fabrica.crearUsuarioDAO(JPAFactory.ESTUDIANTE).eliminar(estudiante);
		
		*/
    
	}

}