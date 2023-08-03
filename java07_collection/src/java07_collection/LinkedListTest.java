package java07_collection;

import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		
	}

	public void start() {
		//LikedList : List 인터페이스를 상속받고 있으므로, 순서 유지  & 중복객체 허용
		LinkedList<String> ll = new LinkedList<String>(); // String 객체 담을 수 있는 list 생성
		
		ll.offer("홍길동"); // add와 같은 개념
		ll.offer(new String("세종대왕"));
		ll.offer("이순신");
		ll.offer("안중근");
		// 				1번쨰    < - pop < - start(1번째)  
		//	 안중근 이순신 세종대왕                  홍길동 
		
		// ll에 객체가 비어있는지 확인 -> 비어있을때까지 pop 진행 !
		
		while(!ll.isEmpty()) { // true : 비어있음 , false : 객체 있음
			String name = ll.pop(); 
			System.out.println("name ="+ name);
		}System.out.println("size = " + ll.size());
		
//		String name1 = ll.pop(); // 맨 먼저 저장된 객체를 꺼내고, 컬렉션에 객체를 제거 -> 그 다음으로 순위 넘어감
//		String name2 = ll.pop();
//		String name3 = ll.pop();
//		String name4 = ll.pop();
//		String name5 = ll.pop(); // output 데이터가 없음 why 총 4개의 객체 offer(add)함 
//								// NoSuchElementException
//		
//		System.out.println("name ="+ name1);
//		System.out.println("size = " + ll.size());
						}
	public static void main(String[] args) {
	 new LinkedListTest().start();

	}

}
