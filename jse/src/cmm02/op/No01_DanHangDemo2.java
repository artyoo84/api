package cmm02.op;

public class No01_DanHangDemo2 {
	public static void main(String[] args) {
		
		// 후위형의 변수값은 연산후 값이 증가한다.
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j = i++ 의 결과");
		System.out.println("=========");
		System.out.println("i 의 값 : " + i);
		System.out.println("j 의 값 : " + j);
		System.out.println();
		
		// 전위형은 1을 먼저 증가 시킨후 연산한다. 
		int x = 5;
		int y = 0;
		y = ++x;
		System.out.println("y = ++x 의 결과");
		System.out.println("=========");
		System.out.println("x 의 값 : " + x);
		System.out.println("y 의 값 : " + y);
		
	}
}
