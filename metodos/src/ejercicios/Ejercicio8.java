package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
//		Realiza un método llamado quitaFaltas() al que se le pasa un String con un texto
//		en minúsculas con signos de puntuación y coloque adecuadamente las palabras
//		que deban empezar en mayúsculas.
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una cadena: ");
		String frase=teclado.nextLine();
		
		System.out.println("La frase corregida es: "+quitaFaltas(frase));

	}
	
	public static StringBuilder quitaFaltas(String frase) {
		
		char letra;
		StringBuilder sb=new StringBuilder(frase);
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)=='.') {
				letra=frase.charAt(i+2);
				sb.deleteCharAt(i+2);
				sb.insert(i+2, Character.toUpperCase(letra));
				}
			if (i==0) {
				letra=frase.charAt(i);
				sb.deleteCharAt(i);
				sb.insert(i, Character.toUpperCase(letra));
			}
			}
		return sb;
		
	}

}
