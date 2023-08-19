package ch06;

public class Ex6_1 {// 소스파일과 클래스 이름이(main 메서드가 있는) 동일해야 제대로 실행됨!

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel);
		System.out.println("t2의 channel값은 " + t2.channel);
		
		t1.channel = 7;// channel 값을 7으로 
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel);
		System.out.println("t2의 channel값은 " + t2.channel);
		
		t2 = t1; // 참조변수 t1의 값을 t2에 저장
		System.out.println("t1의 channel값은 " + t1.channel);
		System.out.println("t2의 channel값은 " + t2.channel);
		
	}
}
