package ch11;

import java.util.Arrays;

public class Ex_11_18 {
//Arrays 클래스의 메서드 실습
	public static void main(String[] args) {
	
	int[] arr = {0,1,2,3,4};
	int[][] arr2D = {{11,12,13},{21,22,23}};
	
	System.out.println("arr=" + Arrays.toString(arr)); // toString:  배열출력
	System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // deepToString : 2차원배열출력

	//copyOf(배열, 복수할개수)
	int[] arr2 = Arrays.copyOf(arr,arr.length); //[0, 1, 2, 3, 4]
	int[] arr3 = Arrays.copyOf(arr,3); // [0, 1, 2]
	int[] arr4 = Arrays.copyOf(arr,7); // [0, 1, 2, 3, 4, 0, 0]
	
	//copyOfRange(배열,from,to)-> from <= x < to
	int[] arr5 = Arrays.copyOfRange(arr,2,4); //[2, 3]
	int[] arr6 = Arrays.copyOfRange(arr,0,7); //[0, 1, 2, 3, 4, 0, 0]
	
	System.out.println("arr2=" + Arrays.toString(arr2));
	System.out.println("arr3=" + Arrays.toString(arr3));
	System.out.println("arr4=" + Arrays.toString(arr4));
	System.out.println("arr5=" + Arrays.toString(arr5));
	System.out.println("arr6=" + Arrays.toString(arr6));
	
	
	int[] arr7 = new int[5];
	
	Arrays.fill(arr7, 9); // Arrays.fill(배열, 채울것) : 배열채우기
	System.out.println("arr=7" + Arrays.toString(arr7));
	
	Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); // Arrays.setAll(배열,람다식) : 난수(랜덤)으로 채우기
	System.out.println("arr=7" + Arrays.toString(arr7));
	
	for(int i :arr7) { // 향상된 for문 => for(int i = 0; i<arr7.length ; i++){ int x = arr7[i]}
					   // arr7 배열에서 요소 하나씩 꺼냄
		char[] graph = new char[i];
		Arrays.fill(graph, '*');
		System.out.println(new String(graph)+ i); // graph 문자(*) + i(숫자) -> 문자 => "*****" + 5 = *****5
												  // char[]배열 --> String : String(char[])
												 // char 배열을 --> String 객체로 변환하기 위해 new String(graph)
		}
	
	String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA", "BBB"}};
	String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA", "BBB"}};
	
	System.out.println(Arrays.equals(str2D, str2D2)); // false
	System.out.println(Arrays.deepEquals(str2D, str2D2)); //  deepEquals : 2차원 배열 비교 
														 // true

	char[] chArr = {'A','D','C','B','E'};
	
	System.out.println("chArr =" + Arrays.toString(chArr));
	System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B')); // 잘못된 결과(정렬x)
	//Arrays.binarySearch : 검색 ( 반드시 정렬 후에 진행 가능 !) 
	System.out.println("=== After sorting =");
	Arrays.sort(chArr);
	System.out.println("chArr =" + Arrays.toString(chArr));
	System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B')); // 올바른 결과(정렬o)
	
	}

}
