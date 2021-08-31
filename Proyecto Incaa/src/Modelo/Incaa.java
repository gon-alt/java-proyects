package Modelo;

import java.util.ArrayList;


import java.util.List;
import java.util.Objects;

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

	//equals
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
	public void agregarPelicula (Pelicula pelicula) {

		//peliculaExistente(pelicula.getPelicula());
		catalogo.add(pelicula);		
		catalogo.set(catalogo.size()-1, pelicula).setIdpelicula(catalogo.size());					
		//System.out.println(catalogo.get(catalogo.size()-1));			
	}	


	//checar si existe la pelicula
	public void peliculaExistente(String pelicula) {
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).getPelicula()==pelicula) {
				System.out.print("pelicula repetida:");
				System.out.println(catalogo.get(i));

			}
		}
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
	public void modificarPelicula (int idPelicula, String pelicula) {
		catalogo.get(idPelicula-1).setPelicula(pelicula);
		
	}

	//Eliminar la película: traerPelicula por su id, si no existe la película lanzar la excepción, de lo
	//contrario eliminar el elemento de la lista (remove)
	public void eliminarPelicula (int idPelicula) {
		catalogo.remove(idPelicula-1);

	}


	

}
