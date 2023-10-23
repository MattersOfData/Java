package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_25 {
// HashSet with 교집합, 합칩합, 차집합 예제
	
	public static void main(String[] args) {
		HashSet setA = new HashSet(); 
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A =" +setA); // A =[1, 2, 3, 4, 5]
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("B =" +setB); //B =[4, 5, 6, 7, 8]
		
		//교집합 : A와 B의 공통 요소
		// setA.retainAll(setB); retainAll -> setA에서 setB와 공통된 것만 남기고 삭제
		// System.out.println(setA);
		Iterator it = setB.iterator();
		while(it.hasNext()) { 
			Object tmp = it.next(); // B의 요소 하나씩 꺼내기
			if(setA.contains(tmp)) // SetA에 tmp있는지 확인
			setKyo.add(tmp); // 있으면 setKyo에 추가
		}
		
		//차집합 : A에서 B를 제외
		// setA.removeAll(setB); removeAll -> setB와 공통요소를 제거
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); // A 요소 하나씩 꺼내기
		if(!setB.contains(tmp)) // SetB에 tmp 없는지 확인
			setCha.add(tmp); // 없으면 setCha에 추가
		}
		
		//합집합 : A와 B에 있는 요소
		//중복된 요소는 Set의 특징에 의해 추가안됨
		//setA.addAll(setB); addAll -> setB의 모든 요소를 추가(중복제외)
		it = setA.iterator();
		while(it.hasNext()) { // A 요소 하나씩 꺼내기
			setHab.add(it.next()); // setHab에 추기
		}
		it = setB.iterator();
		while(it.hasNext()) { // B 요소 하나씩 꺼내기
			setHab.add(it.next()); // setHab에 추기
		}
		
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}
	
	
}


