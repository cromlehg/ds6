package ru.ds.ds6sticks.model;

public class AIPlayer extends Player {

	String name;

	public AIPlayer(String name) {
		this.name = name;
	}

	int takeSticks() {
		return 3;
	}

	String getName() {
		return name;
	}

}
