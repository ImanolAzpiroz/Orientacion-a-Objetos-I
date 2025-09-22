package ar.edu.unlp.info.oo1.ejercicio8;


import java.util.Date;

public class Mamifero {

	
	private String identificador;
	private String especie;
	private Date fechaDeNacimiento;
	private Mamifero madre;
	private Mamifero padre;

	
	
	public Mamifero() {
		super();
	}
	
	public Mamifero(String identificador) {
		super();
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getAbueloMaterno() {
		return this.madre != null ? this.madre.getPadre() : null;
	}

	public Mamifero getAbuelaMaterna() {
		return this.madre != null ? this.madre.getMadre() : null;
	}

	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}

	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}

	public boolean tieneComoAncestroA(Mamifero ancestro) {
		
		return ((this.getMadre() == ancestro) || (this.getPadre() == ancestro) 
				|| (this.getPadre() != null && this.getPadre().tieneComoAncestroA(ancestro)) 
					|| (this.getMadre() != null && this.getMadre().tieneComoAncestroA(ancestro))) ? true : false;
	}
	
}