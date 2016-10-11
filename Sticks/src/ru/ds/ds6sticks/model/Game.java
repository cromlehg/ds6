package ru.ds.ds6sticks.model;

import java.util.ArrayList;

public class Game {

	Player player1 = new AIPlayer("Komp");
	Player player2 = new UserPlayer("Vasya");

	int sticks = 20;

	boolean isFinished;
	
	int currentPlayerIndex = -1;
	
	ArrayList<String> player = new ArrayList();
	
	void addPlayers(Player player) {
		player.add(player);
	}
	
	void start() {
		isFinished = false;
		
	boolean Finished() {
		return isFinished;
	}
	
	void nextStep() {
		Player player = player.get(currentPlayerIndex);
		
	}
	}
	
}
