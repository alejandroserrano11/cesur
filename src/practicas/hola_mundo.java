package practicas;

public class hola_mundo {

	public static void main(String[] args) {

		String cadena = " hola mundo ";

		for (int indice = 0; indice < cadena.length(); indice++) {
			if ((indice % 2) == 0) {
				imprime(cadena.toUpperCase(), indice);
			} else {
				imprime(cadena, indice);

			}
		}
		System.out.println(cadena);

		cadena = cadena.toUpperCase();
		System.out.println(cadena);

	}

	static void imprime(String cadena, int indice) {
		System.out.println(cadena.charAt(indice));
	}

}
