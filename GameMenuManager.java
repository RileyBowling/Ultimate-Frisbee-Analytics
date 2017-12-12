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
public class GameMenuManager extends UltimateMenu {

    private GameMenu o_window;
    private GameMenu d_window;
    
    public GameMenuManager(Game game, String s) {

        makeWindow();
        JPanel window = getWindow();
        JPanel card = new JPanel();
        CardLayout cardlayout = new CardLayout();
        card.setLayout(cardlayout);
        BoxLayout bl = new BoxLayout(window,BoxLayout.Y_AXIS);
        window.setLayout(bl);
        
        JPanel gameScorePnl = new JPanel();
        JLabel g_scoreLbl = new JLabel("Game Score"); 
        JTextField g_scoreDisplay = new JTextField(10);
        g_scoreDisplay.setEditable(false);
        gameScorePnl.add(g_scoreLbl);
        gameScorePnl.add(g_scoreDisplay);
        
        o_window = new OffensiveMenu(game, g_scoreDisplay,
                new d_window_set(card,cardlayout));
        d_window = new DefensiveMenu(game, g_scoreDisplay, 
                new o_window_set(card,cardlayout));
        card.add(o_window,"o");
        card.add(d_window, "d");
        cardlayout.show(card, s);
        
        window.add(card);
        window.add(gameScorePnl);
        

       
    }

    public class o_window_set implements ActionListener {
    	JPanel win;
        CardLayout c;
        public o_window_set(JPanel jp,CardLayout c) {
            win = jp;
            this.c = c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
                c.show(win, "o"); 
        }
        
    }
    public class d_window_set implements ActionListener {
        JPanel win;
        CardLayout c;
        public d_window_set(JPanel jp,CardLayout c) {
            win = jp;
            this.c = c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
                c.show(win, "d");
        }
        
    }
}
