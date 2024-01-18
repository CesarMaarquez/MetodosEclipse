package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Escribe el método grados(), que convierta una temperatura en grados Celsius a
//		grados Fahrenheit. 
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca unos grados Celsius: ");
		float temperatura=teclado.nextFloat();
		
		System.out.println("En grados Fahrenheit: "+grados(temperatura));

	}
	
	public static float grados(float temperatura) {
		return ((9F/5)*temperatura+32);
	}

}
