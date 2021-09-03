package Modelo;

import java.util.Objects;

public class ItemCarrito {
	private int idCarrito;
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(int idCarrito, Producto producto, int cantidad) {
		super();
		this.idCarrito = idCarrito;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemCarrito [idCarrito=" + idCarrito + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", getIdCarrito()=" + getIdCarrito() + ", getProducto()=" + getProducto() + ", getCantidad()="
				+ getCantidad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, idCarrito, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCarrito other = (ItemCarrito) obj;
		return cantidad == other.cantidad && idCarrito == other.idCarrito && Objects.equals(producto, other.producto);
	}	
	
}
