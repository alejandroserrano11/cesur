package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListaYoutube {

	// 45 bloques
	// cada bloque tiene 6 lineas
	// 1, 3, 4 linea si
	// 2, 5 linea no
	// cada linea que me interesa la almaceno en un String
	// al final de cada bloque almaceno en otro fichero la union de las 3 lineas
	// orden : num - nombre - tiempo

	public static void main(String[] args) throws IOException {
		File directorio = null;
		BufferedReader lector = null;
		BufferedWriter escritor = null;
		String num = null;
		String nombre = null;
		String tiempo = null;
		String frase = null;

		try {
			directorio = new File("dirFinal");
			directorio.mkdir();
			lector = new BufferedReader(new FileReader("inicio.txt"));
			escritor = new BufferedWriter(new FileWriter("fin.txt", true));

			for (int j = 0; j < 45 ; j++) {
				for (int i = 0; i < 6; i++) {
					if (i == 0) {
						num = lector.readLine(); // linea 1
					} else if (i == 2) {
						tiempo = lector.readLine(); // linea 3
					} else if (i == 3) {
						nombre = lector.readLine(); // linea 4
					} else {
						lector.readLine();
					}

				}
				frase = num + " - " + nombre + " - " + tiempo + "\n";
				escritor.write(frase);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (lector != null) {
				lector.close();
			}
			if (escritor!=null) {
				escritor.close();
				
			}
		}

	}

}
