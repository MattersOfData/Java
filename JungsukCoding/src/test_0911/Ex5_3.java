package test_0911;


public class Ex5_3 {
// arr 배열에 담긴 모든 값을 더하는 프로그램을 완성하시오
	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	int sum = 0;
	
	for(int i = 0; i< arr.length; i++) {
		sum = arr[i] + sum; // arr 배열 요소의 값을 arr 배열 길이만큼 반복 & 해당 값 더함
		}System.out.println("sum =" + sum);
		
	}// end of main
}// end of class