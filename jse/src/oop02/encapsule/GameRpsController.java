package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		GameRpsService sv = new GameRpsService();
		System.out.println("가위바위보 게임을 시작합니다.");
		sv.gameStart();
	}
}
