package week1.les2.opdrachtindeles;

public class Rekening {
	
	private int nummer;
	private double saldo;
	
	public Rekening(int nr) {
		nummer = nr;
	}
	
	public int getNummer() {
		return nummer;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void stort(double bedrag) {
		if (bedrag > 0) {
			saldo += bedrag;
		}
	}
	
	public void neemOp(double bedrag) {
		saldo = saldo - bedrag;
	}
	
	public String toString() {
		String s = "Op rekening " + nummer + " staat " + saldo;
		return s;
	}

}
