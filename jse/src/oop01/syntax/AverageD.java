package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService as = new AverageService();
		
		String name = "ÇæÅ©";
		int kor = 95;
		int eng = 80;
		as.setUser(name, kor, eng);
		System.out.println("ÀÌ¸§ :"+name);
		System.out.println("±¹¾î :"+kor);
		System.out.println("±¹¾î :"+eng);
		System.out.println("ÃÑÁ¡ : "+as.tot());
		System.out.println("Æò±Õ : "+as.avg());
	}
}
