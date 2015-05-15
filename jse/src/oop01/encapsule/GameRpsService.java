package oop01.encapsule;

/*
 date : 2015.05.15
 author : Yoo eun gyu
 Description : ����, ����, �� ���ӳ���
 1�� ������ 2�� ���� 3�� ��
 */
import java.util.Scanner;

public class GameRpsService {

	public void gameStart() {
	GameRPSValidation valid = new GameRPSValidation();
	GameRpsVO vo = new GameRpsVO();
		while(true){
			System.out.println("���� : 1|���� : 2|�� : 3 |�� �Է��غ����� ");
			Scanner scanner = new Scanner(System.in);
			//GameRPSValidation valid = new GameRPSValidation();
		try{
			// �÷��̾� �� �ޱ�
			int player = scanner.nextInt();
			//====== 1~3���� �ƴѰ�� ======
			if(player<1 || player>3){ 	 
			System.out.println(valid.showMsg());
			continue;
			}
			String playerValue="";
			switch (player) {
			case 1: 
				vo.setScissors(player);
				playerValue =vo.getScissors();
				break;
			case 2: 
				vo.setRock(player);
				playerValue =vo.getRock();
				break;
			default:
				vo.setPaper(player);
				playerValue = vo.getPaper();
				break;
			}
			// ��ǻ�� �� �ޱ� 
			int computer = valid.comRandomValue();
			String computerValue ="";
			switch (computer) {
			case 1: 
				vo.setScissors(computer);
				computerValue =vo.getScissors();
				break;
			case 2: 
				vo.setRock(computer);
				computerValue =vo.getRock();
				break;
			default:
				vo.setPaper(computer);
				computerValue = vo.getPaper();
				break;
			}
			
			String value = "";
			if(player == computer){
				value = "�����ϴ�. ";
			}else if
			( ((player==1)&&(computer==3)) ||
			  ((player==2)&&(computer==1)) || 
			  ((player==3)&&(computer==2)) )
			{ 
				value = "�̰���ϴ�. ";	
			}else{
				value = "�����ϴ�.";
			}

			
			System.out.println("����� " + playerValue +"�� �½��ϴ�. ");
			
			System.out.println("��ǻ�ʹ�" + computerValue + "�� �½��ϴ�.");
			System.out.println("����� " + value );
			}catch(Exception ex){
				ex.printStackTrace();
				continue;
		}
		}
		}
}
