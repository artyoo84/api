package oop01.syntax;
/*
 static ����
- ���� ����  (�ּҰ� ����)
- Ŭ������ jvm ������ �ε��ÿ� �޸� �Ҵ��� �Ѵ�. 
- �ؽ��ڵ�(hashCode) �� ��� //�ּҰ� ���

- ��ü�� �ؽ��ڵ�� jvm �� �ؽþ˰��� ���� ��Ű�����
	Ŭ���� ���� ���յǾ� �ؽ��ڵ尡 ����ȴ�.
- String �� ��ü������ ���� ���� ��� �� ���� ���ڿ��� 
	������ ������... �ؽ��ڵ带 �����Ѵ�. 
	String str1 = "��ũ";
	String str2 = "��ũ";
	str1.hashCode() = str2.hashCode();
	
static ����� ����ؾ� �� ��Ȳ
- �⺯ �� ��� �ν��Ͻ��� ���������� ����ؾ� �ϴ� �Ϳ� �ٿ� ���.
- �ν��Ͻ� ������ ������� �ʰ�, Ŭ�������� �ٷ� �����Ϸ� �� �� 
*/

public class No06_StaticSyntax {
	public static void main(String[] args) {
		String hulk = "��ũ";
		String hulk2 = new String("��ũ");
		hulk.hashCode();
		hulk2.hashCode();
		boolean d = hulk.hashCode() == hulk2.hashCode();
		System.out.println(d);
	}
}

