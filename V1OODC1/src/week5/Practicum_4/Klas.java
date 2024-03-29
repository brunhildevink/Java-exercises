package week5.Practicum_4;

import java.io.Serializable;
import java.util.ArrayList;

public class Klas implements Serializable {
	private String klasCode;
	private Leerling leerling;
	private ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();

	public Klas(String kC) {
		this.klasCode = kC;
	}

	// Return een leerlingen list
		public ArrayList<Leerling> getLeerlingen() {
			return leerlingen;
		}    
		
		
	// Return aantal leerlingen
		public int aantalLeerlingen() {
			return leerlingen.size();
		}
		
		
	// Toevoegen leerling
	public void addStudent(Leerling l) {
		leerlingen.add(l);
	}

	
	// Wijzigen van cijfer
	public void editStudentGrade(String nm, double nweCijfer) {
		for(Leerling l : leerlingen) {
			if(l.getNaam().equals(nm)) {
				l.setCijfer(nweCijfer);
			}
		}
	}
	
	//Print het berichtje
	public String toString() {
		String leerlingenCijferLijst = "\n";
		for(Leerling l : leerlingen) {
			leerlingenCijferLijst += l + "\n";
		}
		return "In klas " + this.klasCode + " zitten de volgende leerlingen: " + leerlingenCijferLijst;
	}
}
