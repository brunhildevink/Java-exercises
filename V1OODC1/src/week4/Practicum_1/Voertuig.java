package week4.Practicum_1;

public class Voertuig implements Goed {
	
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr) {
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
	public String toString() {
		return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + huidigeWaarde() + "\n";
	}

	@Override
	public double huidigeWaarde() {
		return 0;
	}
}
