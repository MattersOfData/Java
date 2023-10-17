package ch11;

import java.util.ArrayList;
import java.util.List;


public class Ex11_2 {
// 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 후, 출력하기
	
	public static void main(String[] args) {
		final int LIMIT = 10; // 자르고자 하는 글자의 개수 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		System.out.println(length);
		
		List list = new ArrayList(length/LIMIT +10); // 자동적으로 크기가 늘어나긴하지만, 소요시간 있기에 넉넉하게 진행!
		   
		
		for(int i = 0; i<length; i+=LIMIT) {// 10개 단위로 list에 새로운 객체 추가
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT)); // add(Object obj) -> add(new Integer(1))
			}else {
				list.add(source.substring(i)); // i 부터 ~ 끝까지
			}
			
			// size : 저장된 객체 수 
			// but, list 의 capacity를 구하는 direct 메소드는 존재 x
			int size = list.size();
			System.out.println("Size of the ArrayList =" + size);
		}
		
		
		for(int i = 0; i<list.size(); i++) { // list에 담겨있는 객체 꺼내기
			System.out.println(list.get(i));
		}
	}


	}// end of main


