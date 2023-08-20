package ch06;


public class Ex6_4 {// 소스파일과 클래스 이름이(main 메서드가 있는) 동일해야 제대로 실행됨!

	public static void main(String[] args) {
	MyMath mm = new MyMath();
	
	long result1 = mm.add(5L,3L);
	long result2 = mm.substract(5L,3L);
	long result3 = mm.multiply(5L,3L);
	double result4 = mm.divide(5L,3L);
	long  result5 = mm.Max(5L,3L);
	long  result6 = mm.Max2(5L,3L);
	long  result7 = mm.Min(5L,3L);
	mm.printGugudan(3); // 3단 출력

	
	System.out.println("add(5L, 3L) = " + result1 );
	System.out.println("substract(5L, 3L) = " + result2 );
	System.out.println("multiply(5L, 3L) = " + result3 );
	System.out.println("divide(5L, 3L) = " + result4 );
	System.out.println("Max(5L, 3L) = " + result5 );
	System.out.println("Max2(5L, 3L) = " + result6 );
	System.out.println("Min(5L, 3L) = " + result7 );
	}
	
}
	class MyMath{
		long add(long a , long b) {
			long result = a+b;
			return result; // return a+b;
			
		}
		
		long substract(long a, long b) {
			long result = a - b;
			return a-b;
		}
		
		long multiply (long a, long b) {
			long multiply = a * b;
			return a*b;
		}
		
		double divide (double a, long b) { // 둘다 double 형 or 둘중에 하나만 double 형 가능 !
			double divide = a/b ;
			return a/b;
		}
		
		//두값을 받아서, 두줄에 큰 값을 반환하는 메서드를 작성해보세요.
		//1. if-else 사용
		long Max(long a , long b) {
			long result = 0; // 작업결과를 담을 변수 
			if (a>b) {
				result = a;
			}else {
				result = b;
			}
			return result; 
		}
		// 2. 삼항연산자 사용
		long Max2(long a, long b) {
			long result = a >b ? a: b; 
			return result ; // return a > b ? a: b;
			}
		
		//두값을 받아서, 두줄에 작은 값을 반환하는 메서드를 작성해보세요.
		long Min (long a, long b) {
			return a>b? b: a;
			
		}
		
		void printGugudan(int dan) {
			if(!(2<=dan && dan>=9)) {
				return; // 입력받은 단(dan)이 2~9단이 아닐경우, 메서드 종료 & 돌아가기
			}
			for(int i = 1 ; i <=9 ; i++) {
				System.out.printf("%d * %d = %d%n", dan , i , dan * i );
			}
			return; //생략가능
		}
	}

		
	
