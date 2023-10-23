package ch11;

import java.util.TreeSet;

public class Ex11_29 {

// 범위 검색에 유리한 TreeSet 예제 with headSet, tailSet, subSet 
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		// Set set = new TreeSet(); 여기서 Set 으로는 불가 -> headSet, tailSet, subSet은 TreeSet에만 존재허는 메서드
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i = 0; i<score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("50보다 작은값:" + set.headSet(50)); //(new Integer(50)));
		System.out.println("50보다 큰값:" + set.tailSet(50)); //(new Integer(50)));
		System.out.println("40과 80 사이의 값:" + set.subSet(new Integer(40),new Integer(80))); 

	}

}
