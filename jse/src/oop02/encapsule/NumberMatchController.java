package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		NumberMatchService sv = new NumberMatchService();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("�� 3ȸ�� �Է��մϴ�.");
		System.out.println("1���� 4���� ������ �Է��ϼ���");
		int input = scanner.nextInt();
		sv.start(input);
	}
}
