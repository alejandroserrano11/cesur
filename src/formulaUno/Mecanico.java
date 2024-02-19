package formulaUno;
import java.util.Random;

public class Mecanico extends Persona {
	
	//ATRIBUTOS
	
	private final int VELOCIDAD;
	private int experiencia;
	
	//CONSTRUCTOR
	
	public Mecanico(int edad, String nombre, int dni, int velocidad, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.VELOCIDAD = aleatorio.nextInt(10);
		this.experiencia = experiencia;
	}
	
	//GETTERS Y SETTERS

	public int getVelocidad() {
		return VELOCIDAD;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
	

}
