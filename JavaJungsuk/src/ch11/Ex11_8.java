package ch11;

import java.util.EmptyStackException;
import java.util.Vector;

// Stack의 실제코드 구현하기

class MyStack extends Vector{ // Stack은 컬렉션 프레임웍 이전부터 존재 -> Vector로 부터 상속받아 구현
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek(); // Stack에 저장된 마지막 요소 읽기
		// 만일 Stack이 비어있으면 peek()메서드가 EmptyStackException을 발생시킨다
		removeElementAt(size()-1);// 마지막 요소 삭제 -> 배열의 index가 0붜 시작하므로 1 빼줌
		return obj;
	}

	public Object peek() {
		int len = size();
		if(len == 0)
		throw new EmptyStackException(); // RuntimeException임으로, 따로 예외처리 하지 않아도 됨
		return elementAt(len-1); // 마지막 요소 삭제 -> 배열의 index가 0붜 시작하므로 1 빼줌
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o); // 끝에서부터 객체를 찾음
								// 반환값은 저장된 위치(배열의 index)
		if(i>=0) { // 객체를 찾은경우
			return size() - i; // Stack은 맨 위의 저장된 객체의 index를 1로 정의하기 때문에, 계산을 통해서 구함
							   // ex) 1(bottom) ~ 4(Top) 스택, 스택크기(size)가 4일때, search(3)을 할 경우,
							   // 3번째 요소가 스택에서 발견(from bottom) -> i = 3 
							   // size() - i = 4 - 3 = 1 
							   // 따라서, serch(3) = 1 -> 즉, Top으로부터 몇번쨰 있는지 나타내줌
			}
		return -1;
	}
	
}// end of class
	
