package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{
	
	@Override
	// ��ǻ�� ���� 
	public int displayComval() {
		int comVal=(int) ((Math.random() * 3) + 1);
		return comVal;
	}

	@Override
	public String showWinner(int playerVal, int comVal) {
		String winner = "";
		switch(playerVal - comVal){
		case 0 : winner = "�÷��̾�� ��ǻ�ʹ� �����ϴ�."; break;
		case 1 : case -2:
			winner = "�÷��̾ �̰���ϴ�."; break;
		default : winner = "�÷��̾ �����ϴ�."; break;
		}
		return winner;
	}

	// ���ڿ� �Ҵ�� ����,����,���� ���ڷ� ��ȯ�ؼ� �����ִ� ��Ȱ
	@Override
	public String showRpsVal(int playerVal) {
		String pv = "";
		switch (playerVal) {
		case 1: pv = "����";  break;
		case 2: pv = "����";  break;
		default: pv = "��";  break;
		}
		return pv;
	}

}
