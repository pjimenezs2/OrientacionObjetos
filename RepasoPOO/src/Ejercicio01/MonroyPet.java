package Ejercicio01;

public class MonroyPet {

	// Atributos
	private static final int COMIDA_INICIAL = 2;
	private static final int PUNTOS_INICIALES = 0;
	private String nombre;
	private String tipo;
	private int puntos;
	private int comida;

	private static int totalJugadoEntreTodasMascotas = 0;

	// Constructor
	public MonroyPet(String nombre, String tipo) throws MonroyPetException {

		if (!(tipo.equals("PERRO") || tipo.equals("GATO"))) {
			throw new MonroyPetException("Tipo de mascota incorrecto");
		}

		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos = PUNTOS_INICIALES;
		this.comida = COMIDA_INICIAL;

	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public int getComida() {
		return comida;
	}

	public static int getTotalJugadoEntreTodasMascotas() {
		return totalJugadoEntreTodasMascotas;
	}

	// toString
	
	//toDo
	@Override
	public String toString() {
		return null;
	}
	
	// Métodos Propios
	
	//toDo
	public void darComida() throws MonroyPetException {
		
	}
	
	//toDo
	public void comprarComida(int numeroAlimentos) throws MonroyPetException {
		 
	}
	
	//toDo
	public void jugar(int minutos) throws MonroyPetException {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
