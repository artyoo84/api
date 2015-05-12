package cmm03.flow;

public class No06_Star3 {
	public static void main(String[] args) {
		
	
	/*
	★★★★★
	   ★★★★
	      ★★★
	         ★★
	            ★
	*/
/*	for(int a = 5; a >= 0; a--){
		for(int b = a; b <= a; b++){
			if(b a){
				System.out.print(" ");
			}else{
				System.out.print("★");
			}
		}
	
	}*/


		for (int i = 6; i > 0; i--) {

			for (int j = i; j < 6; j++) {

				System.out.print("    ");

			}// 공백 증가

			for (int j = 0; j < i; j++) {

				System.out.print("★");

			}// 별 감소

			System.out.println();

		}




	
	}
}
