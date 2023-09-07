package test_0907;

public class Ex4_10 {

	public static void main(String[] args) {
	int num = 12345;
	int sum = 0;
	
	int first = num/10000;  
	int second = num/1000- (num/1000-(num/1000%10)); // 12-10 에서 10 규칙찾기!
				// 12 - (12-2)
	int third = num/100 - (num/100 - (num/100)%10);// 123-120에서 120 규칙 찾기! 
				// 123 - (123-3)
	int fourth= num/10 - (num/10-(num/10)%10);//1234-1230에서 1230 규칙찾기! 
				// 1234 - (1234 - 4)
	int fifth = num- (num - (num%10));//12345- 12340에서 -12340 규칙찾기! 
				//12345 - (12345- 5)
	//값의 일의자리 구하기 위해서는 나누기 10 !!
	
	System.out.printf("%d, %d, %d, %d, %d %n",first,second,third,fourth, fifth);
	sum = first + second+third+fourth+fifth;
	System.out.println("sum =" + sum);
	}

}
