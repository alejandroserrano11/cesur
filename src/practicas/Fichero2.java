package practicas;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero2 {

	public static void main(String[] args) throws IOException {
		
		FileReader entrada = null;
		char caracter;
		
		//imprimir todas las lineas del fichero
		
		try {
			entrada = new FileReader("fichero2.txt");
			caracter = (char) entrada.read();
			while (caracter != (char) -1) {
				System.out.print(caracter);
				caracter = (char) entrada.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada!=null) {
				entrada.close();
			}
		}// fin del trycatch1
		
		//pedir por pantalla cuantas lineas quieres imprimir y sacarlas por pantalla
		
		System.out.println();
		
		entrada = null;
		Scanner teclado = new Scanner(System.in);
		int numeroLinea = 0;
		
		System.out.print("Introduce el numero de lineas que quieres imprimir (de la 1 a la 4): ");
		numeroLinea = teclado.nextInt();
		
		try {
			entrada = new FileReader("fichero2.txt");
			caracter = (char) entrada.read();
			while (caracter != (char) -1 && numeroLinea > 0) {
				if (caracter=='\n') {
					numeroLinea--;
				}
				System.out.print(caracter);
				caracter = (char) entrada.read();
			} 
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada!=null) {
				entrada.close();
			}
		}// fin trycatch2
		
		teclado.close();
		
		

	} //cierra main

}
