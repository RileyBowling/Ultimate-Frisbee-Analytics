import java.util.ArrayList;

public class Player {
	private ArrayList<Stats> stats;
	private String name;
	private String nickname;
	private int number;
	
	public Player(String n, String nick) {
		name = n;
		nickname = nick;
		stats = new ArrayList<Stats>();
	}
	
	public void addStats(Stats s) {
		stats.add(s);
	}
	
	public void removeStats() {
		//use iterator
	}
	
	public Stats getStats(int i) {
		return stats.get(i);
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
