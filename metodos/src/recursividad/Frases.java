package recursividad;

public class Frases {

	public static void main(String[] args) {
		
		String frase="Hola, buenos días";
		System.out.println("Total vocales: "+cuentaVocales(frase));

	}
	
//	public static int cuentaVocales(String frase) {
//		String vocales="aeiouáéíóú";
//		int contador=0;
//		frase.toLowerCase();
//		for (int i = 0; i < frase.length(); i++) {
//			if (vocales.indexOf(frase.charAt(i))!=-1) {
//				contador++;
//			}
//		}
//		return contador;
//	}

	public static int cuentaVocales(String frase) {
		String vocales="aeiouáéíóú";
		frase.toLowerCase();
		if (frase.length()==0) {
			return 0;
		} else {
			char letra=frase.charAt(0);
			String resto=frase.substring(1);
			if (vocales.indexOf(letra)!=-1) {
				return 1+cuentaVocales(resto);
			}else {
				return 0+cuentaVocales(resto);
			}
		}
		
	}
	
	
}
