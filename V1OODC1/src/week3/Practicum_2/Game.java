package week3.Practicum_2;
import java.time.LocalDate;

public class Game {
	
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	private double nieuwePrijs;
	private int huidigJaar = LocalDate.now().getYear();
	
	public Game(String nm, int rJ, double nwpr) {
		naam = nm;
		releaseJaar = rJ;
		nieuwprijs = nwpr;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public double huidigeWaarde() {
		int jarenOud = huidigJaar - releaseJaar;
		for (int i = 0; i < jarenOud; i++) {
			nieuwePrijs = (double) Math.round(0.70 * nieuwprijs * 100) / 100;	
		}
		return nieuwePrijs;
	}
	
	public String toString() {
		return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + nieuwprijs + " nu voor: €" + nieuwePrijs + "\n";
	}
	
	
	

}
