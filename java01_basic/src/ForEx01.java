import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		
	//단을 입력받아 구구단을 출력하라
	//실행
	//단 입력 -> 5 입력받음 -> 5*1 = 5 , 5*2 = 19 ------, 5*9 = 45
	
	
	//1.Scanner 준비 (import &  객체 생성)
		Scanner scan = new Scanner(System.in);
		
	//2.데이터 준비
		System.out.print(" 출력할 단 을 입력하세요 = ");
		int dan = scan.nextInt();
				
		for(int i = 1 ; i<=9 ; i++) { //i = 1,2,3 ~ 9
			int result = dan * i ;
			System.out.printf("%2d * %2d = %3d\n", dan, i , result);
		}
		
		
	
	}

}
