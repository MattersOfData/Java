
public class IfElse02 {

	/*
 	if(조건식1){ 조건식1이 참일때 실행문;
 	}else if(조건식2){ 조건식2가 참일때 실행문;
 	}else if(조건식3) {조건식3이 참일때 실행문;
 	}else{ 조건식 1,2,3이 모두 만족하지 않을때
 	}
	 */
	
	public static void main(String[] args) {
		// <국어, 영어, 수학, 총점, 평균, 학점 구하기>
		// 학점 기준 : 90 ~100 (A학점) , 80~89.9999(B학점) ,70~70.9999(C학점) , 60~69.9999(D학점) , 0~59.9999(F학점) 
		
		int kor = 95;
		int eng = 80;
		int mat = 70;
		
		//총점
		int tot = kor + eng + mat;
		//평균
		double avg = tot /3.0 ;
		
		
		//1. 학점(if else if문을 이용하여 학점 구하기
		char grade ;
		if(avg>=90) { //A학점
			grade = 'A';
		} else if (avg>=80){ //B학점
			grade = 'B';
		} else if (avg>=70) {//C학점
			grade = 'C';
		} else if (avg>=60) {//D학점
			grade = 'D';
		} else { //F학점
			grade = 'F';
		}
		
		System.out.println("총점 = "+ tot);
		System.out.println("ㅎ평균 = "+ avg);
		System.out.println("학점 = "+ grade);
		
		
		//2. if 문으로 구해보기 <-> if 조건문마다 새롭게 시작 but else if 는 각 조건문끼리 연결됨
		String grade2 = "";
		if (avg>=90) {
			grade2="A";
		}
		if(avg>=80 && avg<90) {
			grade2= "B";
		}
		if(avg>=70 && avg<80 ) {
			grade2= "C" ;
		}
		if(avg>=60 && avg<70 ) {
			grade2= "D" ; 
		}
		if(avg>=60 && avg<0 ) {
				grade2= "F" ;	
		}
		
		System.out.println("총점 = "+ tot);
		System.out.println("평균 = "+ avg);
		System.out.println("학점 = "+ grade2);
		

	}

}


