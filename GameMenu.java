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
public class GameMenu extends UltimateMenu {

    public GameMenu(Game game) {
        makeWindow();
        
        Team team = game.getTeam();
        JPanel flow = new JPanel(new FlowLayout());
        //player column
        JPanel playerDisplay = new JPanel();
        flow.add(playerDisplay);
        GridLayout g1 = new GridLayout(team.getTeamSize()+1,1);
        g1.setHgap(30);
        g1.setVgap(30);
        playerDisplay.setLayout(g1);
        playerDisplay.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        playerDisplay.add(new JLabel("Players"));
        
        //scoring column
        JPanel scoreDisplay = new JPanel();
        flow.add(scoreDisplay);
        GridLayout g2 = new GridLayout(team.getTeamSize()+1,4);
        
        g2.setHgap(10);
        g2.setVgap(20);
        scoreDisplay.setLayout(g2);
        scoreDisplay.setBorder(BorderFactory.createEmptyBorder(0,30,0,0));
        scoreDisplay.add(new JLabel("T"));
        scoreDisplay.add(new JLabel("A"));
        scoreDisplay.add(new JLabel("D"));
        scoreDisplay.add(new JLabel("S"));
        //probably a better way to fill empty grid spots
        
        JPanel gameScorePnl = new JPanel();
        JLabel g_scoreLbl = new JLabel("Game Score"); 
        JTextField g_scoreDisplay = new JTextField(10);
        g_scoreDisplay.setEditable(false);
        gameScorePnl.add(g_scoreLbl);
        gameScorePnl.add(g_scoreDisplay);
        
        
        ListIterator<Player> players = team.getPlayerIterator();
        while (players.hasNext()) {
        	Player player = players.next();
        	player.addStats(new Stats(game));
        	
        	playerDisplay.add(new JLabel(player.getNickname()));
        	
        	JButton tbutton = new JButton("0");
        	scoreDisplay.add(tbutton);
        	tbutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			st.incrementThrowaways();
        			tbutton.setText(String.valueOf(st.getThrowaways()));
        		} 
        	});
        	
        	JButton abutton = new JButton("0");
        	scoreDisplay.add(abutton);
        	abutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			st.incrementAssists();
        			abutton.setText(String.valueOf(st.getAssists()));
        		} 
        	});
        	
        	JButton dbutton = new JButton("0");
        	scoreDisplay.add(dbutton);
        	dbutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			st.incrementDrops();
        			dbutton.setText(String.valueOf(st.getDrops()));
        		} 
        	});
        	
        	JButton sbutton = new JButton("0");
        	scoreDisplay.add(sbutton);
        	sbutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			st.incrementScores();
                                game.IncrementScore(1);
//<<<<<<< HEAD
                                updateTotScore(game,g_scoreDisplay);
//=======
        			
        			// updateScore();
//>>>>>>> 885ade9cde3aa26e8fc387fee5c906e52ee46691
        			sbutton.setText(String.valueOf(st.getScores()));
        		} 
        	});
        }
//<<<<<<< HEAD
        

        

//=======
        
        JPanel parent = new JPanel( new GridLayout(2,1));
        parent.add(flow);
        parent.add(gameScorePnl);
        getWindow().add(parent);
//        getWindow().add(playerDisplay);
//        getWindow().add(scoreDisplay);
//        getWindow().add(g_scoreLbl);
//        getWindow().add(g_scoreDisplay);


//>>>>>>> 885ade9cde3aa26e8fc387fee5c906e52ee46691
        
//        JPanel card1 = new JPanel();
//        card1.add(new JButton("Button 2"));
//        JPanel card2 = new JPanel(new CardLayout());
//        card2.add(card1);
//        add(card1);
    }
    public void updateTotScore(Game g,JTextField f) {
        String game_score = String.valueOf(g.getOurScore()) + 
            "-"+String.valueOf(g.getEnemyScore());
        f.setText(game_score);
    }

    
}
