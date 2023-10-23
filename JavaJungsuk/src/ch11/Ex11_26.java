package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_26 {
// TreeSet을 활용한 난수 예제 with Comparable & Comparator
	
	public static void main(String[] args) {
		//Set set = new TreeSet(); // 자동 정렬(저장할떄 이미 정렬됨)
		//Set set = new HashSet(); // 자동 정렬x (정렬필요) -> LinkedList로 저장후, Collections.sort()로 정렬
		
		
		Set set = new TreeSet(); // 저장하려는 Test가 정렬기준(Comparable) 가질 경우 
		//Set set = new TreeSet(new TestComp()); // 저장하려는 Test가 정렬기준 갖지 않은 경우 -> TreeSet이 가져야함 ->비교 기준 제공(Comparator)
		
		// 1 ~ 45 사이의 숫자 랜덤 추출 -> set에 저장
//		for(int i = 0; set.size()<6; i++) {
//			int num = (int)(Math.random()*45)+1;
//			set.add(num); // set.add(new Integer (num)); // Integer는 Comparable 가지고 있음(저장 기준 가짐)
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
//		}
		System.out.println(set);
	}
}
//	class Test{} // 비교기준이 없음

	// 1) 저장하려는 Test가 정렬기준 가질 경우
	class Test implements Comparable{ 

	@Override
	public int compareTo(Object o) {
		return 1;
		}
	} 
	// 2)저장하려는 Test가 정렬기준 가지지 않을 경우 -> TreeSet이 정렬기준 가짐
	class TestComp implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
		return 1; // 0이면 같은 객체로 판단됨 -> 1 or 1로 변경
		}
		
	}

