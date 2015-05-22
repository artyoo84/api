package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{
	
	@Override
	// 컴퓨터 숫자 
	public int displayComval() {
		int comVal=(int) ((Math.random() * 3) + 1);
		return comVal;
	}

	@Override
	public String showWinner(int playerVal, int comVal) {
		String winner = "";
		switch(playerVal - comVal){
		case 0 : winner = "플레이어와 컴퓨터는 비겼습니다."; break;
		case 1 : case -2:
			winner = "플레이어가 이겼습니다."; break;
		default : winner = "플레이어가 졌습니다."; break;
		}
		return winner;
	}

	// 숫자에 할당된 가위,바위,보를 문자로 전환해서 보여주는 역활
	@Override
	public String showRpsVal(int playerVal) {
		String pv = "";
		switch (playerVal) {
		case 1: pv = "가위";  break;
		case 2: pv = "바위";  break;
		default: pv = "보";  break;
		}
		return pv;
	}

}
