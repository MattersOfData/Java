import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		

		/* 두수를 입력받아 두수 모두 양수일떄는 합차곲몫을 구하라.
		 * 실행
		 * 첫번쨰수 = 10
		 * 두번쨰 수 = 3
		 * 10 + 3 = 13
		 * 10 - 3 = 7
		 * 10 * 3 = 30
		 * 10 / 3 = 3
		 * 
		 * 실행
		 * 첫번쨰수 = 10
		 * 두번쨰수 = -5
		 */
		//1. 데이터 준비
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("첫번째 수 = ");
		int num1 = scan.nextInt();
		System.out.print("두번째 수 = ");
		int num2 = scan.nextInt();
		
		//2. 계산
			
		if(num1>0 && num2>0)  {
			int plus = num1 + num2;
			int minus = num1 - num2;
			int multi = num1 * num2;
			int divide = num1 / num2 ;
			
		//3. 출력
			System.out.printf("%d + %d = %d\n" , num1, num2, plus);
			System.out.printf("%d - %d = %d\n" , num1, num2, minus);
			System.out.printf("%d * %d = %d\n" , num1, num2, multi);
			System.out.printf("%d / %d = %d\n" , num1, num2, divide);
			
			
			scan.close();
			
			}
		
		
	}

}