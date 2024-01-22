package practicas;

import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		MiArray cadena;
		cadena = new MiArray(100);

		for (int i = 0; i < 100; i++) {
			cadena.insertarValor(aleatorio.nextInt(150));
		}

		// sacar los 10 primeros

		for (int i = 0; i < 10; i++) {
			System.out.println(cadena.getIntMiArray(i));
		}

		// sacar solo los pares

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 == 0) {
				System.out.println(cadena.getIntMiArray(i));
			}
		}

		// sacar solo los impares

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 != 0) {
				System.out.println(cadena.getIntMiArray(i));
			}
		}

		// introducir pares en un array

		int numPar = 0;

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 == 0) {
				numPar++;
			}

		}

		MiArray cadenaPares = new MiArray(numPar);

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 == 0) {
				cadenaPares.insertarValor(cadena.getIntMiArray(i));
			}
		}

		// introducir impares en un array

		int numImpar = 0;

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 != 0) {
				numImpar++;
			}
		}

		MiArray cadenaImpares = new MiArray(numImpar);

		for (int i = 0; i < 100; i++) {
			if (cadena.getIntMiArray(i) % 2 != 0) {
				cadenaImpares.insertarValor(cadena.getIntMiArray(i));
			}
		}
		
		// introducir pares e impares en la cadena original de manera alternativa
		
		

	} // cierra el main

} // cierra SimuladorLista
	// almacena enteros postivos

class MiArray {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;

	// constructores
	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;
		}

	}

	MiArray() {
		numElem = 0;
		miArray = new int[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = -1;
		}
	}

	public void insertarValor(int valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			numElem--;
			temp = miArray[numElem];
			miArray[numElem] = -1;
			return temp;

		}
	}

	public int sacarValorPrimero() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp = miArray[0];
			// reducir en 1 numElem y meter los valores en la posicion anterior.
			for (int i = 0; i < numElem - 1; i++) {
				miArray[i] = miArray[i + 1];
			}
			miArray[numElem - 1] = -1;
			numElem--;

			return temp;
		}
	}

} // cierra MiArray