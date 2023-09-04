package ch04;

public class Ex4_2 {

	public static void main(String[] args) {
		int sum = 0;
		//1. 1부터 20까지의 정수
		for(int i = 1; i <=20; i++) { // 1,2,3,,,,20
			//2. 2 또는 3의 배수가 아닌 수
			if(i%2 !=0 && i%3 !=0) {
				//3. 총합을 구하기
				sum = sum + i;
			}
		} System.out.println("sum = " + sum);
		
		
		
	}

}
