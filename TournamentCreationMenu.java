import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TournamentCreationMenu extends UltimateMenu {
	public TournamentCreationMenu() {
		makeWindow();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		GridLayout g = new GridLayout(2,1);
        getWindow().setLayout(g);
        
        JLabel lbl = new JLabel("Enter Tournament Name");
        JTextField txt = new JTextField();
        getWindow().add(lbl);
        getWindow().add(txt);
	}
}
