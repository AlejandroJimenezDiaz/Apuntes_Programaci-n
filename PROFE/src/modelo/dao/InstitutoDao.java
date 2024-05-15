package modelo.dao;

import java.util.List;

import modelo.javabeans.Persona;

public interface InstitutoDao {
	
	boolean altaPersona(Persona presona);
	Persona buscarPersona(String nif);
	List<Persona> buscarTodas();
	boolean eliminarPersona(Persona persona);
	List<Persona> buscarPersonasPorTipo(String tipoPersona);
	

}
