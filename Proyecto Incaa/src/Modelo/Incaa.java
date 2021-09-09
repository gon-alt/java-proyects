package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Incaa {
	List<Pelicula> catalogo = new ArrayList<Pelicula>();	


	public Incaa() {}

	//getter y setter
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}


	//Si la película existe en la lista lanzar la excepción
	public List<Pelicula> agregarPelicula (Pelicula pelicula) throws Exception{
		for(int i=0;i<catalogo.size();i++) {
			if(pelicula.getPelicula().equals(catalogo.get(i).getPelicula()))throw new Exception("Error: Objeto pelicula repetido!!");
		}
		catalogo.add(pelicula);		
		catalogo.set(catalogo.size()-1, pelicula).setIdpelicula(catalogo.size());
		return catalogo;					
	}	



	//Si la película no existe devolver null
	public Pelicula traerPelicula (int idPelicula){
		Pelicula peliculaExistente=null;			
		for (int s=0;s<catalogo.size();s++) {			
			if((idPelicula)==(catalogo.get(s).getIdpelicula())) {				
				peliculaExistente=catalogo.get(s);
			}
		}
		return peliculaExistente;
	}

	//todas las películas que contengan en su título el string partePelicula
	public Pelicula traerPelicula (String partePelicula) {
		Pelicula pelicula=null;
		for (int i = 0; i < catalogo.size(); i++) {
			if(catalogo.get(i).getPelicula().contains(partePelicula)) {
				pelicula=catalogo.get(i);
				System.out.println(pelicula);			
			}
		}
		if (pelicula==null) {
			System.out.println("no se encontraron resultados :(");
			}
		return pelicula;
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
	public boolean eliminarPelicula (int idPelicula)throws Exception {
		boolean eliminar=false;	
		traerPelicula(idPelicula);
		if(traerPelicula(idPelicula)==null) {
			throw new Exception ("la pelicula que quiere eliminar no existe");
		}
		for (int i = 0; i <catalogo.size() ; i++) {
			if(catalogo.get(i).getIdpelicula()==idPelicula) {
				catalogo.remove(i);
				eliminar=true;
			}								
		}
		return eliminar;
	}

	// sobrecarga del metodo traer pelicula

	public Pelicula traerPelicula(Genero genero){
		Pelicula existe=null;
		for (int i = 0; i < catalogo.size(); i++) {
			if(catalogo.get(i).getGenero().equals(genero)) {
				existe=catalogo.get(i);
				System.out.println(existe);
			}
		}
		return existe;
	}




}
