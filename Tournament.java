import java.util.ArrayList;

public class Tournament {
	private ArrayList<Game> games;
	private String name;
	
	public Tournament(String n) {
		name = n;
		games = new ArrayList<Game>();
	}
	
	public void addGame(Game g) {
		games.add(g);
	}
	
	public void removeGame() {
		//use iterator
	}
	
	public Game getGame(int i) {
		return games.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

}
