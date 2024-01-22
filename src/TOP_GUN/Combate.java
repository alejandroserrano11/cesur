package TOP_GUN;

public class Combate extends Avion {
	
	//atributos
	
	private boolean esFurtivo;

	//constructor
	
	public Combate(boolean esFurtivo, int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}

	//getters y setters
	
	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

}
