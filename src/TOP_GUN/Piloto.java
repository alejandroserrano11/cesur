package TOP_GUN;

public class Piloto {
	
	//atributos
	
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	
	//metodo
	
	public void mostrarPiloto() {
		
	}

	//constructor
	
	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		super();
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;
	}

	//getters y setters
	
	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public int getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(int rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}
	

}
