package animales;
import java.util.Random;
public class UsoAnimales {

	public static void main(String[] args) {
		//crear array de 10 enteros que se llame enteros
		
		Random aleatorio = new Random();
		int[] enteros;
		enteros = new int[10];
		for (int i=0; i<enteros.length; i++) {
			enteros[i] = aleatorio.nextInt(10);
		}
				
		int numero = aleatorio.nextInt(10);
		
		//quiero buscar numero en el array.
		
		boolean encontrado = false;
		for (int i=0; i<enteros.length; i++) {
			if (enteros[i] == numero) {
				encontrado = true;
			}
		}
		
		System.out.println("Encontrado "+ numero+":"+encontrado);
	}

}