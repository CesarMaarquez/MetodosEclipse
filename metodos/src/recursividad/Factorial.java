package recursividad;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5 ));
	}
	
	//metodo iterativo que calcula el factorial de un número

	
//	public static long factorial(int numero) {
//		long resultado=1;
//		for (int i = 1; i <= numero; i++) {
//			resultado*=i;
//		}
//		return resultado;
//	}
	
	//metodo recursivo
	
	public static long factorial(int numero) {
		//filosofia de trabajo, si es facil lo resuelvo, pero si se complica pido ayuda
		if (numero==1) {
			return 1;     //esto es facil, retorno el resultado
		} else {
			return numero*factorial(numero-1);
		}
		
	}
	
}
