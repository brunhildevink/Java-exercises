package week2.Practicum_2;

public class AutoHuur {
	
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;
	
	public AutoHuur() {
	}
	
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
	}
	
	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	
	public void setHuurder(Klant k) {
		huurder = k;
	}
	
	public Klant getHuurder() {
		return huurder;
	}
	
	public double totaalPrijs() {
		double totaalPrijs = 0.0;
		if (gehuurdeAuto != null) {
			totaalPrijs = (gehuurdeAuto.getPrijsPerDag() * aantalDagen);
		}
		if (huurder != null) {
			totaalPrijs = totaalPrijs / 100 * (100 - huurder.getKorting());
		}
		return totaalPrijs;
	}
	
	public String toString() {
		String autoString = "Er is geen auto bekend";
		String huurderString = "Er is geen huurder bekend";
		String totaalPrijs = "Aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		
		
		if(gehuurdeAuto != null) {
			autoString = gehuurdeAuto.toString();
		}
		
		if(huurder != null) {
			huurderString = huurder.toString();
		}
		
		return autoString + "\n" + huurderString + "\n" + totaalPrijs;
	}

	
}
