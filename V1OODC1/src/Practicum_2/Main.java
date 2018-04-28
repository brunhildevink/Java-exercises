package Practicum_2;

public class Main {

	public static void main(String[] args) {
		Voetbalclub ajx = new Voetbalclub("Ajax");
		ajx.verwerkResultaat('w');
		ajx.verwerkResultaat('v');
		Voetbalclub feij = new Voetbalclub("Fijenoord");
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('g');
		ajx.print();
		feij.print();
	}

}
