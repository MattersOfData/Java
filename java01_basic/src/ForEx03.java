
public class ForEx03 {
	public static void main(String[] args) {
		
 
//	 1~100 사이의 값중 다음값을 출력하라
//	 규칙 : 3의 배수, 5의 배수 제외
//	 실행 :  1,  2. 	4, 7 , 8, 11.... ---- 97, 98 

		for (int n = 1 ; n<=100 ; n++)
			if(n%3 !=0 && n%5 !=0 ) {
				int result = n ;
				System.out.println(n);	
			}
		}
}




