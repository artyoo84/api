package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	
	public  AverageEVO() {
		//����Ʈ������ ���� �ۼ� 
	} 
	public AverageEVO(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public int tot(){
		int tot = kor+eng;
		return tot;
	}
	
	public double avg() {
		double avg = (kor+eng)/2d;
		return avg;
	}
	
	
}
