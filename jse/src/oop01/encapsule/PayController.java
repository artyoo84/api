package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		PayService SV = new PayService();// SV��ü ����

		System.out.println("�̸��� �Է��ϼ��� ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("�޿��� �Է��ϼ��� ");
		Scanner scanner2 = new Scanner(System.in);
		int salary = scanner2.nextInt();
		
		SV.name(name); // �̸�
		SV.salary(salary); //���� 
		System.out.println("===== �޿� ���� =====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + (int)SV.taxer());
		System.out.println("�Ǽ��ɾ� : " + (int)SV.calculation());
	}
}
