package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		//방법 1) 
		int oddSum = 0;
		int evenSum = 0;
		int totalSum =0;
		for(int i = 1; i>=1; i++) { // 1,2,3,4,,,,,,
			//1. 홀수번쨰 값
			if(i%2 !=0){ // 1, 3, 5, 7,,,,,
			oddSum = i + oddSum; 
			}//2. 짝수번쨰 값	
			else { // 2, 4, 6, 8,,,,,
			evenSum = -i + evenSum;
			}
		//3. 홀수번쨰 누적 + 짝수번째 누적 의 합
		totalSum = oddSum + evenSum;
		//4. 100 이상인지 확인
		if(totalSum>=100) {
			System.out.println("totalSum의 합이 100 이상이 되려면," + i +"번쨰까지 더해야 한다.");
			break;
			}
		}
	
		//방법2)
		
		int sum = 0; // 총합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num = 0; 
		
		for(int i =1; true; i++, s =- s) { // 조건식이 true -> 무한반복됨
						// 2개 변수 사용 가능 
						// s의 반복마다 1, -1, 1, -1 ,,,,
			num = i * s ; // i와 부호(s)를 곱함
			sum = num + sum ; // num을 더함
			
			if(sum >= 100) { // 총합이 100 이상이면,
				break; // 반복문 빠져나가기(조건식이 true이기 때문에)
			} 
		}
		System.out.println("num =" + num);
		System.out.println("sum =" + sum);
	}

}
