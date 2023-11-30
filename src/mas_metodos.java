
public class mas_metodos {

	public static void main(String[] args) {

		String cadena = "hola mundo";
		System.out.println(numOcurrenciasChar(cadena, 'o'));
		
	}

	// 1- devuelve un string que es la union de los dos parametros de entrada
	static String uneCadenas(String cadena1, String cadena2) {
		return (cadena1 + cadena2);
	}

	// 2- modifica el string de entrada a mayusculas o minusculas dependiendo del
	// segundo parametro.
	static void pasoCadenaA(String cadena, boolean mayusculas) {
		if (mayusculas == true) {
			cadena = cadena.toUpperCase();
		} else {
			cadena = cadena.toLowerCase();
		}

	}

	// 3 -devuelve el numero de ocurrencias de un caracter pasado como parametro en
	// el String pasado como parametro.
	static int numOcurrenciasChar(String cadena, char caracter) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
			
		}
		return (contador);

	}

}
