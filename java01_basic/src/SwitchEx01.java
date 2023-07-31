import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {

	/* 	콘솔에서 국어, 영어, 수학점수를 입력받아 총점, 평균, 학점을 구하라.

		학점 기준 : 90 ~100 (A학점) , 80~89.9999(B학점) ,70~70.9999(C학점) , 60~69.9999(D학점) , 0~59.9999(F학점) 
		정수의 범위는 0 ~ 100점 사이,

		Switch문 활용 (if 문 사용하지 않음)

		실행
		국어점수 = 80 
		영어점수 = 80 
		수학점수 = 80 

		총점 = 240 
		평균 = 80  
		학점 = B
	 */
	
		
	//1. Scanner 준비
		Scanner scan = new Scanner(System.in);
		
		
	//2. 데이터 준비
		
		System.out.println("국어점수 =");
		int kor = scan.nextInt();
		System.out.println("영어점수 =");
		int eng = scan.nextInt();
		System.out.println("수학점수 =");
		int math = scan.nextInt();
		
		
		
	//3. 계산
		//1) 총점, 평균
		int sum = kor + eng + math ;
		double avg = (double)(kor + eng + math)/3;
		
		//2) 학점 구하기 (switch 사용!)
		//***switch 범위가 없는 조건문 , 실수는 사용 못함
		
		//(int)(avg/10) :정수화 하고나서 계산
		//(int) avg/10 : 실수/정수 = 실수 -> 결과값 -> 정수
		
		String grade = "";
		switch((int)(avg/10)) { //95.6 -> 9.56 -> 9
		case 10:
		case 9 :grade = "A" ;
			break;
		case 8 : grade = "B";
			break;
		case 7 : grade = "C";
			break;	
		case 6 : grade = "D";
			break;	
		default :
			grade = "F" ;
		
		}
		
		System.out.printf("총점 = %d\n" , sum );
		System.out.printf("평균 = %.2f\n", avg );
		System.out.printf("학점 = %s\n", grade );
		
	}

}



