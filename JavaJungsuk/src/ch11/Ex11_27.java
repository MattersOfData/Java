package ch11;

import java.util.TreeSet;

public class Ex11_27 {

// TreeSet의 범위 검색 예제
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();// 범위 검색에 유리(from ~ to)
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		// [Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
		// 대문자 > 소문자 보다 우선 -> 가능하면 대문자로만 or 소문자로만 진행 -> 안될경우, Comparator이용 
		// 공백> 숫자 > 대문자 > 소문자
		System.out.println("range search : from " + from + " to " + to); // range search : from b to d
		System.out.println("result1:" + set.subSet(from, to)); // d포함 x
		// result1:[bat, car]
		System.out.println("result2:" + set.subSet(from, to + "zzz")); // d 포함시키고 싶을 경우, 뒤에 "zzz" 추가   
		// [bat, car, dZZZZ, dance, disc]								  -> d로 시작하지만, dzzz 다음에 오는 단어 없음
		

	}

}
