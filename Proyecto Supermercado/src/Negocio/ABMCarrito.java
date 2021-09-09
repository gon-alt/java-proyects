package Negocio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Carrito;

public class ABMCarrito {
	
	private static final Object Carrito = null;
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
	
	public Carrito traerCarrito(int idCarrito) {
		int index=0;
		Carrito carrito=null;
		while(carrito==null && index <lstCarritos.size()) {
			if(lstCarritos.get(index).getIdCarrito()==idCarrito) {
				carrito=lstCarritos.get(index);
			}
			index++;
		}
		return carrito;
	}
	
	public boolean eliminarCarrito(int idCarrito) throws Exception{
		Carrito carrito = traerCarrito(idCarrito);		
		if(carrito==null) {
			throw new Exception ("el carrito q se intenta borrar no existe");
		}
		carrito.eliminarItemsCarrito();
		return lstCarritos.remove(carrito);
	}

}
