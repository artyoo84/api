package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		Pay pay = new Pay(); // 참조변수를 선언하는 방법 
		pay.name = "헐크";
		pay.salary = (int)(3000000*(1-TAX));
		System.out.println("=== "+pay.name+ "의 5월달 실급여는"+pay.salary+"만원 입니다.");
		pay.name = "아이언";
		pay.salary = (int)(5000000*(1-TAX));
		System.out.println("=== "+pay.name+ "의 5월달 실급여는"+pay.salary+"만원 입니다.");
		pay.name = "토르";
		pay.salary = (int)(100000*(1-TAX));
		System.out.println("=== "+pay.name+ "의 5월달 실급여는"+pay.salary+"만원 입니다.");
	}
}
