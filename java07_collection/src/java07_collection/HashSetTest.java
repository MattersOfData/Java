package java07_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	//HashSet : 입력순서 유지X, 중복데이터 허용X
						
	int data[] = {56, 54,78,56,85, 85, 90, 78, 56, 45};// HashSet 객체 생성
	public HashSetTest() {
	
	HashSet<Integer> hs = new HashSet<Integer>(); 
	
	for (int d:data) {
		hs.add(d);
		}
	System.out.println("size =" + hs.size()); // data 데이터수는 10 but 중복으로 6개만 출력
	
	
	
	//HashSet 객체를 얻어보기
	
	//Iterator : 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스(인터페이스로 리턴해줌)
	
	Iterator<Integer> il = hs.iterator(); // il안에 있는 데이터 모두 담기
	
	//hasNext(): 다음 객체의 존재유무 확인 -> boolean 형 데이터 (논리형 데이터)
	//next() : 객체 얻어오기
	while(il.hasNext()) {
		Integer obj = il.next();
		System.out.println(obj);
		
		}
	}
	
	
	public static void main(String[] args) {
		new HashSetTest ();
	}

}
