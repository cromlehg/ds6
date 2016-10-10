package ru.ds.ds6sticks.model.tests;

import java.util.Scanner;

public class Palochki {

	public static void main(String[] args) {

		int palochki;
		palochki = 20;
		int skolko_Vasya;
		int vzyal_komp = 1;
		Scanner in = new Scanner(System.in);

		System.out.println("���������� ������� = " + palochki);
		System.out.println("�������� ����");

		for (int i = 1; i < 20; i++) {
			System.out.println("������� ���� ����� �������?");
			skolko_Vasya = in.nextInt();
			if (skolko_Vasya > 3) {
				System.out.println("����� ����� 1, 2 ��� ��� �������. ������� ���� ����� �������?");
				skolko_Vasya = in.nextInt();
			}

			palochki = palochki - skolko_Vasya;
			System.out.println("���������� ������� = " + palochki);
			if (palochki == 0) {
				System.out.println("������� ����");
				break;
			}
			System.out.println("���� ����� ���� �������");
			palochki = palochki - vzyal_komp;
			System.out.println("���������� ������� = " + palochki);
			if (palochki == 0) {
				System.out.println("������� ����");
				System.out.println("���������� ������� = " + palochki);
				break;
			}
		}
	}
}