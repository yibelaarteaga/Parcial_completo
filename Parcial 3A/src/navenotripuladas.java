
public class navenotripuladas {
	private String agencia;
	private String[] planetasDestino;
	private String[] lunasDestino;
	private String[] combustibles;
	
	public navenotripuladas(String agencia, String[] planetasDestino, String[] lunasDestino, String[] combustibles) {
	    this.agencia = agencia;
	    this.planetasDestino = planetasDestino;
	    this.lunasDestino = lunasDestino;
	    this.combustibles = combustibles;
	}

	
	public navenotripuladas(String agencia2, String[] planetasDestino2, Object lunasDestino2, String[] combustibles2) {
		// TODO Auto-generated constructor stub
	}


	public void enviarSenal() {
	  System.out.println("llegar a la tierra ");
	}

	public void tomarMuestras() {
	    System.out.println("tomar muestras del espacio");
	}

	
	public String getAgencia() {
	    return agencia;
	}

	public void setAgencia(String agencia) {
	    this.agencia = agencia;
	}

	public String[] getPlanetasDestino() {
	    return planetasDestino;
	}

	public void setPlanetasDestino(String[] planetasDestino) {
	    this.planetasDestino = planetasDestino;
	}

	public String[] getLunasDestino() {
	    return lunasDestino;
	}

	public void setLunasDestino(String[] lunasDestino) {
	    this.lunasDestino = lunasDestino;
	}

	public String[] getCombustibles() {
	    return combustibles;
	}

	public void setCombustibles(String[] combustibles) {
	    this.combustibles = combustibles;
	}

}

public class Sondaplaneta extends navenotripuladas {
	private String planetaDestino;
	
	public Sondaplaneta(String agencia, String planetaDestino, String[] combustibles) {
		 super(agencia, new String[]{planetaDestino}, null, combustibles);
		 this.planetaDestino = planetaDestino;
		}

		//Getters y setters
		public String getPlanetaDestino() {
		 return planetaDestino;
		}

		public void setPlanetaDestino(String planetaDestino) {
		 this.planetaDestino = planetaDestino;
		}
}


public interface Propulsionable {
public void propulsar();

}


public interface Explorable {
public void explorar();
}


 abstract class SondaPropulsada extends EstacionEspacial implements Propulsionable {
	 public SondaPropulsada(String agencia, String[] planetasDestino, String[] lunasDestino, String[] combustibles) {
		 super(agencia, planetasDestino, lunasDestino, combustibles);
		 } 

}
