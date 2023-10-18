package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_7 {
// Stack 과 Queue 저장순서 비교
// Stack : LIFO <-> Queue : FIFO
	
	public static void main(String[] args) {
		Stack st = new Stack(); // Stack은 클래스 구현
		Queue q = new LinkedList(); // Queue는 인터페이스로 정의 -> LinkedList 선택해서 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // Stack에서 요소 꺼내기 -> 저장순서와 반대
		}	

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // Queue에서 요소 꺼내기 -> 저장순서와 일치
		}	
	}
}
