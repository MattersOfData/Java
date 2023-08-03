import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
	//행처리 우선 (왼쪽 -> 오른쪽 ) -> 그 후에 열처리	
		
		
		
//		  *  *  *  *  *
//		  *  *  *  *  *
//		  *  *  *  *  *
//		  *  *  *  *  *
//		  *  *  *  *  *		

		for(int i = 1 ; i<=5; i++) { //행처리
			for (int j=1; j<=5 ; j++) { //열처리
				System.out.printf("%3s","*");
			}	System.out.println(); //줄바꿈
			
		}

//		 * 
//		 * *
//		 * * *
//		 * * * *
//		 * * * * *
		 
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.printf("%3s","*");
		}System.out.println();
		}
		
		
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*		

		//방법 1)
		for(int i =1; i<=5; i++) {
			for(int j= 1; j<= 5-i+1; j++) {
				System.out.printf("%3s","*");
			}System.out.println();
		}
		
		//방법 2)
		for (int row = 5 ; row >=1 ; row--) { //5,4,3,2,1,
			
			for(int col = 1 ; col<=row ; col++) { // 1,2,3,4,5
				System.out.printf("%3s","*");
			}System.out.println();
		}
	
		
//       	     *
//     	       * *
//   		 * * *
// 	       * * * *
//		 * * * * *
  
		for(int i = 1 ; i<=5 ; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.printf("%3s"," ");
			}
			for(int k = 1 ; k<=i; k++) {
				System.out.printf("%3s","*");
				}
			System.out.println();	
		}
		
//		 * * * * *
//		   * * * *
//			 * * *
//			   * *
//			     *			
		//방법1)
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i-1; j++) {
				System.out.printf("%3s"," ");	
			}
			for(int k = 1 ; k <=6-i; k++) {
				System.out.printf("%3s","*");
			}System.out.println();
		}
		
		//방법2)
		for(int row = 5 ; row >=1 ; row--) { //5,4,3,2,1
			for(int space = 1; space<=5-row ; space++){//빈 공간(공백처리) 5-5, 5-4. 5-3, 5-2. 5-1	
				System.out.printf("%3s"," ");	
				}	
			for(int col = 1 ; col<=row ; col++) {  //  * 표시 
				System.out.printf("%3s","*");
				}
		System.out.println();
				}
				
		
//	         *
//	       * * *
//	      * * * * *
//	    * * * * * * *
//	  * * * * * * * * *
//	 0보다 큰 홀수값을 입력하여 위와 같은 삼각형 만들기 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0보다 큰 홀수를 입력하세요 = ");
		int max = scan.nextInt();	
		
		for (int i = 1 ; i <=max; i +=2) { // 1,3,5,7,9 : 출력할 문자의 수
			for(int s=1 ; s<=(max-i)/2 ; s++) {
				System.out.printf("%3s"," ");	
				}
			for(int c= 1; c<=i; c++) {
				System.out.printf("%3s","*");
				}
			System.out.println();
			}
		
		
	} //main

} //class



