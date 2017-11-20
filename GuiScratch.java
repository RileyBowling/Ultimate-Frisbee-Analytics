/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiscratch;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author Zohair
 */
public class GuiScratch extends JFrame {
    



    public GuiScratch() {
        super("Ultimate Frisbee Score Keeper");
        JPanel parent = new JPanel();
        add(parent);
        setSize(700,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel players = new JPanel();
        GridLayout f = new GridLayout(8,0);
        f.setHgap(30);
        f.setVgap(30);
        players.setLayout(f);
        
        players.setBorder(BorderFactory.createEmptyBorder(30,50,10,10));

        
        players.add(new JLabel("Players"));
          JLabel p1 = new JLabel("Z");
          JLabel p2 = new JLabel("D");
          JLabel p3 = new JLabel("R");
          JLabel p4 = new JLabel("E");
          JLabel p5 = new JLabel("A");
          JLabel p6 = new JLabel("N");
          JLabel p7 = new JLabel("K");
          JLabel[] play_arr = {p1,p2,p3,p4,p5,p6,p7};
//          for (JLabel j: play_arr) {
//              players.add(j);
//          }
          

        parent.add(players);
        
        JPanel o_grid = new JPanel();
        GridLayout g = new GridLayout(7,2);
        
        for (int i = 0; i < 7; i++) {
            o_grid.add(play_arr[i]);
            o_grid.add(new JButton("T"));
            o_grid.add(new JButton("A"));
            o_grid.add(new JButton("D"));
            o_grid.add(new JButton("S"));
        }
        
        o_grid.setBorder(BorderFactory.createEmptyBorder(100,50,10,10));
        g.setHgap(30);
        g.setVgap(30);
        o_grid.setLayout(g);
        parent.add(o_grid);
        

        
        
        
        
        
//        JPanel card1 = new JPanel();
//        card1.add(new JButton("Button 2"));
//        JPanel card2 = new JPanel(new CardLayout());
//        card2.add(card1);
//        add(card1);
    }
    public void addPlayer(JPanel p, String name) {
        p.add(new JLabel(name));
    }
    
}
