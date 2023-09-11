package test_0911;


public class Ex5_4 {
//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
	public static void main(String[] args) {
	int[][] arr = {
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
	};
	
	int total = 0;
	float average = 0;
	
	for(int i = 0; i< arr.length; i++) { // 행 
		for(int j = 0; j<arr[i].length;j++) { // 열
			total = arr[i][j] + total; // 각 배열의 요소를 누적하여 더함
			}
	}average = total/20.0f; // int / int = int
							//소수점이하도 표현하기 위해서는 둘중에 하나를 float 형태로 표현해야 함 !
							// 총 누적합/총 배열의 요소개수(식으로 고민해보기)
	System.out.println("total = " + total);
	System.out.println("average = " + average);
			
	}// end of main
}// end of class