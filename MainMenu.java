import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
*
* @author Riley
*/

public class MainMenu extends UltimateMenu{
	private UltimateSystem ult;
	
	public MainMenu() {
		makeWindow();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
        GridLayout g = new GridLayout(4,1);
        getWindow().setLayout(g);
        
		ult = new UltimateSystem();
		
		
		JButton button1 = new JButton("New Tournament");
    	getWindow().add(button1);
    	button1.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			TournamentCreationMenu trcm = new TournamentCreationMenu(ult);
    			trcm.setVisible(true);
    		} 
    	});
    	
    	JButton button2 = new JButton("Tournaments");
    	getWindow().add(button2);
    	button2.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			TournamentDisplayMenu trdm = new TournamentDisplayMenu(ult);
    			trdm.setVisible(true);
    		} 
    	});
    	
    	JButton button3 = new JButton("New Team");
    	getWindow().add(button3);
    	button3.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			TeamCreationMenu tcm = new TeamCreationMenu(ult);
    			tcm.setVisible(true);
    		} 
    	});
    	
    	JButton button4 = new JButton("Teams");
    	getWindow().add(button4);
    	button4.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			TeamDisplayMenu tdm = new TeamDisplayMenu(ult);
    			tdm.setVisible(true);
    		} 
    	});
	}
	
	public UltimateSystem getUlt() {
		return ult;
	}
}
