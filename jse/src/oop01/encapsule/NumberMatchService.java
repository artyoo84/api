package oop01.encapsule;

import java.util.Scanner;

public class NumberMatchService {
	NumberMatchVO vo = new NumberMatchVO();
	
	int result;
	public int game(int com, int player) {

		if (vo.getPlayer() == vo.getCom()) {
			System.out.println("��ǻ�Ͱ� ������ ���� " + vo.getCom() + "�Դϴ�.");
			System.out.println(vo.getPlayer() + "���� !!");
			result = 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + vo.getCom() + "�Դϴ�.");
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
				System.out.println("���� �߻�");
			}
//--------------------------------------------------------
			if (vo.getPlayer() == 0) {
				System.out.println("�ٽ� �Է��� �ֽʽÿ�");
			} else {
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}

			if (result == 1) {
				System.out.println("������ϴ�. " + "������ �����մϴ�.");
			 // �����ϰ�� ����
			} else{
				System.out.println("���ӿ��� �й��߽��ϴ�."
						+ "\n������ �����մϴ�.");
				
			}

	}
}
