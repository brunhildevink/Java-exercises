package week1.les1.opdracht3;

public class Student {
	
	private String naam;
	private int studentNummer;
	
	public Student(String nm, int stNr) {
		naam = nm;
		studentNummer = stNr;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public int getStudentnummer() {
		return studentNummer;
	}
	
	public void setStudentnummer(int nwstNr) {
		studentNummer = nwstNr;
	}
	
	public String toString() {
		String s = "Deze student heet " + naam + " en heeft nummer: " + studentNummer;
		return s;
	}
}
