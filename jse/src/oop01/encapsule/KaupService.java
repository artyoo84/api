package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO vo = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요 : ");
		double height = scanner.nextDouble();
		vo.setHeight(height);
		System.out.println("몸무게를 입력하세요 : ");
		double weight = scanner.nextDouble();
		vo.setWeight(weight);
		
		vo.setIdx(); 
		vo.setMsg(" ");
		
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}
