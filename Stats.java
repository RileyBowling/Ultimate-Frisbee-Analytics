
public class Stats {
	private Game game; //will be used to find out which stats object stored by a player object corresponds to which game, could also just pass a reference to the game possibly
	private int scores;
	private int throwaways;
	private int assists;
	private int drops;
	private int dpoints;
	private int turnovers;
	private int callahans;
	
	public Stats(Game g) {
		game = g;
	}
	
	public Game getGame() {
		return game;
	}
	
	public int getScores() {
		return scores;
	}
	
	public int getThrowaways() {
		return throwaways;
	}
	
	public int getAssists() {
		return assists;
	}
	
	public int getDrops() {
		return drops;
	}
	
	public void incrementScores() {
		scores+=1;
	}
	
	public void incrementThrowaways() {
		throwaways+=1;
	}
	
	public void incrementAssists() {
		assists+=1;
	}
	
	public void incrementDrops() {
		drops+=1;
	}
	

}