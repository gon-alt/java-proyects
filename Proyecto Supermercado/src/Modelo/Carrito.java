package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {
	
	private int idCarrito;
	private ArrayList<ItemCarrito> lstItemCarrito = new ArrayList<ItemCarrito>();
	
	public Carrito() {}

	public Carrito(ArrayList<ItemCarrito> lstItemCarrito) {
		super();
		this.lstItemCarrito = lstItemCarrito;
	}

	public ArrayList<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}

	public void setLstItemCarrito(ArrayList<ItemCarrito> lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}
	
	public boolean eliminarItemsCarrito() {
		return lstItemCarrito.removeAll(lstItemCarrito);
	}
	
	public boolean tieneProductoEnItems(int idProducto) {
		boolean encontroProducto= false;	
		int index = 0;
		while(!encontroProducto && index < lstItemCarrito.size()) {
			encontroProducto = lstItemCarrito.get(index).getProducto().getId_producto()==idProducto;
			index++;
		}
		return encontroProducto;
	}	 
	
	public float calcularTotal() {
		float total=0;
		for (ItemCarrito itemCarrito : lstItemCarrito) {
			total+= itemCarrito.calcularSubTotal();
		}
		return total;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	
	
}
