package test_0908;

import java.util.Arrays;

public class Quiz3_1_Answer_230908 {

	public static void main(String[] args) {
	// Q3-1. 배열 arr에서 중복을 제거한 결과를 출력하세요
	// A: 1,2,4,5
		
	int[] arr = {5,4,1,2,4,4,5,1,2}; // 1~ 5 사이의 수
	int[] arr1 = new int[9]; // 몇개 담길지 모르지만, 우선 arr과 같은 개수로 배열 생성
	
	for(int i = 0; i<arr.length; i++) {
		arr1[arr[i]]++;
		}
	for(int i = 0; i<arr.length; i++) {
		//System.out.println(i+"의 개수 :" + arr1[i] );
		
		if(arr1[i] != 0) {
			System.out.print(i);
			}
		}
	//System.out.println(Arrays.toString(arr1)); 각 자리의 반복횟수
	}
	


}


