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

public class PlayerDisplayMenu extends DisplayMenu {
	public PlayerDisplayMenu(Team team) {
		makeWindow();
		GridLayout g = new GridLayout(team.getTeamSize()+1,1);
        getDisplay().setLayout(g);
        
		getDisplay().add(new JLabel("Players", SwingConstants.CENTER));
		
		ListIterator<Player> players = team.getPlayerIterator();
	    while (players.hasNext()) {
	    	Player p = players.next();
	        	
	    	JLabel lbl = new JLabel(p.getNickname());
	    	getDisplay().add(lbl);
	    }
	     
	    getWindow().add(getDisplay());
	}
}