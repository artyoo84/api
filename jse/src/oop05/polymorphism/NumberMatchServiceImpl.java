package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	boolean msg;
	
	@Override
	public int makeComVal() {
		int num = (int)((Math.random()*3)+1);
		return num;
	}

	/*
	두개의 파라미터를 비교해서 일치하면 true
	다르면 false 리턴
	*/
	@Override
	public boolean match(int playVal, int comVal) {
		boolean msg;
		if (playVal == comVal){
			 return true;
		}else {
			return false;
		}
	}

	@Override
	public String display() {
		String dd = "";
		if (msg == true){
			return "플레이어의 승리";
		}else {
			return "컴퓨터의 승리";
		}
	}

}
