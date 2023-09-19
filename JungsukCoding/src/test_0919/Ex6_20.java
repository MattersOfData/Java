package test_0919;

public class Ex6_20 {
//다음과 같이 정의된 메서드를 작성하고 테스트하시오
// 단, Math.randome()을 사용하는 경우, 실행결과와 다를 수 있음
	// 메서드명 : shuffle
	// 기능 : 주어진배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
	//		처리한 배열을 반환한다
	// 반환타입 : int[]
	// 매개변수 : int[] arr : 정수값이 담긴 배열
	
	public static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0) // arr 배열이 null 이거나, 배열의 개수가 0일때
			return arr;
		for(int i = 0; i< arr.length ; i++) { // arr[0], arr[1], arr[2],,,,,
			int j = (int)(Math.random() * arr.length); // arr[랜덤]
			
			// 두개의 값 자리이동(변경)
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp; 
			}return arr;
	}
	
	public static void main(String args[]) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
	
		