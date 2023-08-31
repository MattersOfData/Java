package ch03;

public class Ex3_8 {
	public static void main(String[] args) {
		// 이항연산은 두 피연산자의 타입을 일치시킨 후 연산을 수행
		// int보다 작은 타입은 int로 자동변환
		
		byte a = 10;
		byte b = 20;
		byte c =  (byte)(a+ b); //byte 타입 연산전, int로 변환 -> 연산결과 byte로 형변환 必
		
		char ch = 'A';
		ch = (char)(ch + 2); // char 타입 연산전, int로 변환 -> 연산결과 char로 형변환 必
		
		float f = 3/2f ; // int/ int = int이기때문에, 피연산자 하나는 f(or d) 로 변경
		long l = 3000 * 3000 * 3000L ; // int*int*int = int 이며, int의 최대값은 약 10의 9제곱
										// long 타입의 l 리터럴 만들어 주기
		
		float f2 = 0.1f; // float 는 리터럴 f 필요
		double d = 0.1; // double은 리터럴 d 생략 가능 
		
		boolean result = (float)d == f2; // double + float = double -> 
		
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		
		}
	}


