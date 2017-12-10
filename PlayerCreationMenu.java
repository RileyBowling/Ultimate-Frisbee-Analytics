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

public class PlayerCreationMenu extends CreationMenu {
	public PlayerCreationMenu(Team team) {
		makeWindow();
		
		GridLayout g = new GridLayout(8,2);
        getDisplay().setLayout(g);
        
        JLabel lbl = new JLabel("Enter Player Name", SwingConstants.CENTER);
        
        JTextField txt = new JTextField();
        
        JLabel lbl2 = new JLabel("Enter Player Nickname", SwingConstants.CENTER);
        
        JTextField txt2 = new JTextField();
        
        JLabel lbl3 = new JLabel("Enter Player Number", SwingConstants.CENTER);
        
        JTextField txt3 = new JTextField();
    	
    	JButton button = new JButton("Done");
    	button.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) {
    			int n;
    			if (!txt2.getText().equals("")) {
    				if (txt3.getText().equals("")) {
    					n = 0; //0 is the default number
    				}
    				else {
    					n = Integer.parseInt(txt3.getText());
    				}
    				Player p = new Player(txt.getText(),txt2.getText(),n);
        			team.addPlayer(p);
    			}
    			done();
    		} 
    	});
    	
        getDisplay().add(lbl);
        getDisplay().add(txt);
        getDisplay().add(lbl2);
        getDisplay().add(txt2);
        getDisplay().add(lbl3);
        getDisplay().add(txt3);
        getDisplay().add(new JLabel()); //blank spot
        getDisplay().add(button);
        getWindow().add(getDisplay());
	}
	
}
