package Negocio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Producto;

public class ABMProducto {
	
	private List<Producto> lstProductos = new ArrayList<Producto >();
	
	public ABMProducto() {} 

	public List<Producto> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(List<Producto> lstProductos) {
		this.lstProductos = lstProductos;
	}
	
	public boolean  agregarProducto(String producto, float precio) {
		boolean agregado = false;
		lstProductos.add(producto, precio);
		return agregado;
	}

	public boolean eliminarProducto(int idProducto) {
		//TODO eliminar el producto de la lista de productos lstProductos 
		return true;
	}
}