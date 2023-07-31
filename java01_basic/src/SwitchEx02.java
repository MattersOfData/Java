import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

	// 입력받은 값이 1:빨강, 2:파랑, 3: 노랑, 4:초록 그외의 값은 '잘못된 컬러 정보입니다' 출력
		
		Scanner s = new Scanner(System.in);

		System.out.print("생상을 입력하세요");
		int colorNum = s.nextInt();
		
		switch(colorNum) {
		case 1: 
			System.out.println(colorNum + "은 빨강입니다");
			break;
		case 2:
			System.out.println(colorNum + "은 파랑입니다");
			break;
		case 3: 
			System.out.println(colorNum + "은 노랑입니다");
		case 4:
			System.out.println(colorNum + "은 초록입니다");
			break;
		default:
			System.out.println(colorNum + "잘못된 컬러 정보입니다.");
		}
	
		
	}

}
// -----------------------------------------------------------
	/* switch 문 : 범위가 없는 조건문
		필요한 만큼 case 사용 
		break 만나기 전까지 계속 수행 
 	switch(변수 or 수식 or 상수){
 		case 상수 :
 			실행문;
 			break; (생략가능)
 		case 상수 :
 			실행문;
 			break;
 		case 상수 :
 			실행문;
 			실행문;
 			break;
 		default: (생략가능)
 			실행문;
 		}
 */ 	
	

