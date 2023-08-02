package java07_collection;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public Vector getData() {
		
		String name = "홍길동";
		Calendar now = Calendar.getInstance();
		Student student = new Student(3, "BTS", "010-1111-2222", 90,80,70);
		int num = 5678;
		Random random = new Random();
		
		//Vector: List 를 상속받고 있기때문에, 입력순서 유지 & 같은 객체 여러개 추가 가능
		Vector v = new Vector(); // 위에 다른 데이터형을 가진 객체들을 한번에 담기 위한 클래스	
		v.add(name); // vector 인덱스 0번째에 들어감 -> 자리 안정해주면 끝에 들어감 
		v.add(now); // vctor 의 인덱스 1번째 들어감 -> 자리 안정해주면 끝에 들어감 
		v.add(1,student) ; // 인덱스 1번에 student -> now는 2번쨰로 이동
		v.add(num); // 인덱스 3번째
		v.add(random); // 인덱스 4번쨰
		
		return v;
	}
		

}
