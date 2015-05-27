package api.lang.object;
/*
�ؽ�(hashing) ����� ���Ǵ� �ؽ��Լ�(hash function) �� ������ ��.
�ؽ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ���Ǵ� ������ �������.
ex) Ʈ���Ϳ��� �ؽ��ױ׸� �Խñۿ� ÷���ϴ°�.
	  ������ �ؽ��ױװ� ÷�ε� �Խñ��� ������ �ؽ��±�(�ּҰ�) �� �����ϰ�
	  �Ǿ� �˻��� ������ ������� �����ϴ� ����� �Ѵ�. 
*/
public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";
		System.out.println("abc �� �ؽ��±� :" + abc.hashCode());
		System.out.println("abc2 �� �ؽ��±� :" + abc2.hashCode());
		/*
		 * abc �� �ؽ��±� : 96354
		 * abc2 �� �ؽ��±� : 96354
		 * ������� ���Ͱ��� ���´�.
		 * �ᱹ String Ÿ���� new String("abc") ó��
		 * �����ڸ� ���� �����̳�,"" ó�� ���ͷ� ������ �����̳�
		 * ������ �ּҰ��� �����ٴ� ���� �� �� �ִ�.
		 * ��� ��ü ��, �����ϰ� String�� �̰��� Ư¡�� ������. 
		*/
	}
}