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

public class TournamentDisplayMenu extends DisplayMenu {
	public TournamentDisplayMenu(UltimateSystem ult) {
		makeWindow();
		GridLayout g = new GridLayout(ult.tourneyCount()+1,1);
        getDisplay().setLayout(g);
        
		getDisplay().add(new JLabel("Tournaments", SwingConstants.CENTER));
		
		ListIterator<Tournament> tournies = ult.getTourniesIterator();
	    while (tournies.hasNext()) {
	    	Tournament t = tournies.next();
	        	
	    	JButton button = new JButton(t.getName());
	    	getDisplay().add(button);
	    	button.addActionListener(new ActionListener() { 
	    		public void actionPerformed(ActionEvent e) { 
	    			TournamentMenu tm = new TournamentMenu(ult, t);
	    			tm.setVisible(true);
	    			setVisible(false);
	    			dispose();
	        	} 
	        });
	    }
	     
	    getWindow().add(getDisplay());
	}
}
