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
	
	//Si la pel�cula existe en la lista lanzar la excepci�n
	public void agregarPelicula (Pelicula pelicula) {
		System.out.println(pelicula.getPelicula());
//		while(catalogo.getPelicula() ==true) {
//			System.out.println("la pelicula ya existe ingrese otra");
//			return;
//		}
//		catalogo.add(pelicula);	
		
	}
	
	//Si la pel�cula no existe devolver null
	public void traerPelicula (int idPelicula) {
		
	}
	
	//todas las pel�culas que contengan en su t�tulo el string partePelicula
	public void traerPelicula (String partePelicula) {
		
	}
	
	//Modificar la pel�cula traerPelicula por id, si no existe la pel�cula lanzar la excepci�n, de lo
	//contrario setPelicula con el par�metro pelicula
	public void modificarPelicula (int idPelicula, String pelicula) {
		
	}
	
	//Eliminar la pel�cula: traerPelicula por su id, si no existe la pel�cula lanzar la excepci�n, de lo
	//contrario eliminar el elemento de la lista (remove)
	public void eliminarPelicula (int idPelicula) {
		
	}
	
	
}
