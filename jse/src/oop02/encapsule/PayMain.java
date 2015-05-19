package oop02.encapsule;

public class PayMain {
	public static void main(String[] args) {
		String name;
		int salary; // 월급
		int tax; //세금
		int income;  //소득
		
		/*
		공식 ...
		income = salary - tax;
		소득 = 월급 - 세금 
		세금 = 월급 * 세금 
		payVO :getter, setter
		payService : 계산로직
		PayController : 입출력만 존재
		세개로 분할하세요
		이름과 급여는 입력받아서 
		세율 뺸 실 소득을 구하는 로직을 만드시오 
		*/
		
		System.out.println("===== 급여 내역 =====");
		System.out.println("성명 : ");
		System.out.println("월급 : ");
		System.out.println("세금 : ");
		System.out.println("실수령액 : ");
		
	}
}
