package test_0919;

public class Ex6_23 {
// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	// 메서드명 : max
	// 기능 : 주어진 int 형 배열의 값 중에서 제일 큰 값을 반환한다.
	//	     만일 주어진 배열이 null 이거나, 크기가 0인경우, -999999를 반환한다.
	// 반환타입 : int
	// 매개변수 : int[] arr - 최대값을 구할 배열
	
	
	static int max(int[] arr) { // 지역변수로 필요한 값 받기 때문에, iv 사용 안함 --> static 메서드로 구현
		
		if(arr == null || arr.length == 0)  // 1. 주어진 배열이 null 이거나, 크기가 0인경우, -999999를 반환
		return -999999;
		
		int max = 0; // 기준 max 값 설정
		for(int i= 0; i< arr.length; i++) { // max 와 비교했을때, max보다 크면 max에 저장 
			if (max <arr[i]) 
				max = arr[i]; 
			
		}	return max; // max 값을 반환
	}
	
	public static void main(String args[]) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인배열
		}

	}	
	

	
		