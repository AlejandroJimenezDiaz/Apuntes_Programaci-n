package aplicaciones;

import java.util.Scanner;

import modelo.dao.Instituto;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;

public class AppInstituto {

	private static Instituto rdao;
	private static Scanner leer;

	static {
		rdao = new Instituto();
		leer = new Scanner(System.in);
	}

	public static void main(String[] args) {

		int opcion = 0;

		do {
			opcion = pintarmenu();
			if (opcion == 6)
				break;
			switch (opcion) {
			case 1:
				buscarTodas();
				break;
			case 2:
				buscarPersonaPorTipo();
				break;
			case 3:
				buscarPersona();
				break;
			case 4:
				eliminarUno();
				break;

			case 5:
				alta();
				break;

			}

		} while (opcion >= 1 && opcion <= 6);

		System.out.println("Fin de Programa");

	}

	public static void buscarTodas() {
		System.out.println(rdao.buscarTodas());
	}

	public static void buscarPersonaPorTipo() {
		System.out.println("Escriba tipo de persona : Alumno , Profesor o Administrativo");
		String opcion = leer.next();
		System.out.println(rdao.buscarPersonaPorTipo(opcion));
	}

	public static void buscarPersona() {
		System.out.println("Escriba el Nif de la persona");
		String opcion = leer.next();
		System.out.println(rdao.buscarPersona(opcion));

	}

	public static void eliminarUno() {
		String nif = "";
		System.out.println("Introduzca nif");
		nif = leer.next();
		System.out.println("Has Eliminado a " + rdao.buscarPersona(nif));
		rdao.eliminarUno(rdao.buscarPersona(nif));
	}

	public static void alta() {
		System.out.println(
				"Para Dar de alta introduzca NUMERO ENTERO segun corresponda :   (1)Alumno  (2)Profesor  (3)Administrativo");
		int numero = leer.nextInt();
		switch (numero) {

		case 1:
			System.out.println("Escriba los datos del Alumno");
			String nif = null, nombre = null, direccion = null, telefono = null, curso = null;
			Alumno nuevo = new Alumno(nif, nombre, direccion, telefono, curso);
			System.out.println("Introduzca Nif");
			nif = leer.next();
			nuevo.setNif(nif);
			System.out.println("Introduzca nombre");
			nombre = leer.next();
			nuevo.setNombre(nombre);
			System.out.println("Introduzca direccion");
			direccion = leer.next();
			nuevo.setDireccion(direccion);
			System.out.println("Introduzca telefono");
			telefono = leer.next();
			nuevo.setTelefono(telefono);
			System.out.println("Introduzca curso");
			curso = leer.next();
			nuevo.setCurso(curso);
			rdao.alta(nuevo);
			System.out.println("Esto son los datos del nuevo  " + nuevo);
			break;
		case 2:
			System.out.println("Escriba los datos del Profesor");
			String nif2 = null, nombre2 = null, direccion2 = null, telefono2 = null, competencia = null;
			Profesor nuevo2 = new Profesor(nif2, nombre2, direccion2, telefono2, competencia);
			System.out.println("Introduzca Nif");
			nif = leer.next();
			nuevo2.setNif(nif);
			System.out.println("Introduzca nombre");
			nombre = leer.next();
			nuevo2.setNombre(nombre);
			System.out.println("Introduzca direccion");
			direccion = leer.next();
			nuevo2.setDireccion(direccion);
			System.out.println("Introduzca telefono");
			telefono = leer.next();
			nuevo2.setTelefono(telefono);
			System.out.println("Introduzca Competencia");
			competencia = leer.next();
			nuevo2.setCompetencias(competencia);
			rdao.alta(nuevo2);
			System.out.println("Esto son los datos del nuevo  " + nuevo2);

			break;
		case 3:
			System.out.println("Escriba los datos del Administrativo");
			String nif3 = null, nombre3 = null, direccion3 = null, telefono3 = null, tareas = null;
			Administrativo nuevo3 = new Administrativo(nif3, nombre3, direccion3, telefono3, tareas);
			System.out.println("Introduzca Nif");
			nif = leer.next();
			nuevo3.setNif(nif);
			System.out.println("Introduzca nombre");
			nombre = leer.next();
			nuevo3.setNombre(nombre);
			System.out.println("Introduzca direccion");
			direccion = leer.next();
			nuevo3.setDireccion(direccion);
			System.out.println("Introduzca telefono");
			telefono = leer.next();
			nuevo3.setTelefono(telefono);
			System.out.println("Introduzca tareas");
			tareas = leer.next();
			nuevo3.setTareas(tareas);
			rdao.alta(nuevo3);
			System.out.println("Esto son los datos del nuevo  " + nuevo3);
		}

	}

	public static int pintarmenu() {
		int opcion = 0;
		System.out.println("1.- Listar Personas");
		System.out.println("2.- Listar Personas Por Tipo");
		System.out.println("3.- Buscar Persona por Nif");
		System.out.println("4.- Eliminar Persona");
		System.out.println("5.- Dar de Alta");
		System.out.println("6.- Salir");
		System.out.println("teclee opcion 1 a 5, 6 salir");
		opcion = leer.nextInt();

		while (opcion < 1 || opcion > 6) {
			System.out.println("opcion incorrecta");
			opcion = leer.nextInt();
		}

		return opcion;

	}

}
