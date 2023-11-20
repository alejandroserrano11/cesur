
import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor;
		int max;
		int min;

		System.out.println("Escribe un numero maximo: ");
		max = teclado.nextInt();

		System.out.println("Escribe un numero minimo: ");
		min = teclado.nextInt();

		do {
			System.out.println("Escribe un valor entre maximo y minimo: ");
			valor = teclado.nextInt();
		} while (!metodos.comprobarValor(max, min, valor));

		System.out.println("Es cierto que el valor " + "esta entre " + min + " y " + max + "?");
		System.out.println(metodos.comprobarValor(max, min, valor));

		teclado.close();
	}

	static boolean comprobarValor(int max, int min, int valor) {
		if ((valor <= max) && (valor >= min)) {
			return true;

		} else {
			return false;
		}

	}

	static boolean comprobarMax(int max, int min, int valor) {
		if (max > min) {
			return true;

		} else {
			return false;

		}

	}

}
