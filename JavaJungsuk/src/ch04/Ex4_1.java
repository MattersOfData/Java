package ch04;

public class Ex4_1 {

	public static void main(String[] args) {
		//1. int 형 변수x가 10보다 크고 20보다 작을떄 true인 조건식
			//	10 < x && x < 20 ; 
		//2. char 형 변수ch 가 공백이나 공백이나 탭이 아닐 때 true인 조건식
			//	!(ch == ' ' || ch == '\t') or ch !=' ' && ch != '\t';
		//3. char형 변수ch ‘x' ’X' true 형 변수 가 또는 일 때 true인 조건식
			//	ch == 'x' || ch == 'X';
		//4. char형 변수ch 가 숫자(‘0’~‘9’)일 때 true인 조건식
			// '0'<= ch && <= '9';
		//5. char형 변수ch 가 영문자 대문자 또는 소문자 일 때 true인 조건식
			// ('A'<= ch && ch <= 'Z') || ('a' <= ch <= 'z');
		//6. int형 변수year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식 
			// year % 400 == 0 || (year%4 == 0 && year% 100 !=0);
		//7. boolean형 변수powerOn가 false일 때 true인 조건식
			// boolean powerOn = false; or !powerOn ;
		//8. 문자형 참조변수 str이 "yes"이 일 때 true인 조건식
			// str.equals("yes"); or "yes".equals(str);
	}

}
