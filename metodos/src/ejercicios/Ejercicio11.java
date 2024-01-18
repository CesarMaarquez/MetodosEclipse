package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
//		Escribe un método romano(), que pasa un numero entero positivo entre 1 y 99 a
//		números romanos. Los caracteres romanos son:
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero=teclado.nextInt();
		
		System.out.println("El número en romano es: "+romano(numero));

	}
	
	public static String romano(int numero) {
		String [] unidades= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] decenas= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		
		int decena= numero/10;
		int unidad=numero%10;
		
		return decenas[decena] + unidades[unidad];
	}

}
