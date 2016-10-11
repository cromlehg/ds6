package ru.ds.ds6sticks.model;

public class UserPlayer extends Player {

	String name;

	public UserPlayer(String name) {
		this.name = name;
	}
	int takeSticks() {
		return 1;
	}

	String getName() {
		return name;
	}
}
