package cmm03.flow;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		//System.out.println("��� ������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int avg = 0;
		do
		{
			System.out.println("��� ������ �Է��ϼ���");
			avg = scanner.nextInt();
		} while(avg > 100);
		
		String result = "";
		
			/*if (avg > 100){
			System.out.println("�ٽ� �Է��ϼ���");
			avg = scanner.nextInt();
		}*/
		
		if (avg >= 70) {
			result = "�հ�";
		}
		if (avg >= 70) {
			result = "�հ�";
		} else {
			result = "�޽���";
		}
		
		// ��� ������ ���� �� �������ϱ�

		/*
		 * if (avg >= 90) { grade = 'A'; } else if (avg >= 80) { grade = 'B'; }
		 * else if (avg >= 70) { grade = 'C'; } else if (avg >= 60) { grade =
		 * 'D'; } else { grade = 'F'; }
		 */
		char grade = 'F';
		switch (avg / 10) {
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default:grade = 'F'; break;
		}

		// �� if else # Switch # �ٲٽÿ�
		System.out.println("���ϴ� " + result + " �̸�, ������ " + grade + " �Դϴ�.");
	}
}
