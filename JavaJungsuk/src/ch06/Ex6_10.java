package ch06;

public class Ex6_10 {
	public static void main(String[] args) {
	MyMath3 mm = new MyMath3();
	
	System.out.println("mm.add(3, 3) = " + mm.add(3,3));
	// int result = mm.add(3,3) : 1번쨰로 실행 ->  System.out.print("int add(int a, int b) -"); & return a+b;
	// System.out.println("mm.add(3, 3) = " + result); : 2번쨰로 실행 -> println 출력
	System.out.println("substract(3L, 3) = " + mm.add(3L,3));
	System.out.println("multiply(3, 3L) = " + mm.add(3,3L));
	System.out.println("divide(5L, 3L) = " + mm.add(3L, 3L));
	
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
	
}
	class MyMath3{
		int add(int a , int b) {
			System.out.print("int add(int a, int b) -");
			return a+b;
			
		}
		
		long add(int a, long b) {
			System.out.print("long add(int a, long b) -");
			return a+b;
		}
		
		long add(long a, long b) {
			System.out.print("long add(long a, long b) -");
			return a+b;
		}
		
		int add (int[]a){ //배열의 모든 요소의 합을 결과로 반환
			System.out.print("int add(int[]a) -");
			int result = 0;
			for(int i = 0; i < a.length; i++) {
				result += a[i];
			}return result;
		
		}
		
	}

		
	
