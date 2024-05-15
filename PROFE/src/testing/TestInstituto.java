package testing;

import modelo.dao.Instituto;
import modelo.dao.InstitutoDao;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class TestInstituto {
	
	private static InstitutoDao idao;
	
	static {
		idao = new Instituto();
	}
	
	public static void main(String[] args) {
		
	 	todos();
		alta();
		uno();
		eliminar();
	  	porTipo();
		
	}
	
	public static void eliminar() {
		System.out.println("ELIMINAR");
		System.out.println(idao.eliminarPersona(idao.buscarPersona("66A")));
		todos();
	}
	
	public static void uno() {
		System.out.println("BUSCAR UNO");
		System.out.println(idao.buscarPersona("66A"));
		System.out.println(idao.buscarPersona("234"));
	}
	
	public static void alta() {
		System.out.println("ALTA PERSONA");
		Profesor prof = new Profesor("A87878765", "IUL", "madrid", "678678678", "Spring Boot");
		System.out.println(idao.altaPersona(prof));
		todos();
	}
	
	public static void porTipo() {
		System.out.println("ALUMNOS");
		for (Persona per: idao.buscarPersonasPorTipo("Alumno")) {
			
			System.out.println(((Alumno)per).hacerExamen()); 
			System.out.println(per.trabajar());
		}
		System.out.println("ADMINISTRATIVOS");
		for (Persona per: idao.buscarPersonasPorTipo("Administrativo")) {
			
			System.out.println(((Administrativo)per).gestionarMatricula()); 
		}
		System.out.println("PROFES");
		for (Persona per: idao.buscarPersonasPorTipo("Profesor")) {
			
			System.out.println(((Profesor)per).ponerNotas()); 
		}
			
	}
	
	public static void todos() {
	//	idao.buscarTodas().forEach(System.out::println);
		System.out.println("TODAS");
		for (Persona p: idao.buscarTodas())
			System.out.println(p);
	}

}
