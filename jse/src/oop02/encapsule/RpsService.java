package oop02.encapsule;

import java.lang.invoke.SwitchPoint;

public class RpsService {
	RpsUtil ut = new RpsUtil();
	RpsVO vo = new RpsVO();
	int player;

	// 컴퓨터가 랜덤으로 발생시킨 수 1~3 까지
	public int displayComVal() {

		return (int) ((Math.random() * 3) + 1);
	}

	// 승자를 보여주는 로직
	public String showWinner(int player, int computer) {
		String winner = "";
	/*	if (player == computer) {
			winner = "플레이어와 컴퓨터는 비겼습니다.";
		} else if (((player == 1) && (computer == 3))
				||    ((player == 2) && (computer == 1))
				||    ((player == 3) && (computer == 2))) {
			winner = "플레이어가 이겼습니다.";
		} else {
			winner = "컴퓨터가 졌습니다.";
		}
		return winner;
	}*/
	switch(player-computer){
	case 0 : winner = "플레이어와 컴퓨터는 비겼습니다."; break;
	case 1 : case -2:
		winner = "플레이어가 이겼습니다."; break;
	default : winner = "플레이어가 졌습니다."; break;
	}
	return winner;
	}
	
	
	
	// 숫자에 할당된 가위,바위,보를 문자로 전환해서 보여주는 역활
	public String showRpaVal(int playerVal) {
		String pv = "";
		switch (playerVal) {
		case 1: pv = "가위"; vo.setScissors(1); break;
		case 2: pv = "바위"; vo.setRock(2); break;
		default: pv = "보";  vo.setPaper(3);break;
		}
		return pv;
	}
}
