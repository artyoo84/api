package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	
	public static void main(String[] args) {
		AverageA a = new AverageA();
		a.name = "헐크";
		a.kor = 80;
		a.eng = 73;
		int tot = a.kor + a.eng;
		double avg = tot/2d; //
		System.out.println("==="+a.name+"의 성적표 ===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점 ");
		System.out.println("");
		// 아이언 
		a.name = "아이언";
		a.kor = 80;
		a.eng = 80;
		tot = a.kor + a.eng;
		avg = tot/2;
		System.out.println("==="+a.name+"의 성적표 ===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점 ");
		System.out.println("");
		// 토르 
		a.name = "토르";
		a.kor = 60;
		a.eng = 90;
		tot = a.kor + a.eng;
		avg = tot/2;
		System.out.println("==="+a.name+"의 성적표 ===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점 ");
		System.out.println("");
	}
}
