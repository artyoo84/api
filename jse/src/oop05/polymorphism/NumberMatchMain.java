package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		NumberMatchService nm = new NumberMatchServiceImpl();
		System.out.println("1부터 2까지 정수만 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int comVal = nm.makeComVal();
		System.out.println("플레이어는 "+ input);
		System.out.println("컴퓨터는 " +nm.makeComVal());
		System.out.println(nm.display());
	}
}
