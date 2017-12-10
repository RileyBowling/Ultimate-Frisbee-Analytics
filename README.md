# Ultimate Frisbee Analytics
# A Final Project for CS 2300 at Saint Louis University

Group: Riley, Zohair, Amy

Project Objective:
(given by our simulated clients)
Create an application for tracking statistics in the sport Ultimate Frisbee.

Project Overview:
We made a program that gives the full funcionality needed for storing Ultimate Frisbee match statistics. This includes sorting games by Tournamment, 
team creation, player creation and of course live stat tracking. 

The first menu let's you make tournaments and teams which you can add players to (the "New Tournament/Team" buttons). From there you can 
view the created teams and their players("Teams") or choose tournaments and create individual games within them("Tournaments" button and 
the subsequent "New Game" button). Once you make a game you are brought to the stat tracking window where you can keep track of all the 
various plays in an Ultimate Frisbee game. Finally, you can browse the archived stats of games you've already made in a tournament("Games").

Project Notes: 
We realize there are a few things a stat tracking app you'd find in the real world would have that our project does not. Firstly edit/delete 
functionality. We decided to hold off on implementing it simply because our hands were full enough creating the full front-end without 
managing edit windows and delete buttons. The setter/remove methods and logic is all there if somebody did want to add that functionality. 
Secondly, the application doesn't save information in between sessions. Every time you run it you have to make new teams, players, etc. 
It would be fairly easy to incorporate storage methods, by putting the data currently held in data structure in text files for 
example. It's still a fully capable stat tracker you would just need to never close it if you wanted to track things over the course of 
long periods of time. 

The nice thing about proper OOD is we've build a strong enough foundation that it would be pretty straightforward to fix these issues and 
also add other new features. One idea we discussed was global player stats ("season stats" for players that track over an entire tournament
instead of just one game), from there you could even generate graphs and track your improvement as a player. Other expansion examples are 
player pictures and (much more ambitious) match outcome predictions.  
