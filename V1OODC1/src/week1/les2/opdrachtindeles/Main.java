package week1.les2.opdrachtindeles;

public class Main {
	public static void main(String[] args) {
		Rekening r1 = new Rekening(12345678);
		Rekening r2 = new Rekening(13456789);
		Rekening r3 = new Rekening(334455);
		
		r1.neemOp(45.11);
		r2.stort(250.00);
		r2.neemOp(744.00);
		r2.neemOp(50.00);
		r3.stort(563346.99);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());

	}

}
