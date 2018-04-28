package week2.Practicum_3;
import java.util.ArrayList; 

public class Klas {
	
	private String klasCode;
	private ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();
	
	public Klas(String kC) {
		klasCode = kC;
	}
	
	public void voegLeerlingToe(Leerling l) {
		leerlingen.add(l);
	}
	
	public void wijzigCijfer(String nm, double nweCijfer) {
		for (Leerling student : leerlingen) {
			if (student.getNaam().equals(nm)) student.setCijfer(nweCijfer);
		}
	}
	
	public ArrayList<Leerling> getLeerlingen() {
		return leerlingen;
	}
	
	public int aantalLeerlingen() {
		return leerlingen.size();
	}
	
	public String toString()  {
		String s = "In klas " + klasCode + " zitten de volgende leerlingen:" + "\n";
		for (Leerling student : leerlingen) { s += student + "\n"; }
		return s;
	}
}
