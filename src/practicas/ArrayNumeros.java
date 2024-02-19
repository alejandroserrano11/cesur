package practicas;

import java.util.Scanner;
import java.util.Random;

public class ArrayNumeros {

	// Pedir por teclado el tamaño del array
	// Construir array de int de ese tamaño
	// pedir rango de valores que se quieran introducir maximo y minimo [max...min]
	// introducir esos valores en el array de forma aleatoria hasta llenarlo de
	// valores positivos
	// almacenar en un array los numeros pares y en otro los impares
	// para ello lo primero es saber cuantos hay de cada

	public static void main(String[] args) {

		// Pedir por teclado el tamaño del array

		Scanner teclado = new Scanner(System.in);
		int[] arrayEnteros;
		int longitud;
		System.out.print("Introduce el tamaño del Array: ");
		longitud = teclado.nextInt();

		// Construir array de int de ese tamaño

		arrayEnteros = new int[longitud];

		// pedir rango de valores que se quieran introducir maximo y minimo [max...min]

		int maximo;
		int minimo;

		System.out.print("Introduce el numero minimo: ");
		minimo = teclado.nextInt();
		System.out.print("Introduce el numero maximo: ");
		maximo = teclado.nextInt();
		System.out.println();

		// introducir esos valores en el array de forma aleatoria hasta llenarlo

		Random aleatorio = new Random();
		System.out.print("Primer array: ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = aleatorio.nextInt(minimo, maximo);
			System.out.print(arrayEnteros[i] + " ");

		}
		
		System.out.println();

		// almacenar en un array los numeros pares y en otro los impares

		int[] arrayPares;
		int[] arrayImpares;
		int par = 0;
		int impar = 0;

		for (int i = 0; i < arrayEnteros.length; i++) {
			if ((arrayEnteros[i] % 2 == 0)) {
				par++;
			} else {
				impar++;
			}
		}

		arrayPares = new int[par];
		arrayImpares = new int[impar];

		int posicionPar = 0;
		int posicionImpar = 0;

		for (int i = 0; i < arrayEnteros.length; i++) {
			if ((arrayEnteros[i] % 2 == 0)) {
				arrayPares[posicionPar] = arrayEnteros[i];
				posicionPar++;
			} else {
				arrayImpares[posicionImpar] = arrayEnteros[i];
				posicionImpar++;
			}

		}

		System.out.print("Array de pares: ");
		for (int i = 0; i < arrayPares.length; i++) {
			System.out.print(arrayPares[i] + " ");

		}
		System.out.println();
		System.out.print("Array de impares: ");
		for (int i = 0; i < arrayImpares.length; i++) {
			System.out.print(arrayImpares[i] + " ");

		}

		teclado.close();

	} // fin del main

}// fin de la clase
