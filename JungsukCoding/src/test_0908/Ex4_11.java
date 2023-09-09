package test_0908;

public class Ex4_11 {

	public static void main(String[] args) {
	//피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다
	// 예를 들어 앞의 두 수가 1과 1일때, 그 다음 수는 1+1이 =2 되고 그 다음 수는 1+2 = 3
	// 1,1,2,3,5,8,13,21,... .
	//피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성
	int first = 1; // 1번째 피보나치의 수열의 수
	int second =1; // 2번째 피보나치의 수열의 수
	int result = 0; //3번째 피보나치의 수열의 수부터 담을 변수 , 1번째와 2번째 수의 더한 값
	
	
	//System.out.println("피보나치수열의"+ "1번쨰 수는 " + first+ "입니다");
	//System.out.println("피보나치수열의"+ "2번쨰 수는 " + second+ "입니다");
	System.out.print(first + "," + second);
	
	for(int i = 1; i<=8; i++){
		result = first+second; // 1번째 + 2번쨰
		first = second; // 2번째 -> 1번째 수로 이동
		second = result; // 3번째 결과 -> 2번째 수로 이동 
		//System.out.println("피보나치수열의"+ (i+2) + "번쨰 수는 " + result+ "입니다");	
		System.out.print(","+ result);		
		}
		
	}
	
}


