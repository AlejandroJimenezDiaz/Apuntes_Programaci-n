package modelo.dao;

import java.util.List;

import modelo.javabeans.Persona;

public interface InstitutoDao {
	// *=============MODIFICACIÓN==============*//
	boolean alta(Persona persona);

	boolean eliminarUno(Persona persona);

	// *=============BUSQUEDAS==============*//
	Persona buscarPersona(String nif);

	List<Persona> buscarPersonaPorTipo(String tipoPersona);

	List<Persona> buscarTodas();
}
