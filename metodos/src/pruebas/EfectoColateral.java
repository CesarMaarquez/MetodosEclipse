package pruebas;

public class EfectoColateral {

	public static void main(String[] args) {
		// probar qué pasa cuando el parametro en un dato referenciado
		
		StringBuilder frase = new StringBuilder("Hola, buenos días");
		StringBuilder resultado;
		
		resultado=añadirPuntoFinal2(frase);
		
		System.out.println(resultado);
		System.out.println(frase);

	}
	
	//metodo que añade un punto al final de la frase
	
	public static StringBuilder añadirPuntoFinal(StringBuilder texto) {
		texto.append(".");
		return texto;
	}
	
	//el mismo metodo pero sin modificar el dato original
	
	public static StringBuilder añadirPuntoFinal2(StringBuilder texto) {
		StringBuilder nuevo=new StringBuilder(texto);
		nuevo.append(".");
		return nuevo;
	}

}
