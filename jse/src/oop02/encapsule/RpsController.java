package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		
		System.out.println("���������� ������ �������ϴ�.");
		System.out.println("1.����, 2.����, 3.���ڱ� �� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		System.out.println("�÷��̾�� "+ service.showRpaVal(playerVal)+"�� �½��ϴ�.");
		int comVal = service.displayComVal();
		System.out.println("��ǻ�ʹ� "+ service.showRpaVal(comVal)+"�� �½��ϴ�.");
		String winner = service.showWinner(playerVal,comVal);
		System.out.println(winner);
	}
}
