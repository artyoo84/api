package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	boolean msg;
	
	@Override
	public int makeComVal() {
		int num = (int)((Math.random()*3)+1);
		return num;
	}

	/*
	�ΰ��� �Ķ���͸� ���ؼ� ��ġ�ϸ� true
	�ٸ��� false ����
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
			return "�÷��̾��� �¸�";
		}else {
			return "��ǻ���� �¸�";
		}
	}

}
