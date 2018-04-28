package week2.Practicum_1;

public class Huis {
	
	private String adres;
	private int bouwjaar;
	private Persoon huisbaas;
	private Persoon leeftijd;
	
	public Huis(String adr, int bwjr) {
		adres = adr;
		bouwjaar = bwjr;
	}
	
	public void setBouwjaar(int nwBwjr) {
		bouwjaar = nwBwjr;
	}
	
	public void setAdres(String nwAdr) {
		adres = nwAdr;
	}
	
	public void setHuisbaas(Persoon nm) {
		huisbaas = nm;
	}
	
	public void setLeeftijd(Persoon lft) {
		leeftijd = lft;
	}
	
	public int getBouwjaar() {
		return bouwjaar;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	
	public Persoon getLeeftijd() {
		return leeftijd;
	}
	
	public String toString() {
		String s = "Huis " + adres + " is gebouwd in " + bouwjaar + " en heeft huisbaas " + huisbaas + "; " + huisbaas.getLeeftijd();
		return s;
	}
	

}
