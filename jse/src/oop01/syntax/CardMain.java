package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("ī�� ���� :"+CardVO.height);//����Ʈ
		System.out.println("ī�� �ʺ� :"+CardVO.width);//����
		
		// �ν��Ͻ� �����ϼż� �Ʒ� ��� ó�� 
		// ��µǵ��� ���ּ���...
		
		CardVO vo1 = new CardVO("��Ʈ",3);

		System.out.println("�÷��̾�� "+vo1.getKind()+" "+vo1.getNumber()+"�̰�");
//		 heart, spade
		vo1 = new CardVO("�����̽�",5);
		System.out.println("��ǻ�ʹ�"+ vo1.getKind()+ vo1.getNumber()+"�� ��ǻ�Ͱ� �̰���ϴ�. ");
	}
}
