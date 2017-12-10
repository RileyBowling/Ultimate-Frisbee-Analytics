import java.util.ArrayList;
import java.util.ListIterator;

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
	
	public void removeGame(Game g) {
		ListIterator<Game> iter = games.listIterator();
		while(iter.hasNext()) {
			if (iter.next() == g)
				iter.remove();
		}
	}
	
	public int gameCount() {
		return games.size();
	}
	
	public ListIterator<Game> getGamesIterator() {
		return games.listIterator();				
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

}
