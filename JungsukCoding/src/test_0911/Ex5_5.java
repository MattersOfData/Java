package test_0911;


public class Ex5_5 {
// 1~ 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 만드시오.
	public static void main(String[] args) {
	int[] ballArr = {1,2,3,4,5,6,7,8,9};// 3자리 숫자가 가질 수 있는 값(1 ~9)(이렇게 풀면, if문 쓰지 않아도,중복없음)
	int[] ball3 = new int[3];
	
	// 1. 배열 ballArr의 임의의 요소를 골라서 위치를 바꿈
	for(int i = 0; i< ballArr.length; i++) { 
		int j = (int)(Math.random()*ballArr.length)+1; // 범위:  1<= j < 10 
		int tmp = 0; // 두 값을 바꾸기 위한 빈공간
		
		tmp = ballArr[i]; // ballArr 배열의 i번째 요소 -> tmp
		ballArr[i] = j; // j(1~9 까지 랜덤선택값) -> i
		j = tmp;
		}
	
	//2. 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
	for(int i = 0; i< ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
	//3. 배열 ball3배열 요소 하나씩 출력
	for(int i = 0; i < ball3.length; i++) {
		System.out.print(ball3[i]);
		}
	
	}// end of main
}// end of class