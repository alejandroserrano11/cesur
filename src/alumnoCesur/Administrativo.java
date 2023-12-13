package alumnoCesur;

class Administrativo extends Persona {

	boolean idiomas;

	// Constructor

	public Administrativo(String nombre, int edad, boolean idiomas) {
		super(nombre, edad);

		this.idiomas = idiomas;
	}

	public Administrativo(String nombre) {
		super(nombre, 0);

		this.idiomas = false;
	}

	// getter y setter

	public boolean isIdiomas() {
		return idiomas;
	}

	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;
	}

} // end of Administrativo