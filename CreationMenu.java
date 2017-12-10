import javax.swing.JPanel;

public class CreationMenu extends UltimateMenu{
	
private JPanel display;
	
	public CreationMenu() {
		
		display = new JPanel();
	}
	
	public void makeWindow() {
		super.makeWindow();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	public JPanel getDisplay() {
		return display;
	}
	
	public void done() {
		setVisible(false);
		dispose();
	}
}
