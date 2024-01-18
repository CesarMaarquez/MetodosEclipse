package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
//		Escribe un método recursivo Fibonacci() que calcule el valor de la serie para un
//		valor dado, siendo:
//		F(1)=0
//		F(2)=1
//		F(n)=F(n-1)+F(n-2), para n>=3
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero=teclado.nextInt();
		
		System.out.println("El valor de Fibonacci de ese número es: "+Fibonacci(numero));

	}
	
	public static int Fibonacci(int numero) {
		if (numero==1) {
			return 0;
		}
		else if (numero==2) {
			return 1;
		}
		else {
			return Fibonacci(numero-1)+Fibonacci(numero-2);
		}
	}

}
