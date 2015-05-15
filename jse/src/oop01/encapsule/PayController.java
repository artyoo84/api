package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		PayService SV = new PayService();// SV객체 생성

		System.out.println("이름을 입력하세요 ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("급여를 입력하세요 ");
		Scanner scanner2 = new Scanner(System.in);
		int salary = scanner2.nextInt();
		
		SV.name(name); // 이름
		SV.salary(salary); //월급 
		System.out.println("===== 급여 내역 =====");
		System.out.println("성명 : " + name);
		System.out.println("월급 : " + salary);
		System.out.println("세금 : " + (int)SV.taxer());
		System.out.println("실수령액 : " + (int)SV.calculation());
	}
}
