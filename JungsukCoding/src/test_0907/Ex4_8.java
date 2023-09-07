package test_0907;

public class Ex4_8 {

	public static void main(String[] args) {
	// 방정식 2x+4y = 10 의 모든 해를 구하시오(단, x와 y는 정수이고, 각각의 범위는 0<=x<=10, 0<=y<=10)
	
	
	for(int i = 0; i<10; i++) {// x의 범위 표현
		for(int j = 0; j<10 ; j++) { // y의 범위 표현
			if(2*i + 4*j == 10) { // 해당 방정식이 성립할때,
				System.out.printf("x = " + i +", "+ "y = " + j + "%n"); // x = i, y = j로 출력
				}
			}
		}
	}

}
