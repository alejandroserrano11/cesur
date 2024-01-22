package practicas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String palabra;
		char[] cadena;

		System.out.println("Introduce una palabra: ");

		palabra = teclado.nextLine();
		cadena = palabra.toCharArray();
		
		//longitud par
		int j = cadena.length;
		int i = 0;
		boolean esPalindromo = true;
		
		while (esPalindromo && (i<cadena.length/2)) {
			j--;
			if (cadena[i] != cadena[j]) {
				esPalindromo = false;
			}
			i++;
		}
		
		
		System.out.println("La palabra es palíndroma?: "+esPalindromo);

		teclado.close();
	}

}
