package modelo.dao;

import java.util.List;
import java.util.ArrayList;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class Instituto implements InstitutoDao {

	private List<Persona> lista;

	public Instituto() {
		super();
		lista = new ArrayList<>();
		cargarDatos();
	}

	public Instituto(List<Persona> lista) {
		super();
		this.lista = lista;
		cargarDatos();
	}

	private void cargarDatos() {
		Profesor Tomas = new Profesor("49039066A", "Tomas", "calle naranjo", "662662662",
				"Tutor,Programacion,Entornos");
		Profesor Raul = new Profesor("49022066B", "Raul Salgado", "calle limon", "636363636", "Profesor Base de Datos");
		Profesor Alberto = new Profesor("490033066C", "Alberto", "calle Sandia", "646464646",
				"Profesor Sistemas Informaticos");
		Profesor Raul2 = new Profesor("49099066D", "Raul", "calle Melon", "656565656", "Profesor Lenguaje de Marcas");
		Alumno Ale = new Alumno("42154789D", "Ale", "sanlucar", "647651756", "1ºDAM");
		Alumno Victor = new Alumno("42222222A", "Victor", "Rota", "65310206", "2ºDAM");
		Alumno Marcos = new Alumno("43333333B", "Marcos", "Chipiona", "64727516", "1ºDAM");
		Alumno Alonso = new Alumno("44444444D", "Alonso", "Jerez", "956363512", "2ºDAM");
		Administrativo Ana = new Administrativo("123456789S", "Ana", "Jerez", "627878998", "Dar de alta");

		lista.add(Tomas);
		lista.add(Raul);
		lista.add(Alberto);
		lista.add(Raul2);
		lista.add(Ale);
		lista.add(Victor);
		lista.add(Marcos);
		lista.add(Alonso);
		lista.add(Ana);

	}

	@Override
	public boolean alta(Persona persona) {
		if (lista.contains(persona))
			return false;
		else
			return lista.add(persona);
	}

	@Override
	public boolean eliminarUno(Persona persona) {

		return lista.remove(persona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		for (Persona ele : lista) {
			if (ele.getNif().equalsIgnoreCase(nif)) {
				return ele;
			}
		}
		return null;
	}

	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		List<Persona> encontrados = new ArrayList<>();
		int contador = 0 ;
		for (Persona ele : lista) {
			
			switch (tipoPersona.toLowerCase()) {

			case "alumno":
				if (ele instanceof Alumno) {
					encontrados.add(ele);
					contador++;
				};
				break;
			case "profesor":
				if (ele instanceof Profesor) {
					encontrados.add(ele);
					contador++;
				}
				break;
			case "administrativo":
				if (ele instanceof Administrativo) {
					encontrados.add(ele);
					contador++;
				}
				break;
			}
		}	
		System.out.println("Existe  " + contador + "  " + tipoPersona );
		return encontrados;
	}

	@Override
	public List<Persona> buscarTodas() {
		int nAlumnos = 0, nProfesor = 0, nAdministrativo = 0;
		for (Persona ele : lista) {

			if (ele instanceof Alumno) {
				nAlumnos++;
			}
			if (ele instanceof Profesor) {
				nProfesor++;
			}
			if (ele instanceof Administrativo) {
				nAdministrativo++;
			}
		}
		System.out.println("Hay : " + nAlumnos + " Alumnos");
		System.out.println("Hay : " + nProfesor + " Profesores");
		System.out.println("Hay : " + nAdministrativo + " Administrativos");
		return lista;

	}

}
