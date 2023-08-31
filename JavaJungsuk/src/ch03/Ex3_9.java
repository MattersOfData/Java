package ch03;

public class Ex3_9 {
	public static void main(String[] args) {
		//문자형 변수 ch가 대문자 or 소문자 or 숫자 -> true 출력
		char ch = 'z' ;
		boolean b = ('a'<= ch && ch <= 'z' ) || ('A' <= ch && ch<='Z') || ('0'<= ch && ch <= '9'); 
		System.out.println(b);
		
		
		
		}
	}


