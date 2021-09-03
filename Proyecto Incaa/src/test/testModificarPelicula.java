package test;

import java.util.ArrayList;
import java.util.List;

import Modelo.Incaa;
import Modelo.Pelicula;

public class testModificarPelicula {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//instancio las peliculas para agregar al catalogo
		Pelicula p1 = new Pelicula("Transportador");
		Pelicula p2 = new Pelicula("Rocky");
		Pelicula p3 = new Pelicula("Tiempos violentos");
		Pelicula p4 = new Pelicula("Forrest Gump");

		//instancio un catalogo para cargarlo con un lista
		Incaa c1 = new Incaa();

		//utilizo el metodo agreagrPelicula para agregar las peliculas al catalogo c1
		c1.agregarPelicula(p1);
		c1.agregarPelicula(p2);
		c1.agregarPelicula(p3);
		c1.agregarPelicula(p4);
		
		System.out.println("modificar pelicula:");
		c1.traerPelicula(3);		
		c1.modificarPelicula(3, "Rocky v");
		System.out.println("pelicula modificada con id 3:");
		c1.traerPelicula(3);
	}

}