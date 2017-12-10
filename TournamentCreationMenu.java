import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
*
* @author Riley
*/

public class TournamentCreationMenu extends CreationMenu {
	public TournamentCreationMenu(UltimateSystem ult) {
		makeWindow();
		
		GridLayout g = new GridLayout(4,1);
        getDisplay().setLayout(g);
        
        JLabel lbl = new JLabel("Enter Tournament Name", SwingConstants.CENTER);
        
        JTextField txt = new JTextField();
        
        JButton button1 = new JButton("Done");
    	button1.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			String text = txt.getText();
    			if (!text.equals("")) {
    				ult.addTournament(new Tournament(text));
    			}
    			done();
    		} 
    	});
    	
        getDisplay().add(lbl);
        getDisplay().add(txt);
        getDisplay().add(new JLabel()); //blank spot
        getDisplay().add(button1);
        getWindow().add(getDisplay());
	}
	
}
