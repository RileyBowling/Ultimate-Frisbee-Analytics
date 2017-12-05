
public class Game {
	private Team ourTeam;
	private String enemyName;
	private int gameDate;
	private int ourScore;
	private int enemyScore;
	private int gameLimit;
	private boolean gameOver;
	
	public Game(Team t, String e) {
		ourTeam = t;
		enemyName = e;
		
		//gamedate = systemdate
		ourScore = 0;
		enemyScore = 0;
		gameOver = false;
	}
	
	public Team getTeam() {
		return ourTeam;
	}
	
	public String getEnemyName() {
		return enemyName;
	}
	
	public int getGameDate() {
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
	
	public boolean isGameOver() {
		return gameOver;
	}
	
	public void setEnemyName(String n) {
		enemyName = n;
	}
	
	public void setOurScore(int s) {
		ourScore = s;
	}
	
	public void setEnemyScore(int s) {
		enemyScore = s;
	}
	
	public void setGameDate(int d) {
		gameDate = d;
	}
	
	public void setGameLimit(int l) {
		gameLimit = l;
	}
	
	public void setGameOver(boolean b) {
		gameOver = b;
	}
	
}
