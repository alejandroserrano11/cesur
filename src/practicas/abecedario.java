package practicas;

public class abecedario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int cont = 97; cont < 97 + 27 - 1; cont++) {
			System.out.print((char) cont + " ");
		}

		System.out.println();

		int cont = 97;

		while (cont < 97 + 27 - 1) {
			System.out.print((char) cont + " ");
			cont = cont + 1;

		}
	}

}
