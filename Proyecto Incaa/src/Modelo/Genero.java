package Modelo;

public class Genero {
	private int idGenero;
	private String Genero;
	
	//constructor
	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		Genero = genero;
	}
	
	
	//getter and setter
	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}
	
	// sobrecarga del metodo traer pelicula
	
	public void traerPelicula(Genero genero){
		
	}
	
	
	
}
