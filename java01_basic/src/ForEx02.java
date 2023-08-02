import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
	// 정수를 입력받아, 1부터 해당 정수까지의 홀수의 합 & 짝수의 합 & 전체의 합을 출력하세요
	// 실행
	// 1~100까지 홀수의 합 ?
	// 1~100까지 짝수의 합?
	//	1~100까지 합은??
		 
		//1. Scanner 준비
		Scanner scan = new Scanner(System.in);
		
		//2. 데이터 준비
		
		System.out.print("정수를 입력하세요 = ");
		int num = scan.nextInt() ;
		
		//3. 계산
		//1) 짝수, 홀수, 전체 합 담을 변수 				
		int even_t = 0 ; //홀수 합
		int odd_t = 0 ; //짝수 합
		int sum = even_t + odd_t; //전체 합
		
		//2) 짝수일때, 홀수일때 , 나눠서 합 구하기
		for (int i = 1 ; i<=num ; i++ ) {		
			sum = sum + i ;//전체합
			
			if (i % 2 == 1) {//홀수합
				odd_t = odd_t + i ; //odd_t += i
			}else { // 짝수합
				even_t = even_t + i ;//even_t += i 
			}
		}	
						
			System.out.println("1~"+ num +"까지의 홀수의 합 = " + odd_t);
			System.out.println("1~"+ num +"까지의 짝수의 합 = " + even_t);
			System.out.println("1~"+ num +"까지의 총합 = " + sum);
			
			
			
		}
		
	}




