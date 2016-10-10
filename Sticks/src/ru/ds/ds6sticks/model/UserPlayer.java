package ru.ds.ds6sticks.model;

import java.util.Scanner;

public class UserPlayer extends Player {

	 int getPlayer;
	Scanner in = new Scanner(System.in);

	int getStick(int sticks) {
		getPlayer = in.nextInt();
		return sticks = sticks - getPlayer;
	}

}
