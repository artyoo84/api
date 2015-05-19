package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		
		System.out.println("가위바위보 게임을 시작힙니다.");
		System.out.println("1.가위, 2.바위, 3.보자기 를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		System.out.println("플레이어는 "+ service.showRpaVal(playerVal)+"를 냈습니다.");
		int comVal = service.displayComVal();
		System.out.println("컴퓨터는 "+ service.showRpaVal(comVal)+"를 냈습니다.");
		String winner = service.showWinner(playerVal,comVal);
		System.out.println(winner);
	}
}
