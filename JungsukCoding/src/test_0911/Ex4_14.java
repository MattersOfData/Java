package test_0911;

public class Ex4_14 {

	public static void main(String[] args) {
		// 주어진 문자열(value)가 숫자인지 판별하는 프로그램
		String valueString = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i<valueString.length(); i++) {// 반복문 & charAt 를 이용하여, 문자열의 문자가 숫자인지 판단
			ch = valueString.charAt(i); // valueString은 String클래스 -> char 배열 + 메서드
										// string클래스 변수명.charAt(인덱스번호) -> 해당 인덱스의 값(문자) 반환
			isNumber = '0'<= ch && ch <='9'; // boolean형에 연산의 ture/false 담을 수 있음 !!!
			if(isNumber){
				System.out.print(valueString + "은 숫자가 아닙니다." );
			}else {
				System.out.print(valueString + "은 숫자입니다" );
			} // else
			
		}//for

	}// end of main
}// end of class