package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo2 {
	public static void main(String[] args) {
		   int kor=90,eng=85,sum=0;
		      double avg=0;
		      String msg = "�޽���";
		      sum=kor+eng;
		      avg = sum/2.0;
		      // ���ǿ� ���� if ó��
		      /*
		       * ����� 100���̸� "���ʽ� ����"
		       * ����� 70 �̻��̸� "���� �հ�"
		       * ����� 70 �̸��̸� ������� ������."
		       */
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("���� : "+kor);
		      System.out.println("���� : "+eng);
		      System.out.println("���� : "+sum);
		      System.out.println("��� : "+avg);
		      if(avg == 100){
		    	  msg = "���ʽ� ����";
		      }else if(avg >= 70){
		    	  msg = "���� �հ�";
		      }else {
		    	  msg = "������� ������";
		      }
		      System.out.println(msg);
		      
	}
}
