package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		GameRpsService sv = new GameRpsService();
		System.out.println("���������� ������ �����մϴ�.");
		sv.gameStart();
	}
}
