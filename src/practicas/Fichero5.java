package practicas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero5 {
	public static void main(String[] args) throws IOException {

		RandomAccessFile fichero = null;
		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "rw");
			for (int i = 0; i < 10; i++) {
				fichero.writeChar(97 + i);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null)
				fichero.close();
		}

		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "r");
			for (int i = 0; i < 10; i++) {
				System.out.print("[" + fichero.readChar() + " " + fichero.getFilePointer() + "] ");
			}
			System.out.println("\nEl puntero acaba en la posicion: " + fichero.getFilePointer());
			fichero.seek(0);
			System.out.println("El puntero ahora está en la posicion: " + fichero.getFilePointer());
			for (int i = 0; i < 20; i = i+2) {
				System.out.print("[" + (char)fichero.readByte() + " " + fichero.getFilePointer() + "] ");
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null)
				fichero.close();
		}

	}

}
