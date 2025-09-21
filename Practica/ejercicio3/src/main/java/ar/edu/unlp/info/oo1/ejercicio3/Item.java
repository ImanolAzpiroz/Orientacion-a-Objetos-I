package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {

	
	
	private String detalle;
	private Integer cantidad;
	private double costoUnitario;
	
	
	public Item(String detalle, Integer cantidad, double costoUnitario) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}

	
	
	public double getCostoUnitario() {
		return this.costoUnitario;		
	}
	
	public double costo() {
		return cantidad * costoUnitario;
	}
	
}
