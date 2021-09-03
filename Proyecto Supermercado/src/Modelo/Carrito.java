package Modelo;

import java.util.ArrayList;

public class Carrito {
	
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
	
	public boolean tieneProductoEnItems(int idProducto) {
		boolean encontroProducto= false;
		
	} 
	
}
