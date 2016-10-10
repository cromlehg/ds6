package ru.ds.ds6sticks.model;

public class AIPlayer extends Player {

	int getAI = 1;

	
	@Override
	int getStick(int sticks) {
		return sticks = sticks - getAI;
	}

}
