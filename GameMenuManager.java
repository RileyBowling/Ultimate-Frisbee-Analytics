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
        CardLayout cardlayout = new CardLayout();
        window.setLayout(cardlayout);
        o_window = new OffensiveMenu(game, new o_window_set(window,cardlayout)
        ,new d_window_set(window,cardlayout));
        d_window = new DefensiveMenu(game, new o_window_set(window,cardlayout)
        ,new d_window_set(window,cardlayout));
        window.add(o_window,"o");
        window.add(d_window, "d");
        cardlayout.show(window, s);
       
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
                c.show(win, "d");
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
                c.show(win, "o");
        }
        
    }
}
