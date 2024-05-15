package testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;
import modelo.javabeans.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Persona Juan = new Profesor("512345", "Juan", "Chipiona", "62456789", "Matemáticas");

		System.out.println("METODO TO STRING");

		System.out.println(Tomas);
		System.out.println(Ale);
		System.out.println(Ana);

		System.out.println("METODO TRABABAR");

		System.out.println(Raul.trabajar());
		System.out.println(Victor.trabajar());
		System.out.println(Ana.trabajar());

		System.out.println("METODO LLAMAR");

		System.out.println(Alberto.llamar(Marcos));
		System.out.println(Raul2.llamar(Alonso));
		System.out.println(Ana.llamar(Ale));
		System.out.println(Ale.llamar(Tomas));

		System.out.println("METODO PONER NOTAS");

		System.out.println(Tomas.ponerNotas());
		System.out.println(Raul.ponerNotas());

		System.out.println("METODO HACER EXAMEN");

		System.out.println(Alonso.hacerExamen());
		System.out.println(Victor.hacerExamen());

		System.out.println("METODO GESTIONAR MATRICULA");

		System.out.println(Ana.gestionarMatricula());

		System.out.println("PERSONA = NEW PROFESOR");

		System.out.println(Juan);
	}
}
