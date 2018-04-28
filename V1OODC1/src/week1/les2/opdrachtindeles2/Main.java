package week1.les2.opdrachtindeles2;

public class Main {

	public static void main(String[] args) {
	
		Product pr1 = new Product("Ipad", "1234AB", 614.00);
		pr1.setBTW(19.0);
		pr1.verhoogPrijsMet(2.5);
		System.out.println("Eerste product: " + pr1);
		
		Product pr2 = new Product("Paracetamol", "2345CD");
		pr2.setPrijs(1.90);
		pr2.setBTW(6.0);
		pr2.verhoogPrijsMet(-10);
		System.out.println("Tweede product: " + pr2);
		

	}

}
