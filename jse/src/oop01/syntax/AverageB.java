package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*�޼ҵ带 ���⿡ �����ϼż�
	�޼ҵ��� ��üȭ�� ���ּ���
	*/
	public int tot(int kor,int eng) {
		int tot = kor+eng;
		return tot;
	}
	public double avg() {
		 double avg = tot(kor,eng)/ 2d;
		return avg;
	}
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
/*		AverageB iron = new AverageB();
		AverageB thor = new AverageB();*/
		hulk.name = "��ũ";
		hulk.kor=80;
		hulk.eng=50;
		System.out.println("==="+hulk.name+"�� ����ǥ ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+hulk.tot(hulk.kor,hulk.eng)+"��");
		System.out.println("��� : 500��");
		System.out.println("");
	}
}
