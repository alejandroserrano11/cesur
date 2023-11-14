//vamos a ir de 1200 a 620 contando de 20 en 20 usando while, do while y for

public class contador_inverso {
	public static void main(String[] args) {

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

	}
}
