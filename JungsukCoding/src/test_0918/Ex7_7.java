package test_0918;
// 다음 코드를 실행했을떄 호출되는 생성자의 순서와 실행결과를 적으시오
class Parent{
	int x = 100;
	
	Parent(){this(200);} // 5. Parent 기본생성자 -> this(200);를 호출하여 매개변수가 있는 다른 생성자를 호출
	
	Parent(int x){this.x = x;} // 6. Parent의 멤버 변수 x에 200 대입
	int getX() { // 8. Parent 클래스에 정의되어 있으며, Parent 클래스의 멤버 변수 x 값을 반환
		return x;}
	}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000); // 2. Child 클래스의 기본 생성자 -> this(1000)를 호출하여 매개변수가 있는 다른 생성자를 호출
	}
	Child(int x){ // 여기서 Child 생성자가 먼저 실행 --> 그 다음 super() 실행됨 !!!
		//super(); // 4. 컴파일러 자동추가 & 부모 클래스인 Parent 클래스의 기본 생성자를 호출
		this.x = x;} // 3. Child의 멤버 변수 x에 1000 대입
} 

public class Ex7_7 {

	public static void main(String[] args) {
		Child c = new Child(); // 1. Child 클래스의 객체 c를 생성 -> Child 클래스의 기본 생성자를 호출
		System.out.println("x= "+ c.getX()); // 7. Parent에 있는 getX메서드 호출 * 9. x= 200 을 println으로 문자열 출력

	}
}
