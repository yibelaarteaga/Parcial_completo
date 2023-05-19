
public class navesespacialestripulads {
	private String nombre;

	public navesespacialestripulads(String nombre) {
	    this.nombre = nombre;
	}


	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

}
public class EstacionEspacial extends navesespacialestripulads {
	private String estado;
	private double peso;
	private double alturaOrbita;
	

	public EstacionEspacial(String nombre, String estado, double peso, double alturaOrbita) {
	    super(nombre);
	    this.estado = estado;
	    this.peso = peso;
	    this.alturaOrbita = alturaOrbita;
	}

	
	

	public String getEstado() {
	    return estado;
	}

	public void setEstado(String estado) {
	    this.estado = estado;
	}

	public double getPeso() {
	    return peso;
	}

	public void setPeso(double peso) {
	    this.peso = peso;
	}

	public double getAlturaOrbita() {
	    return alturaOrbita;
	}

	public void setAlturaOrbita(double alturaOrbita) {
	    this.alturaOrbita = alturaOrbita;
	}

}
