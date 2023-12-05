
public class alumnoCesur {

	public static void main(String[] args) {

		Alumno alejandro;
		alejandro = new Alumno("Alejandro", 23, "DAM");

		Alumno andres;
		andres = new Alumno("Andrés", 20, "DAM");

		Alumno fran;
		fran = new Alumno("Fran", 18, "DAM");

		Alumno santiago;
		santiago = new Alumno("Santiago", 22, "DAM");

		Alumno ramon;
		ramon = new Alumno("Ramón", 24, "DAM");

		Alumno simran;
		simran = new Alumno("Simran", 23, "DAM");

		Alumno joseramon;
		joseramon = new Alumno("José Ramón", 39, "DAM");

		Alumno dario;
		dario = new Alumno("Darío", 17, "DAM");

		Alumno adrian;
		adrian = new Alumno("Adrián", 25, "DAM");

		Alumno yahim;
		yahim = new Alumno("Yahim", 27, "DAM");

		Alumno alvaro;
		alvaro = new Alumno("Álvaro", 18, "DAM");

		Alumno juancarlos;
		juancarlos = new Alumno("Juan Carlos", 25, "DAM");

		Alumno juanantonio;
		juanantonio = new Alumno("Juan Antonio", 26, "DAW");

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

class Alumno {

	private String nombre;
	private int edad;
	private String curso;

	// constructor: click derecho, source, generate constructor using fields.

	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	// getter y setter: click derecho, source, generate getter y setter.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("[Alumno: " + nombre + ", Edad: " + edad + ", Curso: " + curso + "]");
	}

} // end of Alumno

class Clase {

	private String nombre;
	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;

	// constructor

	public Clase(String nombre) {

		numAlumnos = 0;
		alumnos = new Alumno[TOTALALUMNOS];
		this.nombre = nombre;

	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return ("[Clase: " + nombre + ", Número de alumno: " + numAlumnos + "]");
	}

	public void add(Alumno nuevoAlumno) {
		if (numAlumnos <= TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlumno;
			numAlumnos++;
		}
	}

} // end of Clase
