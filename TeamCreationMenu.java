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

public class TeamCreationMenu extends CreationMenu {
	public TeamCreationMenu(UltimateSystem ult) {
		makeWindow();
		
		GridLayout g = new GridLayout(8,1);
        getDisplay().setLayout(g);
        
        Team team = new Team("");
        
        JLabel lbl = new JLabel("Enter Team Name", SwingConstants.CENTER);
        
        JTextField txt = new JTextField();
        
        JButton button1 = new JButton("Player List");
    	button1.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			PlayerDisplayMenu pdm = new PlayerDisplayMenu(team);
    			pdm.setVisible(true);
    		} 
    	});
    	
        
    	JButton button2 = new JButton("Add New Player");
    	button2.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			PlayerCreationMenu pcm = new PlayerCreationMenu(team);
    			pcm.setVisible(true);
    		} 
    	});
    	
    	JButton button3 = new JButton("Done");
    	button3.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			String text = txt.getText();
    			if (!text.equals("")) {
    				team.setName(text);
    				ult.addTeam(team);
    			}
    			done();
    		} 
    	});
    	
        getDisplay().add(lbl);
        getDisplay().add(txt);
        getDisplay().add(button2);
        getDisplay().add(button1);
        getDisplay().add(new JLabel()); //blank spot
        getDisplay().add(button3);
        getWindow().add(getDisplay());
	}
	
}
