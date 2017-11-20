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
        setSize(600,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel players = new JPanel();
        GridLayout f = new GridLayout(8,0);
        f.setHgap(30);
        f.setVgap(30);
        players.setLayout(f);
        
        players.setBorder(BorderFactory.createEmptyBorder(30,50,10,10));

        
        players.add(new JLabel("Players"));
//        players.add(new JLabel("Z"));
//        players.add(new JLabel("D"));
//        players.add(new JLabel("R"));
//        players.add(new JLabel("E"));
//        players.add(new JLabel("K"));
//        players.add(new JLabel("A"));
//        players.add(new JLabel("N"));
        parent.add(players);
        
        JPanel tway = new JPanel();
        GridLayout g = new GridLayout(7,2);
        
        for (int i = 0; i < 7; i++) {
            tway.add(new JLabel("P"));
            tway.add(new JButton("T"));
            tway.add(new JButton("A"));
            tway.add(new JButton("D"));
            tway.add(new JButton("S"));
        }
        
        tway.setBorder(BorderFactory.createEmptyBorder(100,50,10,10));
        g.setHgap(30);
        g.setVgap(30);
        tway.setLayout(g);
        parent.add(tway);
        

        
        
        
        
        
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
