package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_20 {
// HashSet 예제
	
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i = 0; i<objArr.length;i++) {
			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장
			System.out.println(objArr[i] +"="+ set.add(objArr[i])); // 저장 -> true , 저장 x -> false로 반환됨
																	// 1 = true, 1= true, 2= true, 2 = false ...
		}
		
		
		// HashSet에 저장된 요소 출력 with Iterator
		
		Iterator it = set.iterator(); // iterator메서드 
		while(it.hasNext()) { // 읽어올 요소 있는지 확인
			System.out.println(it.next()); // 요소 하나씩 꺼내기
		} // 1,1,2,3,4
		
		// HashSet에 저장된 요소 출력 
		System.out.println(set); //[1, 1, 2, 3, 4]
								// 여기서 1은 String,  1은 Integer 객체 
								// (순서 유지 안하기때문에, 어떤게 String인지, Integer객체인지 알수 없음)
								
	}
}
