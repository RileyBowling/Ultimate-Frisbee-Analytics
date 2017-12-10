import java.util.ArrayList;
import java.util.ListIterator;

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
	
	public void remove(Player p) {
		ListIterator<Player> iter = players.listIterator();
		while(iter.hasNext()) {
			if (iter.next() == p)
				iter.remove();
		}
	}
	
	public int getTeamSize() {
		return players.size();
	}
	
	public ListIterator<Player> getPlayerIterator() {
		return players.listIterator();				
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

}
