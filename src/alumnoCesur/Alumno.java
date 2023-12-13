package alumnoCesur;

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