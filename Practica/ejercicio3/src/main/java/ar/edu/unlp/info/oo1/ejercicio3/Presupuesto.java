package ar.edu.unlp.info.oo1.ejercicio3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {


	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal(){
		double total = 0;
		
		for(Item item: items) {
			total += item.costo();
		}
		
		
		return total;
		
		// Otra forma mas concisa 
		// return this.items.stream().mapToDouble(Item :: costo).sum();
	}

	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
	
	
}
