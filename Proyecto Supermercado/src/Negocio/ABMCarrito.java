package Negocio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Carrito;

public class ABMCarrito {
	
	private List<Carrito> lstCarritos = new ArrayList<Carrito>();
	
	public ABMCarrito () {}

	public List<Carrito> getLstCarritos() {
		return lstCarritos;
	}

	public void setLstCarritos(List<Carrito> lstCarritos) {
		this.lstCarritos = lstCarritos;
	}
	
	public boolean productoExistenteEnCarritos(int idProducto) {
		boolean encontroProducto = false;
		int index = 0;
		while(!encontroProducto && index < lstCarritos.size()) {
			encontroProducto = lstCarritos.get(index).tieneProductoEnItems(idProducto);
			index++;
		}
		return encontroProducto;
	}

}
