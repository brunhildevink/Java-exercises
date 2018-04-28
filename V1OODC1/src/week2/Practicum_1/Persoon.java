package week2.Practicum_1;

public class Persoon {
	
	private String naam;
	private int leeftijd;
	
	public Persoon(String nm, int lft) {
		naam = nm;
		leeftijd = lft;
	}
	
	public void setNaam(String nwNm) {
		naam = nwNm;
	}
	
	public void setLeeftijd(int nwLft) {
		leeftijd = nwLft;
	}
	
	public String getNaam() { return naam; }
	public int getLeeftijd() { return leeftijd; }
	
	public String toString() {
		String n = naam;
		return n;
	}
	

}
