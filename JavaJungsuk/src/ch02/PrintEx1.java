package ch02;

public class PrintEx1 {

	public static void main(String[] args) {

	System.out.println(10/3); // 정수/정수 = 정수
	System.out.println(10/3.0); // 정수/실수 = 실수
	
	// 정수 출력 지시자
	System.out.printf("%d %n",15 ); // 10 진수, 14
	System.out.printf("%#o %n",15 ); // 8 진수 , 17
	System.out.printf("%#x %n",15 ); // 16진수 , f
	System.out.printf("%s %n", Integer.toBinaryString(15)); // 2진수 , 1111
	
	
	// 실수 출력 지시자
	float f = 123.456789f;
	double f1 = 123.456789;
	System.out.printf("%f %n", f); // float 의 정밀도는 7자리까지! 
	System.out.printf("%f %n", f1); // double 의 정밀도는 15자리까지! , 123.456789 
	System.out.printf("%e %n", f); // 지수형식으로 표현 , 1.234568e+02 
	System.out.printf("%g %n", f); // 간략한 형식으로 표현(소수점 포함 6자리) , 123.457 
	
	// 지시자로 출력자리수 지정(정수)
	System.out.printf("[%5d] %n", 10); // 5자리수에 10 표현(오른쪽정렬) , [   10] 
	System.out.printf("[%-5d] %n", 10); // 5자리수에 10 표현(왼쪽정렬) , [10   ] 
	System.out.printf("[%05d] %n", 10); // 5자리수에 빈칸은 0 & 10 표현 , [00010] 
	System.out.printf("[%5d] %n", 123456789); // 지정자리수 넘어도 출력 됨 , [123456789] 

	// 지시자로 출력자리수 지정(실수)
	double d = 1.23456789;
	System.out.printf("%014.10f %n", d); // 총 14자리수(소수점포함)에서 소수점 10자리까지 표현 & 빈칸은 0으로, 001.2345678900 
	System.out.printf("%10.6f %n", d); // 총 10자리수(소수점포함)에서 소수점 6자리까지 표현 , '  1.234568' 
	System.out.printf("%.6f %n", d); // 소수점 6자리까지 출력, 1.234568  
	
	// 지시자로 출력자리수 지정(문자열)
	System.out.printf("[%s] %n", "www.codechobo.com");
	System.out.printf("[%20s] %n", "www.codechobo.com"); // 총 자리수 20자리(왼쪽정렬)
	System.out.printf("[%-20s] %n", "www.codechobo.com"); // 총 자리수 20자리(오른쪽정렬)
	System.out.printf("[%.10s] %n", "www.codechobo.com"); // 10자리 출력
	
	}

}
