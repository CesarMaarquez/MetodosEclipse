package pruebas;

public class Media {

	public static void main(String[] args) {
		System.out.println(media (5,7.7,6.8,4,3.3));
	}
	
	//métodos para calcular la media de todos los valores que le pasamos por parámetros
	
	public static double media (double...ds) {
		double suma=0;
		int contador=0;
		for (double d : ds) {
			suma+=d;
			contador++;
		}
		return (suma/contador);
		
	}

}
