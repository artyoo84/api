package oop01.encapsule;

import java.util.Scanner;

public class NumberMatchService {
	NumberMatchVO vo = new NumberMatchVO();
	
	int result;
	public int game(int com, int player) {

		if (vo.getPlayer() == vo.getCom()) {
			System.out.println("컴퓨터가 선택한 값은 " + vo.getCom() + "입니다.");
			System.out.println(vo.getPlayer() + "정답 !!");
			result = 1;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + vo.getCom() + "입니다.");
			result = 0;
		}
		return result;
	}
//==================================
	public void start(int inputParam) {
		
			try {
				int input = inputParam;
				vo.setPlayer(input);

			} catch (Exception e) {
				System.out.println("오류 발생");
			}
//--------------------------------------------------------
			if (vo.getPlayer() == 0) {
				System.out.println("다시 입력해 주십시오");
			} else {
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}

			if (result == 1) {
				System.out.println("맞췄습니다. " + "게임을 종료합니다.");
			 // 정답일경우 종료
			} else{
				System.out.println("게임에서 패배했습니다."
						+ "\n게임을 종료합니다.");
				
			}

	}
}
