package test_0913;

import java.util.Scanner;

public class Quiz1_230913 { 
	static int mid(String numbers) { // 최종return 값은 int , 입력받는 값은 String
	//Quiz1. 세 개의 정수를 입력받아, 중간 크기의 값을 반환하는 main 메서드를 작성하시오.
		//1.세 개의 정수 입력받기
		//한문장 단위로 입력받아서 (String) -> 크기비교필요하기에 int로 형변환 
		// 문자열 하나씩 읽음(char)(charAt(index))
		
		numbers = numbers.replaceAll(",",""); // 쉼표 제거
		
		int num1 = numbers.charAt(0)-48; // char형 --> int형 
		int num2 = numbers.charAt(1)-48; // char형 --> int형 
		int num3 = numbers.charAt(2)-48; // char형 --> int형 
		
		int[] numbers_new = {num1,num2,num3}; // int로 변환해준 값들로 새로운 배열 생성
		
		//2. 중간 크기의 정수 찾기( 각 요소의 크기를 두개씩 비교 후, 오름차순으로 배열)
		int tmp =0; // 두 수의 위치 변경시, 필요
		for(int i = 0; i <numbers_new.length-1;i++) {
			if(numbers_new[i]>numbers_new[i+1]) {
			 tmp = numbers_new[i];
			 numbers_new[i]= numbers_new[i+1];
			 numbers_new[i+1]= tmp;
			}
		}return numbers_new[1];
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요");
		String numbers = scan.nextLine(); 
		System.out.println(mid(numbers));

	}// end of main
}// end of class