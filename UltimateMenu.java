import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UltimateMenu extends JFrame{
	private JPanel window;
	private UltimateSystem ult;
	
	public UltimateMenu() {
		super("Ultimate Frisbee Score Keeper");
		makeWindow();
        
        GridLayout g = new GridLayout(4,1);
        window.setLayout(g);
        
		ult = new UltimateSystem();
		
		JButton button1 = new JButton("New Tournament");
    	window.add(button1);
    	button1.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			TournamentCreationMenu tcm = new TournamentCreationMenu();
    			tcm.setVisible(true);
    			//ult.addTournament(t);
    		} 
    	});
    	
    	JButton button2 = new JButton("Tournament List");
    	window.add(button2);
    	button2.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
    	
    	JButton button3 = new JButton("New Team");
    	window.add(button3);
    	button3.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
    	
    	JButton button4 = new JButton("Team List");
    	window.add(button4);
    	button4.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
	}
	
	public void makeWindow() {
		window = new JPanel();
        add(window);
        setSize(600,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JPanel getWindow() {
		return window;
	}

}
