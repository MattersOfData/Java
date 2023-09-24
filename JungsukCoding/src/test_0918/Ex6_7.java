package test_0918;

public class Ex6_7 {

	// 두 점 거리를 계산하는 getDistance() 완성 &  MyPoint 클래스의 인스턴스 메서드로 정의하시오
	// 두 점의 거리를 구하기 위해서는 (x, y) & (x1, y1)이 필요 
	// 주어진 조건에 따라, 생성자에서 2개의 점 & 메서드에서 2개의 점 사용해야함 !!
	
	//<포인트>
	// 인스턴스 메서드를 사용할 때와 메서드를 사용할 때의 차이 	
	// 1. static 메서드의 사용(iv 사용 x -> lv 값을 제공받아야 함 !)
	// System.out.println(Exercise6_6.getDistance(1,1,2,2));
	// 2. 인스턴스 메서드의 사용(iv 사용)
	// MyPoint p = new MyPoint(1,1);
	// System.out.println(p.getDistance(2,2)); -- 더 적합
	
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1); // 생성자로 iv의 x, y값 1로 초기화 -> '매개변수' 있는 생성자 생성!
		System.out.println(p.getDistance(2, 2));// 두점 사이 거리 구하는 getDistance 메서드 호출 (이떄, x1, y1의 값은 메서드 매개변수를 사용)
		}
	}
	
	
	class MyPoint {
		int x ; // MyPoint의 iv
		int y ; // MyPoint의 iv
	
		MyPoint(){} // 기본생성자
		MyPoint(int x, int y){
			this.x = x; // lv와 iv를 구분하기 위해 this 사용
			this.y = y; // lv와 iv를 구분하기 위해 this 사용
		}
		double getDistance(int x1, int y1) { // iv를 사용해야 하기때문에, static 삭제
											// MyPoint의 iv로 x , y 사용 & 나머지 한점에 대해서 입력값이 필요하기때문에, 메서드의 매개변수(지역변수)로 x1, y1 선언 !!
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); 
			
		}

	}
	



