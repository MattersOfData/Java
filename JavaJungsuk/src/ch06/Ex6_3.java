package ch06;



public class Ex6_3 {

	public static void main(String[] args) {
		
		System.out.println("Card.width =" + Card.width); // Card 클래스의 cv 변수 의미
		System.out.println("Card.height =" + Card.height); //Card 클래스의 cv 변수 의미
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = " Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + c1.number);
		System.out.println("c2는" + c2.kind + c2.number);
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경 " ); // width와 height은 클래스변수이기때문에, 
		System.out.println("cv의 width와 height를 각각 50, 80으로 변경 " ); // c1 만 변경되는 것이 아닌 cv 값이 변경되는 것
		
		Card.width = 50; // c1.width = 50; 참조변수로 사용할경우, iv로 혼동할 수 있음 -> Card 클래스를 사용할 경우 cv 임이 명확해짐 
		Card.height = 80; // c1.height = 80; 참조변수로 사용할경우, iv로 혼동할 수 있음 -> Card 클래스를 사용할 경우 cv 임이 명확해짐 
		
		System.out.println("c1은" + c1.kind +","+ c1.number +"이며 , 크기는" + c1.width +","+ c1.height + "입니다." );
		System.out.println("c2은" + c2.kind +","+ c2.number +"이며 , 크기는" + c2.width +","+ c2.height + "입니다." );
				
	}
}
	
	class Card {
		String kind;
		int number;
		static int width = 100;
		static int height = 250;
		
	}

