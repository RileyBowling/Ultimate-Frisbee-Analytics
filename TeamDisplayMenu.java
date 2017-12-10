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

public class TeamDisplayMenu extends DisplayMenu {
	public TeamDisplayMenu(UltimateSystem ult) {
		makeWindow();
		GridLayout g = new GridLayout(ult.teamCount()+1,1);
        getDisplay().setLayout(g);
        
		getDisplay().add(new JLabel("Teams", SwingConstants.CENTER));
		
		ListIterator<Team> teams = ult.getTeamsIterator();
	    while (teams.hasNext()) {
	    	Team team = teams.next();
	        	
	    	JButton button = new JButton(team.getName());
	    	getDisplay().add(button);
	    	button.addActionListener(new ActionListener() { 
	    	public void actionPerformed(ActionEvent e) { 
	    		PlayerDisplayMenu pdm = new PlayerDisplayMenu(team);
	        		pdm.setVisible(true);
	        	} 
	        });
	    }
	     
	    getWindow().add(getDisplay());
	}
}
