package Modelo;

import java.util.ArrayList;


import java.util.List;
import java.util.Objects;



public class Incaa {
	List<Pelicula> catalogo = new ArrayList<Pelicula>();

	


	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	//getter y setter
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}





	@Override
	public int hashCode() {
		return Objects.hash(catalogo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incaa other = (Incaa) obj;
		return Objects.equals(catalogo, other.catalogo);
	}


	//Si la película existe en la lista lanzar la excepción
	public void agregarPelicula (Pelicula pelicula) throws Exception{
		for(int i=0;i<catalogo.size();i++) {
			if(pelicula.getPelicula().equals(catalogo.get(i).getPelicula()))throw new Exception("Error: Objeto pelicula repetido!!");
		}
		catalogo.add(pelicula);		
		catalogo.set(catalogo.size()-1, pelicula).setIdpelicula(catalogo.size());					
	}	



	//Si la película no existe devolver null
	public void traerPelicula (int idPelicula) {
		int aux = -1;		
		for (int s=0;s<catalogo.size();s++) {			
			if((idPelicula)==(catalogo.get(s).getIdpelicula())) {				
				aux=s;
			} 
		}
		if(aux>=0) {
			System.out.println(catalogo.get(aux));
		}else System.out.println("null");
	}

	//todas las películas que contengan en su título el string partePelicula
	public void traerPelicula (String partePelicula) {
		int a=0;
		for (int i = 0; i < catalogo.size(); i++) {
			if(catalogo.get(i).getPelicula().contains(partePelicula)) {
				System.out.println(catalogo.get(i));
				a++;
			}
		}
		if (a==0) {
			System.out.println("no se encontraron resultados :(");
		}

	}

	//Modificar la película traerPelicula por id, si no existe la película lanzar la excepción, de lo
	//contrario setPelicula con el parámetro pelicula
	public void modificarPelicula (int idPelicula, String pelicula) throws Exception {
		int a=0;
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).getIdpelicula()==idPelicula) {
				catalogo.get(idPelicula-1).setPelicula(pelicula);
				a=1;
			}
		}
		if(a==0)throw new Exception("la pelicula no existe");
	}

	//Eliminar la película: traerPelicula por su id, si no existe la película lanzar la excepción, de lo
	//contrario eliminar el elemento de la lista (remove)
	public void eliminarPelicula (int idPelicula) {
		catalogo.remove(idPelicula-1);

	}

	// sobrecarga del metodo traer pelicula

	public void traerPelicula(Genero genero){
		int a=0;
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).getGenero()==genero) {
				System.out.println(catalogo.get(i).toString());
				a=1;
			}
		}
		if(a==0) {
			System.out.println("no se encontraron resultados del genero: " + genero.getGenero());
			}
	}




}
