package pruebas;

public class Doble {

	public static void main(String[] args) {
	int numero=7;
	PruebaMetodos.saludar();
	doble(5);
	doble(numero);

	}
	
	public static void doble(int dato) {
		System.out.println("El doble es: "+ (dato*2)); 
	}

}
