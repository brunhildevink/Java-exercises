package week4.Practicum_1;
import java.time.LocalDate;


public class Computer implements Goed {
	
	private String type;
	private String MacAdres;
	private double aanschafprijs;
	private int productieJaar;
	
	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		MacAdres = adr;
		aanschafprijs = pr;
		productieJaar = jr;
	}
	
	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		int jarenOud = huidigJaar - productieJaar;
		double afschrijving = 0;
		
		for (int i = 0; i < jarenOud; i++) {
			afschrijving += (double) Math.round(0.40 * aanschafprijs * 100) / 100;	
		}
		return aanschafprijs - afschrijving;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
	public String toString() {
		return "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde() + "\n";
	}

}
