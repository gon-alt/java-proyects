package Negocio;

import Modelo.Producto;

public class Supermercado {
	private ABMCarrito abmCarrito = new ABMCarrito();
	private ABMProducto abmProducto = new ABMProducto();
	
	public Supermercado ( ) {}

	public ABMCarrito getAbmCarrito() {
		return abmCarrito;
	}

	public void setAbmCarrito(ABMCarrito abmCarrito) {
		this.abmCarrito = abmCarrito;
	}

	public ABMProducto getAbmProducto() {
		return abmProducto;
	}

	public void setAbmProducto(ABMProducto abmProducto) {
		this.abmProducto = abmProducto;
	}
	public void traerCarrito(int id) {
		abmCarrito.traerCarrito(id);
	}
	
	public boolean agregarProducto(String producto, float ptrcio) throws Exception {
		return abmProducto.agregarProducto(producto, ptrcio);
	}
	
	public Producto traerProducto1(int idProducto) {
		Producto producto;
		producto=abmProducto.traerProducto(idProducto);
		return producto;
	}
	
	public boolean eliminatProducto(int idProducto) throws Exception {
		boolean eliminado = false;
		if(!abmCarrito.productoExistenteEnCarritos(idProducto)) {
		eliminado = abmProducto.eliminarProducto(idProducto);
		}else throw new Exception("el producto exixste que quiere eliminar existe en un carrito");
		return eliminado;
	}
	
	public boolean eliminarCarrito(int idCarrito) throws Exception {
		return abmCarrito.eliminarCarrito(idCarrito);		
	}
	
	public Producto traerProducto(int idProducto) {
		Producto producto;
		producto=abmProducto.traerProducto(idProducto);
		return producto;
	}
	
	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {
		return abmProducto.modificarProducto(idProducto, producto, precio);
	}
	
	public boolean agregarItem(Producto producto, int cantidad){
		boolean agregado=false;
		agregado=abmCarrito.agregarItem(producto, cantidad);			
		return agregado;
	}
	
	public boolean  eliminarItem(Producto producto, int cantidad) {
		return abmCarrito.eliminarItem(producto, cantidad);
	}
	
	public float  calcularSubTotal() {
		return abmCarrito.calcularSubTotal() ;
	}

	
}
