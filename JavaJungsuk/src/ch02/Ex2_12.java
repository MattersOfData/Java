package ch02;

public class Ex2_12 {

	public static void main(String[] args) {

		String str = "3";
		
		System.out.println(str.charAt(0)-'0'); // 1. "3"(문자열) -> '3'(문자): charAt(0) - '0'(문자) = 3(숫자)
		System.out.println("3".charAt(0)-'0'); // 1. "3"(문자열) -> '3'(문자): charAt(0) - '0'(문자) = 3(숫자)
		System.out.println('3' - '0' + 1); // '3'(문자) - '0'(문자) = 3 (숫자)4
		System.out.println('3' + 1); // '3'(문자)(51) + 1(숫자) = 52
		System.out.println(Integer.parseInt(str)+1); // "3" -> 3(숫자) + 1(숫자) = 4
		System.out.println("3" +1); // "3" + "1" = "31" ( 문자 + 숫자 = 문자)
		System.out.println(3 + '0'); // 3(숫자) + '0'(문자)(숫자로 48) = 51 
		System.out.println((char)(3 + '0')); // 문자 3 
	
	}

}
