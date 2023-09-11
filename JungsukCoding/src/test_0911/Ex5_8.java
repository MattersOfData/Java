package test_0911;


public class Ex5_8 { // p.196 예제 5-11 : 빈도수 구하기 참고!!
// 배열 answer에 담긴 데이터를 읽고, 각 숫자의 개수를 세어서 개수만큼 "*"찍어서 그래프를 그리는 프로그램 코드를 완성하시오.
	public static void main(String[] args) {
		int[] answer= {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4]; // 각 숫자가 몇번 반복해서 나타나는지 담는 배열 
		
		// 1. answer에 담긴 데이터를 읽고 & 중복 제거 -> counter 이용
		for(int i =0; i< answer.length; i++) { 
			counter[answer[i]-1]++; // counter 배열 인덱스 : 0 ~ 3 & counter에 담을 값 범위 : 1 ~ 4 & answer 배열 값 범위 : 1~4 
		}
		// 2. counter에 담긴 숫자만큼 * 출력
		for(int i = 0; i< counter.length; i++) {
			System.out.print((counter[i]));// 각 요소별 반복된 횟수
			for(int j = 0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}// end of main
}// end of class