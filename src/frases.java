
import java.util.Scanner;

public class frases {

	static final int CANTIDAD = 10;

	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < CANTIDAD; i++) {
			System.out.print("Introduce una frase: ");
			setValue(cadenas, i, teclado.nextLine());
		}

		for (int i = 0; i < CANTIDAD; i++) {

			System.out.println(getValue(cadenas, i));
		}

		teclado.close();
	}

	static String getValue(String[] cadenas, int posicion) {
		return cadenas[posicion];
	}

	String getValue(int posicion) {
		return cadenas[posicion];
	}

	static void setValue(String[] cadenas, int posicion, String nuevaCadena) {
		cadenas[posicion] = nuevaCadena;

	}

	void setValue(int posicion, String nuevaCadena) {

	}
}
