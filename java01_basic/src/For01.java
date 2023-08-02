
public class For01 {

	public static void main(String[] args) {
		
	
	//반복문 -> for문 
	// for(초기값; 조건식(최종값);증감값) {
	//	실행문;
	//  실행문; }	
		
		
		
	//1.  1 , 2, 3, 4, 5를 출력하세요
		
		int sum = 0; // 누적시킬변수
		int i = 0 ; 
				
		for(i=1 ; i<=100 ; i++) { //다 같은 의미 : i++, ++i, i=i+1, i+=1
			
			sum = sum + i ; // sum += i;
			//System.out.println(i + "," + sum); //반복문 안에 있으니, 100번 출력됨
			}
		System.out.println("1~"+ (i-1) +"까지의 합은 = " + sum); // 100번째 결과값만 알고 싶을경우 
								//+, - 연산자 우선순위가 동일하기 때문에 먼저 i-1을 우선순위해줘야함 !
	
	//2. 5, 4, 3, 2, 1를 출력하세요
		 
		 for(int j=5; j>0 ; j--) { //--j, j--, j=-1, j=j-1 , j = 5, 4, 3, 2, 1
			 System.out.println(j);
		 }
		 
	 //3. 1~10 숫자 중,  짝수만 출력하세요.
		 for (int x = 2; x<=10 ; x+=2) {// x = x+2
			 System.out.println("x=" + x);
		 }
		 
	  //4. 1~10 숫자 중,  홀수만 출력하세요.
		 for(int y = 1 ; y<=10 ; y+=2) {
			 System.out.println("y =" + y);
		 }
	}
		
}



