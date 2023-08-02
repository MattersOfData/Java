
public class SingletonMain {

	public SingletonMain() {
		
	}

	public static void main(String[] args) {
		 //SingletonTest st = new Singleton();
		//생성자가 메소드 private으로 객체 생성불가
		// 객체 생성 -> SingletonTest 안에 있는 메소드 사용하고 싶을때	
		// but, Singleton의 경우, new를 이용하여 객체를 생성할 수 없도록 만듬
		// 접근제한자에 영향 받음
		
		//객체명.멤버변수 접근 불가 하도록 private으로 설정할수 있음
		SingletonTest st =  SingletonTest.getInstance(); // 주소 500번지?
		SingletonTest st2 = SingletonTest.getInstance(); // 주소 500번지?
		
		System.out.println(st);
		System.out.println(st);
		
		Member m1 = new Member(); //주소 100번지 ?
		Member m2 = new Member(); // 주소 200 번지?
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
