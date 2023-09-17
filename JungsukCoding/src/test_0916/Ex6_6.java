package test_0916;

public class Ex6_6 {

	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));// 두점 사이 거리 구하는 getDistance 메서드 호출 
	
	}
		
	static double getDistance(int x, int y, int x1, int y1) { // 객체 생성없이, 지역변수로 메서드 호출하기 위해, 'static 사용
		return Math.sqrt((x-x1)* (x-x1) + (y-y1)*(y-y1)); // 제곱근 계산 = Math.sqrt(double a)
		// return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2)) // Math.pow(dobule a, double b) 사용해도 됨
		}
	}
		


