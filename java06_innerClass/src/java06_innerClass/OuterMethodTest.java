package java06_innerClass;

public class OuterMethodTest {
	String email = "abcd@nate.com";
	public OuterMethodTest() {}

	public void innderTestMethod() {
		String addr = "서울시 강남구" ;
		
		//메소드내에 정의하는 내부클래스
		class MethodInner{
			//멤버변수
			int num = 2222;
			String username = "홍길동";
			MethodInner(){}
			void print() {
				System.out.println("번호 = " + num);
				System.out.println("이름 = " + username);
				System.out.println("주소 = " + addr); /// 메소드내의 선언한 변수
				System.out.println("이메일 = " + email); /// 외부 멤버변수
			}
		}
		//메소드내의 내부클래스는 반드시 객체 생성
		MethodInner mi = new MethodInner();
		mi.print();
	}
	
	
	
	
	public static void main(String[] args) {
		OuterMethodTest omt = new OuterMethodTest();
		omt.innderTestMethod();

	}

}
