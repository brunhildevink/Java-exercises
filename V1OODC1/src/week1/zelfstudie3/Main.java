package week1.zelfstudie3;

public class Main {

	public static void main(String[] args) {
		for (int i=1 ; i<11 ; i++) {
			System.out.println(Math.random() / Math.nextDown(1.0));
		}
	}
}
