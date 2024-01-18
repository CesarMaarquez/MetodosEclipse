package pruebas;

import java.util.Scanner;

public class MayorDe2 {

	public static void main(String[] args) {
		int num1, num2;
		
//		Scanner teclado=new Scanner(System.in);
//		System.out.println("Introduzca una edad: ");
//		num1=teclado.nextInt();
//		Scanner teclado1=new Scanner(System.in);
//		System.out.println("Introduzca una edad: ");
//		num2=teclado1.nextInt();
		
		System.out.println("El número más grande es: "+mayor(2,3.5,15 ));

	}
	//método al que pasamos dos números y nos retorna el mayor
	
	public static int mayor(int num1, int num2) {
		int masGrande;
		if (num1>=num2) {
			masGrande=num1;
		}
		else {
			masGrande=num2;
		}
		return masGrande;
	}
	
	//mayor de 3
	public static double mayor( double num1, double num2, double num3) {
		double masGrande = 0;
		if (num1>=num2&&num1>=num3) {
			masGrande=num1;
		} 
		if (num2>=num1&&num2>=num3) {
			masGrande=num2;
		} 
		if (num3>=num1&&num3>=num2) {
			masGrande=num3;
		} 
		return masGrande;
	}
	
	
	
	
	
	
	
	
}
