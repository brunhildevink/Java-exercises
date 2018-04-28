package week2.Practicum_2;

public class Auto {
	
	private String type;
	private double prijsPerDag;
	
	public Auto(String tp, double prPd) {
		type = tp;
		prijsPerDag = prPd;
	}
	
	public void setType(String tp) {
		type = tp;
	}
	
	public String getType() {
		return type;
	}
	
	public void setPrijsPerDag(double prPd) {
		prijsPerDag = prPd;
	}
	
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	
	public String toString( ) {
		String s = "Autotype: " + type + " met prijs per dag: " + prijsPerDag;
		return s;
	}
	
	

}
