package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = null;
		PrintWriter salida = null;
		BufferedWriter salida2 = null;
		
		try {
			entrada = new BufferedReader(new FileReader ("fichero3.3.txt"));
			salida = new PrintWriter(new FileWriter("fichero3.2.txt"));
			salida2 = new BufferedWriter(new FileWriter("fichero3.txt"));
			String linea;
			int numLinea = 3;
			while (numLinea>0) {
				linea = entrada.readLine();
				
				salida.println(linea);
				salida2.write(linea);
				numLinea--;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada!=null) {
				entrada.close();
			}
				
		}
		

	}

}
