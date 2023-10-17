package ch11;

import java.util.Vector;

public class Ex11_3 {

	public static void main(String[] args) {
		Vector v = new Vector(5); // 용량(capacity)이 5인 Vector 생성
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // 빈 공간을 없앤다(용량 == 크기 같아짐) -> 새로운 배열 생성
		System.out.println("=== After trimTosize() ===");
		print(v);
		
		v.ensureCapacity(6); // capacity가  최소한 6이 되도록 함
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7); //size가 7이 되도록 함(단, capacity는 12)
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();// v의 모든 요소 삭제
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size:" + v.size());
		System.out.println("capacity: " + v.capacity());
		System.out.println();
		
	}
}
