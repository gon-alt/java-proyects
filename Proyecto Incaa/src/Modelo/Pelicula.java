package Modelo;

public class Pelicula {
	private String pelicula;
	private int idPelicula;
	private Genero genero; 
	
	//constructor 1
	public Pelicula(String pelicula/*, int idPelicula, String genero*/) {
		this.pelicula = pelicula;
		//this.idPelicula = idPelicula;
		//this.genero = genero;
	}
	
	//constructor 3
		public Pelicula(String pelicula, Genero genero) {
			this.pelicula = pelicula;
			//this.idPelicula = idPelicula;
			this.genero = genero;
		}
	
	//getter y setter
	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public int getIdpelicula() {
		return idPelicula;
	}

	public void setIdpelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public boolean equals(Pelicula pelicula) {
		return this.pelicula.equalsIgnoreCase(pelicula.getPelicula());		
	}
	
	public boolean equals(int idPelicula) {
		return this.idPelicula==idPelicula ;		
	}

	@Override
	public String toString() {
		return "Pelicula [pelicula=" + pelicula + ", idPelicula=" + idPelicula + ", genero=" + genero + "]";
	}
	
	

	
	
	

}
