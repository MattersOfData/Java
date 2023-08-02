
public class StudentTest {

	public StudentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student stu = new Student(); //(0, null, null, 0,0.0,0)
		Student stu2 = new Student(3, "제니","010-4567", 85,56,58);
		
		System.out.println(stu2.getName()); // public String getName() {return name;} 호출 ! 
		System.out.println(stu2.toString()); //한번에 변수들 확인하고 싶을때
		System.out.println(stu.toString());
	}

}
