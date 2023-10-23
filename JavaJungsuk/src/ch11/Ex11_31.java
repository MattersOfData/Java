package ch11;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_31 {
// HashMap의 기본적인 메서드를 이용해서 데이터를 저장& 읽어오는 예제
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100)); // 키중복됨으로, 값은 Integer 100으로 덮어씀
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));

		// key & value 를 entry 하나로 읽어오기 
		Set set = map.entrySet(); 
		Iterator it = set.iterator();
				while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); // Map 인터페이스 - Entry 인터페이스(Map의 내부 인터페이스)
			System.out.println("이름 :" + e.getKey()+ ", 점수 :" + e.getValue());
		}
		
		// key 만 읽어오기		
		set = map.keySet();
		System.out.println("참가자 명단:" + set);
		
		// values만 읽어오기
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next(); // int i = (int)it.next();
			total += i.intValue(); // total += i;
		}
		
		
		System.out.println("총점:" + total);
		System.out.println("평균:" + (float)total/set.size());
		System.out.println("최고점수:" + Collections.max(values));
		System.out.println("최저점수:" + Collections.min(values));
	}

}
