package oop01.syntax;

public class AverageService {
		// vo�� �ִ� avg(), tot() �޼ҵ带 
		// ���񽺿��� ó���ϵ��� ���ּ��� 
	AverageDVO vo = new AverageDVO();
    
	public void  setUser(String name, int kor, int eng) {
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}
	
	public int tot() {
		int tot = vo.getKor() + vo.getEng();
		return tot;
	}
	public double avg() {
		double avg = (vo.getKor() + vo.getEng())/2;
		return avg;
	}
}
