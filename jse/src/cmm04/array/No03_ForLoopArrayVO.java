package cmm04.array;

public class No03_ForLoopArrayVO {
	//int[] arr = { 1, 2, 3, 4, 5 };
/*
	public int sum() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
*/
	private int[] arr = new int[5];
	
	public void testFor() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("1부터 5까지의 합은 :" +result);
	}

	public void view(){
		for(int i : arr){
			System.out.print(i);
		}
	}

	public void setA(int a) {
		this.arr[0] = a;
	}
	
	public int getA() {
		return arr[0];
	}
	
	public void setB(int b) {
		this.arr[1] = b;
	}
	
	public int getB() {
		return arr[1];
	}
	
	public void setC(int c) {
		this.arr[2] = c;
	}
	
	public void setD(int d) {
		this.arr[3] = d;
	}
	
	public void setE(int e) {
		this.arr[4] = e;
	}
	
}
