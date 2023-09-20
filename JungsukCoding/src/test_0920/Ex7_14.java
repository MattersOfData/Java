package test_0920;


// 7-1 & 7-2 & 7-14
//섯다카드의 숫자와 종류(isKwang)의 값이 한번 지정되고 변경되지 않도록 제어접근자 추가하시오.
//섯다 카드 20장을 포함하는 섯다카드 한벌(SutdaDeck클래스)를 정의한 것이다.
//섯다 카드 20장을 담은 SutdaCard배열을 초기화 하시오
//단, 섯다카드는 1~10까지 적힌 카드가 한쌍씩 있고,
//숫자가 1,3,8인 경우에는 둘 중의 한장은 광이어야 한다 --> 즉 SutdaCard의 인스턴스 변수 isKwang 의 값이 true여야 한다.


class SutdaDeck3{
	final int CARD_NUM = 20; // 섯다카의 총 개수
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM]; // 인스턴스 공간만 생성
	
	SutdaDeck3() {
	// 총 20장의 카드 있음 
	// 이중에 1,3,8의 경우 둘 중 하나는 '광'이여야 함
	// 총 20장 = 17장( 1~20) + 3장(1,3,8 : 광)
	// 출력값 :  1K 2, 3K, 4,5,6,7,8K, 9,10,1,2,3,4,5,6,7,8,9,10,	
		
	// 매개변수 num 과 isKwang에 대해서 조건 생성
		for (int i = 0 ; i<cards.length; i++) {
			int num = (i%10)+1;
			//if(i== 0 || i == 2 || i == 7) {
			boolean isKwang = (i<10) && ( num == 1 || num== 3 || num== 5);// isKwang true
			
			cards[i] = new SutdaCard3(num, isKwang); // cards 배열에 객체 생성하기 !!
			
			}// end of for
		} // end of SutdaDeck3
	
		//1. 배열 cards에 담긴 카드의 위치를 뒤섞는 메서드
		void shuffle() {
			for(int i = 0; i<cards.length; i++) { //cards[0] ~ cards.length -1
				int j = (int)(Math.random()*cards.length); // cards[랜덤 : 0 ~ cards.length]
				
				// 2 개의 값 자리바꿈(변경)
				SutdaCard3 tmp = cards[i];
				cards[i]= cards[j];
				cards[j] = tmp;
				
				}
	}// end of class SutdaDeck3
		// 2. 배열 cards에서 임의의 위치의 SutdaCard를 반환하는 메서드
		SutdaCard3 pick(int index){
		if( index <0 || index >= CARD_NUM)// index 에 int범위의 숫자가 들어올수 있기 때문에,
										//index가 0 이하거나, index범위가 CARD_NUM보다 클때
			return null;//  매개변수가 있는 메서드는 반드시 작업 전에 유효성검사
			else return cards[index];// 위치 반환하는 메서드 
		}
		
		// 3. 배열 cards에서 임의의 위치의 SutdaCard를 반환
		SutdaCard3 pick() {
			int index = (int)(Math.random()*cards.length); // 0~20까지의 숫자가 들어오기때문에, 유효성 검사 x
			return cards[index]; 
			//return pick(index);
		}
		
	}
	class SutdaCard3{
	// 원래 변수 앞에 을 붙일 때는 선언과 초기화를 동시에 해야함
	// BUT, 인스턴스변수의 경우 선언시에 초기화 하지 않고 생성자에서 초기화할 수 있음
		
	final int NUM; // 섯다카의 숫자 변동X
 	final boolean IS_KWANG; // 섯다카의 종류 변동X
	
	SutdaCard3(){
		this(1,true); // 기본 생성자(초기화) 
	}
	SutdaCard3(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	// info대신 Object클래스의 toString()을 오버라이딩 했따.
	public String tosString() {
		return NUM + (IS_KWANG? "K" :"");
		}
	}

class Ex7_14 {
	public static void main(String args[]) {
		SutdaDeck3 deck = new SutdaDeck3();
		System.out.println(deck.pick(0).tosString()); // 매개변수 있는 메서드 호출
		System.out.println(deck.pick().tosString()); // 매개변수 없는 메서드 호출
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length ;i++) 
			System.out.print(deck.cards[i].tosString()+ ",");
		
		System.out.println();
		System.out.println(deck.pick(0).tosString());
		
		}
	}


