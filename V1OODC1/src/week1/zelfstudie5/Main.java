package week1.zelfstudie5;

public class Main {

	public static void main(String[] args) {
		
		String s = "s";
		System.out.println(s);
		
		for (int i = 0 ; i<11 ; i++) {
		
			if (s.length() == 1) {
				s = s + "s";
				System.out.println(s);
			}
			
			else if (s.length() == 2) {
				s = "s";
				System.out.println(s);
			}	
		}
	}
}
