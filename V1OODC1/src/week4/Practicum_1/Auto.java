package week4.Practicum_1;
import java.time.LocalDate;


public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		kenteken = kt;
	}
	
	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		int jarenOud = huidigJaar - bouwjaar;
		double afschrijving = 0;
		
		for (int i = 0; i < jarenOud; i++) {
			afschrijving += (double) Math.round(0.30 * nieuwprijs * 100) / 100;	
		}
		return nieuwprijs - afschrijving;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
}
