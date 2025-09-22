package ar.edu.unlp.info.oo1.ejercicio4;


import java.util.ArrayList;
import java.util.List;

public class Balanza {

	
//	private int cantidadDeProductos;
//	private double precioTotal;
//	private double pesoTotal;
	
	private List<Producto> listaProductos;
	
	
	public Balanza() {
		this.ponerEnCero();
	}


	public void ponerEnCero() {
//		this.cantidadDeProductos = 0;
//		this.precioTotal = 0;
//		this.pesoTotal = 0;
		this.listaProductos = new ArrayList<>();
	}
	
	
	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);
	}
	
	public Ticket emitirTicket(){
		Ticket ticket = new Ticket(this.listaProductos.size(), this.getPesoTotal(), this.getPrecioTotal());
		return ticket;
	}

	
	public List<Producto> getProductos(){
		return this.listaProductos;
	}

	public int getCantidadDeProductos() {
		return this.listaProductos.size();
	}


	public double getPrecioTotal() {
		return this.listaProductos.stream().mapToDouble(Producto :: getPrecio).sum();
	}


	public double getPesoTotal() {
		return this.listaProductos.stream().mapToDouble(Producto :: getPeso).sum();
	}
}
