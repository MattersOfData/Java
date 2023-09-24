package test_0918;


public class Ex6_2 {

		public static void main(String args[]) {
		// 객체 생성시, 2객의 생성자 사용 --> 2개의 생성자 필요 !!
		// 1. 매개변수 있는 생성자 (num , isKwang)
		// 2. 기본 생성자
		SutdaCard card1 = new SutdaCard(3, false); // 1. 매개변수 있는 생성자
		SutdaCard card2 = new SutdaCard(); // 2. 기본생성자 --> num  & true 시, K 출력
		System.out.println(card1.info()); // 3 출력
		System.out.println(card2.info()); // 1K 출력
		
		}
	}
		
	class SutdaCard{
	int num;
	boolean isKwang;
						
	SutdaCard() {
			this(1,true); // 기본생성자일때, 1과 K 호출
						  // 같은 생성자끼리는 클래스 이름 대신에 this 사용 !!
			
			// 하기와 같이 해도 되지만, 위와 같이 표현하는게 더 좋은 코드 (재사용성 & 코드 수정 유리)
			// this.num = num;
			// this.isKwang = isKwang ; 
		}
	
	SutdaCard(int num, Boolean isKwang) {
			this.num = num; // this 사용함으로서, iv 가르킴(not lv)
			this.isKwang = isKwang; // this 사용함으로서, iv 가르킴(not lv)
		}
		
	String info() { // info() 메서드 : card 인스턴스 정보 --> 문자혈 반환
		return num + (isKwang? "K" : ""); // 숫자 --> 문자열 반환 , 광인경우 --> K 붙임, 아니면 --> 빈칸 
										 //메서드 선언 : 반환타입 메서드명(매개변수) {구현부 : return 포함(void인경우 불포함)} 
		}
		
	}

