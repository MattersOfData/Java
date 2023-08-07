package java07_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		//Stack : 먼저 입력받은 객체가 나중에 출력된다 (FILO, LIFO)
		Stack stack = new Stack();
		
		//push () : 객체 추가
		stack.push("홍길동");
		stack.push("김길동");
		stack.push("최길동");
		stack.push("강길동");
				
		
		//pop() : 객체 얻어오기
		while(!stack.empty()) { // true : 비어있다 -> false : 비어있지 않다, 객체가 있다
		String popData	= (String)stack.pop(); //제너릭 안하면 형변환 해줘야 함!
		System.out.println(popData);
		}
		
	}

	public static void main(String[] args) {
		new StackTest();
	}

}
