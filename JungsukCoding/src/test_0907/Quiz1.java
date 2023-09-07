package test_0907;

import java.util.Arrays;

public class Quiz1 {

	public static void main(String[] args) {
		// Q1. 1차원 배열 arr을 2차원 배열 arr2로 복사할 코드를 작성 (5by5)
		// 1) arr 의 배열 생성 
			// 방법1) 직접 입력
		//int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		//System.out.println(Arrays.toString(arr2)); // 배열 나열
		
		int[] arr = new int[25]; // 1by25 배열 그릇
		int[][] arr2 = new int[5][5]; // 5by5 배열 그릇
			// 방법2) for문 사용
		for(int i = 0; i<arr.length; i++){ // 배열은 항상 0으로 시작하는 것 명심 !!
			arr[i] = i+1;
			//System.out.println("a["+(i+1)+"] =" + arr[i]);
		}System.out.println("arr[] = " +Arrays.toString(arr));
		
		
		//2) 배열 나열
	
		for(int i= 0; i<arr.length; i++) { // arr[]배열에 있는 배열요소 25개의 숫자를 arr2에 copy
			 arr2[i/5][i%5] = arr[i] ; // for문 1개를 사용해야 하니, arr2[][]를 어떻게 i 를 변형해서 나타낼수 있도록 고민
									 // a[0] = a[0][0] 
									 // 규칙 발견 : 5개묶음씩 행은 00000,11111,,44444 반복 & 열은 0,1,2,3,4/ 0,1,2,3,4/,,,, 반복
			}System.out.println("arr2[][] = " + Arrays.toString(arr2));
		
		//3) arr2 배열 요소 확인

		for( int j = 0; j<arr2.length; j++) {
			for(int k = 0; k<arr2.length; k++) {
				//System.out.print(arr2[j][k] + " "); // 배열 요소 하나씩 확인
				}// System.out.println(Arrays.toString(arr2[j])); 
			}
		System.out.println("-------------------------");
		
		//Q2. 2차원 5by5 배열을 1차원 1by25 배열로 바꾸는 코드 작성
		// arr3[] = arr2[][]
		
		int[] arr3 = new int[25];
		for(int l = 0; l< arr2.length; l++) { // l= 0,1,2,3,4
			for(int m = 0; m< arr2.length ; m++) { // m= 0,1,2,3,4
				arr3[(5*l)+m] = arr2[l][m];//arr2의 l과 m으로 arr3[]를 5의 배수로 표현할 수 있음 
			}
		}System.out.println(Arrays.toString(arr3));
		
			
		}
			
	}
		

