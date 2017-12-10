import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GameCreationMenu extends CreationMenu{
	public GameCreationMenu(Tournament t, Team team) {
		makeWindow();
		
		GridLayout g = new GridLayout(5,1);
        getDisplay().setLayout(g);
        
        JLabel lbl = new JLabel("Enter Opponent Team Name", SwingConstants.CENTER);
        
        JTextField txt = new JTextField();
        
        JLabel lbl2 = new JLabel("Choose a Game Score Limit", SwingConstants.CENTER);
        
        JComboBox<String> combo = new JComboBox<String>();
        
        // add items to the combo box
        combo.addItem("11");
        combo.addItem("15");
        combo.addItem("21");
                
        JLabel lbl3 = new JLabel("Choose a Starting Position", SwingConstants.CENTER);
        
        JComboBox<String> combo2 = new JComboBox<String>();
        
        // add items to the combo box
        combo2.addItem("Offense");
        combo2.addItem("Defense");
    	
    	JButton button = new JButton("Done");
    	button.addActionListener(new ActionListener() { 
    		public void actionPerformed(ActionEvent e) {
    			String gl = (String) combo.getSelectedItem();
    		    String sp = (String) combo.getSelectedItem();
    		    if (!txt.getText().equals("")) {
    		    	Game g = new Game(team, txt.getText(), gl);
    		    	t.addGame(g);
    		    	//GameMenu gm = new GameMenu(g);
    		    	//gm.setVisible(true);
    		    }
    			done();
    		} 
    	});
    	
        getDisplay().add(lbl);
        getDisplay().add(txt);
        getDisplay().add(lbl2);
        getDisplay().add(combo);
        getDisplay().add(lbl3);
        getDisplay().add(combo2);
        getDisplay().add(new JLabel()); //blank spot
        getDisplay().add(button);
        getWindow().add(getDisplay());
	}
}
