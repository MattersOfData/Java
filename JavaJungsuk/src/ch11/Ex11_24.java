package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_24 {
// HashSet with equals() & hashCode() 예제
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이여서 저장 x
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set); //[David:10, abc, David:10]
								// equals()와 hashCode()를 오버라이딩 안할 경우, HashSet이 제대로 동작 x
								// 중복값 제거 x(잘못된 값 출력) 
	}

}

class Person {
	
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // int hash(Objects....values); 가변인자
										// values = iv -> 비교 기준
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false; // 형변환 가능 여부 확인 !
		Person p = (Person) obj; // 형변환 !
								// obj라는 리모콘에는 age와 name이 없음 --> obj.name & obj.age 없음
		return this.name.equals(p.name) && this.age == p.age ; // 나자신(this)의 이름과 나이와 p와 비교(매개변수 obj의 이름, 나이)
	}

	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+ ":" + age;
	}
}
