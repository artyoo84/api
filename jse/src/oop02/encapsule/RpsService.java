package oop02.encapsule;

import java.lang.invoke.SwitchPoint;

public class RpsService {
	RpsUtil ut = new RpsUtil();
	RpsVO vo = new RpsVO();
	int player;

	// ��ǻ�Ͱ� �������� �߻���Ų �� 1~3 ����
	public int displayComVal() {

		return (int) ((Math.random() * 3) + 1);
	}

	// ���ڸ� �����ִ� ����
	public String showWinner(int player, int computer) {
		String winner = "";
	/*	if (player == computer) {
			winner = "�÷��̾�� ��ǻ�ʹ� �����ϴ�.";
		} else if (((player == 1) && (computer == 3))
				||    ((player == 2) && (computer == 1))
				||    ((player == 3) && (computer == 2))) {
			winner = "�÷��̾ �̰���ϴ�.";
		} else {
			winner = "��ǻ�Ͱ� �����ϴ�.";
		}
		return winner;
	}*/
	switch(player-computer){
	case 0 : winner = "�÷��̾�� ��ǻ�ʹ� �����ϴ�."; break;
	case 1 : case -2:
		winner = "�÷��̾ �̰���ϴ�."; break;
	default : winner = "�÷��̾ �����ϴ�."; break;
	}
	return winner;
	}
	
	
	
	// ���ڿ� �Ҵ�� ����,����,���� ���ڷ� ��ȯ�ؼ� �����ִ� ��Ȱ
	public String showRpaVal(int playerVal) {
		String pv = "";
		switch (playerVal) {
		case 1: pv = "����"; vo.setScissors(1); break;
		case 2: pv = "����"; vo.setRock(2); break;
		default: pv = "��";  vo.setPaper(3);break;
		}
		return pv;
	}
}
