package week1.les2.opdracht1;

public class Piloot {
	
	private String naam;
	private double salaris;
	private int vlieguren;
	
	public Piloot(String nm) {
		naam = nm;
	}
	
	public void setSalaris(double newSalaris) {
		salaris = newSalaris;
	}
	
	public int verhoogVliegurenMet(int newVlieguren) {
		vlieguren = vlieguren + newVlieguren;
		return vlieguren;
	}
	
	public double getSalaris( ) {
		return salaris;
	}
	
	public int getVlieguren() {
		return vlieguren;
	}
	
	public String toString() {
		String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
		return s;
	}

}
