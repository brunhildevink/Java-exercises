package week4.Practicum_2;

public class Klant {
	private String naam;
	private String adres;

	public Klant(String nm, String adr) {
		naam = nm;
		adres = adr;
	}

	public String toString() {
		return naam + " met adres: " + adres;
	}
}
