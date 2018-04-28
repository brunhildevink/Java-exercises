package week2.Practicum_2;

public class Klant {
	
	private String naam;
	private double kortingspercentage;
	
	public Klant(String nm) {
		naam = nm;
	}
	
	public void setNaam(String nwNm) {
		naam = nwNm;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setKorting(double kP) {
		kortingspercentage = kP;
	}
	
	public double getKorting() {
		return kortingspercentage;
	}
	
	public String toString( ) {
		String s = "Op naam van: " + naam + " (korting: " + kortingspercentage + "%)";
		return s;
	}
	

}
