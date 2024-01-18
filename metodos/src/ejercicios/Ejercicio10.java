package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
//		Método mcd() (máximo común divisor), que calcule el mcd de dos números
//		pasados como parámetros utilizando el algoritmo de Euclides. Este algoritmo
//		dice que si tenemos dos números A y B, restamos el menor del mayor hasta que
//		A y B sean iguales, es ese momento tenemos el valor de mcd. 
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero1=teclado.nextInt();
		Scanner teclado1=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero2=teclado1.nextInt();
		
		System.out.println("El mcd es: "+mcd(numero1,numero2));

	}
	
	public static int mcd(int numero1, int numero2) {
		while (numero1!=numero2) {
			if (numero1>numero2) {
				numero1=numero1-numero2;
			}
			else if (numero2>numero1) {
				numero2=numero2-numero1;
			}
		}
		return numero1;
	}
}
