package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
//		y retorna un valor true en caso de que el carácter sea una vocal, y un valor false
//		en caso contrario.
		
		System.out.println(esVocal("b"));

	}
	
	public static boolean esVocal(String letra) {
		String vocales = "aeiou";
		if (vocales.indexOf(letra)!=-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
