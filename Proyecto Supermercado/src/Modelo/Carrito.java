package Modelo;

import java.util.ArrayList;

public class Carrito {

	private int idCarrito;
	private ArrayList<ItemCarrito> lstItemCarrito = new ArrayList<ItemCarrito>();

	public Carrito() {}
	
	

	public Carrito(int idCarrito, ArrayList<ItemCarrito> lstItemCarrito) {
		this.idCarrito = idCarrito;
		
	}



	public Carrito(ArrayList<ItemCarrito> lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}

	public ArrayList<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}

	public void setLstItemCarrito(ArrayList<ItemCarrito> lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}
	
	public float calcularSubTotalItem() {
		float subTotal=0;
		for(int j=0; j< lstItemCarrito.size() ; j++) {
			subTotal=subTotal+lstItemCarrito.get(j).getCantidad()*lstItemCarrito.get(j).getProducto().getPrecio();
			}
		return subTotal;	
	}
	

	public boolean agregarItem(Producto producto, int cantidad){
//		boolean agregado=false;
//		int id=lstItemCarrito.size()+1;
//		int cantidadAgergada=0;
//		for(int i=0;i<lstItemCarrito.size();i++) {
//			if(producto.equals(lstItemCarrito.get(i).getProducto())) {
//				cantidadAgergada = cantidadAgergada + lstItemCarrito.get(id).getCantidad() ;
//				lstItemCarrito.get(id).setCantidad(cantidadAgergada);
//				agregado=true;
//			}			
//		}
//		if(agregado==false) {
//			lstItemCarrito.add(new ItemCarrito(id, producto, cantidad));
//			agregado=true;			
//		}
//		return agregado;
		lstItemCarrito.add(new ItemCarrito(1, producto, cantidad));
		return true;
	}

	public boolean eliminarItem(Producto producto, int cantidad) {
		int cantidadNueva=0;
		boolean eliminado=false;
		for (int i = 0; i < lstItemCarrito.size(); i++) {
			if(producto.equals(lstItemCarrito.get(i).getProducto())) {
				if(lstItemCarrito.get(i).getCantidad()==cantidad) {
					lstItemCarrito.remove(i);
					eliminado=true;
				}else if(lstItemCarrito.get(i).getCantidad()>cantidad) {
					cantidadNueva=lstItemCarrito.get(i).getCantidad()-cantidad;
					lstItemCarrito.get(i).setCantidad(cantidadNueva);
				}
			}
		}
		return eliminado;
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

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", lstItemCarrito=" + lstItemCarrito + "]";
	}



}
