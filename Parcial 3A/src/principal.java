	
	import java.util.Scanner;


public class principal {
	

	

		private static int velocidad;




		public static void main (String[] args) {
			System.out.println("**Inventario de naves espaciales**");
			int elegir;
			
			
			do{
				menu();
				Scanner scanner = new Scanner(System.in);
				elegir = scanner.nextInt();
			
			switch(elegir) {
				 
			
			      case 1:   naveTripulada();
					        break;
					
					case 2: naveNoTripulada();
					        break;
					        
					case 3: naveLanzadora();
					        break;
					        
					case 4: return;
					
			}
			
			}
			
			while(elegir != 4);

		}

		public static void menu() {
		System.out.println("\nSeleccione una opcion");
		System.out.println("1. Crear nave espacial tripulada");
		System.out.println("2. Crear nave espacial no tripulada");
		System.out.println("3. Crear nave lanzadera");
		System.out.println("4. Salir del inventario");
		
		}


	private static void naveLanzadora() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ingrese peso de la nave");
		
		System.out.println("ingrese capacidad de tripulacion de la nave");
		System.out.println("ingrese velocidad maxima de la nave");
		velocidad = in.nextInt();
	}




	private static void naveNoTripulada() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ingrese peso de la nave");
		int peso = in.nextInt();
		System.out.println("ingrese capacidad de tripulacion de la nave");
		int capacidad = in.nextInt();
		System.out.println("ingrese velocidad maxima de la nave");
		int velocidad = in.nextInt();
		
	}




	private static void naveTripulada() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ingrese peso de la nave");
		int peso = in.nextInt();
		System.out.println("ingrese capacidad de tripulacion de la nave");
		int capacidad = in.nextInt();
		System.out.println("ingrese velocidad maxima de la nave");
		int velocidad = in.nextInt();
		System.out.println("ingrese tipo de propulsor");
		String propulsor = in.nextLine();
		
	}
		
	}	
		


	
	
	
	   

