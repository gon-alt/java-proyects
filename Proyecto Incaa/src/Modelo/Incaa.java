package Modelo;

import java.util.ArrayList;

import java.util.List;

public class Incaa {
	List<Pelicula> catalogo = new ArrayList<Pelicula>();
	
	//constructor
	public Incaa(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	
	//getter y setter
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	//Si la película existe en la lista lanzar la excepción
	public void agregarPelicula (Pelicula pelicula) {
		System.out.println(pelicula.getPelicula());
//		while(catalogo.getPelicula() ==true) {
//			System.out.println("la pelicula ya existe ingrese otra");
//			return;
//		}
//		catalogo.add(pelicula);	
		
	}
	
	//Si la película no existe devolver null
	public void traerPelicula (int idPelicula) {
		
	}
	
	//todas las películas que contengan en su título el string partePelicula
	public void traerPelicula (String partePelicula) {
		
	}
	
	//Modificar la película traerPelicula por id, si no existe la película lanzar la excepción, de lo
	//contrario setPelicula con el parámetro pelicula
	public void modificarPelicula (int idPelicula, String pelicula) {
		
	}
	
	//Eliminar la película: traerPelicula por su id, si no existe la película lanzar la excepción, de lo
	//contrario eliminar el elemento de la lista (remove)
	public void eliminarPelicula (int idPelicula) {
		
	}
	
	
}
