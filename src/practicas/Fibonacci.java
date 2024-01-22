package practicas;

public class Fibonacci {
	public static void main(String[] args) {
		// sacar por pantalla sucesion fibonacci

		int maxNumFib = 0;
		int contador = 0;
		int num = 1;
		int numAnterior = 1;
		int temp = 0;
		
		System.out.print(numAnterior + " " + num+" ");
		
		while (maxNumFib < 100) {
			 temp = (numAnterior + num);
			System.out.print( temp + " ");
			numAnterior = num;
			num = temp;
			maxNumFib ++;
		}

	}
}
