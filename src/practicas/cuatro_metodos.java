package practicas;

import java.util.Scanner;

public class cuatro_metodos {

	static final int TOTALNUM = 10;
	static int[] arrayEnteros = new int[TOTALNUM];

	public static void main(String[] args) {
		int numero = 3;
		valoresDesde(numero);
		System.out.println(numero);

	}

	// 1- solicita 10 numeros y los lamacena en array de int
	static void pideNumeros() {
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < TOTALNUM; i++) {
			System.out.print("Introduce un número: ");
			arrayEnteros[i] = teclado.nextInt();
		}

		teclado.close();
	}

	// 2- imprime el array de int solo los pares
	static void imprimeNumeros() {
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] % 2 == 0) {
				System.out.println(arrayEnteros[i]);
			}
		}

	}

	// 3- modifica el array poniendo todos los numeros pares, es decir, si el numero
	// es
	// par lo mantiene, sino es par guarda el numero par siguiente en esa
	// posicion
	static void cambiaApar() {
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] % 2 != 0) {
				arrayEnteros[i] = arrayEnteros[i] + 1;
			}
		}
	}

	// 4- pone a cero todos los numeros del array
	static void reseteaNumeros() {

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = 0;
		}
	}

	// 5- pone a x todos los numeros del array
	static void poneNumerosx(int x) {

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = x;
		}
	}

	// 6- mete valores pares desde el valor introducido.
	static void valoresDesde(int x) {
		if (x % 2 != 0) {
			x = x + 1;
		}
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = x;
			x = x + 2;
			System.out.println(arrayEnteros[i]);

		}
	}

}
