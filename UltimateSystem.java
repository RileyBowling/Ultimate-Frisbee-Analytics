import java.util.ArrayList;

public class UltimateSystem {
	
	private ArrayList<Tournament> tournies;
	private ArrayList<Team> teams;

	public UltimateSystem() {
		tournies = new ArrayList<Tournament>();
		teams = new ArrayList<Team>();
	}
	
	public void addTournament(Tournament t) {
		tournies.add(t);
	}
	
	public void addTeam(Team t) {
		teams.add(t);
	}
	
	public void removeTournament() {
		//use iterator
	}
	
	public void removeTeam() {
		//use iterator
	}
}
