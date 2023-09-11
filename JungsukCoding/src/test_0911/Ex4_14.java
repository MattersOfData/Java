package test_0911;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		//1. 1~100 사이의 값 지정 : Math.random() 사용
		int answer= (int)(Math.random()* 100)+1; // 1) 0 <= Math.random() <1 2) 총 100개의 값임으로, 양쪽에 100 곱셈
		System.out.println(answer); 
		
		//2. 1~100 사이값 입력 : Scanner 사용
		Scanner s = new Scanner(System.in); // 사용자 입력을 받기 위해 Scanner 클래스 사용
		int input = 0;
		int count = 0; // 시도횟수를 세기위한 변수
		
		//3. 내값 & 컴퓨터 값 반복 해서 비교 : do-while
		do {
			count++; // 비교 횟수마다 1씩 증가(처음에 더해줌)
			System.out.print("1과 100 사이의 값을 입력하세요");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(answer<input){
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는" + count + " 입니다.");
				break;
				}
			}
		while(true); // 무한 반복문
		
	}// end of main
}// end of class