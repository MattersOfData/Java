package test_0920;
// 7-1, 7-2, 
//섯다 카드 20장을 포함하는 섯다카드 한벌(SutdaDeck클래스)를 정의한 것이다.
//섯다 카드 20장을 담은 SutdaCard배열을 초기화 하시오
//단, 섯다카드는 1~10까지 적힌 카드가 한쌍씩 있고,
//숫자가 1,3,8인 경우에는 둘 중의 한장은 광이어야 한다 --> 즉 SutdaCard의 인스턴스 변수 isKwang 의 값이 true여야 한다.

class SutdaDeck{
	final int CARD_NUM = 20; // 섯다카의 총 개수
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 인스턴스 공간만 생성
	
	SutdaDeck() {
	// 총 20장의 카드 있음 
	// 이중에 1,3,8의 경우 둘 중 하나는 '광'이여야 함
	// 총 20장 = 17장( 1~20) + 3장(1,3,8 : 광)
	// 출력값 :  1K 2, 3K, 4,5,6,7,8K, 9,10,1,2,3,4,5,6,7,8,9,10,	
		
	// 매개변수 num 과 isKwang에 대해서 조건 생성
		for (int i = 0 ; i<cards.length; i++) {
			int num = (i%10)+1; // 10 간격으로 반복 
			//if(i== 0 || i == 2 || i == 7) { // 배열 1,3,8이 있는 index 번호
			boolean isKwang = (i<10 && (num == 1 || num == 3 || num == 8)); // 1, 3, 8 의 경우 isKwang true
			
			cards[i] = new SutdaCard(num, isKwang); // cards 배열에 객체 생성하기 !!
													// cards배열은 SutdaCard 객체를 저장하기 위한 것으로 예상되므로 기본 정수나 문자열을 할당하는 것은 허용되지 않음
													// SutdaCard 객체 생성 & 생성자 호출해서 초기화해줘야 함 !
			}
		
//		for(int i = 0; i < cards.length; i++) {// i = 0,1,2,3,4,5,,,,,,19
//			int num = (i%10) + 1; 
//			if((num == 1 || num == 3 || num == 8) && i<10){
//				cards[i] = new SutdaCard2(num, true);
//				}else {
//				cards[i] = new SutdaCard2(num, false);
//				} 
//			}
//		
		}
	}
class SutdaCard{
	
	//SutdaCard의 멤버변수
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true); // 기본 생성자(초기화) 
	}
	SutdaCard(int num, boolean isKwang){ // 매개변수가 있는 생성자
		this.num = num;
		this.isKwang = isKwang;
	}
	// info대신 Object클래스의 toString()을 오버라이딩 했따.
	public String tosString() {// 카드정보를 문자열로 반환하는 메서드 -> 번호 + 광여부 
		return num + (isKwang? "K" :"");
	}
}

class Ex7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i<deck.cards.length ;i++) 
			System.out.print(deck.cards[i].tosString()+ ",");
		
	}
}

