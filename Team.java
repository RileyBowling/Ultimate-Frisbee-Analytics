import java.util.ArrayList;

public class Team {
	private ArrayList<Player> players;
	private String name;
	
	public Team(String n) {
		name = n;
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	public void removePlayer() {
		//use iterator
	}
	
	public Player getPlayer(int i) {
		return players.get(i);				
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

}
