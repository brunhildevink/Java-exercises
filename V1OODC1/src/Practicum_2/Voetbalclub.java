package Practicum_2;

public class Voetbalclub {
	
	private String naam;
	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;
	
	public Voetbalclub(String nm) {
		naam = nm;
	}
	
	public int aantalGespeeld() {
		return aantalGewonnen + aantalGelijk + aantalVerloren;
	}
	
	public int aantalPunten() {
		return (aantalGewonnen * 3) + aantalGelijk;
	}
	
	public void verwerkResultaat (char ch) {
		if (ch == 'w') {
			aantalGewonnen += 1;
		}
		if (ch == 'g') {
			aantalGelijk += 1;
		}
		if (ch == 'v') {
			aantalVerloren += 1;
		}
	}
	
	public void print() {
		String s = 
			naam + " " +
			aantalGespeeld() + 
			" " +
			aantalGewonnen + 
			" " +
			aantalGelijk + 
			" " +
			aantalVerloren + 
			" " +
			aantalPunten();
		System.out.println(s);
	}
	
}
