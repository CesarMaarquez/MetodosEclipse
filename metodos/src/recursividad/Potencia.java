package recursividad;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int base, exp;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Base: ");
		base=teclado.nextInt();
		Scanner teclado1=new Scanner(System.in);
		System.out.println("Exponente: ");
		exp=teclado1.nextInt();
		
		System.out.println("Potencia: "+potencia(base,exp));

	}
	
	public static long potencia(int num, int exp) {
		long resultado;
		if (exp==0) {
			return 1;
		} else {
			resultado=num*potencia(num,exp-1);
		}
		return resultado;
	}

}
