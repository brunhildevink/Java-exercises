package week4.Practicum_1;
import java.time.LocalDate;

public class Fiets extends Voertuig {
	
	private int framenummer; 
	
	public Fiets(String tp, double pr, int jr, int fnr) {
		super(tp, pr, jr);
		framenummer = fnr;
	}
	
	@Override
	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		int jarenOud = huidigJaar - bouwjaar;
		double afschrijving = 0;
		
		for (int i = 0; i < jarenOud; i++) {
			afschrijving += (double) Math.round(0.10 * nieuwprijs * 100) / 100;	
		}
		return nieuwprijs - afschrijving;
	}
	
	public boolean equals(Object obj) {
		return false;
	}

}
