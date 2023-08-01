

//1~100사이의 값을 벗어난 값을 입력하였을때, MyException 예외를 호출 하기

package java05_exception;

public class MyException extends Exception { // API 에 있는 Exception

	public MyException() {
		super("양의 정수를 입력하셔야 합니다.");
	}

	public MyException(String message) {
		//상위 클래스의 다른 생성자 호출 
		super(message);
	}
}
