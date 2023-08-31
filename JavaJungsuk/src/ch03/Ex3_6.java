package ch03;

public class Ex3_6 {
	public static void main(String[] args) {
		// 변수 num 의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺸 나머지를 구하는 코드
		
		// 1. (num/10+1)*10 - num
		int num = 19;
		int num2 = num/10;
		int num3 = ((num2*10)+10) - num;
		
		System.out.println(num3);
		
		// 2. 10-(num%10)
		System.out.println(10-num%10);
		}
	}


