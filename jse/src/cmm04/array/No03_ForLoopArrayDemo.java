package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	  int[] arr = { 1, 2, 3, 4, 5 };
	
	public int sum() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		/*향상된 for문 출력
		for(int i : arr){
			System.out.println(i);
		}
		*/
		//System.out.println("1부터 5까지의 합은 :" + result);
		//No03_ForLoopArrayDemo FD = new No03_ForLoopArrayDemo();
		//System.out.println("1부터 5까지의 합은 :" + FD.sum());
		No03_ForLoopArrayVO VO = new No03_ForLoopArrayVO();
		//System.out.println("1부터 5까지의 합은 :" + VO.sum());
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		VO.setA(a);
		VO.setB(b);
		VO.setC(c);
		VO.setD(d);
		VO.setE(e);
		
		VO.testFor();
		VO.view();
	}
}
