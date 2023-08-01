package java06_innerClass;

public class OuterTest {
	int num = 5678;
	String name = "세종대왕";
	String tel = "010-1234-5678";
	
	
	public OuterTest() {
		
	}
	public void gugudan(int dan) {
		for(int  i= 2; i<=9;i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}	
	public void testMeThod() {
		// 외부 클래스에서 내부 클래스의 메소드 호출하는 것 불가능 
		//getInfor();
		// but, 내부 클래스를 객체로 만들면 가능
		InnerTest it = new InnerTest();
		it.getInfor();
		}
	
		//내부 클래스 : 클래스에 소속되어있는 클래스
		//1. 클래스 영역에 정의된 클래스
		class InnerTest{
			//멤버변수
			int num = 1234; // OuterClass에 num 이라는 변수 있어도 에러 발생 x -> 다른 클래스
			String name = "홍길동";
			//생성자메소드
			InnerTest(){
				System.out.println("InnerTest()생성자 메소드");
			}
			//메소드
			void getInfor() {
				System.out.println(num + "," + name + "," + tel);
				//외부 클래스 : tel , 내부 클래스 : num = 1234, name = 홍길동
				//즉, 내부 클래스는 외부클래스의 멤버변수를 접근할 수 있다.
				
				//내부클래스에서 외부 클래스의 메소드 호출 가능
				gugudan(5);
			}
		}	
		//2. 메소드내의 내부 클래스 -> OuterMethod 에서 진행
		//3. 익명의 내부 클래스
	
		
	public static void main(String[] args) {
		//내부 클래스의 객체 생성
		//1. 외부 클래스 객체 만들기
		OuterTest ot = new OuterTest();
		//2. 내부 클래스 객체 만들기
		//OuterTest.InnerTest it = ot.new.InnerTest();
		
		//한번에 외부+ 내부 클래스 호출하기
		OuterTest.InnerTest it = new OuterTest().new InnerTest();
		
		//메소드 호출
		it.getInfor();
		
		OuterTest ot2 = new OuterTest();
		ot2.testMeThod();
	}

}

