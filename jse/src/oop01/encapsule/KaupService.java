package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO vo = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ��� : ");
		double height = scanner.nextDouble();
		vo.setHeight(height);
		System.out.println("�����Ը� �Է��ϼ��� : ");
		double weight = scanner.nextDouble();
		vo.setWeight(weight);
		
		vo.setIdx(); 
		vo.setMsg(" ");
		
		System.out.println(vo.toString());
		System.out.println("�Ϸ�");
	}
}
