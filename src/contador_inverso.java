//vamos a ir de 1200 a 620 contando de 20 en 20 usando while, do while y for

import java.util.Scanner;

public class contador_inverso {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int maximo = 0;
		int minimo = 0;
		int salto = 0;
		int contador = 1200;

		while ((contador >= 620)) {
			System.out.print(contador + " ");
			contador = (contador - 20);
		}

		System.out.println();

		contador = 1200;

		do {
			System.out.print(contador + " ");

			contador = contador - 20;

		} while ((contador >= 620));

		System.out.println();

		for (int i = 1200; i >= 620; i = i - 20) {
			System.out.print(i + " ");

		}
		System.out.println();

		System.out.print("Introduce el número máximo: ");

		maximo = teclado.nextInt();

		System.out.println();

		System.out.print("Introduce el número mínimo: ");
		minimo = teclado.nextInt();
		while (minimo > maximo) {
			System.out.print("Introduce el número mínimo: ");
			minimo = teclado.nextInt();
		}
		System.out.println();

		System.out.print("Introduce el salto: ");

		salto = teclado.nextInt();

		System.out.println();

		for (int x = maximo; x >= minimo; x = x - salto) {
			System.out.print(x + " ");
		}
		teclado.close();
	}
}
