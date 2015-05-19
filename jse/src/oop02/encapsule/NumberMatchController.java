package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		NumberMatchService sv = new NumberMatchService();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("총 3회만 입력합니다.");
		System.out.println("1부터 4까지 정수만 입력하세요");
		int input = scanner.nextInt();
		sv.start(input);
	}
}
