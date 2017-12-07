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
public class OffensiveMenu extends GameMenu {

    public OffensiveMenu(Game game) {
        super(game);
    }

        public void scoreButtonLabeler (JPanel jp){
        jp.add(new JLabel("T"));
        jp.add(new JLabel("A"));
        jp.add(new JLabel("D"));
        jp.add(new JLabel("S"));
    }
        
        public void t_setup(Stats st, JButton tbutton) {
        	st.incrementThrowaways();
        	tbutton.setText(String.valueOf(st.getThrowaways()));
    }
        public void a_setup(Stats st, JButton abutton) {
        	st.incrementAssists();
        	abutton.setText(String.valueOf(st.getAssists()));
    }
        public void d_setup(Stats st, JButton dbutton) {
        	st.incrementDrops();
        	dbutton.setText(String.valueOf(st.getDrops()));
    }
        public void s_setup(Stats st, JButton sbutton) {
        	st.incrementScores();
        	sbutton.setText(String.valueOf(st.getScores()));
    }
        public void scoreIncrementer(Game g) {
            g.IncrementScore(1);
        }


    
}
