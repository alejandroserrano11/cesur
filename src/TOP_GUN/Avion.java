package TOP_GUN;

public class Avion {
	
	//atributos
	
	private int idAvion;
	private String modAvion;
	private int capAvion;
	Piloto piloto;
	
	//metodo
	
	public void mostrarAvion() {
		System.out.println(idAvion + ", " + modAvion + ", " + capAvion + "huecos, " + piloto);
	}

	//constructor
	
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super();
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	//getters y setters
	
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	

}
