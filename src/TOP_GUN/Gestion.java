package TOP_GUN;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		// Crea 3 objetos de la clase piloto

		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "Capitán");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

		piloto1.mostrarPiloto();
		piloto2.mostrarPiloto();
		piloto3.mostrarPiloto();
		
		System.out.println();
		

		// Pide al usuario que introduzca los datos de 2 pilotos mas

		Scanner teclado = new Scanner(System.in);
		int id4, id5;
		String rango4, rango5;
		int horas4, horas5;
		String nombre4, nombre5;

		System.out.println("Introduce los datos de 2 pilotos más");

		// piloto 4

		System.out.println("Piloto 4, nombre: ");
		nombre4 = teclado.nextLine();
		System.out.println(nombre4 + ", número de identificación: ");
		id4 = teclado.nextInt();
		System.out.println(nombre4 + ", horas de vuelo: ");
		horas4 = teclado.nextInt();
		System.out.println(nombre4 + ", rango: ");
		teclado.nextLine();
		rango4 = teclado.nextLine();

		System.out.println();
		Piloto piloto4 = new Piloto(id4, nombre4, horas4, rango4);
		piloto4.mostrarPiloto();
		System.out.println();

		
		// piloto 5

		System.out.println("Piloto 5, nombre: ");
		nombre5 = teclado.nextLine();
		System.out.println(nombre5 + ", número de identificación: ");
		id5 = teclado.nextInt();
		System.out.println(nombre5 + ", horas de vuelo: ");
		horas5 = teclado.nextInt();
		System.out.println(nombre5 + ", rango: ");
		teclado.nextLine();
		rango5 = teclado.nextLine();

		System.out.println();
		Piloto piloto5 = new Piloto(id5, nombre5, horas5, rango5);
		piloto5.mostrarPiloto();
		System.out.println();

		//Crea 3 objetos de la clase Avion
		
		Avion avion1 = new Entrenamiento(true, 1, "Alpha", 50, piloto1);
		Avion avion2 = new Combate(true, 2, "Bravo", 100, piloto2);
		Avion avion3 = new Combate(true, 3, "Charlie", 150, piloto3);
		
		//Pide al usuario 2 aviones más, que serán de entrenamiento
		
		
		
		

		teclado.close();
		

	} // cierra main

}
