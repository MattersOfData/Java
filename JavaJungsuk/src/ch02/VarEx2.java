package ch02;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 3, y = 5;
		int tmp ; // 빈컵
		System.out.println("x = " + x + "," + " y = " + y);
		
		// x와 y의 값 바꾸기 
		tmp = x; // 1. x 값을 tmp에 저장
		x = y; // 2. y 값을 x 에 저장
		y = tmp; // 3. tmp 값을 x 에 저장
		
		System.out.println("x = " + x + "," + " y = " + y);
	
	}

}
