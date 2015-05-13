package cmm04.array;

public class No02_StringArrayVO {
	
	public String[] juso = {"서울","종로","광화문"};

	public void view() {
		for (int i = 0; i < juso.length; i++) {
			System.out.print(juso[i] + " ");
		}
	}

}
