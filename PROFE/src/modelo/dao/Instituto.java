package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class Instituto implements InstitutoDao{
	
	private List<Persona> lista;
	
	public Instituto() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		
		Profesor prof1 = 
				new Profesor("66A", "Eva Soriano", "Madrid", "666777888", "Java, Cobol");
			Alumno al1 = 
				new Alumno("77A", "Sara Varas", "Cadiz", "666444888", "1º DAW");
			
			Administrativo adm1 = 
				new Administrativo("99A", "Elias Vazquez", "Sevilla", "666777999",
						"Esemtia viejo y nuevo, becas");
			
		lista.add(adm1);
		lista.add(al1);
		lista.add(prof1);
	}

	@Override
	public boolean altaPersona(Persona presona) {
		if (lista.contains(presona))
			return false;
		return lista.add(presona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		for (Persona per: lista) {
			if (per.getNif().equalsIgnoreCase(nif))
				return per;
		}
		return null;
	}

	@Override
	public List<Persona> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public boolean eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return lista.remove(persona);
	}

	/*	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {

		List<Persona> aux = new ArrayList<>();
	 
		for (Persona per: lista) {
			if ( tipoPersona.equalsIgnoreCase("Administrativo") && per instanceof Administrativo) 
				aux.add(per);
			
			else if (tipoPersona.equalsIgnoreCase("Profesor") && per instanceof Profesor) 
				aux.add(per);
			
			else if (tipoPersona.equalsIgnoreCase("Alumno") && per instanceof Alumno)
				aux.add(per);
				
	}
		return aux;
	}
	*/
	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		List<Persona> aux = new ArrayList<>();
		
		
		switch(tipoPersona) {
		case "Administrativo":
			for (Persona p: lista) {
				if (p instanceof Administrativo)
					aux.add(p);
			}
			
			break;
		case "Alumno":
			for (Persona p: lista) {
				if (p instanceof Alumno)
					aux.add(p);
			}
			
			break;
				
		case "Profesor":
			for (Persona p: lista) {
				if (p instanceof Profesor)
					aux.add(p);
			}
			
			break;
		default:
			return aux=null;
		
		}
	 	
		return aux;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		

}
