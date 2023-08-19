package ch06;

public class Ex6_2 {// 소스파일과 클래스 이름이(main 메서드가 있는) 동일해야 제대로 실행됨!

	public static void main(String[] args) {
		Tv t ; // Tv 인스턴스를 참조하기 위한 변수 t
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재채널은" + t.channel + "입니다." );

	}
}
	class Tv {
		// Tv의 속성(멤버변수)
		String color;
		boolean power;
		int channel;
		
		//Tv의 기능 (메서드)
		void power() {power = !power;}
		void channelUp() { ++ channel;}
		void channelDown() { --channel;}
	}
