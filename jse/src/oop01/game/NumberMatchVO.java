package oop01.game;

public class NumberMatchVO {
	private int player, com, count;
		
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		if(player < 1 || player > 4){
			System.out.println("1���� 4������ ������ �Է��ؾ� �մϴ�.");
		}else {
		this.player = player;
		}
	}

	public int getCom() {
		return com;
	}

	public void setCom() {
		this.com = (int) ((Math.random()*4)+1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
