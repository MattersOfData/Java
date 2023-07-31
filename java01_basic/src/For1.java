
public class For1 {

	public static void main(String[] args) {
		
		//반복문 : for문( 초기치, 최종치, 증가치) {}
		// for(초기값; 조건식(최종값);증감값){
		//	 실행문;
		//	 실행문;
		
		
		
		/* 출력1 , 2, 3, 4, 5*/
		int sum = 0; // 누적시킬변수
		int i = 0 ; 
				
		for(i=1 ; i<=100 ; i++) { //i++1, ++i, i=i+1, i+=1
			
			sum = sum + i ; // sum += i;
			//System.out.println(i + "," + sum); //반복문 안에 있으니, 100번 출력됨
			}
		System.out.println("1~"+ (i-1) +"까지의 합은 = " + sum); // 100번째 결과값만 알고 싶을경우 
								//+, - 연산자 우선순위가 동일하기 때문에 먼저 i-1을 우선순위해줘야함 !
	
		//출력 : 5, 4, 3, 2, 1
		 
		 for(int j=5; j>0 ; j--) { //--j, j--, j=-1, j=j-1 , j = 5, 4, 3, 2, 1
			 System.out.println(j);
			 		 
		 }
		 
		 // 출력 : 1~10까지 짝수만 출력하라.
		 for (int x = 2; x<=10 ; x+=2) {// x = x+2
			 System.out.println("x=" + x);
		 }

	}
}



//int sum = 0; // 누적시킬변수
//for(int i=1 ; i<=100 ; i++) { //i++1, ++i, i=i+1, i+=1
//	sum = sum + i ; // sum += i;
	//System.out.println(i + "," + sum); //반복문 안에 있으니, 100번 출력됨
//	}
//System.out.println("1~"+ i +"까지의 합은 = " + sum); // 100번째 결과값만 알고 싶을경우
//}
//}



/* 

  }
  
 */

