package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*메소드를 여기에 정의하셔서
	메소드의 객체화를 해주세요
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
		hulk.name = "헐크";
		hulk.kor=80;
		hulk.eng=50;
		System.out.println("==="+hulk.name+"의 성적표 ===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+hulk.tot(hulk.kor,hulk.eng)+"점");
		System.out.println("평균 : 500점");
		System.out.println("");
	}
}
