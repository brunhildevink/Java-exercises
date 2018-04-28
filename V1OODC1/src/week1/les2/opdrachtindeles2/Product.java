package week1.les2.opdrachtindeles2;

public class Product {
	
	private String naam;
	private String code;
	private double prijs;
	private double btw;
	
	public Product(String nm, String cd, double pr) {
		naam = nm;
		code = cd;
		prijs = pr;
	}
	
	public Product(String nm, String cd) {
	}
	
	public void setBTW(double bt) {
		btw = bt;
		prijs = prijs * bt;
	}
	
	public void setPrijs(double pr) {
		prijs = pr;
	}
	
	public double getBTW() {
		return btw;
	}
	
	public double getPrijs() {
		return prijs;
	}
	
	public void verhoogPrijsMet(double extra) {
		prijs += prijs * (extra/100);
	}
	
	public double btwBedrag() {
		return prijs * (btw/100);
	}
	
	public String toString() {
		String s = naam + " heeft code " + code + " en kost " + prijs + "; de btw is " + btw + "%";  
		return s;
	}
	
	
}
