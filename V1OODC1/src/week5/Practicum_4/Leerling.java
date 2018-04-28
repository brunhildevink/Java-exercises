package week5.Practicum_4;

import java.io.Serializable;

public class Leerling implements Serializable {
	private String naam;
	private double cijfer;
	
	public Leerling(String nm) {
		this.naam = nm;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public void setNaam(String nm) {
		this.naam = nm;
	}
	
	public double getCijfer() {
		return this.cijfer;
	}
	
	public void setCijfer(double d) {
		this.cijfer = d;
	}
	
	public String toString() {
		return naam + " heeft cijfer: " + cijfer;
	}
}
