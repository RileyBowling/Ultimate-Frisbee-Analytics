/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zohair, Riley
 */
public class Main {
        public static void main(String[] args) {
        	//in the final version all of this code will happen through the full GUI and we'll only have to initialize UltimateSystem
        	//this is manual testing of just the game menu GUI
        
        	Player p1 = new Player("John Smith", "Speedy J", 1);
        	Player p2 = new Player("Carl Carlson", "FrizMaster", 13);
        	Player p3 = new Player("Sarah Jones", "The Destroyer", 97);
        	Player p4 = new Player("Larry Johnson", "Lovely Larry", 8);
        	Player p5 = new Player("Abby Darma", "Eagle Eyes", 59);
        	
        	Team team = new Team("Frisbee Freaks");
        	
        	team.addPlayer(p1);
        	team.addPlayer(p2);
        	team.addPlayer(p3);
        	team.addPlayer(p4);
        	team.addPlayer(p5);
        	
        	Game game = new Game(team, "The Bad Guys");
        	
        	GameMenu window = new GameMenu(game);
        	window.setVisible(true);
        	
        	//this is all the code we'll need in the end
        	//UltimateMenu ult = new UltimateMenu();
        	//ult.setVisible(true);
    }
        
}
