package test_0908;

import java.util.Arrays;

public class Quiz3_2_230908 {

	public static void main(String[] args) {
	// Q3_2. 배열 arr을 정렬(숫자오름차순) 한 결과를 출력하세요
	// A : 1,1,2,2,4,4,4,5,5
		

	int[] arr = {5,4,1,2,4,4,5,1,2}; // 1~ 5 사이의 수
	int[] counter = new int [6]; // 1~5까지 숫자가 배열되었기 때문에 5칸 배열 생성
	
	for(int i = 0; i< arr.length; i++) {
		counter[arr[i]]++; // arr[i] : 5,4,1,2,4,4,5,1,2 (1~ 5까지의 숫자)
						// counter[arr[i] 
						// counter[0] = 0 , counter[1] = 1, counter[2] = 2, counter[3] = 3, counter[4] = 4, counter[5]= 5 
	}System.out.println(Arrays.toString(counter));
	
	for(int i = 1; i< counter.length-1; i++) {
		if(counter[i] != 0) {
			for(int j = 1; j<=counter[i]; j++) {
				System.out.println(i);
			}
		}
	}
	
		}

}


