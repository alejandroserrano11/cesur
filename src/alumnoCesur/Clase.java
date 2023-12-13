package alumnoCesur;

class Clase {

	private String nombre;
	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private Profesor profesor;

	// constructor

	public Clase(String nombre) {

		numAlumnos = 0;
		alumnos = new Alumno[TOTALALUMNOS];
		this.nombre = nombre;

	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
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
	
	public void delete(String nombreAlumno) {
		
			int contador = 0;
			
			while ((alumnos[contador].getNombre() != nombreAlumno) && (contador <= numAlumnos)) {
				contador ++;
			}
			
		
	}

} // end of Clase