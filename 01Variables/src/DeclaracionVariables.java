import java.util.Scanner;

public class DeclaracionVariables {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Esto es un comentario de una sola l�nea
		/* Esto es un comentario de m�s de una
		 * l�nea y se pueden escribir todas las l�neas que necesitemos
		 */
		
		//Tipos PRIMITIVOS:
		
		// Enteros
		
		//Utilizamos este tipo de n�meros para almecenar valores sin decimales:
		
		byte b; // es de 8 bits representa desde -128 hasta +127.
		short sh; //Es de 16 bits. Representa desde -32.768 hasta +32.767
		int i; //Es de 32 bits. Representa desde -2.147.483.648 hasta +2.147.483.647
		long l; //Es de 64 bits. Representa desde -9223372036854775808 hasta +9223372036854775807
		char c; //Es de 0 hasta 65535
		char ch = 'a';
		char ch1 = 97;
		char ch2 = 0x61;
		System.out.println("Como caracter " + ch);
		System.out.println("Como caracter ascII " + ch1);
		System.out.println("Como caracter hex " + ch2);
		
		
		
		//Tipos REALES
		//Almacenan valores con decimales
		
		final float PI = 3.1416F; //Precisi�n de 7 d�gitos 32 bits.
		final double PI2 = 3.1416; //Precisi�n de 16 d�gitos 64 bits.
		
		//Tipo L�GICO O BOOLEANO
		
		boolean bool = false;
		
		//Tipo CLASE ENVOLTURA
		
		Byte bE;
		Short shE;
		Integer iE;
		Long lE;
		Character chE;
		Float fE;
		Double dE;
		Boolean blE;
		String cadena;
		
		//Declaraci�n de constantes
		
		final int FIN = 23;
		
		int prue = FIN + 54 + 8;
		
		int variable01 = 55;
		Integer variable02 = 100;
		
		prue = variable01 * variable02;
		
		Float flotante01 = 0.0F;
		
		flotante01 = variable02.floatValue();
		
		System.out.println("Introduzca un n�mero");
		
		Double gradosCelsius = sc.nextDouble();
		
		System.out.println("El n�mero introducido es: " + gradosCelsius);
		
		System.out.println("El valor de la varable prue es: " + prue);
	}

}
