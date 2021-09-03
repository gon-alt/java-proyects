package Modelo;

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
	
	
	
}
