package test_1002;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_2 {

	public static void main(String[] args) {
			ArrayList list = new ArrayList(); // 중복허용 &  순서 O
											  // 3,6,2,2,7
			list.add(3);
			list.add(6);
			list.add(2);
			list.add(2);
			list.add(2);
			list.add(7);
			
		
			HashSet set = new HashSet(list); //중복제거 & 순서X(랜덤)
											 // 2,6,3,7 or 다른 순서 가능 
			TreeSet tset = new TreeSet(set); //중복제거 & 정렬(Default : 오름)
											 //2,3,6,7
			System.out.println(set);
			Stack stack = new Stack(); // Stack에 넣었다 꺼내면 저장순서가 반대!(FILO)			
			stack.addAll(tset); // TreeSet에 저장된 모든 요소들을 stack에 담음
								// 2,3,6,7
			
			while(!stack.empty())
			System.out.println(stack.pop()); // stack에 저장된 값을 하나씩 꺼냄
										     // 7,6,3,2
			}
			
	}


