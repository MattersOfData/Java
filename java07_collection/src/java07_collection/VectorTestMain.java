package java07_collection;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public static void main(String[] args) {
		VectorTest vt = new VectorTest();
		
		Vector vector = vt.getData();

		String name = (String)vector.elementAt(0); // 0번쨰 인덱스 객체 꺼내기
		System.out.println("name = " + name); 		// object 타입으로 나오기 때문에, 원래 타입으로 강제 형변환!
		
		Student stu = (Student)vector.get(1); // 1번째 인덱스 객체 꺼내기 with get
		System.out.println("student = " + stu.toString());// Object으로 값이 들어와서, 강제 형변환!
		
		Calendar date = (Calendar)vector.get(2); // Calendar는 API에 있는 클래스여서 import !
		System.out.println(date);				// object 타입으로 나오기 때문에 원래 타입으로 강제 형변환!
												// 2번째 인덱스 데이터 객체 꺼내기 with get
		
		int n = (int)vector.get(3);
		System.out.println("num = " + n);
	
		Random ran = (Random)vector.lastElement(); // 마지막 인덱스(lastElement) 객체 꺼내기
		System.out.println("ran -> " + ran.nextInt(100)); // 100사이의 값 랜덤으로 추출(실행시마다 값 변경)
		
		
	}

}
