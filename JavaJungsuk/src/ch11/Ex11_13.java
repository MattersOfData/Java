package ch11;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex11_13 {

	public static void main(String[] args) {
		//ArrayList List = new ArrayList();
		//HashSet list = new HashSet(); Set은 Collection의 자손이기때문에 하기 코드 사용가능 (but, get메서드는 사용불가)
		
		Collection c = new ArrayList(); // new HashSet(), new TreeSet()
		// ArrayList list -> Collection list = new ArrayList(); 로 하게되면, 다른 컬렉션으로 변경시 이 부분만 고치면 됨!(아래코드 검토 x)
		// 실제 구현하는 클래스(객체)가 달라도, c라는 참조변수는 바뀌지 않았기 때문에
		// 즉, Collection에 정의되어있는 공통된 메서드만 사용한게 확실 -> c라는 리모콘을 사용하는 멤버의 개수가 동일
		// Collecton 인터페이스를 구현한 다른 클래스로 변경할때, 선언문만 변경하면 나머지 코드는 변경하지 않아도 됨!
		// 코드는 유연하게 작성하는게 좋음 !
			
		
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	    // while문 2번 사용해도 이미 앞에서 다 읽었기 때문에, while(false)로 출력안됨 			
		// while(it.hasNext()) {
		//	Object obj = it.next();
		//	System.out.println(obj);	

		it = c.iterator(); // iterator는 다 읽고 나면, false 됨(1회용) -> 다쓰고 나면 다시 얻어와야 함!
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);	
		}	
		
		//for문으로 사용해보기(List 컬렉션에서만 가능)
		it = c.iterator();
		for(int i = 0; i<c.size(); i++) {
			if(it.hasNext()) {
				Object obj = ((ArrayList) c).get(i); // List인터페이스에만 get 메서드 존재 -> 다른 컬렉션(HashSet 등)에선 사용 불가
				System.out.println(obj);
			}
		}
			
		}// end of while
	}// end of main


