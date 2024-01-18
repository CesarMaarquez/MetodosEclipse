package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Realiza un método redondear() al que se le pasa como parámetro un numero float
//		y los decimales que deben quedar después de redondear, y retorna el numero
//		redondeado.
//
//		Ejemplo: redondear( 234.49234 , 3 )
//		Da como resultado : 234.492
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		float numero=teclado.nextFloat();
		System.out.println("Decimales: ");
		int decimales=teclado.nextInt();
		
		System.out.println("Número redondeado: "+redondear(numero, decimales));
		System.out.println("Número redondeado: "+redondear2(numero, decimales));

	}
	
	public static float redondear(float numero, int decimales) {
		String s=String.valueOf(numero);
		int pos_punto;
		pos_punto=s.indexOf(".");
		if (pos_punto+decimales<=s.length()-1) {
			String resultado=s.substring(0, pos_punto+decimales+1);
			return Float.parseFloat(resultado);
		}
		else {
			return numero;
		}
		
	}
	
	public static float redondear2(float numero, int decimales) {
		numero*=(float)Math.pow(10, decimales);   //multiplico el numero
		numero=Math.round(numero);
		numero/=Math.pow(10, decimales);
		return numero;
	}

}
