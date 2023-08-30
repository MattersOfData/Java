package ch03;

public class Ex3_1_1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65
		
		System.out.println(1+x <<33); // 6
		System.out.println(y>=5 || x<0 && x>2); // true : &&가 ||보다 우선순위가 높ㅇㅡㅁ -> 먼저 연산
		System.out.println(y += 10 - x++); // y = y + 10 - x++ , 여기서 x 는 후위형이기때문에, 10-x 먼저 계산된 후, 1 증감됨 
		System.out.println("x = " + x + " y = " + y);
		System.out.println(x+=2); // x = x + 2 = 3 + 2 = 5
		System.out.println(!('A' <= c && c<= 'Z')); // c 가 대문자인지 아닌지 확인하는 조건식 , false
		System.out.println('C'- c); //int 보다 작은타입인 경우(char), int로 변환한 후에 연산 수행 : 'C'- 'A' = 67-65 = 2
		System.out.println('5' - '0'); // int보다 작은 타임 (char) -> int로 변환후 연산 -> 53-48 = 5
		System.out.println(c+1); // int보다 작은 타입(char) -> 'A' = 65 -> 65 + 1 = 66 , 단 c의 값에는 변화 없음
		// 단항연산자는 int보다 작은타입이지만, 형변환 x -> 문자 그대로 출력
		System.out.println(++c); //B
		System.out.println(c++); // 후위형이기때문에, c 출력한 후에 1 증가 , B
		System.out.println(c); // C
		
		
	}

}
