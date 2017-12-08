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

    public DefensiveMenu(Game game, ActionListener o, ActionListener d) {
        super(game,o,d);
    }

        public void scoreButtonLabeler (JPanel jp){
        jp.add(new JLabel("D"));
        jp.add(new JLabel("O"));
        jp.add(new JLabel("T"));
        jp.add(new JLabel("C"));
    }
       public void t_setup(Stats st, JButton tbutton) {
        	st.incrementDs();
        	tbutton.setText(String.valueOf(st.getDs()));
    }
        public void a_setup(Stats st, JButton abutton, Game g) {
//        	g.IncrementEnemyScore(1);
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
