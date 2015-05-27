package api.lang.object;
/*
java.lang.Object �� �޼ҵ�
equals() : ���� ������ ���θ� üũ
�ν��Ͻ� ������ �ؽ��ڵ� ��(���ּҰ�) �� ���ϴ� �޼ҵ� 
*/
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		// result �� ���θ޼ҵ� �ȿ� �ִ� �������� �̱� ������ 
		// �ݵ�� !!!!!!!! �ʱ�ȭ�� �ؾ��Ѵ�. 
		String result = " ";
		//if(){}else{} �� ���´� �ϵ��ڵ����� �ͼ������ž� �մϴ�. 
		if(t1.equals(t2)){
			System.out.println("t1 �� t2 �� ���� ����.");
		}else{
			System.out.println("t1 �� t2 �� ���� �ٸ���.");
		}
		/*
		 * ���� �����ڴ� if-else �� ��ü�ϴ� �����̴�.
		 * ������ 
		 * (���ǽ�) ? "���� ���" : "������ ���" ; 
		*/
		result = (t1.equals(t2)) ? "t1 �� t2 �� ���� ����.": "t1 �� t2 �� ���� �ٸ���.";
		System.out.println("�����ڸ� ���� ������ �������� ���� �� :" + result);
		
		t2 = t1;
		result = t1.equals(t2) ? "t1 �� t2 �� ���� ����.": "t1 �� t2 �� ���� �ٸ���.";
		System.out.println("�������� ������ �Ҵ�� ���� ���� ���� �� :" + result);
	}
}

class Temp{
	int num; // �ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ�� �ʿ����. 
	public Temp(int num){
		this.num = num;
		/*
		 * ��� ���´� ���� ����� �ν��Ͻ� ������ 
		 * �� ���ؿ� �ִ� num ���������� �Ҵ�� ���� 
		 * �ν��Ͻ� ������ �Ѱ��ְ� ����(����)���� �ڽ���
		 * ������� �ó������� ����ȴ�. 
		*/
	}
}