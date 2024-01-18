package pruebas;

public class Sumas {

	public static void main(String[] args) {
		System.out.println(suma(2,7.5));

	}
	
	//metodo que suma dos numeros que le paso por parametro
	public static int suma(int num1, int num2) {
		int resultado;
		resultado=num1+num2;
		return resultado;
	}
	
	public static double suma(double num1, double num2) {
		double resultado;
		resultado=num1+num2;
		return resultado;
	}
	
	public static double suma(double num1, double num2, double num3) {
		double resultado;
		resultado=num1+num2+num3;
		return resultado;
	}
	
	
}
