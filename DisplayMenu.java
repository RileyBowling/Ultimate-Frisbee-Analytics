import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DisplayMenu extends UltimateMenu {
	private JPanel display;
	
	public DisplayMenu() {
		
		display = new JPanel();
	}
	
	public void makeWindow() {
		super.makeWindow();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	public JPanel getDisplay() {
		return display;
	}
}
