import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
*
* @author Riley
*/

public class StatsDisplayMenu extends UltimateMenu {
	private int throwaways;
	private int assists;
	private int drops;
	private int dpoints;
	private int turnovers;
	private int callahans;
	
	public StatsDisplayMenu(Game game) {
		makeWindow();
        
        Team team = game.getTeam();
        
        JPanel statsDisplay = new JPanel();
        GridLayout g = new GridLayout(team.getTeamSize()*2+2,7);
        g.setHgap(30);
        g.setVgap(30);
        statsDisplay.setLayout(g);
    	
    	statsDisplay.add(new JLabel(game.getTeam().getName() + " vs " + game.getEnemyName() + " - " + game.getGameDate() + "     -     Final Score: " + game.getOurScore() + "-" + game.getEnemyScore()), SwingConstants.CENTER);
    	
        JPanel headDisplay = new JPanel();
        GridLayout g2 = new GridLayout(1,9);
    	headDisplay.setLayout(g2);
    	headDisplay.add(new JLabel("Players"));
        headDisplay.add(new JLabel("Throwaways"));
    	headDisplay.add(new JLabel("Assists"));
    	headDisplay.add(new JLabel("Drops"));
    	headDisplay.add(new JLabel("Scores"));
    	headDisplay.add(new JLabel("Ds"));
    	headDisplay.add(new JLabel("Turnovers"));
    	headDisplay.add(new JLabel("Callahans"));
    	headDisplay.add(new JLabel("Opponent Scores"));
    	statsDisplay.add(headDisplay);
    	
        ListIterator<Player> players = team.getPlayerIterator();
        while(players.hasNext()) {
        	Player p = players.next();
        	Stats st = p.getStats(game);
        	
        	JPanel scoresDisplay = new JPanel();
        	GridLayout g3 = new GridLayout(1,9);
        	scoresDisplay.setLayout(g3);
        	scoresDisplay.add(new JLabel('"' + p.getNickname() + '"' + " " + p.getName() + " #" + p.getNumber()));	
        	scoresDisplay.add(new JLabel(String.valueOf(st.getThrowaways())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getAssists())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getDrops())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getScores())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getDs())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getTurnovers())));
        	scoresDisplay.add(new JLabel(String.valueOf(st.getCallahans())));
        	scoresDisplay.add(new JLabel(""));
        	statsDisplay.add(scoresDisplay);
        	
        	throwaways += st.getThrowaways();
        	assists += st.getAssists();
        	drops += st.getDrops();
        	dpoints += st.getDs();
        	turnovers += st.getTurnovers();
        	callahans += st.getCallahans();
        }
        
        JPanel totalsDisplay = new JPanel();
    	GridLayout g4 = new GridLayout(1,9);
    	totalsDisplay.setLayout(g4);
    	totalsDisplay.add(new JLabel("Totals:"));
        totalsDisplay.add(new JLabel(String.valueOf(throwaways)));
    	totalsDisplay.add(new JLabel(String.valueOf(assists)));
    	totalsDisplay.add(new JLabel(String.valueOf(drops)));
    	totalsDisplay.add(new JLabel(String.valueOf(game.getOurScore())));
    	totalsDisplay.add(new JLabel(String.valueOf(dpoints)));
    	totalsDisplay.add(new JLabel(String.valueOf(turnovers)));
    	totalsDisplay.add(new JLabel(String.valueOf(callahans)));
    	totalsDisplay.add(new JLabel(String.valueOf(game.getEnemyScore())));
	    statsDisplay.add(totalsDisplay);
	    
	    getWindow().add(statsDisplay);
	}
	
	public void makeWindow() {
		super.makeWindow();
		setSize(1000,800);
	}
}
