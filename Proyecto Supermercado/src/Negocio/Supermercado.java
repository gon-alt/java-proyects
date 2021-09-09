package Negocio;

import java.util.Objects;

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
	
	public void agregarProducto(String producto, float ptrcio) {
		abmProducto.agregarProducto(producto, ptrcio);
	}
	
	public void traerProducto(int idProducto) {
		abmProducto.traerProducto(idProducto);
		
	}
	
	public boolean eliminatProducto(int idProducto) {
		boolean eliminado = false;
		if(!abmCarrito.productoExistenteEnCarritos(idProducto)) {
		eliminado = abmProducto.eliminarProducto(idProducto);
		}
		return eliminado;
	}
	
	public boolean eliminarCarrito(int idCarrito) throws Exception {
		return abmCarrito.eliminarCarrito(idCarrito);		
	}
	
}
