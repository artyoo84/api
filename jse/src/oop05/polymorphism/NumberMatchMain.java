package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		NumberMatchService nm = new NumberMatchServiceImpl();
		System.out.println("1���� 2���� ������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int comVal = nm.makeComVal();
		System.out.println("�÷��̾�� "+ input);
		System.out.println("��ǻ�ʹ� " +nm.makeComVal());
		System.out.println(nm.display());
	}
}
