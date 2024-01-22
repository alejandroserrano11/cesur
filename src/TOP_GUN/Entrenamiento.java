package TOP_GUN;

public class Entrenamiento extends Avion {
	
	//atributos
	
	private boolean tieneDobleMando;

	//constructor
	
	public Entrenamiento(boolean tieneDobleMando, int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;

	}

	//getters y setters
	
	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	

}
