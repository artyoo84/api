package oop01.encapsule;

public class GameRpsVO {
	int rock, paper, scissors; // 바위 보 가위
		//2 ,3,1
	public String getRock() {
		return "rock";
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public String getPaper() {
		return "paper";
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public String getScissors() {
		return "scissors";
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
}
