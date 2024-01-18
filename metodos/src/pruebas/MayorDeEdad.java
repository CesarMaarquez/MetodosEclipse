package pruebas;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		int edad;
		
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una edad: ");
		edad=teclado.nextInt();
		
		if (valor(edad)) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
	}
	//método al que pasamos la edaad de una person y nos dice si es mayor de edad
	public static boolean valor(int edad) {
		if (edad>=18) {
			return true;
		}
		else {
			return false;
		}
	}
}
