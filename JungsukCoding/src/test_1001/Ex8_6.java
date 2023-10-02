package test_1001;

public class Ex8_6 {

	//호출 순서 : main--> method1()--> method2()
	//1. main 메서드에서 method1 호출 -> method1에서 method2 호출
	//2. method2 에서 예외 발생 but // 해당 예외 처리해줄 catch 없어서 종료
	//3. 호출한 method1으로 되돌아감 but, 해당 예외 처리해줄 catch문 없어서 종료
	//4. finally 실행 & 3 출력
	//5. 호출한 main 메서드로 되돌아감 
	//6. 모든 예외를 처리할 수 있는 Exception 선언된 블럭이 있으므로 예외 처리 & 5 출력
	public static void main(String[] args) {
		try {
			method1();
		}catch (Exception e) { 
			System.out.println(5);
		}
	}
	
	static void method1(){ 
	try {
		method2(); 
		System.out.println(1);
	}catch(ArithmeticException e) {
		System.out.println(2); 
	}finally { // 항상 실행 
		System.out.println(3);
	}
	System.out.println(4);
	}



	static void method2() {
		throw new NullPointerException(); 
	}
}