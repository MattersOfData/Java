package ch04;

public class Ex4_3 {

	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0;
		// 1. 1부터 10까지
		for (int i = 1; i<=10; i++) {
			// 2. i의 누적합 : 1 , 1+2, 1+2+3, ,,,
			sum = sum + i; 
			// 3. sum의 누적합 : 1 + (1+2) + (1+2+3) + ,,,,
			totalSum = sum + totalSum;
		}
		System.out.println("totalSum = " + totalSum);
		
	}

}
