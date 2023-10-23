package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_33 {

// 문자열 배열에 담긴 문자열들의 빈도수 구하기(단어 빈도수, 카운팅) with HashMap
	
	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		HashMap map = new HashMap();

		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) { // map 의 key data[i]가 포함됨 ?
				int value = (int) map.get(data[i]);
				//Integer value = (Integer)map.get(data[i]);
				map.put(data[i], value+1); // 포함하는 경우, 값 = 기존값+1
				//map.put(data[i], new Integer(value.intValue() + 1));
			} else { // 안포함하는 경우, 값 = 1
				map.put(data[i], 1);
				//map.put(data[i], new Integer(1));			
			}
		}

		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			//int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value ); 
		}
	} // main

	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; 
		} 
		return new String(bar); 	// String(char[] chArr)
	}
}
