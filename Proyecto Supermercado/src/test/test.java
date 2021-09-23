package test;

import Negocio.Supermercado;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado sistema = new Supermercado();		
		try {
			sistema.agregarProducto("coca", 10);
			sistema.agregarProducto("pepsi", 11);
			sistema.agregarProducto("fanta", 15);
			//sistema.agregarProducto("coca", 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Test traerProducto
		System.out.println("lista de productos agregados:");
		for (int i = 1; i <= sistema.getAbmProducto().getLstProductos().size(); i++) { 
			System.out.println(sistema.traerProducto(i));
		}
		
		//Test modificarProducto
		System.out.println("lista de productos con la modificacion:");
		try {
			sistema.modificarProducto(2, "sevenup", 32);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= sistema.getAbmProducto().getLstProductos().size(); i++) {
			System.out.println(sistema.traerProducto(i));
		}
		
		//Test eliminarProducto		
//		sistema.eliminatProducto(2);
//		System.out.println("lista con producto eliminado:");
//		for (int i = 1; i <= sistema.getAbmProducto().getLstProductos().size()+1; i++) {
//			System.out.println(sistema.traerProducto(i));
//		}
		
		//test agregarItem
		sistema.agregarItem(sistema.traerProducto(2), 5);
		System.out.println(sistema.agregarItem(sistema.traerProducto(2), 5));
//		System.out.println(sistema.traerCarrito(1));
		
		
		//test eliminarItem (Producto producto, int cantidad)
		
//		try {
//			System.out.println(sistema.eliminarItem(sistema.traerProducto(1),3));
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//test  calcularSubTotal()
		System.out.println(sistema.calcularSubTotal());
		

	}

}
