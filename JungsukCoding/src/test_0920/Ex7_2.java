package test_0920;


// 7-1 & 7-2 & 
//섯다 카드 20장을 포함하는 섯다카드 한벌(SutdaDeck클래스)를 정의한 것이다.
//섯다 카드 20장을 담은 SutdaCard배열을 초기화 하시오
//단, 섯다카드는 1~10까지 적힌 카드가 한쌍씩 있고,
//숫자가 1,3,8인 경우에는 둘 중의 한장은 광이어야 한다 --> 즉 SutdaCard의 인스턴스 변수 isKwang 의 값이 true여야 한다.


class SutdaDeck2{
	final int CARD_NUM = 20; // 섯다카의 총 개수
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM]; // 인스턴스 공간만 생성
	
	SutdaDeck2() {
	// 총 20장의 카드 있음 
	// 이중에 1,3,8의 경우 둘 중 하나는 '광'이여야 함
	// 총 20장 = 17장( 1~20) + 3장(1,3,8 : 광)
	// 출력값 :  1K 2, 3K, 4,5,6,7,8K, 9,10,1,2,3,4,5,6,7,8,9,10,	
		
	// 매개변수 num 과 isKwang에 대해서 조건 생성
		for (int i = 0 ; i<cards.length; i++) {
			int num = (i%10)+1;
			//if(i== 0 || i == 2 || i == 7) {
			boolean isKwang = (i<10) && ( num == 1 || num== 3 || num== 5);// isKwang true
			
			cards[i] = new SutdaCard2(num, isKwang); // cards 배열에 객체 생성하기 !!
			
			}// end of for
		} // end of SutdaDeck2
	
		//1. 배열 cards에 담긴 카드의 위치를 뒤섞는 메서드
		void shuffle() {
			for(int i = 0; i<cards.length; i++) { //cards[0] ~ cards.length -1
				int j = (int)(Math.random()*cards.length); // cards[랜덤 : 0 ~ cards.length]
				
				// 2 개의 값 자리바꿈(변경) --> tmp 필요 !
				SutdaCard2 tmp = cards[i];
				cards[i]= cards[j];
				cards[j] = tmp;
				
				}
	}// end of class SutdaDeck2
		// 2. 배열 cards에서 임의의 위치의 SutdaCard를 반환하는 메서드
		SutdaCard2 pick(int index){
		if( index <0 || index >= CARD_NUM)// index 에 int범위의 숫자가 들어올수 있기 때문에,
										//index가 0 이하거나, index범위가 CARD_NUM보다 클때
			return null;				//  매개변수가 있는 메서드는 반드시 작업 전에 유효성검사
			else return cards[index];// 위치 반환하는 메서드 
		}
		
		// 3. 배열 cards에서 임의의 위치의 SutdaCard를 반환
		SutdaCard2 pick() {
			int index = (int)(Math.random()*cards.length); // 0~20까지의 숫자가 들어오기때문에, 유효성 검사 x
			return cards[index]; 
			//return pick(index);
		}
		
	}
	class SutdaCard2{
	int num;
	boolean isKwang;
	
	SutdaCard2(){
		this(1,true); // 기본 생성자(초기화) 
	}
	SutdaCard2(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	// info대신 Object클래스의 toString()을 오버라이딩 했따.
	public String tosString() {
		return num + (isKwang? "K" :"");
		}
	}

class Ex7_2 {
	public static void main(String args[]) {
		SutdaDeck2 deck = new SutdaDeck2();
		System.out.println(deck.pick(0).tosString()); // 매개변수 있는 메서드 호출
		System.out.println(deck.pick().tosString()); // 매개변수 없는 메서드 호출
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length ;i++) 
			System.out.print(deck.cards[i].tosString()+ ",");
		
		System.out.println();
		System.out.println(deck.pick(0).tosString());
		
		}
	}


