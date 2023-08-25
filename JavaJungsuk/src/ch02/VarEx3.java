package ch02;

public class VarEx3 {

	public static void main(String[] args) {

		//int score ; 지역변수는 읽기 전에 반드시 초기화 필수!
		int score = 100;
		System.out.println("score = " + score);
		score = 200; // 변수이기 때문에 값 변경 가능 !
		System.out.println("score = " + score);
		
		final int MAX = 100;
		System.out.println("MAX = " + MAX);
		//MAX = 200;  MAX는 상수임으로, 처음 값에서 다른값으로 변경할수 X
	}

}
