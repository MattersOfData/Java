import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//if else 문 사용하기
		
		//1. Scanner 만들기
		Scanner scan = new Scanner(System.in);

		//데이터준비
		//계산
		//출력
		//2. 메뉴선택
		System.out.print("원하는 메뉴를 선택하세요 1. 사각형의 넓이, 2. 원의 넓이");
		int choice = scan.nextInt();
		
		//3. 선택 1일떄,
		if(choice == 1) {
			System.out.print("가로(밑변)=");
			int w = scan.nextInt(); // 가로
			System.out.print("세로(높이)= ");
			int h = scan.nextInt(); // 세로
					int sq = w * h ;  
			System.out.println("1번을 선택하셨습니다");
			System.out.printf("가로(밑변)= %d , 세로(높이) = %d, 사각형의 넓이 = %d", w,h,sq);
			
		// 4. 선택2 일때, (or 1외의 값이 올때)	
		}else{ //if 로 써도 됨
			if(choice == 2) {
				System.out.print("반지름=");
				int r = scan.nextInt();
				
				double c = r * r * Math.PI ; 
				//double c = r * r * 3.141592 ; 
				System.out.println("2번을 선택하셨습니다");
				System.out.printf("반지름= %d , 원의 넓이 = %f", r,c);	
				}else {
					System.out.println("메뉴를 잘못선택하였습니다.");
				}
				}
			}
		}
		
					

/*
 사각형의 넓이 = 가로 * 세로
 원의 넓이 = 반지름 * 반지름 * 3.14
 
 
 실행결과
 원하는 메뉴 선택(1. 사각형의 넓이, 2. 원의 넓이)? 
 
 1번 메뉴 선택
 가로(밑변)=
 세로(높이)=
 사각형의 넓이 = 
 
 2번 메뉴 선택
 반지름 = 
 원의 넓이 = 
  

 */


