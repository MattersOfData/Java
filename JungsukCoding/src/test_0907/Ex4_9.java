package test_0907;

public class Ex4_9 {

	public static void main(String[] args) {
	// 숫자로 이루어진 문자열 str 이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성
	// 예시 : 문자열 " 12345" --> 1+2+3+4+5  -> 15 출력
		String str = "12345"; // String 클래스는 char형 변수들의 '배열' 
		int sum = 0;
		
		for(int i = 0; i<str.length();i++) {// 배열이기때문에, length사용 가능
											// index는 0부터 시작
			int elements = (int)(str.charAt(i)); // char '1'이기 떄문에, 49 으로 표현됨
												// int 1로 표현할 수 없을까???!!!!
			elements = elements - 48; 			// 1 -> 49 , 2 -> 50 , 3 -> 51 로 민들려면, 48 차이가 나네??!!
			//System.out.print("elements = " + elements);
			sum = sum + elements; // 각 요소들을 더함
			//System.out.println(" ,sum = " + sum);
			}System.out.println(sum);
		
	}

}
