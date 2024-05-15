package testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;

public class Principal {

	public static void main(String[] args) {
		Profesor prof1 = 
			new Profesor("66A", "Eva Soriano", "Madrid", "666777888", "Java, Cobol");
		Alumno al1 = 
			new Alumno("77A", "Sara Varas", "Cadiz", "666444888", "1º DAW");
		
		Administrativo adm1 = 
			new Administrativo("99A", "Elias Vazquez", "Sevilla", "666777999",
					"Esemtia viejo y nuevo, becas");
		System.out.println("ESTO ES PROFE");
		System.out.println(prof1);
		System.out.println(prof1.llamar(adm1));
		System.out.println(prof1.ponerNotas());
		System.out.println(prof1.trabajar());
		System.out.println("ESTO ES ALUMNO");
		System.out.println(al1);
		System.out.println(al1.llamar(prof1));
		System.out.println(al1.hacerExamen());
		System.out.println(al1.trabajar());
		
		System.out.println("ESTO ES ADMINISTRATIVO");
		System.out.println(adm1);
		System.out.println(adm1.llamar(al1));
		System.out.println(adm1.gestionarMatricula());
		System.out.println(adm1.trabajar());
	}

}
