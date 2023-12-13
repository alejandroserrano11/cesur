package practicas;

public class loko {

	public static void main(String[] args) {
		String[] cadenaInicial = new String[10];
		for (int i = 0; i < 4; i++) {
			cadenaInicial[i] = "hola";
		}
		ListaFijaCadena cadena1;
		cadena1 = new ListaFijaCadena(5, cadenaInicial);
		System.out.println("num elementos: " + cadena1.getNumElementos());
		for (int i = 0; i < cadena1.getNumElementos(); i++) {
			System.out.println(cadena1.getArray()[i]);
		}
		// Crear ListaFijaCadena
		// metemos 3 elementos
		// sacamos por pantalla el total de elementos y los elementos.

	} // end of main

} // end of loko

class ListaFijaCadena { // ahora va a ser inmutable.
	// atributos:

	// numero de elementos
	private int numElementos = 0;

	// array de Strings
	private String[] array = new String[MAXNUM];

	// MAXNUM de elementos
	private static final int MAXNUM = 10;

	// metodos:

	// setter y getter de cada atributo

	public int getNumElementos() {
		return numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public static int getMaxnum() {
		return MAXNUM;
	}

	// constructor con parametros de todos sus atributos

	public ListaFijaCadena(int numElementos, String[] array) {
		this.numElementos = numElementos;
		this.array = array;
	}

}
