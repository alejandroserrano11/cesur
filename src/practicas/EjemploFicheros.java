package practicas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFicheros {

	
	public static void main(String[] args) throws IOException {
		// trabajar con caracteres
		// lectura de un fichero "pruebaFichero.txt"
		// escritura de un fichero:
		// escritura de un fichero, al final del mismo.
		
		//flujo de lectura:
		
		FileReader entrada = null;
		boolean nofin = true;
		char caracter;
		
		try {
			entrada = new FileReader("pruebaFichero.txt");
			
			do {
				caracter = (char) entrada.read();
				if (caracter == (char)-1) {
					nofin = false;
				} else {
					System.out.print(caracter);
				}
			} while (nofin);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
		
		String frase = "hola que tal";
		char[] fraseArray = new char[frase.length()];
		for (int i=0; i<frase.length(); i++) {
			fraseArray[i]=frase.charAt(i);
		}
		
		FileOutputStream salida = null;
		
		try {
			salida = new FileOutputStream("pruebaFichero.txt");
			for (int i=0; i<fraseArray.length; i++) {
				salida.write(fraseArray[i]);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());	
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
		
		//pedir por pantalla frase guardarla en String, pasarlo a array de caracteres y meterlo en el fichero
		
		
		Scanner teclado = new Scanner(System.in);
		String fraseTeclado;
		char[] arrayFrase;
		
		
		System.out.println("Introduce una frase: ");
		fraseTeclado = teclado.nextLine();
		arrayFrase = new char[fraseTeclado.length()];
		
		try {
			salida = new FileOutputStream("pruebaFichero.txt");
			for (int i = 0; i < arrayFrase.length; i++) {
				arrayFrase[i] = fraseTeclado.charAt(i);
				salida.write(arrayFrase[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
				teclado.close();
			}
		}
		
		
		
		
		
		
	}
}
