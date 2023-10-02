package test_1001;

public class Ex8_5 {

	public static void main(String[] args) {
		method(true);
		method(false);
	}
	

// <try-catch 문의 흐름>
// 1. try 내에서의 예외 발생
// 2. 일치하는 catch 문찾기 & catch 블럭의 문장 수행
// ** 일치하는 catch 블럭 찾을때까지 계속해서 수행됨  --> 찾지 못하면 예외처리 불가
// ** try 내에서 예외 발생하지 않은 경우, 계속 수행함 
// 3. try-catch 문 빠져나가기
// 4. finally 문장 있는 경우 수행
// 5. 전체 try-catch 문 빠져나간 후, 계속해서 수행 
// 에러 발생 : 1,3,5  <--> 에러미발생 : 1,2,3,5,6	
// 에러발생시, 6이 출력되지 않는 이유 : 블록 내부의 return 문이 실행되면 메서드가 즉시 종료 but, finally 블록은 항상 실행되므로 메서드가 완료되기 전에 "5"가 항상 출력
static void method(boolean b) {
	try {// 예외 발생할 가능성이 있는 문장
		System.out.println(1);
		if(b) throw new ArithmeticException();
		System.out.println(2); // 예외가 발생하지 않으면 실행되지 않는 문장
		}catch (RuntimeException r) {//ArithmeticException은 RuntimeException의 자손
			System.out.println(3);
			return; // finally 수행 후에 , 메서드 빠져나감
					// return 문은 함수를 즉시 종료시킴
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally { //  예외발생여부에 관계없이 항상 실행되는 문장
			System.out.println(5);
		}
		System.out.println(6);
	}

}
