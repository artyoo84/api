package oop02.encapsule;

public class GameRPSValidation {

	public String showMsg() {
		String msg = "�߸��� �Է� �Դϴ�.";
		return msg;
	}

	public int comRandomValue() {
		int computer = (int)((Math.random()*3)+1); 
		return computer;
	}
	
}
