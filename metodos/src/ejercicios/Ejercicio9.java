package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
//		Escribe el método inverso(), que recibe un numero y retorna el inverso (si recibe
//				el 1234 da como retorno el 4321). Prohibido usar método reverse().
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero=teclado.nextInt();
		
		System.out.println("El número al revés es: "+inverso(numero));
		
	}
	
	public static int inverso(int numero) {
		String num=String.valueOf(numero);
		StringBuilder sb=new StringBuilder();
		for (int i = num.length()-1; i >= 0; i--) {
			sb.append(num.charAt(i));
		}
		return Integer.parseInt(sb.toString());
	}

}
