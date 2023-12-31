package ch11;

import java.util.ArrayList;
import java.util.Collections;

	public class Ex11_1 {
	
		public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);// 기본길이(capacity-용량) 가 10인 ArrayList를 생성
											// object객체의 배열이기때문에, '객체 주소'를 가지고 있음
		
		//Arraylist 에는 객체만 저장 가능 but, 컴파일의 autoboxing에 의해 기본형 --> 참조형으로 자동변환!
		//add메서드로 list1에 객체 저장
		list1.add(new Integer(5)); // = add(5)
		list1.add(new Integer(4)); // = add(4)
		list1.add(new Integer(2)); // = add(2)
		list1.add(new Integer(0)); // = add(0)
		list1.add(new Integer(1)); // = add(1)
		list1.add(new Integer(3)); // = add(3)
		
		// ArrayList의 일부 (from 1 ~ to 4: 미포함 -> index : 1,2,3) 를 뽑아서 '새로운' 리스트를 만듬
		// list1.subList(1,4)는 읽기전용이기때문에, 수정도 하려면 새로 ArrayList를 만들어줌
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // ArrayList(Collection c) 메서드 사용
		print(list1,list2);
		
		// Collection은 인터페이스, Collections는 유틸클래스(컬렉션을 다루는데 필요한 메서드 제공)
	
		// Collection(ArrayList 등) 정렬하는 방법 : Collections.sort (default 는 오름차순)
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//containAll : list1이 list2 요소들을 모두 포함하고 있는지 확인 -> true or false 반환
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // 
		
		//add(Object obj) 를 이용한 새로운 객체 저장
		list2.add("B");
		list2.add("C");
		// 특정위치에 객체 추가하는 방법 : add(추가할 위치의 index 번호, 추가할 객체)
		list2.add(3,"A"); // index 3번째에 A 추가 -> 중간에 추가되고 기존 데이터 한칸씩 밀림 -> 자리이동 필수!
		print(list1, list2);
		
		// set(int index, Object obj)를 이용하여 다른 객체로 변경 -> index 3번째 객체를 "AA"로 변경 
		list2.set(3, "AA");
		print(list1, list2);
		
		
		list1.add(0, "1"); // 문자 "1" 객체 을 index 0번째에 추가
		print(list1, list2);
		
		//indexOf() : 지정된 객체의 위치(인덱스)를 알려줌
		System.out.println("index=" + list1.indexOf("1")); // 문자열 "1" -> index : 0 
		System.out.println("index=" + list1.indexOf(1)); // 숫자 1  = new integer(1)-> index : 2
		
		//remove
		list1.remove(1); // 1 번쨰 index 객체 삭제
		list1.remove(new Integer(1)); // integer 1 인 객체 삭제
		//list1.remove(5); // 5번째 index 삭제 but, 중간 값 지울경우 ->  뒤에 데이터가 앞으로 옮겨짐
		print(list1, list2);
		
		//retainAll
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainsAll(list2):" + list1.retainAll(list2));
		print(list1, list2); 
		
		// remove with for  : 뒤에서부터 삭제
		// list2에서 list1에 포함된 객체들을 삭제( 공통요소 삭제 )
		for(int i = list2.size()-1; i>=0; i--) { //1.get(i)으로 list2에서 하나씩 꺼냄
			if(list1.contains(list2.get(i))) //2. contains()로 꺼낸 객체가 list1에 있는지 확인 
				list2.remove(i);// 3. remove(i)로 해당 객체를 list2에서 삭제
			}
			print(list1, list2);
		} //end of main 
	
	
		static void print(ArrayList list1, ArrayList list2) {
			System.out.println("list1:" + list1);
			System.out.println("list2:" + list2);
			System.out.println();
			
		}
	}// end of class