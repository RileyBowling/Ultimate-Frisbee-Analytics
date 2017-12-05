import java.util.ArrayList;
import java.util.ListIterator;

public class Player {
	private ArrayList<Stats> stats;
	private String name;
	private String nickname;
	private int number;
	
	public Player(String n, String nick, int num) {
		name = n;
		nickname = nick;
		number = num;
		stats = new ArrayList<Stats>();
	}
	
	public void addStats(Stats s) {
		stats.add(s);
	}
	
	public void removeStats(Game g) {
		ListIterator<Stats> iter = stats.listIterator();
		while(iter.hasNext()) {
			if (iter.next().getGame() == g)
				iter.remove();
		}
	}
	
	public ListIterator<Stats> getStatsIterator() {
		return stats.listIterator();				
	}
	
	public Stats getStats(Game g) {
		ListIterator<Stats> iter = stats.listIterator();
		while(iter.hasNext()) {
			Stats st = iter.next();
			if (st.getGame() == g)
				return st;
		}
		return new Stats(g);
	}
	
	public String getName() {
		return name;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setNickname(String n) {
		nickname = n;
	}
	
	public void setNumber(int n) {
		number = n;
	}


}
