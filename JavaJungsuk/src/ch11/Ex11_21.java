package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_21 {
//중복값을 저장하지 않는 HashSet의 특징을 이용하여 난수 만드는 예제
	
	public static void main(String[] args) {
		Set set = new HashSet(); 
		
		// set의 크기가 6보다 작은 동안, 1~45사이의 난수를 저장
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num)); // = set.add(num) 과 동일
		}
	List list = new LinkedList(set); // LinkedList(Collection c) 생성자 사용
	Collections.sort(list); // 번호를 크기순으로 정렳하기 위해, Collcections.sort(List list) 메서드 사용해야함 
							// 해당 메서드는 List 인터페이스 타입을 필요하기 때문에,(정렬 == 순서 유지)
							// LinkedList or ArrayList(Collection c)를 이용해서 HashSet에 저장된 객체들을 LinkedList로 담음(=List로 저장)
							// 저장된 객체가 Integer이기때문에 Integer에 정의된 기본정렬 사용
	System.out.println(list);
	}

}
