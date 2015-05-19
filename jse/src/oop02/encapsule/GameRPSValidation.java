package oop02.encapsule;

public class GameRPSValidation {

	public String showMsg() {
		String msg = "잘못된 입력 입니다.";
		return msg;
	}

	public int comRandomValue() {
		int computer = (int)((Math.random()*3)+1); 
		return computer;
	}
	
}
