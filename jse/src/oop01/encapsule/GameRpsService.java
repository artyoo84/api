package oop01.encapsule;

/*
 date : 2015.05.15
 author : Yoo eun gyu
 Description : 가위, 바위, 보 게임놀이
 1은 가위고 2는 바위 3은 보
 */
import java.util.Scanner;

public class GameRpsService {

	public void gameStart() {
	GameRPSValidation valid = new GameRPSValidation();
	GameRpsVO vo = new GameRpsVO();
		while(true){
			System.out.println("가위 : 1|바위 : 2|보 : 3 |을 입력해보세요 ");
			Scanner scanner = new Scanner(System.in);
			//GameRPSValidation valid = new GameRPSValidation();
		try{
			// 플레이어 값 받기
			int player = scanner.nextInt();
			//====== 1~3값이 아닌경우 ======
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
			// 컴퓨터 값 받기 
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
				value = "비겼습니다. ";
			}else if
			( ((player==1)&&(computer==3)) ||
			  ((player==2)&&(computer==1)) || 
			  ((player==3)&&(computer==2)) )
			{ 
				value = "이겼습니다. ";	
			}else{
				value = "졌습니다.";
			}

			
			System.out.println("당신은 " + playerValue +"를 냈습니다. ");
			
			System.out.println("컴퓨터는" + computerValue + "를 냈습니다.");
			System.out.println("결과는 " + value );
			}catch(Exception ex){
				ex.printStackTrace();
				continue;
		}
		}
		}
}
