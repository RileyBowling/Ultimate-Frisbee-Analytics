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
public class GameMenu extends JPanel {

    public GameMenu(Game game, JTextField disp, ActionListener a,
            ActionListener gk) {
        
        setLayout(new FlowLayout());
//        setLayout(new GridLayout(2,1));
//        getWindow().setLayout(new CardLayout());
//        JPanel parent = new JPanel( new GridLayout(2,1));
        
        
        Team team = game.getTeam();
//        JPanel flow = new JPanel(new FlowLayout());
        //player column
        JPanel playerDisplay = new JPanel();
//        flow.add(playerDisplay);
        add(playerDisplay);
        GridLayout g1 = new GridLayout(team.getTeamSize()+1,1);
        g1.setHgap(30);
        g1.setVgap(30);
        playerDisplay.setLayout(g1);
        playerDisplay.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        playerDisplay.add(new JLabel("Players"));
        
        //scoring column
        JPanel scoreDisplay = new JPanel();
//        flow.add(scoreDisplay);
        add(scoreDisplay);
        GridLayout g2 = new GridLayout(team.getTeamSize()+1,4);
        
        g2.setHgap(10);
        g2.setVgap(20);
        scoreDisplay.setLayout(g2);
        scoreDisplay.setBorder(BorderFactory.createEmptyBorder(0,30,0,0));
        scoreButtonLabeler(scoreDisplay);
        
//        JPanel gameScorePnl = new JPanel();
//        JLabel g_scoreLbl = new JLabel("Game Score"); 
//        g_scoreDisplay = new JTextField(10);
//        g_scoreDisplay.setEditable(false);
//        gameScorePnl.add(g_scoreLbl);
//        gameScorePnl.add(g_scoreDisplay);
        
        
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
                                t_setup(st,tbutton);

        		} 
        	});
        	
        	JButton abutton = new JButton("0");
        	scoreDisplay.add(abutton);
        	abutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			a_setup(st,abutton,game);
                                //game.IncrementEnemyScore(1);
                                updateTotScore(game,disp);
        		} 
        	});
        	
        	JButton dbutton = new JButton("0");
        	scoreDisplay.add(dbutton);
        	dbutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			d_setup(st,dbutton);
        		} 
        	});
        	
        	JButton sbutton = new JButton("0");
        	scoreDisplay.add(sbutton);
        	sbutton.addActionListener(new ActionListener() { 
        		public void actionPerformed(ActionEvent e) { 
        			Stats st = player.getStats(game);
        			s_setup(st,sbutton,game);
                                game.IncrementScore(1);
//                                scoreIncrementer(game);
                                updateTotScore(game,disp);

//=======
        			
        			// updateScore();
//>>>>>>> 885ade9cde3aa26e8fc387fee5c906e52ee46691

        		} 
        	});
                addWindowSetters(tbutton,abutton,dbutton,sbutton,a,gk);
                //sbutton.addActionListener(o);
//                sbutton.addActionListener(d);
                //abutton.addActionListener(d);
        }
//<<<<<<< HEAD
        

        

//=======
        
        
//        add(flow);
//        add(gameScorePnl);

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
//    public JTextField getScoreDisplay() {
//        return g_scoreDisplay;
//    }
    public void addWindowSetters(JButton t, JButton a_, JButton d,
            JButton s,ActionListener a, ActionListener gk) {
        
    }
    public void scoreButtonLabeler (JPanel jp){
//////        jp.add(new JLabel("T"));
//////        jp.add(new JLabel("A"));
//////        jp.add(new JLabel("D"));
//////        jp.add(new JLabel("S"));
    }
    public void t_setup(Stats st, JButton tbutton) {

    }
        public void a_setup(Stats st, JButton abutton, Game g) {

    }
        public void d_setup(Stats st, JButton dbutton) {

    }
        public void s_setup(Stats st, JButton sbutton, Game g) {

    }
//        public void scoreIncrementer(Game g) {
//            
//        }
    public void removeWindow(JPanel parent) {
           
    }
    
}
