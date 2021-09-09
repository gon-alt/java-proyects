package test;

import Modelo.Genero;
import Modelo.Incaa;
import Modelo.Pelicula;

public class testModificarPelicula {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//instancio las peliculas para agregar al catalogo
		Genero accion = new Genero (1,"accion");
		Genero drama = new Genero (2,"drama");
		Genero comedia = new Genero (3,"comedia");
		Pelicula p1 = new Pelicula("Transportador",accion);
		Pelicula p2 = new Pelicula("Rocky", drama);
		Pelicula p3 = new Pelicula("Tiempos violentos", comedia);
		Pelicula p4 = new Pelicula("Forrest Gump", drama);


		//instancio un catalogo para cargarlo con un lista
		Incaa c1 = new Incaa();

		//utilizo el metodo agreagrPelicula para agregar las peliculas al catalogo c1
		c1.agregarPelicula(p1);
		c1.agregarPelicula(p2);
		c1.agregarPelicula(p3);
		c1.agregarPelicula(p4);
		
		System.out.println("modificar pelicula:");
		System.out.println(c1.traerPelicula(3));		
		c1.modificarPelicula(3, "Rocky v");
		System.out.println("pelicula modificada con id 3:");
		System.out.println(c1.traerPelicula(3));
	}

}
