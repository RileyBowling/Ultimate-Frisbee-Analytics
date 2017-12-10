import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
*
* @author Amy
*/

public class TournamentMenu extends UltimateMenu{


    public TournamentMenu(UltimateSystem ult, Tournament t) {
        makeWindow();

        GridLayout g = new GridLayout(2,1);
        getWindow().setLayout(g);


        JButton button1 = new JButton("New Game");
        getWindow().add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	TeamChoiceMenu tcm = new TeamChoiceMenu(ult, t);
            }
        });

        JButton button2 = new JButton("Game List");
        getWindow().add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameDisplayMenu gdm = new GameDisplayMenu();
            }
        });

    }

}