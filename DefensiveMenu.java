/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.CardLayout;
import java.util.ListIterator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Zohair
 */
public class DefensiveMenu extends GameMenu {

    public DefensiveMenu(Game game, JTextField disp, ActionListener a) {
        super(game,disp,a);
    }

        public void scoreButtonLabeler (JPanel jp){
        jp.add(new JLabel("DPoint"));
        jp.add(new JLabel("Offense Score"));
        jp.add(new JLabel("Turnover"));
        jp.add(new JLabel("Callahan"));
    }
    public void addWindowSetters(JButton t, JButton a_, JButton d,
            JButton s,ActionListener a) {
        t.addActionListener(a);
        a_.addActionListener(a);
        d.addActionListener(a);
    }
       public void t_setup(Stats st, JButton tbutton) {
        	st.incrementDs();
        	tbutton.setText(String.valueOf(st.getDs()));
    }
        public void a_setup(Stats st, JButton abutton, Game g) {
        	g.IncrementEnemyScore(1);
        	abutton.setText(String.valueOf(st.getEnemyScore()));
    }
        public void d_setup(Stats st, JButton dbutton) {
        	st.incrementTurnovers();
        	dbutton.setText(String.valueOf(st.getTurnovers()));
    }
        public void s_setup(Stats st, JButton sbutton, Game g) {
                st.incrementCallahans();
        	sbutton.setText(String.valueOf(st.getCallahans()));
    }
//       public void scoreIncrementer(Game g) {
//            g.IncrementEnemyScore(1);
//        }
}
