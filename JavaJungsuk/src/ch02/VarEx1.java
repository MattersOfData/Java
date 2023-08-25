package ch02;

public class VarEx1 {

	public static void main(String[] args) {
	System.out.println("6+3"); // "" 안에 있는 내용 그대로 출력
	
	System.out.println(6+3); // 덧셈
	System.out.println(6-3); // 뺼셈
	System.out.println(6*3); // 곱셈
	System.out.println(6/3); // 나눗셈
	
	// 값을 일일이 적어주기보다, 변수를 선언 & 이를 이용하면, 다른 결과값 쉽게 도출 가능 
	// 변수의 필요 이유!
	
	int x = 6, y = 3;
	System.out.println(x+y); // 덧셈
	System.out.println(x-y); // 뺄셈
	System.out.println(x*y); // 곱셈
	System.out.println(x/y); // 나눗셈
	
	
	}

}
