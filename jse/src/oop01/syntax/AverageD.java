package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService as = new AverageService();
		
		String name = "��ũ";
		int kor = 95;
		int eng = 80;
		as.setUser(name, kor, eng);
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+kor);
		System.out.println("���� :"+eng);
		System.out.println("���� : "+as.tot());
		System.out.println("��� : "+as.avg());
	}
}
