package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
//		Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de
//		caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o
//		descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está
//		dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta que el
//		cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de
//		descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán
//		ningún cambio.
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una cadena: ");
		String cadena=teclado.nextLine();
		
		System.out.println("La cadena cifrada es: "+cifrar(cadena));
		System.out.println("La cadena descifrada es: "+descifrar(cifrar(cadena)));
		
	}
	
	public static String cifrar(String cadena) {
		String letras="abcdefghijklmnopqrstuvwxyz";
		String resultado="";
		cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			char letra=cadena.charAt(i);
			if (letra=='y') {
				letra='a';
			}
			else if (letra=='z') {
				letra='b';
			}
			else {
				resultado+=(char)(letra+2);
			}
		}
		return resultado;
	}
	
	public static String descifrar(String cadena) {
		String letras="abcdefghijklmnopqrstuvwxyz";
		String resultado="";
		cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			char letra=cadena.charAt(i);
			if (letra=='a') {
				letra='y';
				resultado+=(char)(letra);
			}
			else if (letra=='b') {
				letra='z';
				resultado+=(char)(letra);
			}
			else {
				resultado+=(char)(letra-2);
			}
		}
		return resultado;
	}

}
