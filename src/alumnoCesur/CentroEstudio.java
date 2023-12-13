package alumnoCesur;

public class CentroEstudio {

	// atributos

	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private final int MAX_ADMIN;
	private final int MAX_CLASES;

	// constructor

	public CentroEstudio(String nombre, int MAX_ADMIN, int MAX_CLASES) {
		this.nombre = nombre;
		this.MAX_ADMIN = MAX_ADMIN;
		this.MAX_CLASES = MAX_CLASES;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];

	}

	public CentroEstudio(String nombre) {

		this.nombre = nombre;
		MAX_ADMIN = 10;
		MAX_CLASES = 10;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];

	}

	// getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}

	public String toString() {
		return ("["+"Centro: "+nombre+", Clases: "+MAX_CLASES+", Admin: "+MAX_ADMIN+"]");
	}

} // end of CentroEstudio
