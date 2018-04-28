package Practicum_1;

public class Zwembad {
	
	private double breedte, lengte, diepte;
	
	public Zwembad(double br, double ln, double dp) {
		breedte = br;
		lengte = ln;
		diepte = dp;
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public double getDiepte() {
		return diepte;
	}
	
	public double inhoud() {
		return breedte * lengte * diepte;
	}
	
	public void setBreedte(double nwBr) {
		breedte = nwBr;
	}
	
	public void setLengte(double nwLn) {
		lengte = nwLn;
	}
	
	public void setDiepte(double nwDp) {
		diepte = nwDp;
	}
	
	public String toString() {
		String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
		return s;
	}

}
