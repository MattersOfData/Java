import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
	
		//if문 : 조건식 참이면 작동 (거짓이면 아무런 작동 x)
		//		조건문은 논리형 결과가 나오는 수식 또는 변수
		//		if(조건문/논리형 결과가 나오는){조건문이 참일떄 실행할 실행문 표기}
		 		
		//<임의의 값을 입력받아 그 값이 양수면 출력, 양수가 아니면 아무런 작업 안함>
				
		Scanner scan = new Scanner (System.in);
		//int n = 1234;
		
		System.out.print("임의의 수 = ");
		int data = scan.nextInt();
		
		if(data>=1) {
			System.out.println("data=>"+ data);
			int x = 5678;
			//System.out.println("if->"+ n + "," +x);
		}
		
		System.out.println("The end....");
		
		
		// 메인 메소드 안에 있는 변수들은 그 안 어디서든 사용 가능, but if 안에 있는 변수는 사용불가
		// if 문에서 선언한 지역변수 x는 if문을 벗어나면 사용할 수 없음
		//System.out.println("main->"+n +","+x); 
	
		//<응용버전>
					
		do {
			System.out.println("정수를 입력하세요");
			int num = Integer.parseInt(scan.nextLine());
			if (num>=1) {
			System.out.println("입력한 수는" + num + "입니다");
			System.out.println("The end...");
			break;
			} else  System.out.println("음수를 입력하셨습니다");
			}while(true);
		
			}

}



