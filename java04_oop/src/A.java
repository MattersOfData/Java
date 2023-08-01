
public class A {
//멤버변수(속성)
	int isbn = 123456;
	String book = "자바";
	private String author = "홍길동"; // A클래스 안에서만 사용(아무리 상속받아도(B클래스), 사용할수없음)
									// 상속되지 않음
//생성자메소드
	public A () {
		System.out.println("A클래스의 생성자 메소드 실행됨 >>>");
	}
	public A(String food) {
		System.out.println("food->" + food);
	}
//메소드
	public void method1 () {
		System.out.println(isbn + "****" + book + "****"+ author);
	}
	private void sum() {
		int tot = 0;
		for(int i= 1; i<=100 ; i+=2) {
			tot += i;
		}
		System.out.println("1~ 100까지의 홀수의 합은 " + tot);
	}
	void sum(int max) {
		int tot = 0;
		for(int i= 1; i<=max ; i+=2) {
			tot += i;
		}
		System.out.println("1~" + max + "까지의 홀수의 합은 " + tot + "from A");
	}
	
}
