package ch03;

public class Ex3_10_10 {
	public static void main(String[] args) {
		//1. 풀이
		char ch = 'A';
		//1) 대문자인경우에만 
		if('A' <= ch && ch <='Z')
		//2) 소문자로 변경(대문자와 소문자의 차이는 32)
		ch = (char) (ch + 32);
		System.out.println("ch = " + ch);
		
		//2. 풀이
		char ch1 = 'A';
		char lowerCase = ('A' <= ch && ch <='Z')? (char)(ch+32): ch; 
						// 대문자인지 확인하는 조건식 ,  덧셈연산결과 int -> char 로 형변환
		System.out.println("ch1 = " + ch1);
		System.out.println("ch to lowerCase: " + lowerCase);
		}
	
	}


