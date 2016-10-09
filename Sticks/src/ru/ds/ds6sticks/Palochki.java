package ru.ds.ds6sticks;

import java.util.Scanner;

public class Palochki {

	public static void main(String[] args) {

		int palochki;
		palochki = 20;
		int skolko_Vasya;
		int vzyal_komp = 1;
		Scanner in = new Scanner(System.in);

		System.out.println("Количество палочек = " + palochki);
		System.out.println("начинаем игру");

		for (int i = 1; i < 20; i++) {
			System.out.println("Сколько Вася берет палочек?");
			skolko_Vasya = in.nextInt();
			if (skolko_Vasya > 3) {
				System.out.println("Нужно взять 1, 2 или три палочки. Сколько Вася берет палочек?");
				skolko_Vasya = in.nextInt();
			}

			palochki = palochki - skolko_Vasya;
			System.out.println("Количество палочек = " + palochki);
			if (palochki == 0) {
				System.out.println("Выиграл комп");
				break;
			}
			System.out.println("Комп берет одну палочку");
			palochki = palochki - vzyal_komp;
			System.out.println("Количество палочек = " + palochki);
			if (palochki == 0) {
				System.out.println("Выиграл Вася");
				System.out.println("Количество палочек = " + palochki);
				break;
			}
		}
	}
}