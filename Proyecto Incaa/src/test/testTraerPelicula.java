package test;

import java.util.ArrayList;
import java.util.List;

import Modelo.Incaa;
import Modelo.Pelicula;

public class testTraerPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instancio las peliculas para agregar al catalogo
		Pelicula p1 = new Pelicula("transporter");
		Pelicula p2 = new Pelicula("Rocky");
		Pelicula p3 = new Pelicula("Rocky");
		Pelicula p4 = new Pelicula("dsfg");

		//creo q aca instancio la lista catalogo o la inicializo
		List<Pelicula> catalogo = new ArrayList<Pelicula>();
		//instancio un catalogo para cargarlo con un lista
		Incaa c1 = new Incaa(catalogo);

		//utilizo el metodo agreagrPelicula para agregar las peliculas al catalogo c1
		c1.agregarPelicula(p1);
		c1.agregarPelicula(p2);
		c1.agregarPelicula(p3);
		c1.agregarPelicula(p4);
		
		//metodo traerPelicula
		System.out.print("metodo traerPelicula: ");
		c1.traerPelicula(1);
	}

}
