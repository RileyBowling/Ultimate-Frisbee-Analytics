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
 * @editor Amy
 */
public class OffensiveMenu extends GameMenu {

    public OffensiveMenu(Game game, JTextField disp, ActionListener a,
     ActionListener gk) {
        super(game,disp,a,gk);

    }

        public void scoreButtonLabeler (JPanel jp){
        jp.add(new JLabel("Throwaways"));
        jp.add(new JLabel("Assists"));
        jp.add(new JLabel("Drop"));
        jp.add(new JLabel("Score"));
    }
      
     public void addWindowSetters(JButton t, JButton a, JButton d,
            JButton s,ActionListener al,ActionListener gk) {
        t.addActionListener(al);
        d.addActionListener(al);
        s.addActionListener(al);
        //add gameKillers too
        s.addActionListener(gk);
    }

        public void t_setup(Stats st, JButton tbutton) {
        	st.incrementThrowaways();
        	tbutton.setText(String.valueOf(st.getThrowaways()));
    }
        public void a_setup(Stats st, JButton abutton, Game g) {
        	st.incrementAssists();
        	abutton.setText(String.valueOf(st.getAssists()));
    }
        public void d_setup(Stats st, JButton dbutton) {
        	st.incrementDrops();
        	dbutton.setText(String.valueOf(st.getDrops()));
    }
        public void s_setup(Stats st, JButton sbutton, Game g) {
        	st.incrementScores();
                //g.IncrementScore(1);
        	sbutton.setText(String.valueOf(st.getScores()));
    }
//        public void scoreIncrementer(Game g) {
//            g.IncrementScore(1);
//        }



}
