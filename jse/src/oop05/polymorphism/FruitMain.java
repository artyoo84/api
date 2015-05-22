package oop05.polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ����� ����.
		// ��, FruitInterface fi = new FruitInterface();
		// ������ �߻��Ѵ�. 
		FruitInterface apple = new AppleImpl();
		//======================
		FruitInterface banana;
		// FruitInterface Ÿ���� ���������� ����
		banana = new BananaImpl();
		// Ŭ���� BananaImpl �� ��ü�� �����Ͽ�
		// banana�� �Ҵ�
		
		FruitInterface orange = new OrangeImp();
		
		apple.display("���ִ�");
		banana.display("������");
		orange.display("���");
		int d = orange.getCount();
		System.out.println(d);
	//   orange.getCount();
	      // �������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�.
			
		
	}
}
