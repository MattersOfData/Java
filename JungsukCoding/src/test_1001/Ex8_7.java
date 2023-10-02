package test_1001;

public class Ex8_7 {


	public static void main(String[] args) {
		method(true);
		method(false);
	}
	
	
	// System.exit(정수)은 프로그램을 종료하는 데 사용
	// System.exit(0): 프로그램을 정상적으로 종료
	// System.exit(양수):비정상적으로 종료
	
	static void method(boolean b){ 
	try {
		System.out.println(1);
		if(b) System.exit(0); // 변수 b의 값이 true --> System.exit(0); 수행 --> 즉시 종료
							// 이럴때는 finally 는 수행 X
		System.out.println(2);
	}catch (RuntimeException e) {
		System.out.println(3);
		return;
	}catch (Exception e) {
		System.out.println(4);
		return;
	}finally {
		System.out.println(5);
	}
	System.out.println(6);
	}
	
}