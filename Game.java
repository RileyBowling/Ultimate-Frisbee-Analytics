import java.text.SimpleDateFormat;

public class Game {
	private Team ourTeam;
	private String enemyName;
	private String gameDate;
	private int ourScore;
	private int enemyScore;
	private int gameLimit;
	
	public Game(Team t, String e, String gl) {
		ourTeam = t;
		enemyName = e;
		
		gameDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new java.util.Date());
		ourScore = 0;
		enemyScore = 0;
	}
	
	public Team getTeam() {
		return ourTeam;
	}
	
	public String getEnemyName() {
		return enemyName;
	}
	
	public String getGameDate() {
		return gameDate;
	}
	
	public int getOurScore() {
		return ourScore;
	}
	
	public int getEnemyScore() {
		return enemyScore;
	}
	
	public int getGameLimit() {
		return gameLimit;
	}
	
	public void setEnemyName(String n) {
		enemyName = n;
	}
	
	public void IncrementScore(int s) {
		ourScore += s;
	}
	
	public void IncrementEnemyScore(int s) {
		enemyScore += s;
	}
	
	public void setGameLimit(int l) {
		gameLimit = l;
	}
	
}
