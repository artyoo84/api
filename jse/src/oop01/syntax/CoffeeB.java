package oop01.syntax;
/*
�����ڴ� �ν��Ͻ��� ������ �� 
ȣ��Ǵ� "�ν��Ͻ� �ʱ�ȭ �޼���"�̴�.
*/
class MilkCoffee{
	int money; // this. �� �⺯
	
	public MilkCoffee(){
		this(500);
		System.out.println("���� �ִ�");
	}
	
	public MilkCoffee(int money){
		this(500,true);
		System.out.println(money + "��");
	}
	
	public MilkCoffee(int money, boolean exist){
		System.out.println(
				"���Ű��ɿ��� :" + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
}
public class CoffeeB {
	public static void main(String[] args) {
		MilkCoffee b = new MilkCoffee();
		// �ν��Ͻ��� ������ �ʴ� �ּҰ��� ���� ���� �����̴�. 
		
	}
}
