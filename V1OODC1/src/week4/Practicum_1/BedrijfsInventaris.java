package week4.Practicum_1;

import java.util.ArrayList;

public class BedrijfsInventaris {
	
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed>inventarisLijst = new ArrayList<Goed>();
	
	public BedrijfsInventaris(String nm, double bud) {
		bedrijfsnaam = nm;
		budget = bud;
	}
	
	public void schafAan(Goed g) {
		for (Goed goedje : inventarisLijst) {
			// Kan niet vergelijken op basis van type, type is private in Voertuig en Computer. Als de prijs verandert klopt dit niet meer.
			if (goedje.toString().equals(g.toString())) {
				return;
			}
		}
		
		if (budget >= g.huidigeWaarde()) {
			inventarisLijst.add(g);
		}
	}
	
	public String toString() {
		String inventaris = "HU met inventaris: \n";
		for (Goed g : inventarisLijst) {
			inventaris += g;
		}
		return inventaris;
	}

}
