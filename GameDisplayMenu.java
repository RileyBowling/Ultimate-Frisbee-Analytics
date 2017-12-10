import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
*
* @author Riley
*/

public class GameDisplayMenu extends DisplayMenu {
	public GameDisplayMenu(Tournament t) {
		makeWindow();
		GridLayout g = new GridLayout(t.gameCount()+1,1);
        getDisplay().setLayout(g);
        
		getDisplay().add(new JLabel("Games", SwingConstants.CENTER));
		
		ListIterator<Game> games = t.getGamesIterator();
	    while (games.hasNext()) {
	    	Game game = games.next();
	        	
	    	JButton button = new JButton(game.getTeam().getName() + " vs " + game.getEnemyName() + " - " + game.getGameDate());
	    	getDisplay().add(button);
	    	button.addActionListener(new ActionListener() { 
	    		public void actionPerformed(ActionEvent e) { 
	    			StatsDisplayMenu sdm = new StatsDisplayMenu(game);
	    			sdm.setVisible(true);
	    			setVisible(false);
	    			dispose();
	        	}
	        });
	    }
	     
	    getWindow().add(getDisplay());
	}
}
