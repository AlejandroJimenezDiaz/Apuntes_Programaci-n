package modelo.javabeans;

public class Profesor extends Persona {

	private String competencias;

	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return "Profesor [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", competencias=" + competencias + "]";
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El Profesor " + this.nombre + " va impartir su clase";
	}

	public String ponerNotas() {
		return "El  Profesor " + this.nombre + " va a corregir los examenes";
	}

}
