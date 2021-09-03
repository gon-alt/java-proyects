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
	
	public boolean eliminatProducto(int idProducto) {
		boolean eliminado = false;
		if(!abmCarrito.productoExistenteEnCarritos(idProducto)) {
		eliminado = abmProducto.eliminarProducto(idProducto);
		}
		return eliminado;
	}
	
	
}
