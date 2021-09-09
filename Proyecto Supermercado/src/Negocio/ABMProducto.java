package Negocio;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import Modelo.Producto;

public class ABMProducto {
	
	private List<Producto> lstProductos = new ArrayList<Producto>();
	
	public ABMProducto() {} 

	public List<Producto> getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(List<Producto> lstProductos) {
		this.lstProductos = lstProductos;
	}
	
	public boolean agregarProducto(String producto, float precio) {
		boolean agregado = false;
		int id;		
		id = lstProductos.size()+1;		
		lstProductos.add(new Producto(id, producto, precio));
		return agregado = true;
	}
	
	public String traerProducto(int idProducto) {
		String producto = null;
		for (int i=0;i<lstProductos.size();i++) {
			if(lstProductos.get(i).getId_producto() == idProducto) {
				producto=lstProductos.get(i).getProducto();
			}else producto = null;
		}
		return producto;
	}

	public boolean eliminarProducto(int idProducto) {
		//TODO eliminar el producto de la lista de productos lstProductos 
		return true;
	}	

	 
}





