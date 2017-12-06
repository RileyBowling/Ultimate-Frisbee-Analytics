import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UltimateMenu extends JFrame{
	private JPanel parent;
	
	public UltimateMenu() {
		super("Ultimate Frisbee Score Keeper");
		makeWindow();
        
        GridLayout g = new GridLayout(4,1);
        parent.setLayout(g);
        
		UltimateSystem ult = new UltimateSystem();
		
		JButton button1 = new JButton("New Tournament");
    	parent.add(button1);
    	button1.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			
    			
    			//ult.addTournament(t);
    		} 
    	});
    	
    	JButton button2 = new JButton("Tournament List");
    	parent.add(button2);
    	button2.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
    	
    	JButton button3 = new JButton("New Team");
    	parent.add(button3);
    	button3.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
    	
    	JButton button4 = new JButton("Team List");
    	parent.add(button4);
    	button4.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) { 
    			//stuff
    		} 
    	});
	}
	
	public void makeWindow() {
		parent = new JPanel();
        add(parent);
        setSize(600,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void addPanel(JPanel p) {
		parent.add(p);
	}

}
