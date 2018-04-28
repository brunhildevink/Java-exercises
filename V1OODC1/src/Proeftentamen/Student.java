package Proeftentamen;

public class Student {

	private String naam;
	private int leeftijd;
	private Opleiding opleiding;

	public Student(String nm, int lft) {
		naam = nm;
		leeftijd = lft;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opl) {
		opleiding = opl;
	}

	public String toString() {
		String a = "Student " + naam + " " + leeftijd + " volgt nog geen opleiding";
		String b = "Student " + naam + " " + leeftijd + " volgt de opleiding: " + opleiding;
		
		if (opleiding == null) {
			return a;
	 	}
		
		return b;
		}
}
