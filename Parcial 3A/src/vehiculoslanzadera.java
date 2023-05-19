
public abstract class vehiculoslanzadera {
	private String nombre;
	 String paispropietario;
       int altura;
	 int peso;
	 int potencia;
	
	
public vehiculoslanzadera(String nombre, String paispropietario, int altura, int peso, int potencia ) {
	this.altura = altura;
	this.nombre = nombre;
	this.paispropietario = paispropietario;
	this.peso = peso;
	this.potencia = potencia;	
	
}

public abstract void lanzar();
public abstract void aterrizar();


}

public class SaturnoV extends vehiculoslanzadera{
	private int añoderetirada;
	
	public SaturnoV(String nombre, String paispropietario, int altura, int peso, int potencia, int añoderetirada) {
		super(nombre, paispropietario, altura, peso, potencia);
		this.añoderetirada = añoderetirada;
	}


	public void lanzar() {
		System.out.println("lanzando SaturnoV");
		
	}


	public void aterrizar() {
		System.out.println("aterrizar SaturnoV");
		
	}	
	
}

public class Energia extends vehiculoslanzadera{
	  private int combustible;
		
		public Energia(String nombre, String paispropietario, int altura, int peso, int potencia, int combustible) {
			super(nombre, paispropietario, altura, peso, potencia);
			this.combustible = combustible;
			
			
}
		public void lanzar() {
			System.out.println("lanzando Energia");
		}

		public void aterrizar() {
			System.out.println("Aterrizar energia ");
			
		}	
		
		public interface Comportamiento {
		    public void moverse();
		}

	
		public abstract class ComportamientoAbstracto implements Comportamiento {
		    public void detenerse() {
		        System.out.println("Deteniéndose...");
		    }
		}
	

}
