package Modelo;

import java.util.Objects;

public class Producto {
	private int id_producto;
	private String producto;
	private float precio;
	
	
	public Producto(int id_producto, String producto, float precio) {
		this.id_producto = id_producto;
		this.producto = producto;
		this.precio = precio;
	}
	
	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", producto=" + producto + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_producto, precio, producto);
	}

	public boolean equals(Producto obj) {
		boolean retorno=false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.id_producto == obj.id_producto&& this.producto == obj.getProducto())
			retorno = true;
		return retorno;
	}
	
	
	
	
	
}
