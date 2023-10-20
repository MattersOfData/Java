package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_11 {
// 최근 5개의 명령어 history를 보여주기
	
	static Queue q = new LinkedList(); // Queue 인터페이스를 구현한 클래스 중 하나 선택
	// ** Ctrl + o 누르면, 가지고 있는 멤버 보임
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 함
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // 앞 , 뒤 공백 삭제
				
				// input 값에 따라 처리
				if("".equals(input)) // 1. 빈칸이면,
						continue; // 		 while로 돌아가기
				
				if(input.equalsIgnoreCase("q")) { // 2. q or Q 이면
					System.exit(0); // 프로그램 종료
				}else if(input.equalsIgnoreCase("help")) {// 3. help이면, 
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE+ "개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) { //4. history면,
					//int i = 0;
					save(input);// 입력받은 명령어를 저장하고,
					LinkedList list = (LinkedList)q; // LinkedList의 내용을 보여줌
												 	// LinkedList로 q를 형변환 
													// 참조변수는 q이지만, 실제 객체는 LinkedList이기때문에 형변환 가능
					final int SIZE = list.size(); // 메서드 한번만 호출하게 함(같은 값을 반복해서 호출하는 건 좋지 않음)
					
					for(int i = 0; i< SIZE; i++)
						System.out.println((i+1)+ "."+ list.get(i)); // list에 저장되어있는 객체 읽기
				}else {
					save(input);
					System.out.println(input);
				}// end of if(input.equalsIgnoreCase
			}catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}// end of while(true)

	}//end of main
	
	public static void save(String input) {
		if(!"".equals(input)) // 빈문자열이 아니면, 
		// = if(input != null && !input.equals("")) -> 이렇게 쓰면 nullException 발생 가능성 있음
			q.offer(input); // queue에 input을 저장
		
		if(q.size()>MAX_SIZE) //size()는 Collection인터페이스에 정의
			q.remove(); // queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제
			// = q.poll();
	}

} // end of class
