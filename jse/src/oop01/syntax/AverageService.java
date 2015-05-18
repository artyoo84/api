package oop01.syntax;

public class AverageService {
		// vo에 있던 avg(), tot() 메소드를 
		// 서비스에서 처리하도록 해주세요 
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
