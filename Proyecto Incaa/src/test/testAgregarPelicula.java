package test;

import java.util.ArrayList;
import java.util.List;

import Modelo.Incaa;
import Modelo.Pelicula;


public class testAgregarPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula p1 = new Pelicula("ewr", 1);
		Pelicula p2 = new Pelicula("Rocky", 2);
		Pelicula p3 = new Pelicula("nm,", 3);
		Pelicula p4 = new Pelicula("Rocky", 4);
		
		List<Pelicula> catalogo = new ArrayList<Pelicula>();	
		Incaa c1 = new Incaa(catalogo);
		

		
		c1.agregarPelicula(p1);
		c1.agregarPelicula(p2);
		c1.agregarPelicula(p3);
		c1.agregarPelicula(p4);
			
		for(int i=0;i<catalogo.size();i++) {
			System.out.println(catalogo.get(i));			
		}
	

}
}
