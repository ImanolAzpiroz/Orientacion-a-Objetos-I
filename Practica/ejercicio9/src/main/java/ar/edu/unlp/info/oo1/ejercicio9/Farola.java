package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.LinkedList;
import java.util.List;


public class Farola {

	private boolean isOn;
	private List<Farola> neighbors;
	
	
	public Farola() {
		this.isOn = false;
		this.neighbors = new LinkedList<>();
	}
	
	
	public void turnOn() {
		if(!this.isOn) {
			this.isOn = true;
			for(Farola v: neighbors){
				v.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.isOn) {
			this.isOn = false;
			for(Farola v: neighbors) {
				v.turnOff();
			}
		}
	}
	
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.neighbors.contains(otraFarola)) {
			neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
		
	}
	
	public boolean isOn(){
		return this.isOn;
	}
	
	public boolean isOff() {
		return !this.isOn;
	}
	
	public List<Farola> getNeighbors(){
		return this.neighbors;
	}
}
