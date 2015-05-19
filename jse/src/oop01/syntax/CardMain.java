package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("카드 높이 :"+CardVO.height);//하이트
		System.out.println("카드 너비 :"+CardVO.width);//위드
		
		// 인스턴스 생성하셔서 아래 결과 처럼 
		// 출력되도록 해주세요...
		
		CardVO vo1 = new CardVO("하트",3);

		System.out.println("플레이어는 "+vo1.getKind()+" "+vo1.getNumber()+"이고");
//		 heart, spade
		vo1 = new CardVO("스페이스",5);
		System.out.println("컴퓨터는"+ vo1.getKind()+ vo1.getNumber()+"라서 컴퓨터가 이겼습니다. ");
	}
}
