package retoUD5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		//pedir al usuario que introduzca por teclado el nombre de dos ficheros
		//el nombre debe tener una lomgitud superior a 3 caracteres en caso contrario se le pregunta una y otra vez hasta que introduzca un nombre válido
		//cuando el nombre sea valido, indicar: "el nombre del fichero XXX es válido".
		
		Scanner teclado = new Scanner(System.in);
		String nombre1 = null;
		String nombre2 = null;
		
		do {
			System.out.println("Introduce el nombre del fichero 1, debe tener al menos 3 carácteres: ");
			nombre1 = teclado.nextLine();
		} while (nombre1.length() < 3);
		
		do {
			System.out.println("Introduce el nombre del fichero 2, debe tener al menos 3 carácteres: ");
			nombre2 = teclado.nextLine();
		} while (nombre2.length() < 3);
		
		
		//Obten la ruta de tu directorio actual y muestrala en consola
		
		System.out.println(System.getProperty("user.dir"));
		
		//Construye la ruta relativa al primer fichero con la construccion: String rutaCompletaFich = directorioActual + File.separator + nombreArchivo1
		//A continuacion crea el fichero usando metodos de la clase File, pero comprueba con el metodo comprobarExiste(nombreArchivo1) si el
		// fichero existe y en caso de que exista ya no lo puedes crear, se mostrara el mensaje adecuado, igual con el segundo.
		
		String directorioActual = System.getProperty("user.dir");
		String rutaCompletaFich1 = directorioActual + File.separator + nombre1;
		System.out.println(File.separator);
		System.out.println(rutaCompletaFich1);
		
		File fichero1 = new File(rutaCompletaFich1);
		
		if (comprobarExiste(rutaCompletaFich1)) {
			System.out.println("el fichero: " + nombre1 + "ya existe");
		} else {
			fichero1.createNewFile();
		}
		
		String rutaCompletaFich2 = directorioActual + File.separator + nombre2;
		
		File fichero2 = new File(rutaCompletaFich2);
		
		if (comprobarExiste(rutaCompletaFich2)) {
			System.out.println("el fichero: " + nombre2 + "ya existe");
		} else {
			fichero2.createNewFile();
		}
		
		//apartado d no
		//apartado e
		
		if (comprobarExiste(rutaCompletaFich1)) {
			escribirEnFichero(fichero1);
		}
		
		//apartado f
		
		if (comprobarExiste(rutaCompletaFich1)) {
			leerDeFichero(rutaCompletaFich1);
		}
		
		//apartado g
		
		if (comprobarExiste(rutaCompletaFich1)) {
			System.out.println(fichero1.getName()); 
			System.out.println(fichero1.getAbsolutePath());
			System.out.println(fichero1.getParent());
			System.out.println(fichero1.length());
			System.out.println("es directorio?: " + fichero1.isDirectory());
		} else {
			System.out.println("no existe por tanto...");
		}
		
		//apartado h
		
		duplicarFicheros(fichero1, fichero2);
		
		//apartado i
		
		borrarFichero(fichero1);
		
		//apartado j
		
		leerDeFichero(fichero2);
		
		teclado.close();
		
		//apartado k
		
		File directorio = new File("dirEjer1");
		if (comprobarExiste(directorio)) {
			System.out.println("ya existe");
		} else {
			directorio.mkdir();
		}
		
		
		
		
		
		
	} //fin del main

	// metodos

	static boolean leerDeFichero(File miFichero) throws IOException {

		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

	}

	static boolean leerDeFichero(String miFichero) throws IOException {

		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	static boolean escribirEnFichero(String miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write(""+cont);
				salida.write('\n');
			}

			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean escribirEnFichero(File miFichero) throws IOException {

		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write(String.valueOf(cont));
				salida.write('\n');
			}

			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean borrarFichero(File miFichero) {
		return miFichero.delete();
	}

	static boolean borrarFichero(String miFichero) {
		File fichero = new File(miFichero);
		return fichero.delete();
	}

	static boolean comprobarExiste(File fichero) {
		return fichero.exists();
	}

	static boolean comprobarExiste(String fichero) {
		File miFichero = new File(fichero);
		return miFichero.exists();
	}

	static boolean duplicarFicheros(File origen, File destino) throws IOException {

		FileReader entrada = null;
		FileWriter salida = null;

		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);
			
			int caracter = entrada.read();
			while (caracter!=-1) {
				salida.write((char) caracter);
				caracter = entrada.read();
			}
			
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada!=null) entrada.close();
			if (salida!=null) salida.close();
		}

	}
}
