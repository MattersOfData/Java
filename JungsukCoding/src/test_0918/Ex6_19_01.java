package test_0918;

public class Ex6_19_01 {
// 만약 "ABC123456"을 그대로 출력하고 싶다면??
	
	public static String change(String str) {
		str = str + "456";// 문자열은 한번 생성된 이후에는 변경되지 않음 
				     // 따라서 덧셈연산을 하면 새로운 문자열이 생성되고 --> 새로운 문자열의 주소가 변수 str에 저장
					 // 참고 : 문자열을 변경하려면, 새로운 문자열 생성 & 변경된 값을 새로운 문자열에 저장 & 참조변수 업데이트 
		return str; 
	}
	
	public static void main(String args[]) {
		String str = "ABC123";
		System.out.println(str);
		 str = change(str); // 참조형 매개변수 --> 객체 주소가 복사됨 !
		 					// 반환된 return 값을 main 메서드 내의 str 변수로 업데이트해야 변경이 적용됨 !!!!!!
		System.out.println("After change:" + str);
		}
	}
	
		