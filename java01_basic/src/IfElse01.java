import java.util.Scanner;



public class IfElse01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//정수를 입력받아 0보다 크면 100을 곱한값을 출력하고, 0보다 작으면 양수로 만들어 100을 곱하여 출력
		
		// if_else : 둘중에 하나 조건만 실행됨
		// if(조건식) { 참일때 실행문; }
		//	else{ 거짓일떄 실행문;}
						
		System.out.print("정수입력=");
		int num = scan.nextInt();
		int result;
		if(num>0) { // 양수
			result = num * 100;
		}else {//0, 음수
			if(num==0) {
				result = 0;
			}else {
			result = -num * 100;
			}
		}	
		System.out.println("result = " + result);
				
	}

}

