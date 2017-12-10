import java.util.ArrayList;
import java.util.ListIterator;

/**
*
* @author Riley
*/

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
	
	public void removeTournament(Tournament t) {
		ListIterator<Tournament> iter = tournies.listIterator();
		while(iter.hasNext()) {
			if (iter.next() == t)
				iter.remove();
		}
	}
	
	public void removeTeam(Team t) {
		ListIterator<Team> iter = teams.listIterator();
		while(iter.hasNext()) {
			if (iter.next() == t)
				iter.remove();
		}
	}
	
	public int teamCount() {
		return teams.size();
	}
	
	public int tourneyCount() {
		return tournies.size();
	}
	
	public ListIterator<Team> getTeamsIterator() {
		return teams.listIterator();				
	}
	
	public ListIterator<Tournament> getTourniesIterator() {
		return tournies.listIterator();				
	}
}
