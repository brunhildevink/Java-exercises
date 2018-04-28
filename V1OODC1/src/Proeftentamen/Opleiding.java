package Proeftentamen;

public class Opleiding {

	private String naam;
	private String variant;
	private int studieduur;
	private int minimumECs;

	public Opleiding(String nm, int std, int mEs) {
		naam = nm;
		studieduur = std;
		minimumECs = mEs;
	}

	public Opleiding(String nm, String v, int std, int mEs) {
		naam = nm;
		variant = v;
		studieduur = std;
		minimumECs = mEs;
	}

	public String getNaam() {
		return naam;
	}

	public void setStudieduur(int std) {
		studieduur = std;
	}

	public void wijzigVariant(String v) {
		variant = v;
	}

	public String toString() {
		return naam + " in " + variant + ". De studie duurt " + studieduur + " jaar (minimaal " + minimumECs + ")";
	}
	
}
