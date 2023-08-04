package java07_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	String data[] = {"JAVA","자바","Apple","사과","Banana","바나나","Spring","스프링", "JAVA","사과"};
	public TreeSetTest() {
	//TreeSet: 중복허용 X, 입력순서 유지 X, 정렬 O
	//root(첫번째 수) 기준으로 크기가 작으면 왼쪽, 크가기 크면 오른쪽에 노드 생성
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i = 0 ; i< data.length; i++) {
			ts.add(data[i]);
		}	
		
		//오름차순으로 객체 얻어오기
		Iterator<String> il = ts.iterator();	
		while(il.hasNext()) {
			String txt = il.next();
			System.out.println(txt);
		
		}
		System.out.println("--------------------");
		
		//내림차순으로 객체 얻어오기
		Iterator<String> iii = ts.descendingIterator();
		while(iii.hasNext()) {
			String txt = iii.next();
			System.out.println(txt);
		}
	}

	public static void main(String[] args) {
		new TreeSetTest();
		
		
		
	}

}
