package test_0916;

public class Ex6_22 {
// 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	// 메서드명 : isNumber
	// 기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인
	// 		모두 숫자로만 이루어져 있으면 , true 반환  or false 반환
	//		만일 주어진 문자열이 null 이거나, 빈문자열("")이라면, false 반환
	// 반환타입 : boolean
	// 매개변수 : String str (검사할 문자열)
	
	
	static boolean isNumber(String str) { // 지역변수로 필요한 값 받기 때문에, iv 사용 안함 --> static 메서드로 구현
		
		if(str == null || str == "")  // 1. 주어진 문자열이 null 이거나, ""(빈문자열) 일경우, false 반환
		return false; 
				
		int cnt =0 ;
		for(int i= 0; i< str.length(); i++) {
			if ('0'<= str.charAt(i) && str.charAt(i)<= '9') { // 각 문자가 숫자에 있을떄
				cnt++;
			} // cnt 1씩 증가
		}
		if(cnt == str.length())
			// true일때, flase일떄 모두 return 값 써줘야 함 !!
			return true; // true의 return 값
		else return false; // false의 return 값
					
	}	
		public static void main(String args[]) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
	}
}

	
	

	
		