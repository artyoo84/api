package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		Pay pay = new Pay(); // ���������� �����ϴ� ��� 
		pay.name = "��ũ";
		pay.salary = (int)(3000000*(1-TAX));
		System.out.println("=== "+pay.name+ "�� 5���� �Ǳ޿���"+pay.salary+"���� �Դϴ�.");
		pay.name = "���̾�";
		pay.salary = (int)(5000000*(1-TAX));
		System.out.println("=== "+pay.name+ "�� 5���� �Ǳ޿���"+pay.salary+"���� �Դϴ�.");
		pay.name = "�丣";
		pay.salary = (int)(100000*(1-TAX));
		System.out.println("=== "+pay.name+ "�� 5���� �Ǳ޿���"+pay.salary+"���� �Դϴ�.");
	}
}
