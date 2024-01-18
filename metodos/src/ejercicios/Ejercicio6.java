package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
//		Método repite(), que recibe como parámetro una cadena de caracteres y un
//		numero, y retorna un nuevo String donde aparece repetida la cadena de caracteres
//		tantas veces como indique el numero pasado como parámetro.
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		String cadena=teclado.nextLine();
		System.out.println("Introduzca un número de repeticiones: ");
		int repeticiones=teclado.nextInt();
		
		System.out.println("Resultado: "+repite(cadena, repeticiones));
		System.out.println("Resultado: "+repite2(cadena, repeticiones));
		
	}
	
	public static String repite(String cadena, int repeticiones) {
		if (repeticiones<0||cadena.length()<1) {
			return "";
		}
		String resultado="";
		for (int i = 0; i < repeticiones; i++) {
			resultado+=cadena;
		}
		return resultado;
	}
	public static String repite2(String cadena, int repeticiones) {
		if (repeticiones<0||cadena.length()<1) {
			return "";
		}
		if (repeticiones==1) {
			return cadena;
		}
		else {
			return cadena+repite2(cadena, repeticiones-1);
		}
		
		
	}

}
