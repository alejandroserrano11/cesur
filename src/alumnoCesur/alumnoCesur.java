package alumnoCesur;

import java.util.Random;

import practicas.Creator;

public class alumnoCesur {

	public static void main(String[] args) {

		// crear un objeto-nombre de la clase+nombre del objeto+llamar al constructor
		// con new

		CentroEstudio cesurEste = new CentroEstudio("CESUR El Palo", 4, 5);

		Clase claseTemp;
		String nombreClaseTemp;

		for (int i = 0; i < 5; i++) { // construyo 5 clases
			nombreClaseTemp = Creator.newClase();
			claseTemp = new Clase(Creator.newClase());
			claseTemp = new Clase(nombreClaseTemp);
			// meto un profesor aleatorio en la clase i-ésima
			claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(), Creator.newClase()));

			for (int j = 0; j < 15; j++) {
				claseTemp.add(new Alumno(Creator.newName(), Creator.newAge(), Creator.newClase()));
			}
			cesurEste.getClases()[i] = claseTemp;
		}
		Random aleatorio = new Random();

		Administrativo adminTemp;
		for (int i = 0; i < 4; i++) {
			adminTemp = new Administrativo(Creator.newName(), Creator.newAge(), aleatorio.nextBoolean());
			cesurEste.getAdministrativos()[i] = adminTemp;
		}
		System.out.println(cesurEste);

		CentroEstudio cesurPTA = new CentroEstudio("CESUR del PTA");

		System.out.println();
		Alumno alejandro = new Alumno("Alejandro", 23, "DAM");
		Alumno andres = new Alumno("Andrés", 20, "DAM");
		Alumno fran = new Alumno("Fran", 18, "DAM");
		Alumno santiago = new Alumno("Santiago", 22, "DAM");
		Alumno ramon = new Alumno("Ramón", 24, "DAM");
		Alumno simran = new Alumno("Simran", 23, "DAM");
		Alumno joseramon = new Alumno("José Ramón", 39, "DAM");
		Alumno dario = new Alumno("Darío", 17, "DAM");
		Alumno adrian = new Alumno("Adrián", 25, "DAM");
		Alumno yahim = new Alumno("Yahim", 27, "DAM");
		Alumno alvaro = new Alumno("Álvaro", 18, "DAM");
		Alumno juancarlos = new Alumno("Juan Carlos", 25, "DAM");
		Alumno juanantonio = new Alumno("Juan Antonio", 26, "DAW");

		Clase premiumPlus = new Clase("Premium Plus");

		premiumPlus.add(alejandro);
		premiumPlus.add(andres);
		premiumPlus.add(fran);
		premiumPlus.add(santiago);
		premiumPlus.add(ramon);
		premiumPlus.add(simran);
		premiumPlus.add(joseramon);
		premiumPlus.add(dario);
		premiumPlus.add(adrian);
		premiumPlus.add(yahim);
		premiumPlus.add(alvaro);
		premiumPlus.add(juancarlos);
		premiumPlus.add(juanantonio);

		System.out.println(alejandro);
		System.out.println(alejandro.toString());

		System.out.println();
		System.out.println(premiumPlus);
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			System.out.println(premiumPlus.getAlumnos()[i]);
		}
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getNombre() == "Darío") {
				premiumPlus.getAlumnos()[i].setEdad(18);
				System.out.println(premiumPlus.getAlumnos()[i].getEdad());
			}
		}

		System.out.println();
		System.out.println("Alumnos de DAW: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAW") {
				System.out.println(premiumPlus.getAlumnos()[i]);
			}
		}

		System.out.println();
		System.out.println("Alumnos de DAM: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAM") {
				System.out.println(premiumPlus.getAlumnos()[i]);
			}
		}

		System.out.println();

		juanantonio = null;
		System.out.println(juanantonio);

	} // end of main

} // end of alumnoCesur
