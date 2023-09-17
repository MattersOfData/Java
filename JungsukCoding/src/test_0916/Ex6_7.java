package test_0916;

public class Ex6_7 {

	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1); // 생성자로 iv의 x, y값 1로 초기화
		System.out.println(p.getDistance(2, 2));// 두점 사이 거리 구하는 getDistance 메서드 호출 
		}
	}
	
	
	class MyPoint {
		int x ;
		int y ;
	
		//MyPoint(){};
		MyPoint(int x, int y){
			this.x = x; // lv와 iv를 구분하기 위해 this 사용
			this.y = y; // lv와 iv를 구분하기 위해 this 사용
		}
		double getDistance(int x1, int y1) { // iv를 사용해야 하기때문에, static 삭제
											// 인스턴스 변수 x , y & 매개변수(지역변수) x1, y1 이 있어야 하기때문에, x1 &y1 입력 필요 !!
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); 
			
		}

	}
	
	// 인스턴스 메서드를 사용할 때와 메서드를 사용할 때의 차이 	
	// 1. static메서드의 사용
	// System.out.println(Exercise6_6.getDistance(1,1,2,2));
	// 2. 인스턴스 메서드의 사용
	// MyPoint p = new MyPoint(1,1);
	// System.out.println(p.getDistance(2,2)); -- 더 적합


