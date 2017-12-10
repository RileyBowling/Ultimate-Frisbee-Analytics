import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
*
* @author Riley
*/

//this is the parent class of all GUI elements, assures they all have the same window size and the "Ultimate Frisbee Score Keeper" window title
public class UltimateMenu extends JFrame{
	private JPanel window;
	
	public UltimateMenu() {
		super("Ultimate Frisbee Score Keeper");
	}
	
	public void makeWindow() {
		window = new JPanel();
        add(window);
        setSize(600,400);
        setResizable(true);
	}
	
	public JPanel getWindow() {
		return window;
	}
	
}
