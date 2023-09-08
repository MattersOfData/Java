package test_0908;

import java.util.Arrays;

public class Quiz3_2_Answer_230908 {

	public static void main(String[] args) {
	// Q3_2. 배열 arr에서 중복을 제거한 결과 / 정렬(숫자오름차순) 한 결과를 출력하세요
	// A : 1,1,2,2,4,4,4,5,5
		
	int[] arr = {5,4,1,2,4,4,5,1,2}; // 1~5 사이의 숫자
	int[] arr1 = new int[9];
	int[] tmp = new int[9];
	
	for(int j = 1; j<arr.length; j++) {// j= 1,2,3,4,5,6,7,8
		for(int i = 0; i<arr.length-1; i++) { // i = 0,1,2,3,4,5,6,7,8
			if(arr[i]>arr[i+1]) {// arr[1번째값] > arr[2번쨰값]
				tmp[i] = arr[i];// x값 -> tmp
				//System.out.println(tmp[i]);
				
				arr[i]= arr[i+1]; // y값 -> x
				//System.out.println(arr[i]);
				arr[i+1]= tmp[i];
				//System.out.println(arr[i]);
				
				arr1[i] = arr[i];
				arr1[i+1] = arr[i+1];
				//System.out.println(Arrays.toString(arr1));
						}
				}
	
			}System.out.print("arr = " + Arrays.toString(arr) + "\n");
			System.out.print("arr1 = " + Arrays.toString(arr1));
			
		}

}


