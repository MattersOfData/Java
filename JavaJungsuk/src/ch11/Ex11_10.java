package ch11;
import java.util.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_10 {

	public static void main(String[] args) {
//		if(args.length!=1) {
//			System.out.println("Usage:java ExpValidCheck\"EXPRESSION\"");
//			System.out.println("Example : java ExpValidCheck\"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2)"; // 1. 여는 괄호 2. 여는괄호 3. 닫는괄호(스택에서 뻄) 4. 닫는괄호(스택에서 뺌) -> 스택비워지면 괄호 OK
										   // "((3+5)*8-2))))"; 스택에서 꺼낼 괄호가 없는 경우 
		//String expression = args[0]; // 위에 if 식 사용할꺼면-> run configuration에서 arguments에서 수식입력 필요 !
		System.out.println("expression:" + expression);
		
		try {
			for(int i = 0; i< expression.length(); i++) {
				char ch = expression.charAt(i); // expression 문자열에서 하나씩 꺼냄
				
				if(ch =='(' ) { // 여는 괄호라면
					st.push(ch+""); // 넣기
				}else if(ch== ')' ) {
					st.pop(); // 꺼내기
				}
			} // end of for
			
		
			if(st.isEmpty()) { //스택이 비어있으면
				System.out.println("괄호가 일치합니다");
			}else {// 스택이 비어있지 않으면
				System.out.println("괄호가 일치하지 않습니다");
			}
			
		}// try
		catch (EmptyStackException e) {// 스택에서 꺼낼 괄호가 없을 경우
			System.out.println("괄호가 일치하지 않습니다2222");
		}
		
	} // main

}// class