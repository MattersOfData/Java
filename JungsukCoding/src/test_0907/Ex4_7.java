package test_0907;

public class Ex4_7 {

	public static void main(String[] args) {
	// Math.random()을 이용해서 1 ~6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
	// Math.random() : 0.0과 1.0사이의 임의의 double값을 반환
	// 0.0 <= Math.random() < 1.0
	// 출력하고자 하는 숫자의 개수를 math.random()에 곱해줌 & int로 변환
	// ex) -5 ~5까지의 수 중, 랜덤으로 고를떄 : -5, -4,,,,,,5 (총개수 11개) -> math.random *11
	//System.out.println(Math.random()*11); -> 0<= math.random() < 11.0
	// int로 형변환 
	//-5 가 범위의 시작임으로, (Math.random()*11) -5
	// 1,2,3,4,5,6으로 총 6개의 숫자
		double value1 = Math.random() ;  // 0.0 <= x < 6.0
		int value = (int)(Math.random()*6+1); // 0 <= x <6 : 소수점 버림 & 1<=x <7 : 범위시작이 1임으로, +1 
		System.out.println("value:" + value);
		
		}
	}


