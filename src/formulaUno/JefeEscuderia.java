package formulaUno;
import java.util.Random;

public class JefeEscuderia extends Persona {

	// ATRIBUTOS

	private final int INTELIGENCIA;
	private final int LIDERAZGO;
	private int experiencia;

	// CONSTRUCTOR

	public JefeEscuderia(int edad, String nombre, int dni, int inteligencia, int liderazgo, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.LIDERAZGO = aleatorio.nextInt(10);
		this.experiencia = experiencia;
	}

	// GETTERS Y SETTERS

	public int getInteligencia() {
		return INTELIGENCIA;
	}

	public int getLiderazgo() {
		return LIDERAZGO;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
