package java07_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		}

	public void start(){
	//ArrayList : 입력순서 유지, 중복객체 허용
	//			  데이터베이스에서 데이터 꺼낼때 많이 사용 
	//ArrayList list = new ArrayList();//객체 생성
	//List list = new ArrayList(); list 형으로 생성하는 경우가 더 많음 (list 상속 받고, 추상클래스이기때문에 implement로)
								// why ? list interface로서 , 상속관계에 있고, list 제공하는 속성 사용 가능
	List<Student> list = new ArrayList<Student>(); // 같은 타입의(한 종류) 객체들을 한번에 담아군 것 -> 컬렉션에 담겨져있는 것 꺼내보기 
									// 특히, Student 클래스만 (같은 타입)만 담을 수 있는 제너릭 컬렉션 ! ->  <> 입력값 없으면 object

	
	Student stu1 = new Student();
	stu1.setName("이순신");
	stu1.setGrade(3);
	
	Student stu2 = new Student(2, "홍길동" , "010-1234-1234" , 90, 80, 90);
	Student stu3 = new Student(1, "안중근" , "010-2222-3333", 70, 82, 90);
	
	list.add(stu1); // 인덱스 0번쨰
	list.add(stu2); // 인덱스 1번째 -> stu3 으로 인해 2번째로 이동
	list.add(1, stu3); // 인덱스 1번째에 stu3 입력 ! 
	
	// index, 확장된 for문 
	// for (Student s : list) { // list는 object이여서 상위클래스를 student 하위클래스로 받을수 없음 -> object으로 받아줌
	for(Object obj : list) {
		Student s = (Student)obj; // 다시 형변환 
		System.out.println(s.toString());
		}
	
	for(Student s : list) { // 위에 Student 클래스를 특정하여 list 생성하여서, 강제형변환 필요 x
							// 즉, 제너릭으로 생성된 제너릭은 한종류의 객체만 추가할 수 있고,
							// 객체를 get()할 경우, 형변환 필요 x
		System.out.println(s.toString());
	}	
		Student getData1 = list.get(1);
		System.out.println(getData1.toString());
	
		int idx = list.indexOf(stu1); // stu1의 인덱스 위치
		System.out.println("stu1.index -> " + idx);
		
		System.out.println("isEmpty -> " + list.isEmpty()); // list 의 값 있는지 여부
		
		Student obj = list.remove(1); //1번쨰 인덱스 삭제  
		System.out.println("size -> " + list.size()); // 인덱스 개수 
		System.out.println(obj.toString()); 
		
		boolean boo = list.remove(stu1); // stu1 삭제
		System.out.println(boo + " , " + list.size()); // 인덱스 개수 
	}
	
	
		public static void main(String[] args) {
		new ArrayListTest().start();

	}

}
