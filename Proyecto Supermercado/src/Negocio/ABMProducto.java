package Negocio;

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
	
	public boolean agregarProducto(String producto, float precio) throws Exception{
		boolean agregado = false;
		for (int i = 0; i < lstProductos.size() ; i++) {
			if(lstProductos.get(i).getProducto().equals(producto)) {
				throw new Exception("el producto que quiere agragar ya existe");
			}
		}		
		int id;		
		id = lstProductos.size()+1;		
		lstProductos.add(new Producto(id, producto, precio));
		agregado = true;
		return agregado;
	}
	
	public Producto traerProducto(int idProducto) {
		Producto producto = null;
		for (int i=0;i<lstProductos.size();i++) {
			if(lstProductos.get(i).getId_producto() == idProducto) {
				producto=lstProductos.get(i);
			}
		}
		return producto;
	}

	public boolean eliminarProducto(int idProducto) throws Exception{
		boolean eliminado=false;
		traerProducto(idProducto);
		if(traerProducto(idProducto)==null) {
			throw new Exception("el producto que quiere eliminar no existe");
		}
		lstProductos.remove(idProducto-1);
		eliminado=true;
		return eliminado;
	}	
	
	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {
		boolean productoModificado=false;
		if(traerProducto(idProducto)==null) {
			throw new Exception("el producto que quiere modificar no existe");
		}
		
		lstProductos.get(idProducto-1).setProducto(producto);
		lstProductos.get(idProducto-1).setPrecio(precio);
		productoModificado=true;
		return productoModificado;
				
	}
	 
}