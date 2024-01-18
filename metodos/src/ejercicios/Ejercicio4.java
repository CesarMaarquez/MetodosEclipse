package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Método factorial(), que calculará el factorial del número que se le pasa como
//		parámetro. Retornará el resultado del calculo del factorial, o bien un -1 en caso
//		de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro
//		pasado sea cero.
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numero=teclado.nextInt();
		
		System.out.println("El factorial es: "+factorial(numero));
		
		

	}
	
	public static long factorial(int numero) {
		if (numero<0) {
			return -1;
		}
		if (numero==0) {
			return -2;
		}
		if (numero==1) {
			return 1;
		}
		else {
			return numero*factorial(numero-1);
		}
		
	}

}
