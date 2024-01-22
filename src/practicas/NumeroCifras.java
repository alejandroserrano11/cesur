package practicas;

import java.util.Scanner;

public class NumeroCifras {
	public static void main(String[] args) {
		// pedir un numero y comprobar que sea positivo

		Scanner teclado = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("Introduce un número positivo: ");
			num = teclado.nextInt();
		} while (num < 0);
		
		// sacar por pantalla el numero de cifras que tiene del numero
		
		
		
		
		teclado.close();

	}

}
