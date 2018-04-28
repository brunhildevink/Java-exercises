package week3.Practicum_2;
import java.util.ArrayList; 


public class Persoon {
	
	private String naam;
	private double budget;
	private ArrayList<Game> gamesInBezit = new ArrayList<Game>();
	
	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
	}
	
	public boolean koop(Game g) {
		for (Game game : gamesInBezit) {
			if (g.getNaam().equals(game.getNaam())) { return false; }
		}

		if (g.huidigeWaarde() <= budget) {
			gamesInBezit.add(g);
			budget = budget - g.huidigeWaarde();
			return true;
		} else { return false; }
	}
	
	public boolean verkoop(Game g, Persoon koper) {
		if (!koper.koop(g)) { return false; }
		
		for (Game game : gamesInBezit) {
			if (game.getNaam().equals(g.getNaam())) {
				gamesInBezit.remove(g);
				return true;
			}
		}
		return false;
	}
	
	public Game zoekGameOpNaam(String game) {
		for (Game i : gamesInBezit) {
			if (i.getNaam().equals(game)) {
				return i;
			}
		}
		return null;
	}
	
	public String toString() {
		String games = naam + " heeft een budget van €" + (double) Math.round(budget * 100) / 100 + " en bezit de volgende games:\n";
		for (Game game : gamesInBezit) { games += game; }
		return games;
	}

}
