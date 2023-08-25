package ch02;

public class VarEx3 {

	public static void main(String[] args) {

		//int score ; 지역변수는 읽기 전에 반드시 초기화 필수!
		int score = 100;
		System.out.println("score = " + score);
		score = 200; // 변수이기 때문에 값 변경 가능 !
		System.out.println("score = " + score);
		
		final int MAX = 100;
		System.out.println("MAX = " + MAX);
		//MAX = 200;  MAX는 상수임으로, 처음 값에서 다른값으로 변경할수 X
		
		boolean power = true; // or false
		System.out.println(power);
		
		// byte b = 128; byte 범위 : -128 ~127
		byte b = 127;
		System.out.println(b);
		
		int oct = 010; // 8진수 -> 10진수로 8
		int hex = 0x10; //16진수 -> 10진수로 16
		// println 은 10진수로만 출력 가능
		System.out.println(oct); // 8
		System.out.println(hex); // 16
		
		//long 타입
		long l = 1000_000_000; // 10억은 int -> long 타입에 저장 가능 
		// long l = 3_000_000_000; 30억은 int 타입으로 저장할 수 없음
		long l2 = 3_000_000_000L ; // long 타입으로 접미사 'L' 붙여서 저장해줘야 함 !
		
		//float & double 타입
		float f = 3.14f; // float 타입은 필수로 접미사 f !
		double d = 3.14; // double 타입은 접미사 d 생략 가능 
		double d2 = 3.14f; // 에러 발생 x -> double> float
		
		System.out.println(10.); // 10.0
		System.out.println(0.10); // 0.1 
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
		
		//Char 타입
		char ch = 'A'; // A
		//char ch1 = '' ; 빈 뮨저 X
		//char ch2 = 'AB'; 하나의 문자만 가능
		int ch3 = 'A'; // 65
		System.out.println(ch);
		System.out.println(ch3);
		
		//String 타입
		String str = "A"; // 하나의 문자도 가능 
		String str1 = "AB"; // 연속된 여러개의 문자열 가능
		String str2 = "" ; // 빈문자열 가능(empty string)
		String str3 = "A" + "B" ; //덧셈 기호를 이용해서 결합 가능! 
		System.out.println(str1 + str3);
		
		//문자열 + "" 
		System.out.println(""+ 7 + 7); // 77
		System.out.println(7 + 7 + ""); //14
	}

}
